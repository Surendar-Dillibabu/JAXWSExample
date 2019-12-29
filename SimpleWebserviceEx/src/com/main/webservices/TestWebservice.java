package com.main.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.Endpoint;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public class TestWebservice {

  @WebMethod
  public String greetingMsg(String name) {
    System.out.println("name :"+name);
    return "Hi, " + name;
  }

  public static void main(String[] args) {
    Endpoint.publish("http://localhost:8888/testws", new TestWebservice());
  }
}
