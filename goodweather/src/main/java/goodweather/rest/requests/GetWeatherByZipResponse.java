package goodweather.rest.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import goodweather.rest.jacksonobjects.CurrentObservation;

/**
 * Created by nikita.shubarev@masterdata.ru on 09.11.2017.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetWeatherByZipResponse {

  private Integer zipCode;

  private CurrentObservation current_observation;

  public CurrentObservation getCurrent_observation() {
    return current_observation;
  }


  public Integer getZipCode() {
    return zipCode;
  }

  public void setZipCode(Integer zipCode) {
    this.zipCode = zipCode;
  }

  @Override
  public String toString() {
    return "GetWeatherByZipResponse{" +
           "zipCode=" + zipCode +
           ", current_observation=" + current_observation +
           '}';
  }
}