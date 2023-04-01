package com.Damera.client;

import java.io.File;
import java.io.IOException;

import com.Damera.conversions.JSONToObject;
import com.Damera.conversions.ObjectToJSON;
import com.Damera.entity.Customer;
import com.fasterxml.jackson.databind.DatabindException;

public class Tester {
	
	public static void main(String[] args) throws Exception {
		/*
		Customer customer = new Customer();
		customer.setCustomerId(101);
		customer.setCustomerName("Shrehitha");
		customer.setGender("Female");
		customer.setLocation("Warangal");
		customer.setAge(19);
		
		
		ObjectToJSON.covertToJSON(customer, file);
		
		System.out.println("Oject inserted to json....");
		*/
		File file = new File("D:\\19-JFSD\\Java RealTime Project\\JRTP Workspace\\customer.json");
		
		JSONToObject.convertToObject(file);
	
	
	}

}
