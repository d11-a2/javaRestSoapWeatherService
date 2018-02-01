package goodweather.soap.clients;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.xml.transform.TransformerException;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceTemplate;

import goodweather.soap.latlonlistzipcode.LatLonListZipCodeResponse;
import goodweather.soap.ndfdgenlatlonlist.WeatherParametersType;
import goodweather.soap.ndfdgenlatlonlist.NDFDgenLatLonList;
import goodweather.soap.ndfdgenlatlonlist.NDFDgenLatLonListResponse;

/**
 * Created by nikita.shubarev@masterdata.ru on 17.11.2017.
 */
public class NDFDgenLatLonListClient extends WebServiceTemplate {

  private Jaxb2Marshaller         marshaller;
  private LatLonListZipCodeClient latLonListZipCodeClient;

  public NDFDgenLatLonListResponse getNDFDgenLatLonList(String zipCode) {

    marshaller = new Jaxb2Marshaller();
    marshaller.setContextPath("goodweather.soap.ndfdgenlatlonlist");

    setDefaultUri("https://graphical.weather.gov:443/xml/SOAP_server/ndfdXMLserver.php");
    setMarshaller(marshaller);
    setUnmarshaller(marshaller);

    latLonListZipCodeClient = new LatLonListZipCodeClient();
    LatLonListZipCodeResponse zipCodeResponse = latLonListZipCodeClient.getLatLonListZipCode(zipCode);
    NDFDgenLatLonListResponse response = null;

    if (zipCodeResponse.getError() != null) {
      response = new NDFDgenLatLonListResponse();
      response.setError(zipCodeResponse.getError());

      return response;
    }

    zipCodeResponse.setLatitudeAndlongitude();

    LocalDateTime localDateTime = LocalDateTime.now();

    NDFDgenLatLonList request = new NDFDgenLatLonList();
    request.setListLatLon(zipCodeResponse.getLatitudeAndlongitudeList());
    request.setProduct("time-series");
    request.setStartTime(localDateTime.toString());
    request.setEndTime(localDateTime.plusHours(1).toString());
    request.setUnit("m");
    request.setWeatherParameters(new WeatherParametersType(

      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true,
      true));

   /*
        //first request
        request.setLatitude("40.00");
        request.setLongitude("-77.01");
        request.setProduct("glance");
        request.setStartTime("2017-11-13T00:00:00");
        request.setEndTime("2017-11-14T00:00:00");
        request.setUnit("m");
  */

    try {
      response = (NDFDgenLatLonListResponse) marshalSendAndReceive(request, new WebServiceMessageCallback() {
        @Override
        public void doWithMessage(WebServiceMessage webServiceMessage) throws IOException, TransformerException {

        }
      });
    }
    catch (Exception e) {
      response = new NDFDgenLatLonListResponse();
      response.setError(e.getMessage());
    }

    return response;

  }
}