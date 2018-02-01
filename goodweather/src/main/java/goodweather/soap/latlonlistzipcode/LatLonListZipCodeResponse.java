package goodweather.soap.latlonlistzipcode;

import javax.xml.bind.annotation.*;

/**
 * Created by nikita.shubarev@masterdata.ru on 13.11.2017.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"listLatLonOut", "latitudeAndlongitudeList", "latitude", "longitude", "error"
})
@XmlRootElement(name = "LatLonListZipCodeResponse")
public class LatLonListZipCodeResponse {

  @XmlElement(name = "listLatLonOut")
  private String listLatLonOut;

  private String latitudeAndlongitudeList;
  private String latitude;
  private String longitude;
  private String error;

  public void setLatitudeAndlongitude() {
    latitudeAndlongitudeList = listLatLonOut.substring(listLatLonOut.indexOf("<latLonList>") + "<latLonList>".length(), listLatLonOut.indexOf("</latLonList>"));
    latitude = latitudeAndlongitudeList .substring(0, latitudeAndlongitudeList .indexOf(','));
    longitude = latitudeAndlongitudeList .substring(latitudeAndlongitudeList .indexOf(',') + 1);
  }


  public String getLatitudeAndlongitudeList() {
    return latitudeAndlongitudeList;
  }

  public String getListLatLonOut() {
    return listLatLonOut;
  }

  public String getLatitude() {
    return latitude;
  }

  public String getLongitude() {
    return longitude;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  @Override
  public String toString() {
    return "LatLonListZipCodeResponse{" +
           "listLatLonOut='" + listLatLonOut + '\'' +
           ", latitude='" + latitude + '\'' +
           ", longitude='" + longitude + '\'' +
           ", error='" + error + '\'' +
           '}';
  }
}
