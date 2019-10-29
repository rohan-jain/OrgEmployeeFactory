package com.empcompany.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@jacksonId")
public class SalesEmployee extends Employee
{
    protected float hours = 7;
    protected float rate = 8.23f;
    protected float Salary = hours*rate*7;

    public SalesEmployee(Department department, String mobile, String name) {
    	this.mobile = mobile;
    	this.name = name;
	}

    @Override
	public float getHours() {
		return hours;
	}
    
    @Override
	public void setHours(float hours) {
		this.hours = hours;
	}

    @Override
	public float getRate() {
		return rate;
	}

    @Override
	public void setRate(float rate) {
		this.rate = rate;
	}

    @Override
	public float getSalary() {
		return Salary;
	}

    @Override
	public void setSalary(float salary) {
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