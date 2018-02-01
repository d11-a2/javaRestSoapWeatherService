
package test.examples.com.webservicex.stockquote;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.2-b05-RC1
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "StockQuote", targetNamespace = "http://www.webserviceX.NET/", wsdlLocation = "http://www.webservicex.com/stockquote.asmx?WSDL")
public class StockQuote
    extends Service
{

    private final static URL STOCKQUOTE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(StockQuote.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = StockQuote.class.getResource(".");
            url = new URL(baseUrl, "http://www.webservicex.com/stockquote.asmx?WSDL");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://www.webservicex.com/stockquote.asmx?WSDL', retrying as a local file");
            logger.warning(e.getMessage());
        }
        STOCKQUOTE_WSDL_LOCATION = url;
    }

    public StockQuote(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StockQuote() {
        super(STOCKQUOTE_WSDL_LOCATION, new QName("http://www.webserviceX.NET/", "StockQuote"));
    }

    /**
     * 
     * @return
     *     returns StockQuoteSoap
     */
    @WebEndpoint(name = "StockQuoteSoap")
    public StockQuoteSoap getStockQuoteSoap() {
        return super.getPort(new QName("http://www.webserviceX.NET/", "StockQuoteSoap"), StockQuoteSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StockQuoteSoap
     */
    @WebEndpoint(name = "StockQuoteSoap")
    public StockQuoteSoap getStockQuoteSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET/", "StockQuoteSoap"), StockQuoteSoap.class, features);
    }

}
