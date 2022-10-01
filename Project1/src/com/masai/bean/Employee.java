package com.masai.bean;

public class Employee {
	private String name;
	private String password;
	private int deptId;
	private String email;
	private int empId;
	private String leaves;

	public Employee()
	{
		
	}

	public Employee(String name, String password, int deptId, String email, int empId, String leaves) {
		this.name = name;
		this.password = password;
		this.deptId = deptId;
		this.email = email;
		this.empId = empId;
		this.leaves = leaves;
	}

	public Employee(String name, String password, int deptId, String email) {
		super();
		this.name = name;
		this.password = password;
		this.deptId = deptId;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getLeaves() {
		return leaves;
	}

	public void setLeaves(String leaves) {
		this.leaves = leaves;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", password=" + password + ", deptId=" + deptId + ", email=" + email
				+ ", empId=" + empId + ", leaves=" + leaves + "]";
	}
	

	
	
	

}
