package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Employee;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exceptions.EmployeeException;

public class LogInEmployeeUseCase {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter emplyee id: ");
		int id=sc.nextInt();
		System.out.println("please enter password: ");
		String pass=sc.next();
		EmployeeDao dao=new EmployeeDaoImpl();
		try {
			Employee e=dao.loginEmployee(id, pass);
			System.out.println("welcome employee "+e.getName());
			
			
		}catch(EmployeeException ee)
		{
			System.out.println(ee.getMessage());
		}
	}

}
