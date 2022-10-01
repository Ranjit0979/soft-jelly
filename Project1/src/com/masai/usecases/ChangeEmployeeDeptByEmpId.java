package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class ChangeEmployeeDeptByEmpId {
	
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter employee id : ");
//		int id=sc.nextInt();
//		System.out.println("Enter new department id : ");
//		int deptId=sc.nextInt();
//		AdminDao dao=new AdminDaoImpl();
//		String result=dao.changeEmployeeDepartment(id, deptId);
//		System.out.println(result);
//		
//	}
	
	public static void chnageEmployeeDepartment()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id : ");
		int id=sc.nextInt();
		System.out.println("Enter new department id : ");
		int deptId=sc.nextInt();
		AdminDao dao=new AdminDaoImpl();
		String result=dao.changeEmployeeDepartment(id, deptId);
		System.out.println(result);
	}

}
