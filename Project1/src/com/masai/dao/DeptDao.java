package com.masai.dao;

import com.masai.bean.Department;

public interface DeptDao {
	
	
	public String addDept(Department d);
	public String updateDepartment(int dId,String newDeptName);
	public String deleteDepartment(int dId);

}
