package com.example.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CarService
{
    @WebMethod
    Car getCar(String plateNumber);

    @WebMethod
    boolean rentCar(String plateNumber);

    @WebMethod
    boolean getBackCar(String plateNumber);
}
