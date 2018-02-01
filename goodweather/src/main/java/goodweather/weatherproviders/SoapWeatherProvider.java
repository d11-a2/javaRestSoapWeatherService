package goodweather.weatherproviders;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.Map;

import goodweather.soap.clients.NDFDgenLatLonListClient;
import goodweather.soap.ndfdgenlatlonlist.NDFDgenLatLonListResponse;

/**
 * Created by nikita.shubarev@masterdata.ru on 13.11.2017.
 */
public class SoapWeatherProvider implements WeatherProvider {

  private String                error;
  private String                serviceSource;
  private Map<String, String>[] weatherValues;
  private String                icon;
  private Path                  forecastFilePath;

  @Override
  public void generateRequestAndResponse(String zipCodes) {

    if (zipCodes == null) {
      error = "Incorrect input";
      return;
    }

    zipCodes = parseZipCodes(zipCodes);

    NDFDgenLatLonListClient ndfDgenClient = new NDFDgenLatLonListClient();
    NDFDgenLatLonListResponse ndfDgenResponse = ndfDgenClient.getNDFDgenLatLonList(zipCodes);

    if (ndfDgenResponse.getError() != null) {
      error = ndfDgenResponse.getError();
      return;
    }
    else {

      error = null;

      ndfDgenResponse.setAll(zipCodes);
      weatherValues = ndfDgenResponse.getWeatherValues();
      icon = ndfDgenResponse.getIcon();
      createForecastFile();
    }
  }

  private void createForecastFile() {

    String[] columnNames = weatherValues[0].keySet().stream().toArray(String[]::new);

    Path path = csvWriter("goodweather.csv", columnNames);
    for (Map<String, String> map : weatherValues) {
      String[] values = new String[columnNames.length];
      for (int i = 0; i < columnNames.length; i++) {
        values[i] = map.get(columnNames[i]);
      }
      addCsvLine(path, values);
    }

    forecastFilePath = getZipFile(path);

  }

  @Override
  public String getError() {
    return error;
  }

  @Override
  public String getServiceSource() {
    return serviceSource;
  }

  @Override
  public Map<String, String>[] getWeatherValues() {
    return weatherValues;
  }

  @Override
  public String getIcon() {
    return icon;
  }

  @Override
  public Path getForecastFilePath() {
    return forecastFilePath;
  }

  public void setError(String error) {
    this.error = error;
  }

  public void setServiceSource(String serviceSource) {
    this.serviceSource = serviceSource;
  }

  public void setWeatherValues(Map<String, String>[] weatherValues) {
    this.weatherValues = weatherValues;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  @Override
  public String toString() {
    return "SoapWeatherProvider{" +
           "error='" + error + '\'' +
           ", serviceSource='" + serviceSource + '\'' +
           ", weatherValues=" + Arrays.toString(weatherValues) +
           ", icon='" + icon + '\'' +
           '}';
  }
}
