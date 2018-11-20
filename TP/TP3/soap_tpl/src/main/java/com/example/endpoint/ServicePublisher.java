package com.example.endpoint;
import com.example.ws.Car;
import com.example.ws.CarService;
import com.example.ws.CarServiceImpl;
import javax.xml.ws.Endpoint;

public class ServicePublisher
{
    public static void main(String[] args)
    {
        CarService c1 = new CarServiceImpl();
        c1.addCar(new Car("911GT2RS","Porsche",300000));
        c1.addCar(new Car("MDLS","Tesla",150000));
        Endpoint.publish("http://localhost:8080/ws/carservice", c1);
    }
}