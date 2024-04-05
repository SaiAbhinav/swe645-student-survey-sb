package com.survey.SurveyApplication.Model;


import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name="survey")
public class SurveyForm {
	
	@Id
	private int id;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="streetaddress")
	private String streetaddress;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="zip")
	private int zip;
	
	@Column(name="telephone")
	private String telephone;
	
	@Column(name="email")
	private String email;
	
	@Column(name="dateofsurvey")
	private Date dateofsurvey;
	
	@Column(name="likings", columnDefinition="json")
	@Convert(converter = StringArrayConverter.class)
	private String[] likings;
	
	@Column(name="interests")
	private String interest;
	
	@Column(name="recommendation")
	private String recommendation;
	
	@Column(name="comments")
	private String comments;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getStreetAddress() {
		return streetaddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetaddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateOfSurvey() {
		return dateofsurvey;
	}

	public void setDateOfSurvey(Date dateOfSurvey) {
		this.dateofsurvey = dateOfSurvey;
	}

	public String[] getLikings() {
		return likings;
	}

	public void setLikings(String[] likings) {
		this.likings = likings;
	}

	public String getinterest() {
		return interest;
	}

	public void setinterest(String interest) {
		this.interest = interest;
	}

	public String getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	public SurveyForm() {
		
	}

	public SurveyForm(int id, String firstName, String lastName, String streetAddress, String city, String state,
			int zip, String telephone, String email, Date dateOfSurvey, String[] likings, String interest,
			String recommendation, String comments) {
		super();
		this.id = id;
		this.firstname = firstName;
		this.lastname = lastName;
		this.streetaddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.telephone = telephone;
		this.email = email;
		this.dateofsurvey = dateOfSurvey;
		this.likings = likings;
		this.interest = interest;
		this.recommendation = recommendation;
		this.comments = comments;
	}
	
}
