package com.masai.humanresourceproject;

import java.util.Scanner;

import com.masai.exceptions.IlleagalChoiceException;
import com.masai.usecases.ApplyForLeaveUseCase;
import com.masai.usecases.ChangeEmpPasswordByIdUseCase;
import com.masai.usecases.GetEmployeeByIDUseCase1;

public class EmployeeLink {
	
	public  static void linkingEmployeeMethod() throws IlleagalChoiceException {
		
		boolean run=true;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----Welcome Employee----");
		
	do {
		
		System.out.println("\n select choice : \n");
		
		System.out.println("Press 1 . View Your Profile ");
		System.out.println();
		System.out.println("Press 2 . Change password ");
		System.out.println();
		System.out.println("Press 3 . Apply For Leaves");
		System.out.println();
		System.out.println("Press 4 . Exit");
		System.out.println();
		
		int choice=sc.nextInt();
		
		
		switch (choice) {
		case 1: {
			GetEmployeeByIDUseCase1.getEmployeeById();
			break;
		}
		case 2: {
				ChangeEmpPasswordByIdUseCase.changeEmployeePasswordById();
				break;
				}
		case 3: {
			ApplyForLeaveUseCase.applyForLeave();
			break;
			
		}
		case 4: {
			System.out.println("Application Closed");
			run=false;
			break;
		}
		default:
			throw new IlleagalChoiceException("Unexpected value: " + choice);
		}
	}while(run);
				
	}


}
