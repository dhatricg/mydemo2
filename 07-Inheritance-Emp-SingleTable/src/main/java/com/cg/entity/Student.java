package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="student_default")
@DiscriminatorValue(value="student_type")
public class Student extends Person {
 
	@Column(name="school_name",length=50)
	private String schoolName;
	
	@Column(name="fee")
	private float fee;
	
	@Column(name="section_name",length=50)
	private String sectionName;
	
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public float getFee() {
		return fee;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", fee=" + fee + ", sectionName=" + sectionName + "]";
	}
	public Student(String name, String gender, String schoolName, float fee, String sectionName) {
		super(name, gender);
		this.schoolName = schoolName;
		this.fee = fee;
		this.sectionName = sectionName;
	}
	public Student(String string, double d, String string2) {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
