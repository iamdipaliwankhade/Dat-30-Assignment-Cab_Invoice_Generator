package com.cabinvoicegenerator;

import org.junit.Assert;
import org.junit.Test;

public class Cab_Invoice_Generator_Test {
	@Test
	public void CalculateFareTest()  {
		Cab_Invoice_Generator obj=new Cab_Invoice_Generator();
		double test=obj.calculateFare(10, 15);
		double test1=obj.calculateFare(10, 15)+obj.calculateFare(10, 15);;
		Assert.assertEquals(230.0, test1, 0.0);
	}
	@Test
	public void MonthFareTest()  {
		Cab_Invoice_Generator obj=new Cab_Invoice_Generator();
		Ride[] rides= { new Ride(1,23), new Ride(1,2)};
		double monthfare=obj.calculateFare(rides);
		Assert.assertEquals(45.0,monthfare , 0.0);
		
		}
}