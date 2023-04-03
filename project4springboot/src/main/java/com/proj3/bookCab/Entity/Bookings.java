package com.proj3.bookCab.Entity;

import java.io.Serializable;
import javax.persistence.*;


//  Model Classes from previous => Entity Classes in this project

@Entity // To leverage Spring, these annotations need to be on all the major classes
@Table(name="bookings")
@NamedQuery(name="Bookings.findAllBookings", query="SELECT b FROM Bookings b")
public class Bookings implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id //ID annotation goes above the primary key only
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AutoIncrement
	@Column(name = "bookingid")
	int bookingid;
	@Column(name = "passengerid")
	String passengerid;
	@Column(name = "passengercount")
	int passengercount;
	@Column(name = "pickuplocation")
	String pickuplocation;
	@Column(name = "dropofflocation")
	String dropofflocation;
	@Column(name = "traveldistance")
	int traveldistance;
	@Column(name = "cabnumber")
	int cabnumber;
	@Column(name = "basefare")
	int basefare;
	@Column(name = "addfees")
	int addfees;
	@Column(name = "gratuity")
	int gratuity;
	@Column(name = "totalfare")
	int totalfare;
	/*
	 * @Column(name = "timedropoff") LocalDateTime timeDropoff;
	 * @Column(name = "timebooked") LocalDateTime timeBooked;
	 * @Column(name = "timepickup") LocalDateTime timePickup;
	 */
	
	public Bookings() {
		super();
	}

	public Bookings(int bookingid, String passengerid, int passengercount, String pickuplocation,
			String dropofflocation, int traveldistance, int cabnumber, int basefare, int addfees, int gratuity,
			int totalfare) {
		super();
		this.bookingid = bookingid;
		this.passengerid = passengerid;
		this.passengercount = passengercount;
		this.pickuplocation = pickuplocation;
		this.dropofflocation = dropofflocation;
		this.traveldistance = traveldistance;
		this.cabnumber = cabnumber;
		this.basefare = basefare;
		this.addfees = addfees;
		this.gratuity = gratuity;
		this.totalfare = totalfare;
	}

	public int getBookingid() {
		return bookingid;
	}

	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}

	public String getPassengerid() {
		return passengerid;
	}

	public void setPassengerid(String passengerid) {
		this.passengerid = passengerid;
	}

	public int getPassengercount() {
		return passengercount;
	}

	public void setPassengercount(int passengercount) {
		this.passengercount = passengercount;
	}

	public String getPickuplocation() {
		return pickuplocation;
	}

	public void setPickuplocation(String pickuplocation) {
		this.pickuplocation = pickuplocation;
	}

	public String getDropofflocation() {
		return dropofflocation;
	}

	public void setDropofflocation(String dropofflocation) {
		this.dropofflocation = dropofflocation;
	}

	public int getTraveldistance() {
		return traveldistance;
	}

	public void setTraveldistance(int traveldistance) {
		this.traveldistance = traveldistance;
	}

	public int getCabnumber() {
		return cabnumber;
	}

	public void setCabnumber(int cabnumber) {
		this.cabnumber = cabnumber;
	}

	public int getBasefare() {
		return basefare;
	}

	public void setBasefare(int basefare) {
		this.basefare = basefare;
	}

	public int getAddfees() {
		return addfees;
	}

	public void setAddfees(int addfees) {
		this.addfees = addfees;
	}

	public int getGratuity() {
		return gratuity;
	}

	public void setGratuity(int gratuity) {
		this.gratuity = gratuity;
	}

	public int getTotalfare() {
		return totalfare;
	}

	public void setTotalfare(int totalfare) {
		this.totalfare = totalfare;
	}

	@Override
	public String toString() {
		return "Bookings [bookingid=" + bookingid + ", passengerid=" + passengerid + ", passengercount="
				+ passengercount + ", pickuplocation=" + pickuplocation + ", dropofflocation=" + dropofflocation
				+ ", traveldistance=" + traveldistance + ", cabnumber=" + cabnumber + ", basefare=" + basefare
				+ ", addfees=" + addfees + ", gratuity=" + gratuity + ", totalfare=" + totalfare + "]";
	}

	
}