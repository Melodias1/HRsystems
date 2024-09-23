package com.generation.classes;

public class Employee {
	
	private String firstName;
	private String lastName;
	private int    registration;
	private int    age;
	private int    daysWorked;
	private int    vacationsDaysTaken;
	private double Salary;
	private int    yearsWorked;
	
	public Employee(String firstName, String lastName, int registration, int age, int daysWorked,
			int vacationsDaysTaken, double salary, int yearsWorked) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.age = age;
		this.daysWorked = daysWorked;
		this.vacationsDaysTaken = vacationsDaysTaken;
		Salary = salary;
		this.yearsWorked = yearsWorked;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getRegistration() {
		return registration;
	}

	public void setRegistration(int registration) {
		this.registration = registration;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getDaysWorked() {
		return daysWorked;
	}

	public void setDaysWorked(int daysWorked) {
		this.daysWorked = daysWorked;
	}

	public int getVacationsDaysTaken() {
		return vacationsDaysTaken;
	}

	public void setVacationsDaysTaken(int vacationsDaysTaken) {
		this.vacationsDaysTaken = vacationsDaysTaken;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public int getYearsWorked() {
		return yearsWorked;
	}

	public void setYearsWorked(int yearsWorked) {
		this.yearsWorked = yearsWorked;
	}
	
	public int timeToRetirement(){
	      // time to retirement = min(60 - age, 40 - yearsWorked)
		int timeLeftMaxage= 60- age;;
		int timeLeftMaxYearsWorked= 40- yearsWorked;
		if(timeLeftMaxage>timeLeftMaxYearsWorked) {
			return timeLeftMaxYearsWorked;
		}else {
			return timeLeftMaxage;
		}
		
			
	   }

	   public int vacationTimeLeft(){
	       // vacation time left = (daysWorked/360)*(30 - vacationDaysTaken)
		   
		   int daysLeft=(daysWorked/360)*(30-vacationsDaysTaken);
		   return daysLeft;
	   }

	   public double calculateBonus(){
	       // bonus = 2.2*salary
		   double bonus = 2.2*Salary;
			return bonus;	   
	   }
	
	
	

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", registration=" + registration
				+ ", age=" + age + ", daysWorked=" + daysWorked + ", vacationsDaysTaken=" + vacationsDaysTaken
				+ ", Salary=" + Salary + ", yearsWorked=" + yearsWorked + "]";
	}
	
	

}
