package goodweather.rest.jacksonobjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by nikita.shubarev@masterdata.ru on 09.11.2017.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {

  private Error error;

  public Error getError() {
    return error;
  }

  @Override
  public String toString() {
    return "Response{" +
           "error=" + error +
           '}';
  }
}
