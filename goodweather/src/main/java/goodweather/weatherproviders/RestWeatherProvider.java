package goodweather.weatherproviders;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import goodweather.rest.requests.GetInfoByZipResponse;
import goodweather.rest.requests.GetWeatherByZipResponse;

/**
 * Created by nikita.shubarev@masterdata.ru on 09.11.2017.
 */

public class RestWeatherProvider implements WeatherProvider {
  //-Dspring.profiles.active=rest
  private String KEY;
  private final String serviceApiUrl    = "http://api.wunderground.com/api";
  private final String geolookupOption  = "geolookup";
  private final String conditionsOption = "conditions";
  private String                error;
  private String                serviceSource;
  private Map<String, String>[] weatherValues;
  private String                icon;
  private Path                  forecastFilePath;

  private String generateUriByZip(String zipCode) {
    return serviceApiUrl + "/" + KEY + "/" + geolookupOption + "/q/" + zipCode + ".json";
  }

  public void generateRequestAndResponse(String zipCodes) {

    GetWeatherByZipResponse getWeatherByZipResponse = null;
    GetInfoByZipResponse getInfoByZipResponse = null;
    RestTemplate restTemplate = new RestTemplate();

    zipCodes = parseZipCodes(zipCodes);
    String[] zipCodesArray = zipCodes.split(" ");

    String[] columnNames = new String[] {"Zip code",
                                         "City",
                                         "State",
                                         "Temperature",
                                         "Dew Point Temperature",
                                         "Apparent Temperature",
                                         "Precipitation Amount",
                                         "Wind Speed",
                                         "Wind Speed Gust",
                                         "Wind Direction",
                                         "Relative Humidity",
                                         "Cloud Cover Amount",
                                         "Weather",
                                         "Visibility"
    };

    Path path = csvWriter("goodweather.csv", columnNames);

    weatherValues = new LinkedHashMap[zipCodesArray.length];
    for (int i = 0; i < zipCodesArray.length; i++) {

      String zipRequest = generateUriByZip(zipCodesArray[i]);
      getInfoByZipResponse = restTemplate.getForObject(zipRequest, GetInfoByZipResponse.class);

      if (getInfoByZipResponse.getResponse().getError() != null) {

        error = getInfoByZipResponse.getResponse().getError().getDescription();
        return;
      }
      else {

        error = null;

        String uriByStateAndCity = serviceApiUrl + "/" + KEY + "/" + conditionsOption + "/q/" + getInfoByZipResponse.getLocation().getState() +
                                   "/" + getInfoByZipResponse.getLocation().getCity().replaceAll(" ", "_") + ".json";

        getWeatherByZipResponse = restTemplate.getForObject(uriByStateAndCity, GetWeatherByZipResponse.class);

        weatherValues[i] = new LinkedHashMap<>();
        weatherValues[i].put("icon", getWeatherByZipResponse.getCurrent_observation().getIcon_url());
        weatherValues[i].put("City", getWeatherByZipResponse.getCurrent_observation().getDisplay_location().getCity());
        weatherValues[i].put("State", getWeatherByZipResponse.getCurrent_observation().getDisplay_location().getState_name());
        weatherValues[i].put("Temperature", getWeatherByZipResponse.getCurrent_observation().getTemp_c() + " \u2103");
        weatherValues[i].put("Dew Point Temperature", getWeatherByZipResponse.getCurrent_observation().getDewpoint_c() + " \u2103");
        weatherValues[i].put("Apparent Temperature", getWeatherByZipResponse.getCurrent_observation().getFeelslike_c() + " \u2103");
        weatherValues[i].put("Precipitation Amount", getWeatherByZipResponse.getCurrent_observation().getPrecip_today_metric() + " cm");
        weatherValues[i].put("Wind Speed", getWeatherByZipResponse.getCurrent_observation().getWind_kph() + " m/s");
        weatherValues[i].put("Wind Speed Gust", getWeatherByZipResponse.getCurrent_observation().getWind_gust_kph() + " m/s");
        weatherValues[i].put("Wind Direction", getWeatherByZipResponse.getCurrent_observation().getWind_degrees() + "\u00B0");
        weatherValues[i].put("Relative Humidity", getWeatherByZipResponse.getCurrent_observation().getRelative_humidity());
        weatherValues[i].put("Cloud Cover Amount", getWeatherByZipResponse.getCurrent_observation().getPressure_mb() + " mb");
        weatherValues[i].put("Weather", getWeatherByZipResponse.getCurrent_observation().getWeather());
        weatherValues[i].put("Visibility", getWeatherByZipResponse.getCurrent_observation().getVisibility_km() + " km");

        addCsvLine(path,
                   new String[] {zipCodesArray[i],
                                 getWeatherByZipResponse.getCurrent_observation().getDisplay_location().getCity(),
                                 getWeatherByZipResponse.getCurrent_observation().getDisplay_location().getState_name(),
                                 getWeatherByZipResponse.getCurrent_observation().getTemp_c() + " \u2103",
                                 getWeatherByZipResponse.getCurrent_observation().getDewpoint_c() + " \u2103",
                                 getWeatherByZipResponse.getCurrent_observation().getFeelslike_c() + " \u2103",
                                 getWeatherByZipResponse.getCurrent_observation().getPrecip_today_metric() + " cm",
                                 getWeatherByZipResponse.getCurrent_observation().getWind_kph() + " m/s",
                                 getWeatherByZipResponse.getCurrent_observation().getWind_gust_kph() + " m/s",
                                 getWeatherByZipResponse.getCurrent_observation().getWind_degrees() + "\u00B0",
                                 getWeatherByZipResponse.getCurrent_observation().getRelative_humidity(),
                                 getWeatherByZipResponse.getCurrent_observation().getPressure_mb() + " mb",
                                 getWeatherByZipResponse.getCurrent_observation().getWeather(),
                                 getWeatherByZipResponse.getCurrent_observation().getVisibility_km() + " km"
                   });

      }
    }

    forecastFilePath = getZipFile(path);
  }

  public String getKEY() {
    return KEY;
  }

  public String getServiceApiUrl() {
    return serviceApiUrl;
  }

  public String getGeolookupOption() {
    return geolookupOption;
  }

  public String getConditionsOption() {
    return conditionsOption;
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

  public void setKEY(String KEY) {
    this.KEY = KEY;
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
    return "RestWeatherProvider{" +
           "KEY='" + KEY + '\'' +
           ", serviceApiUrl='" + serviceApiUrl + '\'' +
           ", geolookupOption='" + geolookupOption + '\'' +
           ", conditionsOption='" + conditionsOption + '\'' +
           ", error='" + error + '\'' +
           ", serviceSource='" + serviceSource + '\'' +
           ", weatherValues=" + Arrays.toString(weatherValues) +
           ", icon='" + icon + '\'' +
           '}';
  }
}
