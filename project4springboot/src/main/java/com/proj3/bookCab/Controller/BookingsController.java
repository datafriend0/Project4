package com.proj3.bookCab.Controller;

import org.springframework.http.MediaType;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proj3.bookCab.Entity.Bookings;
import com.proj3.bookCab.Service.BookingsService;

@RestController
@RequestMapping("/bookings") //http:localhost:8080/bookings
@CrossOrigin("*")
public class BookingsController {

	@Autowired
	BookingsService bookingService;
	
	// http://localhost:9090/bookings/storeBooking
	// Pass data in JSON format
	@PostMapping(value="storeBooking",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE) //, consumes= MediaType.APPLICATION_JSON_VALUE
	@CrossOrigin("*")
	public String storeBooking (@RequestBody Bookings booking) {
		System.out.println("[Bookings Controller] - Booking store processed -> Booking Service");
		return bookingService.storeBooking(booking);
	}
	
	// http://localhost:9090/bookings/findAllBookings
		//produces = MediaType.APPLICATION_JSON_VALUE
	@GetMapping("/findAllBookings")
	public List<Bookings> findAllBookings() {
		System.out.println("[Bookings Controller] - Find all bookings processed -> Booking Service");
		return bookingService.findAllBookings();
	}
	
	// http://localhost:9090/bookings/findBookingById/1
	@GetMapping("/findBookingById/{bookingid}")
	public Bookings findBookingById(@PathVariable("bookingid") int bookingid) {
		System.out.println("[Bookings Controller] - Find booking by ID processed -> Booking Service");
		return bookingService.findBookingById(bookingid);
	}
	
	// http://localhost:9090/bookings/updateBooking
			// consumes = MediaType.APPLICATION_JSON_VALUE
	@PutMapping("/updateBooking")
	public String updateBooking(@RequestBody Bookings booking) {
		System.out.println("[Bookings Controller] - Booking update processed -> Booking Service");
		return bookingService.updateBookingDetails(booking);
	}
	
	// http://localhost:9090/bookings/deleteBookingById/1
	@DeleteMapping("/deleteBookingById/{bookingid}")
	public String deleteBookingById(@PathVariable("bookingid") int bookingid) {
		System.out.println("[Bookings Controller] - Booking deletion processed -> Booking Service");
		return bookingService.deleteBookingById(bookingid);
	}
	
	// http://localhost:9090/bookings/deleteAllBookings
	@DeleteMapping("/deleteAllBookings")
	public String deleteAllBookings() {
		System.out.println("[Bookings Controller] - Delete all bookings processed -> Booking Service");
		return bookingService.deleteAllBookings();
	}
	
}
