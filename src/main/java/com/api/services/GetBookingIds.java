package com.api.services;

import java.util.LinkedHashMap;
import java.util.Map;

import com.project.spec.ProjectSpecificationMethods;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetBookingIds extends ProjectSpecificationMethods {

	public Response gettingAllBookingIds(RequestSpecification spec) {
		Response response = api.get(spec);
		return response;
	}
	
	public Response gettingBookingIdByName(RequestSpecification spec, String fName, String lName) {
		Map<String, String> queryParams = new LinkedHashMap<String, String>();
		queryParams.put("firstname", fName);
		queryParams.put("lastname", lName);
		Response response = api.get(spec, queryParams);
		return response;		
	}
	
	public int getSizeOftheBookingIds(Response response) {
		int size = api.getListSize(response);
		System.out.println(size);
		return size;
	}

}