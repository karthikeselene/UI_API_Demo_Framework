package com.api.tests;

import org.testng.annotations.Test;

import com.api.services.CreateBookings;
import com.project.spec.ProjectSpecificationMethods;

import io.restassured.response.Response;

public class CreateBookingTest extends ProjectSpecificationMethods{
	
	CreateBookings bookings = new CreateBookings();	
	Response res;
		
	@Test
	public void test01_create_booking_valid_input() {
		res = bookings.createBookingWithValidInput(spec, "Jhon", "Node", 110, true, "2022-02-20", "2022-02-21", "Offical Trip");
		System.out.println(res.asPrettyString());
	}

}