package com.masai.usecases;

import java.util.List;

import com.masai.bean.Department;
import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.exceptions.DepartmentsException;

public class GetAllDepartmentDetails {
	
//
//	public static void main(String[] args)
//	{
//		AdminDao dao=new AdminDaoImpl();
//		try {
//			List<Department> list=dao.getAllDepartmentDetails();
//			list.stream().forEach(s->{
//				System.out.println("=========================\n");
//				System.out.println("Department id : "+s.getDeptId());
//				System.out.println("Department name : "+s.getDeptName());
//			});
//			
//		} catch (DepartmentsException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}
//	}
	
	public static void getAllDepartmentDetails()
	{
		AdminDao dao=new AdminDaoImpl();
		try {
			List<Department> list=dao.getAllDepartmentDetails();
			list.stream().forEach(s->{
				System.out.println("=========================\n");
				System.out.println("Department id : "+s.getDeptId());
				System.out.println("Department name : "+s.getDeptName());
			});
			
		} catch (DepartmentsException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
