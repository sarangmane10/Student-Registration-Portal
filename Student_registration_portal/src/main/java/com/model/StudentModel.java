package com.model;

import java.sql.Date;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class StudentModel {
	private String  gender;
	private String  emailAddress;
	private String  phoneNumber;
	private String  firstName;
	private String  lastName;
	private Date  birthdayDate;
	private String course;
	private int id;
	CommonsMultipartFile profilePic;
	private String imageBase64;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public StudentModel() {
		
	}
	
	public StudentModel(int id,String gender, String emailAddress, String phoneNumber, String firstName, String lastName,
			Date birthdayDate, String course,CommonsMultipartFile profilePic) {
		this.gender = gender;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthdayDate = birthdayDate;
		this.course = course;
		this.id=id;
		this.profilePic=profilePic;
	}
	public StudentModel(int id,String gender, String emailAddress, String phoneNumber, String firstName, String lastName,
			Date birthdayDate, String course,String imageBase64) {
		this.gender = gender;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthdayDate = birthdayDate;
		this.course = course;
		this.id=id;
		this.imageBase64=imageBase64;
	}
	public StudentModel(int id,String gender, String emailAddress, String phoneNumber, String firstName, String lastName,
			Date birthdayDate, String course) {
		this.gender = gender;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthdayDate = birthdayDate;
		this.course = course;
		this.id=id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthdayDate() {
		return birthdayDate;
	}
	public void setBirthdayDate(Date birthdayDate) {
		this.birthdayDate = birthdayDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String cource) {
		this.course = cource;
	}
	
	public CommonsMultipartFile getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(CommonsMultipartFile profilePic) {
		this.profilePic = profilePic;
	}
	
	

	public String getBase64Image() {
		return imageBase64;
	}

	public void setBase64Image(String imageBase64) {
		this.imageBase64 = imageBase64;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", birthdayDate=" + birthdayDate
				+ ", gender=" + gender + ", emailAddress=" + emailAddress + ", phoneNumber=" + phoneNumber + ", cource="
				+ course + "]";
	}
	
	

}
