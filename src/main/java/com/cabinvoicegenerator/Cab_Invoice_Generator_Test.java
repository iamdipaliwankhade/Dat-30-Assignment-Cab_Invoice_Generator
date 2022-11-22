package com.cabinvoicegenerator;

import org.junit.Assert;
import org.junit.Test;

public class Cab_Invoice_Generator_Test {
	@Test
	public void givenUserId_shouldReturnInvoiceSummary() {
		try {
			String userId = "me.shadab@gmail.com";
			Ride[] rides = { new Ride(2.0, 5), new Ride(0.1, 1) };
			Cab_Invoice_Generator.addRides(userId, rides);
			InvoiceSummary summary;

			summary = Cab_Invoice_Generator.calculateFare(rides, "normal");

			InvoiceSummary invoiceSummary = Cab_Invoice_Generator.getInvoiceSummary(userId);
			Assert.assertEquals(invoiceSummary, summary);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}