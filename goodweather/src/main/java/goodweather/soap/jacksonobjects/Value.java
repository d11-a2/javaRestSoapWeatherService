package goodweather.soap.jacksonobjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "value")
public class Value {

  @JacksonXmlText(value = true)
  private String value;

  @JacksonXmlProperty(localName = "visibility")
  private String visibility;

  public Value(String value) {
    this.value = value;
  //  System.out.println("Value(String value) " + value);
  }

  public Value() {
    //System.out.println("Value()");

  }

  public String getValue() {
    return value;
  }

  public String getVisibility() {
    return visibility;
  }



  @Override
  public String toString() {
    return "Value{" +
           "value='" + value + '\'' +
           '}';
  }
}
