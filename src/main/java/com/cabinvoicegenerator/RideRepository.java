package com.cabinvoicegenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RideRepository {
	int id;
	   double totalDistance;
	   double totalRidesDuration;

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public double getTotalDistance() {
	        return totalDistance;
	    }

	    public void setTotalDistance(double totalDistance) {
	        this.totalDistance = totalDistance;
	    }

	    public double getTotalRidesDuration() {
	        return totalRidesDuration;
	    }

	    public void setTotalRidesDuration(double totalRidesDuration) {
	        this.totalRidesDuration = totalRidesDuration;
	    }

	    public RideRepository(int id, double totalDistance, double totalRidesDuration) {
	        this.id = id;
	        this.totalDistance = totalDistance;
	        this.totalRidesDuration = totalRidesDuration;
	    }

	    public double getTotalRideDuration() {
	        return getTotalRidesDuration();
	    }
}