
package test.examples.com.webservicex.uszip;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.2-b05-RC1
 * Generated source version: 2.1
 * 
 */
@WebService(name = "USZipSoap", targetNamespace = "http://www.webserviceX.NET")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface USZipSoap {


    /**
     * Get State Code,City,Area Code,Time Zone,Zip Code by Zip Code
     * 
     * @param usZip
     * @return
     *     returns test.examples.com.webservicex.uszip.GetInfoByZIPResponse.GetInfoByZIPResult
     */
    @WebMethod(operationName = "GetInfoByZIP", action = "http://www.webserviceX.NET/GetInfoByZIP")
    @WebResult(name = "GetInfoByZIPResult", targetNamespace = "http://www.webserviceX.NET")
    @RequestWrapper(localName = "GetInfoByZIP", targetNamespace = "http://www.webserviceX.NET", className = "test.examples.com.webservicex.uszip.GetInfoByZIP")
    @ResponseWrapper(localName = "GetInfoByZIPResponse", targetNamespace = "http://www.webserviceX.NET", className = "test.examples.com.webservicex.uszip.GetInfoByZIPResponse")
    public test.examples.com.webservicex.uszip.GetInfoByZIPResponse.GetInfoByZIPResult getInfoByZIP(
        @WebParam(name = "USZip", targetNamespace = "http://www.webserviceX.NET")
        String usZip);

    /**
     * Get State Code,City,Area Code,Time Zone,Zip Code by City
     * 
     * @param usCity
     * @return
     *     returns test.examples.com.webservicex.uszip.GetInfoByCityResponse.GetInfoByCityResult
     */
    @WebMethod(operationName = "GetInfoByCity", action = "http://www.webserviceX.NET/GetInfoByCity")
    @WebResult(name = "GetInfoByCityResult", targetNamespace = "http://www.webserviceX.NET")
    @RequestWrapper(localName = "GetInfoByCity", targetNamespace = "http://www.webserviceX.NET", className = "test.examples.com.webservicex.uszip.GetInfoByCity")
    @ResponseWrapper(localName = "GetInfoByCityResponse", targetNamespace = "http://www.webserviceX.NET", className = "test.examples.com.webservicex.uszip.GetInfoByCityResponse")
    public test.examples.com.webservicex.uszip.GetInfoByCityResponse.GetInfoByCityResult getInfoByCity(
        @WebParam(name = "USCity", targetNamespace = "http://www.webserviceX.NET")
        String usCity);

    /**
     * Get State Code,City,Area Code,Time Zone,Zip Code by state
     * 
     * @param usState
     * @return
     *     returns test.examples.com.webservicex.uszip.GetInfoByStateResponse.GetInfoByStateResult
     */
    @WebMethod(operationName = "GetInfoByState", action = "http://www.webserviceX.NET/GetInfoByState")
    @WebResult(name = "GetInfoByStateResult", targetNamespace = "http://www.webserviceX.NET")
    @RequestWrapper(localName = "GetInfoByState", targetNamespace = "http://www.webserviceX.NET", className = "test.examples.com.webservicex.uszip.GetInfoByState")
    @ResponseWrapper(localName = "GetInfoByStateResponse", targetNamespace = "http://www.webserviceX.NET", className = "test.examples.com.webservicex.uszip.GetInfoByStateResponse")
    public test.examples.com.webservicex.uszip.GetInfoByStateResponse.GetInfoByStateResult getInfoByState(
        @WebParam(name = "USState", targetNamespace = "http://www.webserviceX.NET")
        String usState);

    /**
     * Get State Code,City,Area Code,Time Zone,Zip Code by Area Code
     * 
     * @param usAreaCode
     * @return
     *     returns test.examples.com.webservicex.uszip.GetInfoByAreaCodeResponse.GetInfoByAreaCodeResult
     */
    @WebMethod(operationName = "GetInfoByAreaCode", action = "http://www.webserviceX.NET/GetInfoByAreaCode")
    @WebResult(name = "GetInfoByAreaCodeResult", targetNamespace = "http://www.webserviceX.NET")
    @RequestWrapper(localName = "GetInfoByAreaCode", targetNamespace = "http://www.webserviceX.NET", className = "test.examples.com.webservicex.uszip.GetInfoByAreaCode")
    @ResponseWrapper(localName = "GetInfoByAreaCodeResponse", targetNamespace = "http://www.webserviceX.NET", className = "test.examples.com.webservicex.uszip.GetInfoByAreaCodeResponse")
    public test.examples.com.webservicex.uszip.GetInfoByAreaCodeResponse.GetInfoByAreaCodeResult getInfoByAreaCode(
        @WebParam(name = "USAreaCode", targetNamespace = "http://www.webserviceX.NET")
        String usAreaCode);

}
