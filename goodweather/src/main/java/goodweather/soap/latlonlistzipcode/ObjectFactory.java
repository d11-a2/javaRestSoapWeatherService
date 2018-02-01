package goodweather.soap.latlonlistzipcode;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

  public ObjectFactory() {
  }

  public LatLonListZipCodeResponse createNDFDgenResponse() {
    return new LatLonListZipCodeResponse();
  }

  public LatLonListZipCode createNDFDgen() {
    return new LatLonListZipCode();
  }

}
