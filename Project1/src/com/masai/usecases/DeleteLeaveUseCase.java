package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.Employee;
import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.exceptions.EmployeeException;

public class DeleteLeaveUseCase {
	
	public static void deleteLeave()
	{
		Scanner sc=new Scanner(System.in);
		AdminDao dao=new AdminDaoImpl();
		try {
			List<Employee> list=dao.checkLeaveTickets();
			list.stream().forEach(s->{
				System.out.println("Enter yes to delete leave for employee "+s.getName()+" with employee id "+s.getEmpId());
				String grant=sc.next();
				if(grant.equalsIgnoreCase("yes"))
				{
					System.out.println(dao.deleteLeave(s.getEmpId()));
				}
				
			});
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
