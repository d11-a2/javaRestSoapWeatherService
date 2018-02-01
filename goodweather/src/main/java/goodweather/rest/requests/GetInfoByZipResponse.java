package goodweather.rest.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import goodweather.rest.jacksonobjects.Location;
import goodweather.rest.jacksonobjects.Response;

/**
 * Created by nikita.shubarev@masterdata.ru on 09.11.2017.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetInfoByZipResponse {

  private Location location;

  private Response response;

  public Location getLocation() {
    return location;
  }

  public Response getResponse() {
    return response;
  }

  @Override
  public String toString() {
    return "GetInfoByZipResponse{" +
           "location=" + location +
           ", response=" + response +
           '}';
  }
}
