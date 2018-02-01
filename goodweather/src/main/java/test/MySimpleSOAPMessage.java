package test;

import javax.xml.soap.*;
import java.io.IOException;

public class MySimpleSOAPMessage {

    public static void main(String[] args) {

        try {
            SOAPConnectionFactory connectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection connection = connectionFactory.createConnection();


            SOAPMessage request = createRequest();

            String destination =
                    "https://graphical.weather.gov:443/xml/SOAP_server/ndfdXMLserver.php";
            //Отправка
            SOAPMessage reply = connection.call(request, destination);

            System.out.println();
            System.out.println();
            System.out.println("RESPONSE");
            reply.writeTo(System.out);
            //Закрытие соединения
            connection.close();
        } catch (SOAPException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SOAPMessage createRequest() {


        try {
            MessageFactory factory = MessageFactory.newInstance();
            SOAPMessage message = factory.createMessage();

            SOAPPart part = message.getSOAPPart();
            SOAPEnvelope envelope = part.getEnvelope();
            envelope.setEncodingStyle("http://schemas.xmlsoap.org/soap/encoding/");

            SOAPBody body = envelope.getBody();
            body.addNamespaceDeclaration("xsi", "http://www.w3.org/1999/XMLSchema-instance");
            body.addNamespaceDeclaration("xsd", "http://www.w3.org/1999/XMLSchema");
            body.addNamespaceDeclaration("ns3591", "https://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl");
            SOAPElement element = body.addChildElement("NDFDgenByDay", "ns3591");

            element.addChildElement("latitude", "xsi").addTextNode("38.99");
            element.addChildElement("longitude", "xsi").addTextNode("-77.01");
            element.addChildElement("product", "xsi").addTextNode("time-series");
            element.addChildElement("startTime", "xsi").addTextNode("2016-01-01T00:00:00");
            element.addChildElement("endTime", "xsi").addTextNode("2018-02-12T00:00:00");
            element.addChildElement("Unit", "xsi").addTextNode("m");
            //element.addChildElement("weatherParameters").addAttribute(new NameImpl("maxt"), "0");


            message.saveChanges();

            System.out.println();
            System.out.println("\nREQUEST:\n");
            message.writeTo(System.out);


            return message;

        } catch (SOAPException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}



