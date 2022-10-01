package com.masai.dao;

import java.util.List;

import com.masai.bean.Admin;
import com.masai.bean.Department;
import com.masai.bean.Employee;
import com.masai.exceptions.DepartmentsException;
import com.masai.exceptions.EmployeeException;

public interface AdminDao {
	
	public boolean loginAdmin(String userName,int pass);
	
	public String changeEmployeeDepartment(int id,int deptId);
	
	public List<Employee> getAllEmployeeDetails() throws EmployeeException;
	
	public List<Employee> checkLeaveTickets()throws EmployeeException;
	
	public String grantLeave(int eId);
	
	public String deleteLeave(int eId);
	
	public String registerEmployee(Employee e);
	
	public String deleteEmployee(int eId);
	
	public List<Department> getAllDepartmentDetails()throws DepartmentsException;
	
}
