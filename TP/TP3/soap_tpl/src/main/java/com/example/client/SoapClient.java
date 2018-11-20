package com.example.client;
import com.example.client.service.*;

public class SoapClient {
    public static void main(String[] args) {
         //Instance
        CarServiceImplService serviceImpl = new CarServiceImplService();
        CarService carService = serviceImpl.getCarServiceImplPort();

        //Requests
        carService.getCar("911GT2RS");
        System.out.println(carService.getCar("911GT2RS").toString());
        System.out.println(carService.rentCar("911GT2RS"));  //true
        System.out.println(carService.rentCar("911GT2RS"));  //false
        System.out.println(carService.getBackCar("911GT2RS")); //true
    }
}
