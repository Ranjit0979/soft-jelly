package com.masai.usecases;

import java.util.List;

import com.masai.bean.Employee;
import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.exceptions.EmployeeException;

public class GetAllEmployeeDetailsUseCase {
	
	
//	public static void main(String[] args)
//	{
//		
//		AdminDao dao=new AdminDaoImpl();
//		try {
//			List<Employee> list=dao.getAllEmployeeDetails();
//			list.stream().forEach(s->{
//				System.out.println("=========================\n");
//				System.out.println("Employee id : "+s.getEmpId());
//				System.out.println("Employee name : "+s.getName());
//				System.out.println("Employee password : "+s.getPassword());
//				System.out.println("Employee email : "+s.getEmail());
//				System.out.println("Employee department id : "+s.getDeptId());
//				System.out.println("Employee on leave : "+s.getLeaves());
//				
//				
//			});
//			
//		} catch (EmployeeException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}
//		
//	}
	
	public static void getAllEmployeeDetails()
	{
		AdminDao dao=new AdminDaoImpl();
		try {
			List<Employee> list=dao.getAllEmployeeDetails();
			list.stream().forEach(s->{
				System.out.println("=========================\n");
				System.out.println("Employee id : "+s.getEmpId());
				System.out.println("Employee name : "+s.getName());
				System.out.println("Employee password : "+s.getPassword());
				System.out.println("Employee email : "+s.getEmail());
				System.out.println("Employee department id : "+s.getDeptId());
				System.out.println("Employee on leave : "+s.getLeaves());
				
				
			});
			
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
