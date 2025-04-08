package com.spec;
//POJO--->plain old java object
public class Employee {
	//when there is no access specifier then it assumes
	//default package level
	 public String empName;//private properties can not 
	//be accessed out of the class
	private int empId;
	private String dept;
	private String desg;
	
	public Employee() {
		super();
	}

	public Employee(String empName, int empId, String dept, String desg) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.dept = dept;
		this.desg = desg;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", dept=" + dept + ", desg=" + desg + "]";
	}
	
	
		

}
