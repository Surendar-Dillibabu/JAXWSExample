package com.main.ws.client;

import java.util.Arrays;
import com.main.ws.service.impl.UserService;
import com.main.ws.service.impl.UserServiceImplService;

public class UserServiceClient {

  public static void main(String[] args) {
    UserServiceImplService userServiceImpl = new UserServiceImplService();
    UserService userService = userServiceImpl.getUserServiceImplPort();

    System.out.println("Surendar user details added in the map :" + userService.addUser(10, "Surendar", 27));
    System.out.println("Deepan user details added in the map :" + userService.addUser(11, "Deepan", 30));
    System.out.println("Vivek user details added in the map :" + userService.addUser(12, "Vivek", 27));

    System.out.println("Deepan user details deleted in the map :" + userService.deleteUser(11));
    System.out.println("Surendar user details :" + userService.getUser(10));

    System.out.println("All user details :" + Arrays.asList(userService.getUsers()));
  }
}
