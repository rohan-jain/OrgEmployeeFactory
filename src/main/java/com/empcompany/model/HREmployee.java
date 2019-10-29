package com.empcompany.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@jacksonId")
public class HREmployee extends Employee
{
	protected Float hours = 9.0f;
    protected Float rate = 9.23f;
    protected Float Salary = hours*rate*7;
	
    public HREmployee(Department department, String mobile, String name) {
    	this.department = department;
    	this.mobile = mobile;
    	this.name = name;
	}
	
	@Override
    public Float getHours() {
		return hours;
	}

	@Override
	public void setHours(Float hours) {
		this.hours = hours;
	}

	@Override
	public Float getRate() {
		return rate;
	}

	@Override
	public void setRate(Float rate) {
		this.rate = rate;
	}

	@Override
	public Float getSalary() {
		return Salary;
	}

	@Override
	public void setSalary(Float salary) {
		Salary = salary;
	}


//	@Override
//	public Employee builder() 
//	{
//		this.setHours();
//		this.setRate();
//		this.setSalary();
//		return super.builder();
//	}
//	
	
}
