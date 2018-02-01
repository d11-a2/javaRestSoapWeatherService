package goodweather.soap.ndfdgenlatlonlist;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public NDFDgenLatLonListResponse createNDFDgenLatLonListResponse() {
        return new NDFDgenLatLonListResponse();
    }

    public NDFDgenLatLonList createNDFDgenLatLonList() {
        return new NDFDgenLatLonList();
    }


}
