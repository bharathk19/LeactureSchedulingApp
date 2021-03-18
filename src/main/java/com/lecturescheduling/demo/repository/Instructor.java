package com.lecturescheduling.demo.repository;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Instructor")
public class Instructor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int instructorid;
	private String coursename;
	private Date fromdate;
	private Date todate;
	private Time timeteached;
	@OneToMany
	private List<Courses> courses;
	@OneToOne(cascade = CascadeType.ALL)
	private InstructorDetails details;

	public int getInstructorid() {
		return instructorid;
	}

	public void setInstructorid(int instructorid) {
		this.instructorid = instructorid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public Date getFromdate() {
		return fromdate;
	}

	public void setFromdate(Date fromdate) {
		this.fromdate = fromdate;
	}

	public Date getTodate() {
		return todate;
	}

	public void setTodate(Date todate) {
		this.todate = todate;
	}

	public Time getTimeteached() {
		return timeteached;
	}

	public void setTimeteached(Time timeteached) {
		this.timeteached = timeteached;
	}

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}

	public InstructorDetails getDetails() {
		return details;
	}

	public void setDetails(InstructorDetails details) {
		this.details = details;
	}
	
	

}
