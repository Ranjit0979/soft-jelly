package com.masai.humanresourceproject;

import java.util.Scanner;

import com.masai.exceptions.IlleagalChoiceException;
import com.masai.usecases.ChangeEmployeeDeptByEmpId;
import com.masai.usecases.CheckLeaveTickets;
import com.masai.usecases.DeleteDepartmentByDeptIdUseCase;
import com.masai.usecases.DeleteEmployeeUsingId;
import com.masai.usecases.DeleteLeaveUseCase;
import com.masai.usecases.GetAllDepartmentDetails;
import com.masai.usecases.GetAllEmployeeDetailsUseCase;
import com.masai.usecases.GrantLeaveUseCase;
import com.masai.usecases.RegisterDeptUseCase1;
import com.masai.usecases.RegisterEmployeeUseCase1;
import com.masai.usecases.UpdateDeptUsingDeptId;

public class AdminLink {
	
public  static void linkingAdmin() throws IlleagalChoiceException {
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		
		System.out.println("Welcome Admin");
		System.out.println();
		
		do
		{
			System.out.println("\n");
			System.out.println("Press 1. add new Departments.");
			System.out.println("Press 2. view all Department ");
			System.out.println("Press 3. Update The Department ");
			System.out.println("Press 4. Get All Employee Details ");
			System.out.println("Press 5. Register new Employee");
			System.out.println("Press 6. Chnage Employee Department");
			System.out.println("Press 7. Delete Employee");
			System.out.println("Press 8. Check Leave Tickets ");
			System.out.println("Press 9. Grant Leave");
			System.out.println("Press 10. Delete Leave");
			System.out.println("Press 11. Delete Department");
			System.out.println("Press 12. for closing application");
			
			int choice = sc.nextInt();
			
			
			switch (choice) {
			case 1: {
				RegisterDeptUseCase1.registerNewDepartment();
				break;
			}
			case 2: {
				GetAllDepartmentDetails.getAllDepartmentDetails();
				break;
			}
			case 3: {
				UpdateDeptUsingDeptId.updateDepartment();
				break;
			}
			case 4: {
				GetAllEmployeeDetailsUseCase.getAllEmployeeDetails();
				break;
			}
			case 5: {
				RegisterEmployeeUseCase1.registerEmployee();
				break;
			}
			case 6: {
				ChangeEmployeeDeptByEmpId.chnageEmployeeDepartment();
				break;
			}
			case 7: {
				DeleteEmployeeUsingId.deleteEmployeeUsingId();
				break;
			}
			case 8: {
				CheckLeaveTickets.checkLeaveTickets();
				break;
			}
			case 9: {
				GrantLeaveUseCase.grantLeave();
				break;
			}
			case 10: {
				DeleteLeaveUseCase.deleteLeave();
				break;
			}
			case 11: {
				DeleteDepartmentByDeptIdUseCase.deleteDepartmentBydeptId();
				break;
			}
			case 12: {
				System.out.println("Application closed");
				flag=false;
				break;
			}
			default:
				throw new IlleagalChoiceException("Unexpected value: " + choice);
			}
			
		}while(flag);
		
		
	}


}
