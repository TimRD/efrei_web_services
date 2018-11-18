package com.example.CarRental;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;

@RestController
public class CarRentalService {
	
	private List<Car> cars = new ArrayList<Car>();
	
	public CarRentalService() {
		cars.add(new Car("11AA22", "Ferrari", 1000));
		cars.add(new Car("33BB44", "Porshe", 2222));
	}
	
	@RequestMapping(value="/cars", method=RequestMethod.GET) 
	@ResponseStatus(HttpStatus.OK) 
	public List<Car> getListOfCars(){
		return cars;
	}

	//Methode 1
	@RequestMapping(value = "/cars", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void addCar(@RequestBody Car car) throws Exception {
		System.out.println(car);
		cars.add(car);
	}

	/*
	//Methode 2
	@RequestMapping(value = "/cars", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void addCar(
			@RequestParam (value="plateNumberId", required = true) String plateNumberId,
			@RequestParam (value="brandId", required = true) String brandId,
			@RequestParam (value="priceId", required = true) String priceId) throws Exception {
		System.out.println("ok");
		Car c= new Car(plateNumberId,brandId,Integer.parseInt(priceId));
		System.out.println(c);
		cars.add(c);
	}
	*/

	@RequestMapping(value= "/cars", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void removeCar(@RequestBody Car ce) throws Exception
	{
		for (Car c : cars)
		{
			if (c.getPlateNumber().equals(ce.getPlateNumber()))
				cars.remove(c);
		}
	}


}
