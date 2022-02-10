package com.api.services;

import com.api.pojo.serialization.BookingDates;
import com.api.pojo.serialization.CreateBooking;
import com.project.spec.ProjectSpecificationMethods;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateBookings extends ProjectSpecificationMethods {
	
	public Response createBookingWithValidInput(RequestSpecification spec, String fName, String lName, int price, boolean bValue, String checkIn,String checkOut, String needs) {
		CreateBooking booking = new CreateBooking();
		BookingDates dates = new BookingDates();
		booking.setFirstname(fName);
		booking.setLastname(lName);
		booking.setTotalprice(price);
		booking.setDepositpaid(bValue);
		dates.setCheckin(checkIn);
		dates.setCheckout(checkOut);
		booking.setDates(dates);
		booking.setAdditionalneeds(needs);
		Response response = api.post(spec, getHeaders(), booking);
		return response;
	}

}