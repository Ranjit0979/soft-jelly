package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Employee;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exceptions.EmployeeException;

public class GetEmployeeByIDUseCase1 {
	
	
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Employee Id: ");
//		int eId=sc.nextInt();
//		EmployeeDao dao=new EmployeeDaoImpl();
//		try
//		{
//			Employee e=dao.getEmployeeByEmpId2(eId);
//			System.out.println("Emplyee name is: "+e.getName());
//			System.out.println("Emplyee password is: "+e.getPassword());
//			System.out.println("Emplyee email is: "+e.getEmail());
//			System.out.println("Emplyee department is: "+e.getDeptId());
//			System.out.println("Emplyee leave status  is: "+e.getLeaves());
//			
//		}catch(EmployeeException ee)
//		{
//			System.out.println(ee.getMessage());
//		}
//	}
	
	public static void getEmployeeById()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id: ");
		int eId=sc.nextInt();
		EmployeeDao dao=new EmployeeDaoImpl();
		try
		{
			Employee e=dao.getEmployeeByEmpId2(eId);
			System.out.println("Emplyee name is: "+e.getName());
			System.out.println("Emplyee password is: "+e.getPassword());
			System.out.println("Emplyee email is: "+e.getEmail());
			System.out.println("Emplyee department is: "+e.getDeptId());
			System.out.println("Emplyee leave status  is: "+e.getLeaves());
			
		}catch(EmployeeException ee)
		{
			System.out.println(ee.getMessage());
		}
	}

}
