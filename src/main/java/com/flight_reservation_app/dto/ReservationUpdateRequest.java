package com.flight_reservation_app.dto;

public class ReservationUpdateRequest {

	private long id;
	private boolean checkedIN;
	private int numberOfBags;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public boolean isCheckedIN() {
		return checkedIN;
	}
	public void setCheckedIN(boolean checkedIN) {
		this.checkedIN = checkedIN;
	}
	public int getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	
}
