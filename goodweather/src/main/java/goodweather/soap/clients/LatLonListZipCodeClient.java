package goodweather.soap.clients;

import java.io.IOException;

import javax.xml.transform.TransformerException;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceTemplate;

import goodweather.soap.latlonlistzipcode.LatLonListZipCode;
import goodweather.soap.latlonlistzipcode.LatLonListZipCodeResponse;

/**
 * Created by nikita.shubarev@masterdata.ru on 13.11.2017.
 */
public class LatLonListZipCodeClient extends WebServiceTemplate {

  private Jaxb2Marshaller marshaller;

  public LatLonListZipCodeResponse getLatLonListZipCode(String zipCode) {

    LatLonListZipCode request = new LatLonListZipCode();
    request.setZipCodeList(zipCode);

    marshaller = new Jaxb2Marshaller();
    marshaller.setContextPath("goodweather.soap.latlonlistzipcode");

    setDefaultUri("https://graphical.weather.gov:443/xml/SOAP_server/ndfdXMLserver.php");
    setMarshaller(marshaller);
    setUnmarshaller(marshaller);

    LatLonListZipCodeResponse response = null;

    try {
      response = (LatLonListZipCodeResponse) marshalSendAndReceive(request, new WebServiceMessageCallback() {
        @Override
        public void doWithMessage(WebServiceMessage webServiceMessage) throws IOException, TransformerException {
        }
      });
    }
    catch (Exception e) {

      response = new LatLonListZipCodeResponse();
      response.setError(e.getLocalizedMessage() + zipCode);
    }

    return response;
  }
}
