package com.empcompany.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Component
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@jacksonId")
public class Department
{
	private int departmentId;
	private DepartmentNames departmentName;
	
	private List<Employee> employees=new ArrayList<Employee>();
	

    public enum DepartmentNames {
        HR_DEPT("HR_DEPT"),
        SALES_DEPT("SALES_DEPT");

        private final String text;

        /**
         * @param text
         */
        DepartmentNames(final String text) {
            this.text = text;
        }

        /* (non-Javadoc)
         * @see java.lang.Enum#toString()
         */
        @Override
        public String toString() {
            return text;
        }
    }
	
	public List<Employee> getEmployees() {
		return employees;
	}
	
	public int getDepartmentId() {
		return departmentId;
	}
	
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	
//	public String getDepartmentName() {
//		return departmentName;
//	}
//	
//	public void setDepartmentName(String departmentName) {
//		this.departmentName = departmentName;
//	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public DepartmentNames getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(DepartmentNames departmentName) {
		this.departmentName = departmentName;
	}
}
