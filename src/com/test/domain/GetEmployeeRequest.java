package com.test.domain;

public class GetEmployeeRequest extends RequestHeader {
	
	String empId;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

}
