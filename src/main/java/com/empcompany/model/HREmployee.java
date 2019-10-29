package com.empcompany.model;

public class HREmployee extends Employee
{
	protected float hours = 9;
    protected float rate = 9.23f;
    protected float Salary = hours*rate*7;
	
	
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
