package com.main.ws.service.impl;

import java.util.HashMap;
import java.util.Map;
import javax.jws.WebService;
import com.main.ws.beans.User;
import com.main.ws.service.UserService;

@WebService(endpointInterface = "com.main.ws.service.UserService")
public class UserServiceImpl implements UserService {

  private static Map<Integer, User> userMap = new HashMap<>();

  @Override
  public boolean addUser(int id, String name, int age) {
    System.out.println("userMap :"+userMap);
    System.out.println("addUser id :" + id + " name :" + name + " age :" + age);
    User user = new User(id, name, age);
    userMap.put(id, user);
    return true;
  }

  @Override
  public boolean deleteUser(int id) {
    System.out.println("deleteUser id :" + id);
    userMap.remove(id);
    return true;
  }

  @Override
  public User getUser(int id) {
    System.out.println("getUser id :" + id);
    User user = userMap.get(id);
    return user;
  }

  @Override
  public User[] getUsers() {
    System.out.println("getUsers method called");
    User[] userArr = new User[userMap.size()];
    userMap.values().toArray(userArr);
    return userArr;
  }

}
