package nl.qien.dodo.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*
 * Een ticket heeft vooralsnog 
 * id	ticketnumber	eventname	seating	venuelocation	startdatetime	enddatetime
 */

@Entity
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ticketId;
	private String ticketNumber;
	private String ticketEventName;
	private String ticketSeating;
	private String ticketVenueLocation;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date ticketStartDateTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date ticketEndDateTime;
	
	public long getTicketId() {
		return ticketId;
	}
	public void setTicketId(long ticketId) {
		this.ticketId = ticketId;
	}
	public String getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public String getTicketEventName() {
		return ticketEventName;
	}
	public void setTicketEventName(String ticketEventName) {
		this.ticketEventName = ticketEventName;
	}
	public String getTicketSeating() {
		return ticketSeating;
	}
	public void setTicketSeating(String ticketSeating) {
		this.ticketSeating = ticketSeating;
	}
	public String getTicketVenueLocation() {
		return ticketVenueLocation;
	}
	public void setTicketVenueLocation(String ticketVenueLocation) {
		this.ticketVenueLocation = ticketVenueLocation;
	}
	public Date getTicketStartDateTime() {
		return ticketStartDateTime;
	}
	public void setTicketStartDateTime(Date ticketStartDateTime) {
		this.ticketStartDateTime = ticketStartDateTime;
	}
	public Date getTicketEndDateTime() {
		return ticketEndDateTime;
	}
	public void setTicketEndDateTime(Date ticketEndDateTime) {
		this.ticketEndDateTime = ticketEndDateTime;
	}
	
	

}
