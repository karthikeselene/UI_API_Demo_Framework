package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.api.services.GetBookingIds;
import com.project.spec.ProjectSpecificationMethods;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetBookingIdTest extends ProjectSpecificationMethods {
	
	GetBookingIds getBookingIds = new GetBookingIds();
	RequestSpecification spec;
	Response res;
	ValidatableResponse response;
	
	@BeforeClass
	public void beforeClass() {
		spec = api.setRequestSpecification("https://restful-booker.herokuapp.com/", "booking");
	}
	
	@Test
	public void test01_get_all_ids() {
		res = getBookingIds.gettingAllBookingIds(spec);	
		Assert.assertEquals(res.statusCode(), 200);
		Assert.assertEquals(res.statusLine(), "HTTP/1.1 200 OK");
	}
	
	@Test
	public void test02_filter_by_name() {
		response = getBookingIds.gettingBookingIdByName(spec, "Eric", "Brown");
		Assert.assertEquals(res.statusCode(), 200);
		Assert.assertEquals(res.statusLine(), "HTTP/1.1 200 OK");
		Assert.assertEquals(getBookingIds.getSizeOftheBookingIds(response), 1);
	}
	

}