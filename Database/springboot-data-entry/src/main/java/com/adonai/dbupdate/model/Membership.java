package com.adonai.dbupdate.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "membership")
public class Membership {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "peopleId", nullable = false)
	private People people;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date membershipDate;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}

	public Date getMembershipDate() {
		return membershipDate;
	}

	public void setMembershipDate(Date membershipDate) {
		this.membershipDate = membershipDate;
	}

}
