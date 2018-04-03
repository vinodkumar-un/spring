package com.rb.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "BUS")
public class Bus {
	@Id
	@GeneratedValue(generator = "hib_increment")
	@GenericGenerator(name = "hib_increment", strategy = "increment")
	@Column(name = "BUS_NO")
	protected int busNo;
	@Column(name = "SERVICE_NO")
	protected String serviceNo;
	protected String type;
	protected int capacity;

	@OneToMany(mappedBy = "bus")
	protected Set<Journey> journeys;

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public String getServiceNo() {
		return serviceNo;
	}

	public void setServiceNo(String serviceNo) {
		this.serviceNo = serviceNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Set<Journey> getJourneys() {
		return journeys;
	}

	public void setJourneys(Set<Journey> journeys) {
		this.journeys = journeys;
	}

}
