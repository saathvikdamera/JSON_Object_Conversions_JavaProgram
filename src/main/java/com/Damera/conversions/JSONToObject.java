package com.Damera.conversions;

import java.io.File;
import java.io.IOException;

import com.Damera.entity.Customer;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONToObject {
	
	public static void convertToObject(File file) throws Exception, DatabindException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		Customer customer = mapper.readValue(file, Customer.class);
		System.out.println(customer);
	}

}
