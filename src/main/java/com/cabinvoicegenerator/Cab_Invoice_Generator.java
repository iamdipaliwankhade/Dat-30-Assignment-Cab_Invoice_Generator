package com.cabinvoicegenerator;

public class Cab_Invoice_Generator {
	private static final double MINIMUM_COST_PER_KILOMETER = 10.0;
	private static final int COST_PER_TIME = 1;
	private static final double MINIMUM_FARE = 5;
	private static RideRepository rideRepository;

	public static double calculateFare(double distance, int time) {
		double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
		return Math.max(totalFare, MINIMUM_FARE);
	}

	public Cab_Invoice_Generator() {
		this.rideRepository = new RideRepository();
	}

	public InvoiceSummary calculateFare(Ride[] rides) {
		double totalFare = 0;
		for (Ride ride : rides) {
			totalFare += this.calculateFare(ride.distance, ride.time);

		}
		return new InvoiceSummary(rides.length, totalFare);
	}

	public static InvoiceSummary calculateFare(Ride[] rides, String type) {
		double totalFare = 0;
		if (type == "premium") {
			for (Ride ride : rides) {
				totalFare += calculateFare(ride.distance, ride.time);
			}
			return new InvoiceSummary(rides.length, totalFare);
		}
		for (Ride ride : rides) {
			totalFare += calculateFare(ride.distance, ride.time);
		}
		return new InvoiceSummary(rides.length, totalFare);
	}

	public static void addRides(String userId, Ride[] rides) {
		rideRepository.addRide(userId, rides);
	}

	public static InvoiceSummary getInvoiceSummary(String userId) {
		return calculateFare(rideRepository.getRides(userId), "normal");
	}
}