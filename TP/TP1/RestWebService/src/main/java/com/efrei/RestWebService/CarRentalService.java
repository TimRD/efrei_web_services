package com.efrei.RestWebService;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarRentalService 
{
	private List<Car> cars = new ArrayList<Car>();
	
	public CarRentalService() 
	{
		cars.add(new Car("11AA22", 1000));
		cars.add(new Car("33BB44", 2222));
	}
	
	@RequestMapping(value="/cars", method=RequestMethod.GET) 
	@ResponseStatus(HttpStatus.OK) 
	public List<Car> getListOfCars()
	{
		return cars;
	}

	@RequestMapping(value = "/cars/{plateNumber}", method = RequestMethod.GET)    
	@ResponseStatus(HttpStatus.OK)    
	@ResponseBody
	public Car aCar(@PathVariable("plateNumber") String plateNumber) throws Exception
	{    
		for (Car c: cars)
		{
			if (c.getPlateNumber().equals(plateNumber))
				return c;
		}
		return null;
	}        

//	@RequestMapping(value = "/cars/{plateNumber}", method = RequestMethod.DELETE)
//	@ResponseStatus(HttpStatus.OK)    
//	public void getBack(@PathVariable("plateNumber") String plateNumber) throws Exception
//	{
//		for (Car c : cars)
//		{
//			if (c.getPlateNumber().equals(plateNumber))
//				
//			
//		}
//		return null;
//	}      

	@RequestMapping(value = "/cars/{plateNumber}", method = RequestMethod.PUT)    
	@ResponseStatus(HttpStatus.OK)    
	public void rent(@PathVariable("plateNumber") String plateNumber) throws Exception
	{
		for (Car c : cars)
		{
			if (c.getPlateNumber().equals(plateNumber))
			{
				c.getRent().setbegin("begin");
				c.getRent().setend("end");
				c.getRent().setbool(true);
			}
		}
	}    

//	@RequestMapping(value = "/voiture/{plateNumber}", method = RequestMethod.PUT)  
//	@ResponseStatus(HttpStatus.OK)   
//	public void rentAndGetBack(@PathVariable("plateNumber") String plateNumber, 
//	@RequestParam(value="rent", required = true)boolean rent) throws Exception
//	{
//		
//	}
//	

}
