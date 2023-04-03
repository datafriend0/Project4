package com.proj3.bookCab.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.proj3.bookCab.Entity.Bookings;

@Repository
public interface BookingsRepository extends JpaRepository<Bookings, Integer> {

	// Total Fare Microservice:
	@Query ("select b from Bookings b where b.totalfare > :totalfare")
	public List<Bookings> searchBookingsBytotalFare(@Param("totalfare") int totalfare);
	
	// Planned upgrade to fare calculation for the Total Fare Microservice:
	// Query to pull back bookingID then add: baseFare + addfees + gratuity = update totalfare
	// addfees = (traveldistance)3 + (timedropoff - timepickup).75 + (passengercount)1.5
	// baseFare = 5
	
}