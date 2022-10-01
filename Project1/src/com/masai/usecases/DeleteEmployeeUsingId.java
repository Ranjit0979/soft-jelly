package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;

public class DeleteEmployeeUsingId {
	
	public static void deleteEmployeeUsingId()
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("please enter the employee id : ");
		int eId=sc.nextInt();
		AdminDao dao=new AdminDaoImpl();
		
		String result=dao.deleteEmployee(eId);
		System.out.println(result);
		
		
	}
	

}
