package goodweather.soap.jacksonobjects;

import java.util.Arrays;
import java.util.LinkedList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "temperature")
public class Temperature {

  public static LinkedList<Temperature> temperatures = new LinkedList<>();

  @JacksonXmlProperty(localName = "type", isAttribute = true)
  private String type;

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

  public Temperature(String type, String name, Value[] value) {
    this.type = type;
    this.name = name;
    this.value = value;
    System.out.println("Temperature(String type, String name, Value[] value)");
  }

  public Temperature() {

  }

  @Override
  public String toString() {
    return "Temperature{" +
           "type='" + type + '\'' +
           ", name='" + name + '\'' +
           ", value=" + Arrays.toString(value) +
           '}';
  }
}
