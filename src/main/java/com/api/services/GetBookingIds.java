package com.api.services;

import java.util.LinkedHashMap;
import java.util.Map;

import com.project.spec.ProjectSpecificationMethods;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetBookingIds extends ProjectSpecificationMethods {

	public Response gettingAllBookingIds(RequestSpecification spec) {
		Response response = api.get(spec);
		return response;
	}
	
	public ValidatableResponse gettingBookingIdByName(RequestSpecification spec, String fName, String lName) {
		Map<String, String> queryParams = new LinkedHashMap<String, String>();
		queryParams.put("firstname", fName);
		queryParams.put("lastname", lName);
		ValidatableResponse response = api.get(spec, queryParams).then();
		return response;		
	}
	
	public int getSizeOftheBookingIds(ValidatableResponse response) {
		int size = api.getListSize(response);
		System.out.println(size);
		return size;
	}

}