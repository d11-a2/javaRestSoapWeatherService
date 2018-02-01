package goodweather.rest.jacksonobjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by nikita.shubarev@masterdata.ru on 09.11.2017.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Error {

  private String type;

  private String description;

  public String getType() {
    return type;
  }

  public String getDescription() {
    return description;
  }

  @Override
  public String toString() {
    return "Error{" +
           "type='" + type + '\'' +
           ", description='" + description + '\'' +
           '}';
  }
}
