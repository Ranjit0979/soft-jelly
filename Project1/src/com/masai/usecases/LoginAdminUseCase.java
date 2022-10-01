package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;

public class LoginAdminUseCase {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter admin user name: ");
		String userName=sc.next();
		System.out.println("please enter password :");
		int password=sc.nextInt();
		AdminDao aDao=new AdminDaoImpl();
		
		if(aDao.loginAdmin(userName, password))
		{
			System.out.println("Welcome admin ");
		}
		else
		{
			System.out.println("can not login wrong credentials entered..!");
		}
	}

}
