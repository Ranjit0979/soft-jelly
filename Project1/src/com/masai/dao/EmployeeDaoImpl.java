package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.masai.bean.Employee;
import com.masai.exceptions.EmployeeException;
import com.masai.utility.DButil;

public class EmployeeDaoImpl implements EmployeeDao {

	

//	@Override
//	public String registerEmployee(Employee e) {
//        String message="not inserted...";
//		
//		try (Connection conn=DButil.provideConnection()){
//			PreparedStatement ps=conn.prepareStatement("insert into emp (name,password,department,email) values(?,?,?,?)");
//			ps.setString(1, e.getName());
//			ps.setString(2,e.getPassword());
//			ps.setInt(3,e.getDeptId());
//			ps.setString(4, e.getEmail());
//			int x=ps.executeUpdate();
//			if(x>0)
//			{
//				message="employee registered successfully...!";
//			}
//			
//			
//			
//		}catch(SQLException ex)
//		{
//			message=ex.getMessage();
//		}
//		
//		return message;
//	}


	@Override
	public Employee getEmployeeByEmpId2(int id) throws EmployeeException {
		// TODO Auto-generated method stub
		Employee e=null;
		try(Connection conn=DButil.provideConnection())
		{
			PreparedStatement ps=conn.prepareStatement("select * from emp where empId=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
			 int eid=rs.getInt("empId");
			 String n=rs.getString("name");
			 String p=rs.getString("password");
			 String l=rs.getString("leaves");
			 int d=rs.getInt("department");
			 String em=rs.getString("email");
			 e=new Employee(n,p,d,em,eid,l);
			}
			else
			{
				throw new EmployeeException("employee does not exist with employee id ="+id);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			throw new EmployeeException(e1.getMessage());
		}
		return e;
	}


	@Override
	public Employee loginEmployee(int id, String pass) throws EmployeeException {
		Employee e=null;
		try(Connection conn=DButil.provideConnection())
		{
			PreparedStatement ps=conn.prepareStatement("select * from emp where empId=? AND password=?");
			ps.setInt(1, id);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				int eid=rs.getInt("empId");
				 String n=rs.getString("name");
				 String p=rs.getString("password");
				 String l=rs.getString("leaves");
				 int d=rs.getInt("department");
				 String em=rs.getString("email");
				 e=new Employee(n,p,d,em,eid,l);
			}
			else
			{
				throw new EmployeeException("employee does not exist with employee id ="+id+" and password ="+pass);	
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			throw new EmployeeException(e1.getMessage());
		}
		return e;
	}



	@Override
	public String updatePassword(int eId, String newPass) {
		String message="password not changed...!";
		
	    try(Connection conn=DButil.provideConnection())
	    {
	    	PreparedStatement ps=conn.prepareStatement("update emp set password=? where empId=?");
	    	ps.setString(1, newPass);
	    	ps.setInt(2, eId);
	    	int x=ps.executeUpdate();
	    	if(x>0)
	    	{
	    		message="password changed for employee "+eId;
	    	}
	    	
	    }catch(SQLException e)
	    {
	    	message=e.getMessage();
	    }
		
		
		
		return message;
	}


	@Override
	public String applyForLeave(int eId) {
		String message="not applied...!";
		try(Connection conn=DButil.provideConnection())
		{
			PreparedStatement ps=conn.prepareStatement("update emp set leaves='TicketPending' where empId=?");
			ps.setInt(1, eId);
			int x=ps.executeUpdate();
			if(x>0)
			{
				message="leave request applied to employee with Id: "+eId;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			message=e.getMessage();
		}
		
		return message;
	}




	


	



}
