package com.main.ws.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import com.main.ws.service.UserService;

public class UserServiceClient {

  public static void main(String[] args) throws MalformedURLException {
    URL wsdlURL = new URL("http://localhost:8888/user-service?wsdl");
    QName qName = new QName("http://impl.service.ws.main.com/", "UserServiceImplService");

    Service service = Service.create(wsdlURL, qName);

    UserService userService = service.getPort(UserService.class);

    System.out.println("Surendar user details added in the map :" + userService.addUser(10, "Surendar", 27));
    System.out.println("Deepan user details added in the map :" + userService.addUser(11, "Deepan", 30));
    System.out.println("Vivek user details added in the map :" + userService.addUser(12, "Vivek", 27));

    System.out.println("Deepan user details deleted in the map :" + userService.deleteUser(11));
    System.out.println("Surendar user details :" + userService.getUser(10));

    System.out.println("All user details :" + Arrays.asList(userService.getUsers()));
  }
}
