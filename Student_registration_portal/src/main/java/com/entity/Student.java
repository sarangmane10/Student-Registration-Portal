package com.entity;



import java.sql.Blob;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="StudentInfo")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	private String  firstName;
	private String  lastName;
	private Date  birthdayDate;
	private String  gender;
	private String  emailAddress;
	private String  phoneNumber;
	private String course;
	@Lob
	byte []profilePic;

	public Student() {
		
	}

	
	public Student(int id,String firstName, String lastName, Date birthdayDate, String gender, String emailAddress,String phoneNumber,
			String course,byte[] bs) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id=id;
//		this.birthdayDate = new Date(birthdayDate.getTime());
		this.birthdayDate=birthdayDate;
		this.gender = gender;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.course=course;
		this.profilePic=bs;
	}
	
	public Student(int id,String firstName, String lastName, Date birthdayDate, String gender, String emailAddress,String phoneNumber,
			String course) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id=id;
//		this.birthdayDate = new Date(birthdayDate.getTime());
		this.birthdayDate=birthdayDate;
		this.gender = gender;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.course=course;
	}
	

	
	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
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
//		this.birthdayDate = new Date(birthdayDate.getTime());
		this.birthdayDate=birthdayDate;
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
	
	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}

	

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public byte[] getProfileImage() {
		return profilePic;
	}


	public void setProfileImage(byte[] profileImage) {
		this.profilePic = profileImage;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birthdayDate="
				+ birthdayDate + ", gender=" + gender + ", emailAddress=" + emailAddress + ", phoneNumber="
				+ phoneNumber + ", course=" + course + "]";
	}
	
	
}
