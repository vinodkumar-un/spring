package com.bppa.valueobjects;

public class EmployeeValueObject extends PMSValueObject {
	private int empNo;
	private String firstName;
	private String lastName;
	private float salary;

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeValueObject [empNo=" + empNo + ", firstName="
				+ firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", createdDate=" + createdDate + ", createdBy=" + createdBy
				+ ", lastModifiedDate=" + lastModifiedDate
				+ ", lastModifiedBy=" + lastModifiedBy + "]";
	}

}
