package com.empcompany.factory;

import com.empcompany.model.Department;
import com.empcompany.model.Department.DepartmentNames;
import com.empcompany.model.Employee;
import com.empcompany.model.HREmployee;
import com.empcompany.model.SalesEmployee;

public class EmployeeFactory
{
	public static Employee getEmployee(Department department, String mobile, String name)
	{
		if(department.getDepartmentName() == DepartmentNames.HR_DEPT)
		{
			return new HREmployee(department, mobile, name);
		}
		else if(department.getDepartmentName() == DepartmentNames.SALES_DEPT)
		{
			return new SalesEmployee(department, mobile, name);
		}
		else
		{
			return null;
		}
		
	}
}
