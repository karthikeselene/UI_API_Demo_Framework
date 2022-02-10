package com.api.wrappers;

import java.util.ArrayList;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class RestAssuredBase implements IRestAssuredBaseDesign {	

	public RequestSpecification setRequestSpecification(String bUri, String bPath) {		
		return RestAssured.given().baseUri(bUri).basePath(bPath);
	}

	public Response get(RequestSpecification spec) {		
		return spec.get();
	}

	public Response get(RequestSpecification spec, String url) {		
		return spec.get(url);
	}

	public Response get(RequestSpecification spec, String url, String key, String value) {		
		return spec.queryParam(key, value).get(url);
	}	

	public Response get(RequestSpecification spec, Map<String,String> queryParams) {		
		return spec.queryParams(queryParams).get();
	}
	
	public int getListSize(Response response, String jsonPath) {
		return response.jsonPath().getList(jsonPath).size();
	}
	
	public int getListSize(ValidatableResponse response) {
		ArrayList<Map<String,?>> list = response.extract().jsonPath().get("");
		return list.size();
	}

}