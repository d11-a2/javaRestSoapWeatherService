package test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

import goodweather.weatherproviders.RestWeatherProvider;
import goodweather.weatherproviders.SoapWeatherProvider;

/**
 * Created by viktor on 08.11.17.
 */
public class Sample {

  public static void main(String[] args) {

   /* Pattern p = Pattern.compile("(\\s*\\d{1,6}(?:[-\\s]\\d{1,6})?\\s*)||((\\s*\\d{1,6}(?:[-\\s]\\d{1,6})?\\s*)(,\\s*\\d{1,6}(?:[-\\s]\\d{1,6})?\\s*)*)" +
                                "||((\\s*\\d{1,6}(?:[-\\s]\\d{1,6})?\\s*)( \\s*\\d{1,6}(?:[-\\s]\\d{1,6})?\\s*)*)");
    String zipCodes = "100055-43453 1-77";
    if (p.matcher(zipCodes).matches()) {
      System.out.println("match");
    }
    else { System.out.println("no match"); }
*/


    SoapWeatherProvider soapWeatherProvider = new SoapWeatherProvider();
    soapWeatherProvider.generateRequestAndResponse("92391 , 10007");
    System.out.println("SOAP RESPONSE");
    System.out.println(soapWeatherProvider.toString());

    System.out.println();

   /* RestWeatherProvider restWeatherProvider = new RestWeatherProvider();
    restWeatherProvider.setKEY("d5b955a26ea99839");
    restWeatherProvider.generateRequestAndResponse("92391 , 10007");
    System.out.println("REST RESPONSE");
    System.out.println(restWeatherProvider.toString());*/

  }
}
