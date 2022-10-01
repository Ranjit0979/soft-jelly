package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.masai.bean.Admin;
import com.masai.bean.Department;
import com.masai.bean.Employee;
import com.masai.exceptions.DepartmentsException;
import com.masai.exceptions.EmployeeException;
import com.masai.utility.DButil;

public class AdminDaoImpl implements AdminDao {

	@Override
	public boolean loginAdmin(String userName,int pass) {
		boolean status=false;
		Admin a=new Admin();
		if(a.getUserName().equals(userName)&&a.getPassword()==pass)
		{
			status=true;
		}
		return status;
	}
	
	@Override
	public String changeEmployeeDepartment(int id, int deptId) {
		String message="not updated...!";
		try(Connection conn=DButil.provideConnection())
		{
			PreparedStatement ps=conn.prepareStatement("update emp set department=? where empId=?");
			ps.setInt(1, deptId);
			ps.setInt(2, id);
			int x=ps.executeUpdate();
			if(x>0)
			{
				message ="department changed for employee "+id+" to new department id= "+deptId;
			}
			
		}catch(SQLException e)
		{
			message=e.getMessage();
		}
		return message;
	}

	@Override
	public List<Employee> getAllEmployeeDetails() throws EmployeeException {
		List<Employee> list=new LinkedList<>();
		try(Connection conn=DButil.provideConnection())
		{
			
			PreparedStatement ps=conn.prepareCall("select * from emp");
			ResultSet rs=ps.executeQuery();
			boolean flag=true;
			while(rs.next())
			{
				flag=false;
				int eid=rs.getInt("empId");
				 String n=rs.getString("name");
				 String p=rs.getString("password");
				 String l=rs.getString("leaves");
				 int d=rs.getInt("department");
				 String em=rs.getString("email");
				 Employee e=new Employee(n,p,d,em,eid,l);
				 list.add(e);
			}
			if(flag)
			{
				throw new EmployeeException("no employee registered...!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new EmployeeException(e.getMessage());
		}
		
		return list;
	}

	@Override
	public List<Employee> checkLeaveTickets() throws EmployeeException {
		List<Employee> list=new LinkedList<>();
		try(Connection conn=DButil.provideConnection())
		{
			PreparedStatement ps=conn.prepareStatement("select * from emp where leaves='TicketPending'");
			ResultSet rs=ps.executeQuery();
			boolean flag=true;
			while(rs.next())
			{
				flag=false;
				int eid=rs.getInt("empId");
				 String n=rs.getString("name");
				 String p=rs.getString("password");
				 String l=rs.getString("leaves");
				 int d=rs.getInt("department");
				 String em=rs.getString("email");
				 Employee e=new Employee(n,p,d,em,eid,l);
				 list.add(e);
			}
			if(flag)
			{
				throw new EmployeeException("no employee raised LeaveTicket...!");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new EmployeeException(e.getMessage());
		}
		
		return list;
	}

	@Override
	public String grantLeave(int eId) {
		// TODO Auto-generated method stub
		String message="not granted leave for employee: "+eId;
		try(Connection conn=DButil.provideConnection())
		{
			PreparedStatement ps=conn.prepareStatement("update emp set leaves='Yes' where empId=?");
			ps.setInt(1, eId);
			int x=ps.executeUpdate();
			if(x>0)
			{
				message="leave granted for employee with Id: "+eId;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			message=e.getMessage();
		}
		
		return message;
	}

	@Override
	public String deleteLeave(int eId) {
		String message="not deleted leave status of : "+eId;
		try(Connection conn=DButil.provideConnection())
		{
			PreparedStatement ps=conn.prepareStatement("update emp set leaves='No' where empId=?");
			ps.setInt(1, eId);
			int x=ps.executeUpdate();
			if(x>0)
			{
				message="leave denied for employee with Id: "+eId;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			message=e.getMessage();
		}
		
		return message;
	}

	@Override
	public String registerEmployee(Employee e) {
        String message="not inserted...";
		
		try (Connection conn=DButil.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("insert into emp (name,password,department,email) values(?,?,?,?)");
			ps.setString(1, e.getName());
			ps.setString(2,e.getPassword());
			ps.setInt(3,e.getDeptId());
			ps.setString(4, e.getEmail());
			int x=ps.executeUpdate();
			if(x>0)
			{
				message="employee registered successfully...!";
			}
			
			
			
		}catch(SQLException ex)
		{
			message=ex.getMessage();
		}
		
		return message;
	}

	@Override
	public List<Department> getAllDepartmentDetails() throws DepartmentsException {
	List<Department> list=new LinkedList<>();
		
		try(Connection conn=DButil.provideConnection())
		{
			PreparedStatement ps=conn.prepareStatement("select * from dept");
			ResultSet rs=ps.executeQuery();
			boolean flag=true;
			while(rs.next())
			{
				flag=false;
				int deptid=rs.getInt("deptId");
				String deptname=rs.getString("deptName");
				Department d=new Department(deptid,deptname);
				list.add(d);
			}
			if(flag)
			{
				throw new DepartmentsException("no department is there in dept table");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DepartmentsException(e.getMessage());
		}
		
		
		return list;
	}

	@Override
	public String deleteEmployee(int eId) {
		String message="Employee with id "+eId+" not deleted...!";
		try(Connection conn=DButil.provideConnection())
		{
		 PreparedStatement ps=conn.prepareCall("delete from emp where empId=?");
		 ps.setInt(1, eId);
		 int x=ps.executeUpdate();
		 if(x>0)
			{
				message ="Employee with "+eId+" deleted from emp";
			}
		 
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			message=e.getMessage();
			
		}
		return message;
	}

	

}
