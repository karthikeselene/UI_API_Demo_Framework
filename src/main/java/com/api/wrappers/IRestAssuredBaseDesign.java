package com.api.wrappers;

import java.util.Map;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public interface IRestAssuredBaseDesign {	
	
	/**
	 * This method is used to set the base URI and base path across all
	 * request of the testing apis
	 * @param bUri - Passing base URI as a String argument
	 * @param bPath - Passing base URI as a String argument
	 * @return Object of the RequestSpecification Interface
	 */
	public RequestSpecification setRequestSpecification(String bUri, String bPath);
	
	/**
	 * This method used to perform the get http calls
	 * @param spec - Object of the RequestSpecification Interface as an argument  
	 * @return Response of the get call as a Object
	 */
	public Response get(RequestSpecification spec);
	
	/**
	 * This method used to perform the get http calls
	 * @param spec - Object of the RequestSpecification Interface as an argument  
	 * @param url - Passing resource url as a String argument
	 * @return Response of the get call as a Object
	 */
	public Response get(RequestSpecification spec, String url);
	
	/**
	 * This method used to perform the get http calls with query parameter
	 * @param spec - Object of the RequestSpecification Interface as an argument  
	 * @param url - Passing resource url as a String argument
	 * @param key - Passing query parameter key  as a String argument
	 * @param value - Passing query parameter value  as a String argument
	 * @return Response of the get call as a Object
	 */
	public Response get(RequestSpecification spec, String url, String key, String value);
	
	/**
	 * This method used to perform the get http calls with query parameters
	 * @param spec - Object of the RequestSpecification Interface as an argument
	 * @param queryParams - Multiple query params on the format of Map object
	 * @return Response of the get call as a Object
	 */
	public Response get(RequestSpecification spec, Map<String,String> queryParams);
	
	/**
	 * This method is used to get the JSON array size
	 * @param response - Passing JSON Response interface object
	 * @param jsonPath - Passing Jsonpath as a String
	 * @return size of the list object
	 */
	public int getListSize(Response response, String jsonPath);
	
	/**
	 * This method is used to get the JSON array size of root path
	 * @param response - Passing JSON Response interface object
	 * @return size of the list object
	 */
	public int getListSize(Response response);

}
