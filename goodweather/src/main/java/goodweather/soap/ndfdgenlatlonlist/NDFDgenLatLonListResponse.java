package goodweather.soap.ndfdgenlatlonlist;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

import javax.xml.bind.annotation.*;
import javax.xml.stream.XMLInputFactory;

import com.ctc.wstx.stax.WstxInputFactory;
import com.ctc.wstx.stax.WstxOutputFactory;
import com.fasterxml.jackson.dataformat.xml.XmlFactory;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import goodweather.soap.jacksonobjects.*;

/**
 * Created by nikita.shubarev@masterdata.ru on 17.11.2017.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"dwmlOut", "weatherValues", "icon", "error"
})
@XmlRootElement(name = "NDFDgenLatLonListResponse", namespace = "https://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl")
public class NDFDgenLatLonListResponse {

  @XmlElement(name = "dwmlOut")
  private String                    dwmlOut;
  private HashMap<String, String>[] weatherValues;
  private String                    icon;
  private String                    error;

  public void setAll(String zipCodes) {

    Parser(zipCodes);

  }

  public String getDwmlOut() {
    return dwmlOut;
  }

  public HashMap<String, String>[] getWeatherValues() {
    return weatherValues;
  }

  public String getIcon() {
    return icon;
  }

  public String getError() {
    return error;
  }

  public void setDwmlOut(String dwmlOut) {
    this.dwmlOut = dwmlOut;
  }

  public void setWeatherValues(HashMap<String, String>[] weatherValues) {
    this.weatherValues = weatherValues;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public void setError(String error) {
    this.error = error;
  }

  @Override
  public String toString() {
    return "NDFDgenLatLonListResponse{" +
           "dwmlOut='" + dwmlOut + '\'' +
           ", weatherValues=" + Arrays.toString(weatherValues) +
           ", icon='" + icon + '\'' +
           ", error='" + error + '\'' +
           '}';
  }

  private LinkedList<Location> Parser(String zipCodes) {

    String[] zipCodesArray = zipCodes.split(" ");
    LinkedList<Location> locations = new LinkedList<>();

    int startTokenIndex = 0;
    int endTokenIndex = 0;
    int endParametersTokenIndex = 0;
    int currentIndex = 0;

    XMLInputFactory input = new WstxInputFactory();
    input.setProperty(XMLInputFactory.IS_NAMESPACE_AWARE, Boolean.FALSE);
    XmlMapper mapper = new XmlMapper(new XmlFactory(input, new WstxOutputFactory()));
    //XmlMapper mapper = new XmlMapper();

    try {
      while (startTokenIndex >= 0) {
        startTokenIndex = dwmlOut.indexOf("<location>", currentIndex);
        endTokenIndex = dwmlOut.indexOf("</location>", currentIndex) + "</location>".length();

        if (startTokenIndex > 0 && endTokenIndex > 0) {
          locations.add(mapper.readValue(dwmlOut.substring(startTokenIndex, endTokenIndex), Location.class));
        }
        currentIndex = endTokenIndex;
      }

      currentIndex = 0;

      for (int i = 0; i < locations.size(); i++) {

        locations.get(i).setZipCode(zipCodesArray[i]);

        startTokenIndex = dwmlOut.indexOf("<parameters applicable-location=\"" + locations.get(i).getLocationKey() + "\">", currentIndex);
        endParametersTokenIndex = dwmlOut.indexOf("</parameters>", currentIndex) + "</parameters>".length();
        String result = null;

        /**
         * temperature
         */

        result = findDocElement("<temperature type=\"maximum\"", "</temperature>", startTokenIndex, mapper);
        if (result != null) { locations.get(i).getTemperatures().add(mapper.readValue(result, Temperature.class)); }

        result = findDocElement("<temperature type=\"minimum\"", "</temperature>", startTokenIndex, mapper);
        if (result != null) { locations.get(i).getTemperatures().add(mapper.readValue(result, Temperature.class)); }

        result = findDocElement("<temperature type=\"hourly\"", "</temperature>", startTokenIndex, mapper);
        if (result != null) { locations.get(i).getTemperatures().add(mapper.readValue(result, Temperature.class)); }

        result = findDocElement("<temperature type=\"dew point\"", "</temperature>", startTokenIndex, mapper);
        if (result != null) { locations.get(i).getTemperatures().add(mapper.readValue(result, Temperature.class)); }

        result = findDocElement("<temperature type=\"apparent\"", "</temperature>", startTokenIndex, mapper);
        if (result != null) { locations.get(i).getTemperatures().add(mapper.readValue(result, Temperature.class)); }

        /**
         * precipitation
         */

        result = findDocElement("<precipitation type=\"liquid\" units=\"centimeters\"", "</precipitation>", startTokenIndex, mapper);
        if (result != null) { locations.get(i).getPrecipitations().add(mapper.readValue(result, Precipitation.class)); }

        result = findDocElement("<precipitation type=\"ice\" units=\"centimeters\"", "</precipitation>", startTokenIndex, mapper);
        if (result != null) { locations.get(i).getPrecipitations().add(mapper.readValue(result, Precipitation.class)); }

        result = findDocElement("<precipitation type=\"snow\" units=\"centimeters\"", "</precipitation>", startTokenIndex, mapper);
        if (result != null) { locations.get(i).getPrecipitations().add(mapper.readValue(result, Precipitation.class)); }

        /**
         * humidity
         */

        result = findDocElement("<humidity type=\"relative\" units=\"percent\"", "</humidity>", startTokenIndex, mapper);
        if (result != null) { locations.get(i).getHumidities().add(mapper.readValue(result, Humidity.class)); }

        result = findDocElement("<humidity type=\"maximum relative\" units=\"percent\"", "</humidity>", startTokenIndex, mapper);
        if (result != null) { locations.get(i).getHumidities().add(mapper.readValue(result, Humidity.class)); }

        result = findDocElement("<humidity type=\"minimum relative\" units=\"percent\"", "</humidity>", startTokenIndex, mapper);
        if (result != null) { locations.get(i).getHumidities().add(mapper.readValue(result, Humidity.class)); }

        /**
         * wind-speed
         */

        result = findDocElement("<wind-speed type=\"sustained\" units=\"meters/second\"", "</wind-speed>", startTokenIndex, mapper);
        if (result != null) { locations.get(i).getWindSpeeds().add(mapper.readValue(result, WindSpeed.class)); }

        result = findDocElement("<wind-speed type=\"gust\" units=\"meters/second\"", "</wind-speed>", startTokenIndex, mapper);
        if (result != null) { locations.get(i).getWindSpeeds().add(mapper.readValue(result, WindSpeed.class)); }

        /**
         * direction
         */

        result = findDocElement("<direction type=\"wind\" units=\"degrees true\"", "</direction>", startTokenIndex, mapper);
        if (result != null) { locations.get(i).getDirections().add(mapper.readValue(result, Direction.class)); }

        /**
         * cloud-amount
         */

        result = findDocElement("<cloud-amount type=\"total\" units=\"percent\"", "</cloud-amount>", startTokenIndex, mapper);
        if (result != null) { locations.get(i).getCloudAmounts().add(mapper.readValue(result, CloudAmount.class)); }

        /**
         * probability-of-precipitation
         */

        result = findDocElement("<probability-of-precipitation type=\"12 hour\" units=\"percent\"", "</probability-of-precipitation>", startTokenIndex, mapper);
        if (result != null) { locations.get(i).getProbabilityOfPrecipitations().add(mapper.readValue(result, ProbabilityOfPrecipitation.class)); }

        currentIndex = endParametersTokenIndex;

      }
      /**
       * set response data into HashMap[] weatherValues
       */
      copyLocationListToMap(locations);
    }
    catch (IOException e) {
      e.printStackTrace();
      return locations;
    }
    return locations;
  }

  private String findDocElement(String openTag, String closeTag, int offset, XmlMapper mapper) {

    int startTokenIndex = 0;
    int endTokenIndex = 0;

    startTokenIndex = dwmlOut.indexOf(openTag, offset);

    if (startTokenIndex > 0) {
      endTokenIndex = dwmlOut.indexOf(closeTag, startTokenIndex) + closeTag.length();

      if (endTokenIndex > 0) {
        return dwmlOut.substring(startTokenIndex, endTokenIndex);
      }
    }
    return null;
  }

  private void copyLocationListToMap(LinkedList<Location> locations) {

    weatherValues = new LinkedHashMap[locations.size()];

    for (int i = 0; i < locations.size(); i++) {

      weatherValues[i] = new LinkedHashMap<String, String>();

      weatherValues[i].put("Zip code", locations.get(i).getZipCode());
      weatherValues[i].put("Latitude", locations.get(i).getPoint().getLatitude());
      weatherValues[i].put("Longitude", locations.get(i).getPoint().getLongitude());

      for (Temperature temperature : locations.get(i).getTemperatures()) {
        if (temperature.getValue()[0].getValue() != null) { weatherValues[i].put(temperature.getName(), temperature.getValue()[0].getValue() + " \u2103"); }
      }

      for (ProbabilityOfPrecipitation probabilityOfPrecipitation : locations.get(i).getProbabilityOfPrecipitations()) {
        if (probabilityOfPrecipitation.getValue()[0].getValue() != null) { weatherValues[i].put(probabilityOfPrecipitation.getName(), probabilityOfPrecipitation.getValue()[0].getValue() + " cm"); }
      }

      for (Precipitation precipitation : locations.get(i).getPrecipitations()) {
        if (precipitation.getValue()[0].getValue() != null) { weatherValues[i].put(precipitation.getName(), precipitation.getValue()[0].getValue() + " cm"); }
      }

      for (CloudAmount cloudAmount : locations.get(i).getCloudAmounts()) {
        if (cloudAmount.getValue()[0].getValue() != null) { weatherValues[i].put(cloudAmount.getName(), cloudAmount.getValue()[0].getValue() + "%"); }
      }

      for (Humidity humidity : locations.get(i).getHumidities()) {
        if (humidity.getValue()[0].getValue() != null) { weatherValues[i].put(humidity.getName(), humidity.getValue()[0].getValue() + "%"); }
      }

      for (Direction direction : locations.get(i).getDirections()) {
        if (direction.getValue()[0].getValue() != null) { weatherValues[i].put(direction.getName(), direction.getValue()[0].getValue() + "\u00B0"); }
      }

      for (WindSpeed windSpeed : locations.get(i).getWindSpeeds()) {
        if (windSpeed.getValue()[0].getValue() != null) { weatherValues[i].put(windSpeed.getName(), windSpeed.getValue()[0].getValue() + " m/s"); }
      }

    }
  }

}
