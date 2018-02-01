package goodweather.soap.ndfdgenlatlonlist;

import javax.xml.bind.annotation.*;

/**
 * Created by nikita.shubarev@masterdata.ru on 17.11.2017.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"listLatLon", "product", "startTime", "endTime", "Unit", "weatherParameters"
})
@XmlRootElement(name = "NDFDgenLatLonList", namespace = "https://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl")

public class NDFDgenLatLonList {

  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private String listLatLon;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private String product;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private String startTime;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private String endTime;
  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private String Unit;

  @XmlElement(name = "weatherParameters")
  private WeatherParametersType weatherParameters;

  public String getListLatLon() {
    return listLatLon;
  }

  public String getProduct() {
    return product;
  }

  public String getStartTime() {
    return startTime;
  }

  public String getEndTime() {
    return endTime;
  }

  public String getUnit() {
    return Unit;
  }

  public WeatherParametersType getWeatherParameters() {
    return weatherParameters;
  }

  public void setListLatLon(String listLatLon) {
    this.listLatLon = listLatLon;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public void setUnit(String Unit) {
    this.Unit = Unit;
  }

  public void setWeatherParameters(WeatherParametersType weatherParameters) {
    this.weatherParameters = weatherParameters;
  }
}