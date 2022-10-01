package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class ApplyForLeaveUseCase {

	
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the empid: ");
//		int eId=sc.nextInt();
//		EmployeeDao dao=new EmployeeDaoImpl();
//		String result=dao.applyForLeave(eId);
//		System.out.println(result);
//		
//	}
	
	public static void applyForLeave()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the empid: ");
		int eId=sc.nextInt();
		EmployeeDao dao=new EmployeeDaoImpl();
		String result=dao.applyForLeave(eId);
		System.out.println(result);
	}
}
