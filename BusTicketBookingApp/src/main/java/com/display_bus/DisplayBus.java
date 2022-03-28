package com.display_bus;

public class DisplayBus {
	public Integer busId;
	public String busName;
	public String busFrom;
	public String busTo;
	public String busDate;
	public String busTiming;
	
	public Integer busTickets;
	public Integer busTicketPrice;

	public DisplayBus(Integer busId,String busName, String busFrom, String busTo, String busDate, String busTiming,
			Integer busTickets, Integer busTicketPrice) {
		super();
		this.busId = busId;
		this.busName = busName;
		this.busFrom = busFrom;
		this.busTo = busTo;
		this.busDate = busDate;
		this.busTiming = busTiming;
		this.busTickets = busTickets;
		this.busTicketPrice = busTicketPrice;
	}
	
	public DisplayBus(String busName, String busFrom, String busTo, String busDate, String busTiming,
			Integer busTickets, Integer busTicketPrice) {
		super();
		this.busName = busName;
		this.busFrom = busFrom;
		this.busTo = busTo;
		this.busDate = busDate;
		this.busTiming = busTiming;
		this.busTickets = busTickets;
		this.busTicketPrice = busTicketPrice;
	}

public DisplayBus(String busName, String busFrom, String busTo, String busTiming) {
	super();
	this.busName = busName;
	this.busFrom = busFrom;
	this.busTo = busTo;
	this.busTiming = busTiming;
}






/**
 * @param busName
 * @param busFrom
 * @param busTo
 */
public DisplayBus(String busName, String busFrom, String busTo) {
	super();
	this.busName = busName;
	this.busFrom = busFrom;
	this.busTo = busTo;
}


/**
 * @param busFrom
 */
public DisplayBus(String busFrom) {
	super();
	this.busFrom = busFrom;
}



/**
 * @param busTo
 */



public DisplayBus(Integer busId, String busName) {
	super();
	this.busId= busId;
	this.busName = busName;
}

	

public DisplayBus(Integer busId, Integer busTickets) {
	this.busId=busId;
	this.busTickets=busTickets;
	// TODO Auto-generated constructor stub
}
public DisplayBus(Integer busTicketPrice) {
	// TODO Auto-generated constructor stub
	this.busTicketPrice=busTicketPrice;
}

@Override
public String toString() {
	return '\n'+ busId +"     "+ busName + "      "+ busFrom +"       "+ busTo +"      "+ busDate+"      "+ busTiming ;
	}

}