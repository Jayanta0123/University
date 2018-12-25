package com.api.education.University.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.api.education.University.dto.StudentsFormDTO;
import com.api.education.University.helper.DateHelper;

@Entity
@Table(name = "students")
public class Students implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "student_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "roll_number", nullable = false)
	private String rollNumber;
	
	@Column(name = "student_name", nullable = false)
	private String studentName;
	
	@Column(name = "date_of_birth", nullable = false)
	private Date dateOfBirth;

	@Column(name = "dept_code")
	private String deptCode;
	
	@Column(name = "govt_id_number")
	private String govtIDNumber;

	@Column(name = "home_address")
	private String homeAddress;

	@Column(name = "hostel_address")
	private String hostelAddress;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "parent_name")
	private String parentName;
	
	@Column(name = "par_contact_num")
    private String parentContactNumber;
	
	public Students (StudentsFormDTO studentForm) {
		this.rollNumber = studentForm.getRollNumber();
		this.studentName = studentForm.getStudentName();
		this.dateOfBirth = DateHelper.convertStringToDate(studentForm.getDateOfBirth());
		this.deptCode = studentForm.getDeptCode();
		this.govtIDNumber = studentForm.getGovtIDNumber();
		this.homeAddress = studentForm.getHomeAddress();
		this.hostelAddress = studentForm.getHostelAddress();
		this.phoneNumber = studentForm.getPhoneNumber();
		this.parentName = studentForm.getParentName();
		this.parentContactNumber = studentForm.getParentContactNumber();
	}

/*	
	public Students(String rollNumber, String studentName, Date dateOfBirth, String deptCode, String govtIDNumber,
			String homeAddress, String hostelAddress, String phoneNumber, String parentName,
			String parentContactNumber) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.dateOfBirth = dateOfBirth;
		this.deptCode = deptCode;
		this.govtIDNumber = govtIDNumber;
		this.homeAddress = homeAddress;
		this.hostelAddress = hostelAddress;
		this.phoneNumber = phoneNumber;
		this.parentName = parentName;
		this.parentContactNumber = parentContactNumber;
	}
*/	
	public Students() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getGovtIDNumber() {
		return govtIDNumber;
	}

	public void setGovtIDNumber(String govtIDNumber) {
		this.govtIDNumber = govtIDNumber;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getHostelAddress() {
		return hostelAddress;
	}

	public void setHostelAddress(String hostelAddress) {
		this.hostelAddress = hostelAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getParentContactNumber() {
		return parentContactNumber;
	}

	public void setParentContactNumber(String parentContactNumber) {
		this.parentContactNumber = parentContactNumber;
	}
	
	@Override
	public String toString() {
		return "Students [id=" + id + ", rollNumber=" + rollNumber + ", studentName=" + studentName + ", dateOfBirth="
				+ dateOfBirth + ", deptCode=" + deptCode + ", govtIDNumber=" + govtIDNumber + ", homeAddress="
				+ homeAddress + ", hostelAddress=" + hostelAddress + ", phoneNumber=" + phoneNumber + ", parentName="
				+ parentName + ", parentContactNumber=" + parentContactNumber + "]";
	}	
}
