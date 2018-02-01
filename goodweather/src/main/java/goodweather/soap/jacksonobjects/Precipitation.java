package goodweather.soap.jacksonobjects;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "precipitation")
public class Precipitation {

  @JacksonXmlProperty(localName = "name")
  private String name;

  @JacksonXmlElementWrapper(useWrapping = false)
  @JacksonXmlProperty(localName = "value")
  private Value[] value;

  public String getName() {
    return name;
  }

  public Value[] getValue() {
    return value;
  }

  @Override
  public String toString() {
    return "Precipitation{" +
           "name='" + name + '\'' +
           ", value=" + Arrays.toString(value) +
           '}';
  }
}
