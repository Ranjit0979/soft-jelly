package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class ChangeEmpPasswordByIdUseCase {
	
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter employee id :");
//		int eId=sc.nextInt();
//		System.out.println("Enter new password :");
//		String pass=sc.next();
//		
//		EmployeeDao dao=new EmployeeDaoImpl();
//		System.out.println(dao.updatePassword(eId, pass));
//		
//	}
	
	public static void changeEmployeePasswordById()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id :");
		int eId=sc.nextInt();
		System.out.println("Enter new password :");
		String pass=sc.next();
		
		EmployeeDao dao=new EmployeeDaoImpl();
		System.out.println(dao.updatePassword(eId, pass));
	}

}
