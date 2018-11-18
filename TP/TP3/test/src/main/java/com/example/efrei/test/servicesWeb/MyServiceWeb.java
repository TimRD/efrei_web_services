package com.example.efrei.test.servicesWeb;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface MyServiceWeb {
    @WebMethod
    public void createEntity();
}