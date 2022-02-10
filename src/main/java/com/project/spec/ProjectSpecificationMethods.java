package com.project.spec;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeSuite;

import com.api.wrappers.RestAssuredBase;

import io.restassured.specification.RequestSpecification;

public class ProjectSpecificationMethods {

	protected RestAssuredBase api = new RestAssuredBase();
	protected RequestSpecification spec;
	
	@BeforeSuite
	public void beforeSuite() {
		spec = api.setRequestSpecification("https://restful-booker.herokuapp.com/", "booking");		
	}
	
	public Map<String, String> getHeaders() {
		Map<String, String> header = new HashMap<String, String>();
		header.put("Content-Type", "application/json");
		header.put("Accept", "application/json");
		return header;
	}

}