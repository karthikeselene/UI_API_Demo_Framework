package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.services.GetBookingIds;
import com.project.spec.ProjectSpecificationMethods;

import io.restassured.response.Response;

public class GetBookingIdTest extends ProjectSpecificationMethods {
	
	GetBookingIds getBookingIds = new GetBookingIds();	
	Response res;	
	
	@Test
	public void test01_get_all_ids() {
		res = getBookingIds.gettingAllBookingIds(spec);	
		Assert.assertEquals(res.statusCode(), 200);
		Assert.assertEquals(res.statusLine(), "HTTP/1.1 200 OK");
	}
	
	@Test
	public void test02_filter_by_name() {
		res = getBookingIds.gettingBookingIdByName(spec, "falika", "BIravo");
		Assert.assertEquals(res.statusCode(), 200);
		Assert.assertEquals(res.statusLine(), "HTTP/1.1 200 OK");
		Assert.assertEquals(getBookingIds.getSizeOftheBookingIds(res), 1);
	}
	

}