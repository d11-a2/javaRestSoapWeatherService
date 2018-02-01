package goodweather.soap.latlonlistzipcode;

import javax.xml.bind.annotation.*;

/**
 * Created by nikita.shubarev@masterdata.ru on 13.11.2017.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"zipCodeList",
})
@XmlRootElement(name = "LatLonListZipCode", namespace = "https://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl")

public class LatLonListZipCode {

  @XmlElement(namespace = "http://www.w3.org/1999/XMLSchema-instance")
  private String zipCodeList;

  public String getZipCodeList() {
    return zipCodeList;
  }

  public void setZipCodeList(String zipCodeList) {
    this.zipCodeList = zipCodeList;
  }

  @Override
  public String toString() {
    return "LatLonListZipCode{" +
           "zipCodeList='" + zipCodeList + '\'' +
           '}';
  }
}
