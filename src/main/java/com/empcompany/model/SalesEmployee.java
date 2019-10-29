package com.empcompany.model;

public class SalesEmployee extends Employee
{
	
    protected float hours = 7;
    protected float rate = 8.23f;
    protected float Salary = hours*rate;
	
	
	@Override
	public void setHours() 
	{
		this.hours=7;
	}

	@Override
	public void setRate() 
	{
		this.rate=8.23f;
	}

	@Override
	public void setSalary() 
	{
		this.Salary=this.rate*this.hours;
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