package com.empcompany.factory;

import com.empcompany.model.Department;
import com.empcompany.model.Employee;
import com.empcompany.model.HREmployee;
import com.empcompany.model.SalesEmployee;

public class EmployeeFactory
{
	public static Employee getEmployee(Department department, String mobile, String name)
	{
		if(department.getDepartmentName().equals("hr"))
		{
			return new HREmployee(department, mobile, name);
		}
		else if(department.getDepartmentName().equals("sales"))
		{
			return new SalesEmployee(department, mobile, name);
		}
		else
		{
			return null;
		}
	}
}
