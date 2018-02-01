package goodweather.soap.jacksonobjects;

/**
 * Created by nikita.shubarev@masterdata.ru on 16.11.2017.
 */

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "probability-of-precipitation")
public class ProbabilityOfPrecipitation {

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

  public void setName(String name) {
    this.name = name;
  }

  public void setValue(Value[] value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "ProbabilityOfPrecipitation{" +
           "name='" + name + '\'' +
           ", value=" + Arrays.toString(value) +
           '}';
  }
}
