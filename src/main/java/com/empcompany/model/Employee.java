package com.empcompany.model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@jacksonId")
@Component
public class Employee
{
    protected int id;
    protected String name;
    protected String mobile;
    protected Float Salary;
    protected Float hours;
    protected Float rate;

    
    
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public void setSalary(Float salary) {
		this.Salary = salary;
	}
	public void setHours(Float hours) {
		this.hours = hours;
	}
	public void setRate(Float rate) {
		this.rate = rate;
	}
	protected Department department;
    
	public int getId() {
		return id;
	}
	public Employee setId(int id) 
	{
		this.id = id;
		return this;
	}
	
	public String getName() {
		return name;
	}
	
	public Employee setName(String name) 
	{
		this.name = name;
		return this;
	}
	
	public String getMobile() {
		return mobile;

	}
	
	public Employee setMobile(String mobile) {
		this.mobile = mobile;
		return this;
	}
	
	public Float getSalary() {
		return Salary;
	}
	
	public Float getRate() {
		return rate;
	}
	
	public Float getHours() 
	{
		return hours;
	}
	
	public void setHours()
	{}
	public void setRate()
	{}
    public void setSalary()
    {}
//    public Employee builder()
//    {
//    	return this;
//    }
    
}

