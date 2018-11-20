package com.example.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.WebServiceProvider;
import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService
{
    private List<Car> cars = new ArrayList<>();

    @Override
    public Car getCar(String plateNumber)
    {
        for (Car c: cars)
        {
            if (c.getPlateNumber().equals(plateNumber))
                return c;
        }
        System.out.println("Can't find the car");
        return null;
    }

    @Override
    public boolean rentCar(String plateNumber)
    {
        boolean b_break=false;
        for (Car c: cars)
        {
            if (c.getPlateNumber().equals(plateNumber)) {
                if (c.getRent())
                    return false;
                else {
                    c.setRent(true);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean getBackCar(String plateNumber)
    {
        for (Car c: cars)
        {
            if (c.getPlateNumber().equals(plateNumber)) {
                if (c.getRent()) {
                    c.setRent(false);
                    return true;
                }
            }
        }
        return false;
    }
}
