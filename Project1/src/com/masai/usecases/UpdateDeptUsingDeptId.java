package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.DeptDao;
import com.masai.dao.DeptDaoImpl;

public class UpdateDeptUsingDeptId {
	
	
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the department Id : ");
//		int deptId=sc.nextInt();
//		System.out.println("Enter the new department name :");
//		String newDeptName=sc.next();
//		DeptDao dao=new DeptDaoImpl();
//		String result=dao.updateDepartment(deptId, newDeptName);
//		System.out.println(result);
//		
//	}

	public static void updateDepartment()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the department Id : ");
		int deptId=sc.nextInt();
		System.out.println("Enter the new department name :");
		String newDeptName=sc.next();
		DeptDao dao=new DeptDaoImpl();
		String result=dao.updateDepartment(deptId, newDeptName);
		System.out.println(result);
	}
}
