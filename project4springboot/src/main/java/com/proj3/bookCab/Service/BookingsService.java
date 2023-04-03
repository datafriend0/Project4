package com.proj3.bookCab.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proj3.bookCab.Entity.Bookings;
import com.proj3.bookCab.Repository.BookingsRepository;

@Service
public class BookingsService {

	@Autowired
	BookingsRepository bookingsRepository;
	
	public String storeBooking(Bookings booking) {
		bookingsRepository.save(booking); // Insert query (Create)RUD
		System.out.println("[Bookings Service] - Booking "+booking.getBookingid()+" stored successfully");
		return "Booking stored successfully";
	}
	
	public List<Bookings> findAllBookings() {
		System.out.println("[Bookings Service] - Find all bookings successful");
		return bookingsRepository.findAll(); // Select query C(Read)UD
	}
	
	public Bookings findBookingById(int bookingid) { //C(Read)UD
		Optional <Bookings> result = bookingsRepository.findById(bookingid);
		if(result.isPresent()) {
			Bookings bb = result.get();
			System.out.println("[Bookings Service] - Booking "+bookingid+" found successfully");
			return bb;
		}else {
			return null;
		}
	}
	
	public String updateBookingDetails(Bookings booking) {
		Optional<Bookings> result = bookingsRepository.findById(booking.getBookingid()); //Using Primary Key
		if (result.isPresent()) {
			Bookings bb = result.get();
			
			bb.setPassengercount(booking.getPassengercount());
			bb.setPickuplocation(booking.getPickuplocation()); // CR(Update)D
			bb.setDropofflocation(booking.getDropofflocation());
			bb.setTraveldistance(booking.getTraveldistance());
			bb.setCabnumber(booking.getCabnumber());
			bb.setBasefare(booking.getBasefare());
			bb.setAddfees(booking.getAddfees());
			bb.setGratuity(booking.getGratuity());
			bb.setTotalfare(booking.getBasefare());
			// Add other editable parameters here!
			
			bookingsRepository.saveAndFlush(bb);
			System.out.println("[Bookings Service] - Booking "+booking.getBookingid()+" updated successfully");
			return "Booking details updated successfully";
		}else {
			System.out.println("[Bookings Service] - Failure: Booking not updated");
			return "[Update Booking Details] Booking not found";
		}
	}
	
	public String deleteBookingById(int bookingid) { // Delete query CRU(Delete)
		Optional <Bookings> result = bookingsRepository.findById(bookingid);
		if(result.isPresent()) {
			Bookings bb = result.get();
			bookingsRepository.deleteById(bb.getBookingid());
			System.out.println("[Bookings Service] - Booking "+bookingid+" deleted successfully");
			return "Booking cancelled successfully";
		}else {
			return "[Delete Booking by ID] Booking not found";
		}
	}
	
	public String deleteAllBookings() { // Delete all query 
		bookingsRepository.deleteAll();
		System.out.println("[Bookings Service] - All bookings deleted successfully");
		return "[Delete All Bookings] All Bookings cancelled successfully";
	}
	
	public List<Bookings> findBookingsBytotalFare(int totalfare) {
		return bookingsRepository.searchBookingsBytotalFare(totalfare);
	} // BookingsbytotalFare was defined in BookingsRepository and then called here.
}
