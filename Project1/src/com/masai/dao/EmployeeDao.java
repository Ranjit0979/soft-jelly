package com.masai.dao;

import com.masai.bean.Employee;
import com.masai.exceptions.EmployeeException;

public interface EmployeeDao {

	
	public Employee getEmployeeByEmpId2(int id)throws EmployeeException;
	
	public Employee loginEmployee(int id,String pass) throws EmployeeException;
	
	public String updatePassword(int eId,String newPass);
	
	public String applyForLeave(int eId);
	
	
	
	
	
}
