package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Department;
import com.masai.dao.DeptDao;
import com.masai.dao.DeptDaoImpl;

public class RegisterDeptUseCase1 {

//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the department id: ");
//		int deptId=sc.nextInt();
//		System.out.println("Enter the department name: ");
//		String deptName=sc.next();
//		Department d=new Department();
//		d.setDeptId(deptId);
//		d.setDeptName(deptName);
//		DeptDao dao=new DeptDaoImpl();
//		String result=dao.addDept(d);
//		System.out.println(result);
//	}
	
	public static void registerNewDepartment()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the department id: ");
		int deptId=sc.nextInt();
		System.out.println("Enter the department name: ");
		String deptName=sc.next();
		Department d=new Department();
		d.setDeptId(deptId);
		d.setDeptName(deptName);
		DeptDao dao=new DeptDaoImpl();
		String result=dao.addDept(d);
		System.out.println(result);
	}
	
	
}
