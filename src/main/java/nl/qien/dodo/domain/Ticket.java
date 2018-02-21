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
	private long ticketid;
	private String ticketnumber;
	private String ticketeventname;
	private String ticketseating;
	private String ticketvenuelocation;

	@Temporal(TemporalType.TIMESTAMP)
	private Date ticketstartdatetime;

	@Temporal(TemporalType.TIMESTAMP)
	private Date ticketenddatetime;

	public long getTicketid() {
		return ticketid;
	}

	public void setTicketid(long ticketid) {
		this.ticketid = ticketid;
	}

	public String getTicketnumber() {
		return ticketnumber;
	}

	public void setTicketnumber(String ticketnumber) {
		this.ticketnumber = ticketnumber;
	}

	public String getTicketeventname() {
		return ticketeventname;
	}

	public void setTicketeventname(String ticketeventname) {
		this.ticketeventname = ticketeventname;
	}

	public String getTicketseating() {
		return ticketseating;
	}

	public void setTicketseating(String ticketseating) {
		this.ticketseating = ticketseating;
	}

	public String getTicketenuelocation() {
		return ticketvenuelocation;
	}

	public void setTicketenuelocation(String ticketenuelocation) {
		this.ticketvenuelocation = ticketenuelocation;
	}

	public Date getTicketstartdatetime() {
		return ticketstartdatetime;
	}

	public void setTicketstartdatetime(Date ticketstartdatetime) {
		this.ticketstartdatetime = ticketstartdatetime;
	}

	public Date getTicketenddatetime() {
		return ticketenddatetime;
	}

	public void setTicketenddatetime(Date ticketenddatetime) {
		this.ticketenddatetime = ticketenddatetime;
	}

}
