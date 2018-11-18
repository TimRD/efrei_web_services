package com.example.efrei.test;

import com.example.efrei.test.servicesWeb.MyServiceWeb;
import com.example.efrei.test.servicesWeb.MyServiceWebImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.ws.Endpoint;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args)
	{
		MyServiceWeb myServiceWeb = new MyServiceWebImpl();
		Endpoint.publish("http://localhost:8080/WS/MonServiceWeb",myServiceWeb);
		//SpringApplication.run(TestApplication.class, args);
	}
}
