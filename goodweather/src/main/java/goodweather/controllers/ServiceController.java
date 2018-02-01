package goodweather.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import goodweather.weatherproviders.SoapWeatherProvider;
import goodweather.weatherproviders.WeatherProvider;

/**
 * Created by nikita.shubarev@gmail.com on 07.11.2017.
 */

@Controller
public class ServiceController {

  private WeatherProvider weatherProvider;
  private ZipCode         zipCode;

  @RequestMapping(value = "/weather", method = RequestMethod.GET)
  public String getForm(Model model) {

    weatherProvider.generateRequestAndResponse(zipCode.getZipCode());

    if (weatherProvider instanceof SoapWeatherProvider) { weatherProvider.setIcon(null); }

    model.addAttribute("zipCode", zipCode);
    model.addAttribute("arrayOfMaps", weatherProvider.getWeatherValues());
    model.addAttribute("weatherProvider", weatherProvider);
    return "weather";
  }

  @RequestMapping(value = "/weather", method = RequestMethod.POST)
  public String getWeatherFromServer(@Valid @ModelAttribute("zipCode") ZipCode zipCode, Model model, BindingResult result) {
    if (result.hasErrors()) {
      List<ObjectError> errorList = result.getAllErrors();
      for (ObjectError objectError : errorList) {
        System.out.println(objectError.toString());
      }
    }
    else {

      weatherProvider.generateRequestAndResponse(zipCode.getZipCode());

      if (weatherProvider instanceof SoapWeatherProvider) { weatherProvider.setIcon(null); }

      model.addAttribute("arrayOfMaps", weatherProvider.getWeatherValues());
      model.addAttribute("weatherProvider", weatherProvider);
    }

    return "weather";
  }

  @RequestMapping(value = "/weather/download", method = RequestMethod.GET)
  public
  @ResponseBody
  void downloadForecastFile(HttpServletResponse response) throws IOException {
    File file = weatherProvider.getForecastFilePath().toFile();
    InputStream inputStream = new FileInputStream(file);
    response.setContentType("application/zip");
    response.setHeader("Content-Disposition", "attachment; fileName = " + file.getName());
    response.setHeader("Content-Length", String.valueOf(file.length()));
    FileCopyUtils.copy(inputStream, response.getOutputStream());

  }

  public WeatherProvider getWeatherProvider() {
    return weatherProvider;
  }

  public void setWeatherProvider(WeatherProvider weatherProvider) {
    this.weatherProvider = weatherProvider;
  }

  public ZipCode getZipCode() {
    return zipCode;
  }

  public void setZipCode(ZipCode zipCode) {
    this.zipCode = zipCode;
  }
}
