package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.bean.Department;
import com.masai.utility.DButil;

public class DeptDaoImpl implements DeptDao {

		

	@Override
	public String addDept(Department d) {
      String message="not added...";
      try(Connection conn=DButil.provideConnection())
      {
    	  PreparedStatement ps=conn.prepareStatement("insert into dept values(?,?)");
    	  ps.setInt(1, d.getDeptId());
    	  ps.setString(2, d.getDeptName());
    	  int x=ps.executeUpdate();
    	  if(x>0)
    	  {
    		  message=d.getDeptName()+" department added successfully";
    	  }
    	  
      }catch(SQLException e)
      {
    	  message=e.getMessage();
      }
      
      return message;
		
	}

	@Override
	public String updateDepartment(int dId, String newDeptName) {
		String message="not updated...!";
		try(Connection conn=DButil.provideConnection())
		{
			PreparedStatement ps=conn.prepareStatement("update dept set deptName=? where deptId=?");
			ps.setString(1, newDeptName);
			ps.setInt(2, dId);
			int x=ps.executeUpdate();
			if(x>0)
			{
				message ="department name changed to "+newDeptName+" of department id= "+dId;
			}
			
		}catch(SQLException e)
		{
			message=e.getMessage();
		}
		return message;
		
	}

	@Override
	public String deleteDepartment(int dId) {
		String message="department with department id "+dId+" not deleted...!";
		try(Connection conn=DButil.provideConnection())
		{
		 PreparedStatement ps=conn.prepareCall("delete from dept where deptId=?");
		 ps.setInt(1, dId);
		 int x=ps.executeUpdate();
		 if(x>0)
			{
				message ="department with department id "+dId+" deleted from dept";
			}
		 
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			message=e.getMessage();
			
		}
		return message;
	}



}
