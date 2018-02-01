package goodweather.rest.jacksonobjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by nikita.shubarev@masterdata.ru on 09.11.2017.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentObservation {

  private DisplayLocation display_location;

  private String temp_c;
  private String dewpoint_c;
  private String feelslike_c;
  private String wind_kph;
  private String wind_degrees;
  private String wind_gust_kph;
  private String precip_today_metric;
  private String visibility_km;
  private String relative_humidity;
  private String pressure_mb;
  private String weather;
  private String icon_url;

  public DisplayLocation getDisplay_location() {
    return display_location;
  }

  public String getTemp_c() {
    return temp_c;
  }

  public String getDewpoint_c() {
    return dewpoint_c;
  }

  public String getFeelslike_c() {
    return feelslike_c;
  }

  public String getWind_kph() {
    return wind_kph;
  }

  public String getWind_degrees() {
    return wind_degrees;
  }

  public String getWind_gust_kph() {
    return wind_gust_kph;
  }

  public String getPrecip_today_metric() {
    return precip_today_metric;
  }

  public String getVisibility_km() {
    return visibility_km;
  }

  public String getRelative_humidity() {
    return relative_humidity;
  }

  public String getPressure_mb() {
    return pressure_mb;
  }

  public String getWeather() {
    return weather;
  }

  public String getIcon_url() {
    return icon_url;
  }

  @Override
  public String toString() {
    return "CurrentObservation{" +
           "display_location=" + display_location +
           ", temp_c='" + temp_c + '\'' +
           ", dewpoint_c='" + dewpoint_c + '\'' +
           ", feelslike_c='" + feelslike_c + '\'' +
           ", wind_kph='" + wind_kph + '\'' +
           ", wind_degrees='" + wind_degrees + '\'' +
           ", wind_gust_kph='" + wind_gust_kph + '\'' +
           ", precip_today_metric='" + precip_today_metric + '\'' +
           ", visibility_km='" + visibility_km + '\'' +
           ", relative_humidity='" + relative_humidity + '\'' +
           ", pressure_mb='" + pressure_mb + '\'' +
           ", weather='" + weather + '\'' +
           ", icon_url='" + icon_url + '\'' +
           '}';
  }
}
