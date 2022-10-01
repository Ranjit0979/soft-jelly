package com.masai.humanresourceproject;

import java.util.Scanner;

import com.masai.bean.Employee;
import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exceptions.EmployeeException;
import com.masai.exceptions.IlleagalChoiceException;

public class Main {
	
	
	public static void main(String[] args)
	{
			
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Welcome To Human Resource Management ");
			System.out.println("--------------------------------------");
			
			System.out.println("Press 1 for Login As Admin");
			System.out.println();
			System.out.println("Press 2 for login As Employee");
			System.out.println();
			System.out.println("Press 3 for Exit\n");
			
			int choice =sc.nextInt();
			
			switch (choice) {
			
			case 1: {
				
				System.out.println("Enter Admin Username : ");
				String username=sc.next();
				
				System.out.println("Enter Admin Password : ");
				int pass = sc.nextInt();
				
				AdminDao aDao=new AdminDaoImpl();
				
				if(aDao.loginAdmin(username, pass))
				{
					try {
						AdminLink.linkingAdmin();
					} catch (IlleagalChoiceException e) {
						e.getMessage();
					}
				}
				else 
					{
					System.out.println("Wrong Username And PassWord");
					}
				break;
				
			}
			case 2:{
				
				System.out.println("Enter Employee Id : ");
				int id=sc.nextInt();
				
				System.out.println("Enter Employee Password : ");
				String pass = sc.next();
				
				EmployeeDao eDao=new EmployeeDaoImpl();
				Employee e1=null;
				try {
					e1 = eDao.loginEmployee(id, pass);
				} catch (EmployeeException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				if(e1!=null)
				{
				try {
					EmployeeLink.linkingEmployeeMethod();
				} catch (IlleagalChoiceException e) {
					e.getMessage();
				}
				}
				else
				{
					System.out.println("Wrong Employee Id and Password");
				}
				break;
				
			}
			case 3:{
				System.out.println("Application Closed");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			
			
			
		
		

		
	}
	
	
	

}
