package com.cabinvoicegenerator;

import org.junit.Assert;
import org.junit.Test;

public class Cab_Invoice_Generator_Test {
	@Test
    public void test() {
		Cab_Invoice_Generator obj = new Cab_Invoice_Generator();
        Assert.assertEquals(120.0,obj.getInvoice(10, 20,"R"), 0);
    }

    @Test
    public void test1() {
    	Cab_Invoice_Generator obj = new Cab_Invoice_Generator();    
    	Assert.assertEquals(240.0, obj.generateInvoiceAsPerUserID(5),0);
    }
    @Test
    public void test2() {
    	Cab_Invoice_Generator obj = new Cab_Invoice_Generator();
    	Assert.assertEquals(220.0,obj.getInvoice(10, 20,"P"), 0);
    }
}