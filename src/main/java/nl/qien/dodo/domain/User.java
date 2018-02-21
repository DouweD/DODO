package nl.qien.dodo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Columns;

/*
 * Een user heeft vooralsnog een id, username, first name, last name, email en phone number
 * 
 */

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String username;
	private String firstname;
	private String lastname;
	private String email;
	private String phonenumber;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
	}
	public String getFirstName() {
		return firstname;
	}
	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}
	public String getLastName() {
		return lastname;
	}
	public void setLastName(String lastName) {
		this.lastname = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phonenumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phonenumber = phoneNumber;
	}
	
	

}
