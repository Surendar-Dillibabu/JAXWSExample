package com.main.ws.publisher;

import javax.xml.ws.Endpoint;
import com.main.ws.service.impl.UserServiceImpl;

public class PublishUserService {

  public static void main(String[] args) {
    Endpoint.publish("http://localhost:8888/user-service", new UserServiceImpl());
  }
}
