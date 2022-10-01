package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Employee;
import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class RegisterEmployeeUseCase1 {

	
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter employee name: ");
//		String name=sc.next();
//		System.out.println("Enter employee password: ");
//		String password=sc.next();
//		System.out.println("Enter employee department id: ");
//		int department=sc.nextInt();
//		System.out.println("Enter employee email: ");
//		String email=sc.next();
//		Employee e=new Employee();
//		e.setName(name);
//		e.setPassword(password);
//		e.setDeptId(department);
//		e.setEmail(email);
//		AdminDao dao=new AdminDaoImpl();
//		String result=dao.registerEmployee(e);
//		System.out.println(result);
//		
//	}
	
	public static void registerEmployee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name: ");
		String name=sc.next();
		System.out.println("Enter employee password: ");
		String password=sc.next();
		System.out.println("Enter employee department id: ");
		int department=sc.nextInt();
		System.out.println("Enter employee email: ");
		String email=sc.next();
		Employee e=new Employee();
		e.setName(name);
		e.setPassword(password);
		e.setDeptId(department);
		e.setEmail(email);
		AdminDao dao=new AdminDaoImpl();
		String result=dao.registerEmployee(e);
		System.out.println(result);
	}
}
