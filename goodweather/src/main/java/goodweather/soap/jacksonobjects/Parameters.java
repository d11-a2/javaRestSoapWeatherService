package goodweather.soap.jacksonobjects;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlSchemaType;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonPropertyOrder(alphabetic = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "parameters")
public class Parameters {

  @JacksonXmlElementWrapper(useWrapping = false)
  @JacksonXmlProperty(localName = "temperature")
  private Temperature[] temperatures;


  @JacksonXmlElementWrapper(useWrapping = false)
  @JacksonXmlProperty(localName = "precipitation")
  private Precipitation[] precipitations;

  @JacksonXmlProperty(localName = "probability-of-precipitation")
  private ProbabilityOfPrecipitation probabilityOfPrecipitation;

  @JacksonXmlElementWrapper(useWrapping = false)
  @JacksonXmlProperty(localName = "direction")
  private Direction[] direction;

  @JacksonXmlElementWrapper(useWrapping = false)
  @JacksonXmlProperty(localName = "cloud-amount")
  private CloudAmount[] cloudAmount;

  @JacksonXmlElementWrapper(useWrapping = false)
  @JacksonXmlProperty(localName = "wind-speed")
  private WindSpeed[] windSpeeds;


  @JacksonXmlElementWrapper(useWrapping = false)
  @JacksonXmlProperty(localName = "humidity")
  private Humidity[]  humidities;

  public Temperature[] getTemperature() {
    return temperatures;
  }

  public Precipitation[] getPrecipitations() {
    return precipitations;
  }

  public ProbabilityOfPrecipitation getProbabilityOfPrecipitation() {
    return probabilityOfPrecipitation;
  }

  public Direction[] getDirection() {
    return direction;
  }

  public CloudAmount[] getCloudAmount() {
    return cloudAmount;
  }

  public WindSpeed[] getWindSpeeds() {
    return windSpeeds;
  }

  public Humidity[] getHumidities() {
    return humidities;
  }

  @Override
  public String toString() {
    return "Parameters{" +
           "humidities=" + Arrays.toString(humidities) +
           ", windSpeeds=" + Arrays.toString(windSpeeds) +
           ", cloudAmount=" + Arrays.toString(cloudAmount) +
           ", direction=" + Arrays.toString(direction) +
           ", probabilityOfPrecipitation=" + probabilityOfPrecipitation +
           ", precipitations=" + Arrays.toString(precipitations) +
           ", temperature=" + Arrays.toString(temperatures) +
           '}';
  }
}