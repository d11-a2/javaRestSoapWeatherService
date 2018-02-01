package goodweather.soap.jacksonobjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Created by nikita.shubarev@masterdata.ru on 16.11.2017.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "point")
public class Point {

  @JacksonXmlProperty(isAttribute = true, localName = "latitude")
  private String latitude;

  @JacksonXmlProperty(isAttribute = true, localName = "longitude")
  private String longitude;

  public String getLatitude() {
    return latitude;
  }

  public String getLongitude() {
    return longitude;
  }

  @Override
  public String toString() {
    return "Point{" +
           "latitude='" + latitude + '\'' +
           ", longitude='" + longitude + '\'' +
           '}';
  }
}
