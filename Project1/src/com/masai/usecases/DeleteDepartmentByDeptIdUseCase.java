package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.DeptDao;
import com.masai.dao.DeptDaoImpl;

public class DeleteDepartmentByDeptIdUseCase {
	
	public static void deleteDepartmentBydeptId()
	{
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter department id: ");
		int deptId=sc.nextInt();
		DeptDao dao=new DeptDaoImpl();
		String result=dao.deleteDepartment(deptId);
		System.out.println(result);
	}

}
