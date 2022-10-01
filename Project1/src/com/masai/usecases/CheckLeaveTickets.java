package com.masai.usecases;

import java.util.List;

import com.masai.bean.Employee;
import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.exceptions.EmployeeException;

public class CheckLeaveTickets {
	
	public static void checkLeaveTickets()
	{
		AdminDao dao=new AdminDaoImpl();
		try {
			List<Employee> list=dao.checkLeaveTickets();
			list.stream().forEach(s->{
				System.out.println("employee id= "+s.getEmpId()+" name="+s.getName());
				System.out.println("=================================\n");
			});
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
	}

}
