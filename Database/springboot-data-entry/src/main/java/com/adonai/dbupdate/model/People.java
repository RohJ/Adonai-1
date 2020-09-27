package com.adonai.dbupdate.model;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "people")
public class People {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long peopleId;

	private String firstname;

	private String lastname;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dob;

	private String gender;

	private String email;

	@OneToOne(mappedBy = "people", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
	private Membership membership;
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	private String address;

	private String pincode;
	
	private String mobilenumber;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Long getPeopleId() {
		return peopleId;
	}

	public void setPeopleId(Long id) {
		this.peopleId = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

}
