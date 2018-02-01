package goodweather.soap.jacksonobjects;

import java.util.LinkedList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "location")
public class Location {

  @JacksonXmlProperty(localName = "point")
  private Point point;

  @JacksonXmlProperty(localName = "location-key")
  private String locationKey;

  private String                                 zipCode;
  private LinkedList<Temperature>                temperatures;
  private LinkedList<Precipitation>              precipitations;
  private LinkedList<WindSpeed>                  windSpeeds;
  private LinkedList<Humidity>                   humidities;
  private LinkedList<Direction>                  directions;
  private LinkedList<CloudAmount>                cloudAmounts;
  private LinkedList<ProbabilityOfPrecipitation> probabilityOfPrecipitations;

  public Location() {
    temperatures = new LinkedList<>();
    precipitations = new LinkedList<>();
    windSpeeds = new LinkedList<>();
    humidities = new LinkedList<>();
    directions = new LinkedList<>();
    cloudAmounts = new LinkedList<>();
    probabilityOfPrecipitations = new LinkedList<>();
  }

  public String getZipCode() {
    return zipCode;
  }

  public Point getPoint() {
    return point;
  }

  public String getLocationKey() {
    return locationKey;
  }

  public LinkedList<Temperature> getTemperatures() {
    return temperatures;
  }

  public LinkedList<Precipitation> getPrecipitations() {
    return precipitations;
  }

  public LinkedList<WindSpeed> getWindSpeeds() {
    return windSpeeds;
  }

  public LinkedList<Humidity> getHumidities() {
    return humidities;
  }

  public LinkedList<Direction> getDirections() {
    return directions;
  }

  public LinkedList<CloudAmount> getCloudAmounts() {
    return cloudAmounts;
  }

  public LinkedList<ProbabilityOfPrecipitation> getProbabilityOfPrecipitations() {
    return probabilityOfPrecipitations;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public void setPoint(Point point) {
    this.point = point;
  }

  public void setLocationKey(String locationKey) {
    this.locationKey = locationKey;
  }

  public void setTemperatures(LinkedList<Temperature> temperatures) {
    this.temperatures = temperatures;
  }

  public void setPrecipitations(LinkedList<Precipitation> precipitations) {
    this.precipitations = precipitations;
  }

  public void setWindSpeeds(LinkedList<WindSpeed> windSpeeds) {
    this.windSpeeds = windSpeeds;
  }

  public void setHumidities(LinkedList<Humidity> humidities) {
    this.humidities = humidities;
  }

  public void setDirections(LinkedList<Direction> directions) {
    this.directions = directions;
  }

  public void setCloudAmounts(LinkedList<CloudAmount> cloudAmounts) {
    this.cloudAmounts = cloudAmounts;
  }

  public void setProbabilityOfPrecipitations(LinkedList<ProbabilityOfPrecipitation> probabilityOfPrecipitations) {
    this.probabilityOfPrecipitations = probabilityOfPrecipitations;
  }

  @Override
  public String toString() {
    return "Location{" +
           "point=" + point +
           ", locationKey='" + locationKey + '\'' +
           ", zipCode='" + zipCode + '\'' +
           ", temperatures=" + temperatures +
           ", precipitations=" + precipitations +
           ", windSpeeds=" + windSpeeds +
           ", humidities=" + humidities +
           ", directions=" + directions +
           ", cloudAmounts=" + cloudAmounts +
           ", probabilityOfPrecipitations=" + probabilityOfPrecipitations +
           '}';
  }
}
