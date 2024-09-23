package com.generation.classes;

public class SalesRep extends Employee {
	
	double salesMade;
	
	
	
	



	public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked,
			int vacationsDaysTaken, double salary, int yearsWorked, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationsDaysTaken, salary, yearsWorked);
		this.salesMade = salesMade;
	}// salesRep
	
	  public double calculateComission(){
	      // comission = 0.1 * salesMade
		  double comission = 0.1*salesMade;
		return comission;
	   }//calculateComission

	public double getSalesMade() {
		return salesMade;
	}

	public void setSalesMade(double salesMade) {
		this.salesMade = salesMade;
	}
	  
	  

}
