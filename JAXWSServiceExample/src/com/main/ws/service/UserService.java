package com.main.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import com.main.ws.beans.User;

@WebService
@SOAPBinding(style = Style.RPC)
public interface UserService {

  @WebMethod
  public boolean addUser(int id, String name, int age);

  @WebMethod
  public boolean deleteUser(int id);

  @WebMethod
  public User getUser(int id);

  @WebMethod
  public User[] getUsers();
}
