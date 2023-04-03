package com.proj3.bookCab.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

// Model Classes from previous => Entity Classes in this project
@Entity
public class Cabs {
	@Id //ID annotation goes above the primary key only
	@Column(name = "cabnumber")
	int cabnumber;
	@Column(name = "cabinuse")
	boolean cabinuse;
	@Column(name = "cablocation")
	String cablocation;
	@Column(name = "cabmakemodel")
	String cabmakemodel;
	@Column(name = "cabcapacity")
	int cabcapacity;
	@Column(name = "cabdriver")
	String cabdriver;
	@Column(name = "cabschedule")
	String cabschedule;
	@Column(name = "cabnextpickuplocation")
	String cabnextpickuplocation;
	
	public Cabs() {
		super();
	}

	public Cabs(int cabnumber, boolean cabinuse, String cablocation, String cabmakemodel, int cabcapacity,
			String cabdriver, String cabschedule, String cabnextpickuplocation) {
		super();
		this.cabnumber = cabnumber;
		this.cabinuse = cabinuse;
		this.cablocation = cablocation;
		this.cabmakemodel = cabmakemodel;
		this.cabcapacity = cabcapacity;
		this.cabdriver = cabdriver;
		this.cabschedule = cabschedule;
		this.cabnextpickuplocation = cabnextpickuplocation;
	}

	public int getCabnumber() {
		return cabnumber;
	}

	public void setCabnumber(int cabnumber) {
		this.cabnumber = cabnumber;
	}

	public boolean isCabinuse() {
		return cabinuse;
	}

	public void setCabinuse(boolean cabinuse) {
		this.cabinuse = cabinuse;
	}

	public String getCablocation() {
		return cablocation;
	}

	public void setCablocation(String cablocation) {
		this.cablocation = cablocation;
	}

	public String getCabmakemodel() {
		return cabmakemodel;
	}

	public void setCabmakemodel(String cabmakemodel) {
		this.cabmakemodel = cabmakemodel;
	}

	public int getCabcapacity() {
		return cabcapacity;
	}

	public void setCabcapacity(int cabcapacity) {
		this.cabcapacity = cabcapacity;
	}

	public String getCabdriver() {
		return cabdriver;
	}

	public void setCabdriver(String cabdriver) {
		this.cabdriver = cabdriver;
	}

	public String getCabschedule() {
		return cabschedule;
	}

	public void setCabschedule(String cabschedule) {
		this.cabschedule = cabschedule;
	}

	public String getCabnextpickuplocation() {
		return cabnextpickuplocation;
	}

	public void setCabnextpickuplocation(String cabnextpickuplocation) {
		this.cabnextpickuplocation = cabnextpickuplocation;
	}

	@Override
	public String toString() {
		return "Cabs [cabnumber=" + cabnumber + ", cabinuse=" + cabinuse + ", cablocation=" + cablocation
				+ ", cabmakemodel=" + cabmakemodel + ", cabcapacity=" + cabcapacity + ", cabdriver=" + cabdriver
				+ ", cabschedule=" + cabschedule + ", cabnextpickuplocation=" + cabnextpickuplocation + "]";
	}

	
}
