package com.student.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import lombok.Data;

@Data
public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2867822786009844446L;
	private String StudentId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private Date dob;
	private LocalDate createdBy;
	private Date modifiedBy;

}
