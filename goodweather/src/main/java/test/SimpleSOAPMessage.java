package test;

import javax.xml.soap.*;

public class SimpleSOAPMessage {


    public static void main(String args[]) throws Exception {
        // Create SOAP Connection
        SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
        SOAPConnection soapConnection = soapConnectionFactory.createConnection();

        // Send SOAP SimpleSOAPMessage to SOAP Server
        String url = "http://graphical.weather.gov/xml/SOAP_server/ndfdXMLserver.php";
        soapConnection.call(createSOAPRequest(), url);

        // print SOAP Response
        System.out.print("Response SOAP SimpleSOAPMessage:");
        //soapResponse.writeTo(System.out);

        soapConnection.close();
    }

    private static SOAPMessage createSOAPRequest() throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        SOAPPart soapPart = soapMessage.getSOAPPart();

        String serverURI = "https://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl";

        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration("ns3591", serverURI);
        envelope.addNamespaceDeclaration("xsi", serverURI);


        // SOAP Body
        SOAPBody soapBody = envelope.getBody();
        SOAPElement soapBodyElem = soapBody.addChildElement("NDFDgenByDay", "ns3591");
        soapBody.setEncodingStyle("http://schemas.xmlsoap.org/soap/encoding/");
        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("startDate", "xsi");
        soapBodyElem1.addTextNode("2014-07-06");
        SOAPElement soapBodyElem2 = soapBodyElem.addChildElement("numDays", "xsi");
        soapBodyElem2.addTextNode("3");
        SOAPElement soapBodyElem3 = soapBodyElem.addChildElement("Unit", "xsi");
        soapBodyElem3.addTextNode("e");
        SOAPElement soapBodyElem4 = soapBodyElem.addChildElement("format", "xsi");
        soapBodyElem4.addTextNode("24 hourly");
        SOAPElement soapBodyElem5 = soapBodyElem.addChildElement("latitude", "xsi");
        soapBodyElem5.addTextNode("38.99");
        SOAPElement soapBodyElem6 = soapBodyElem.addChildElement("longitude", "xsi");
        soapBodyElem6.addTextNode("-77.01");
        soapMessage.saveChanges();

    /* Print the request message */
        System.out.print("Request SOAP SimpleSOAPMessage:");
        soapMessage.writeTo(System.out);
        System.out.println();

        return soapMessage;
    }

}
