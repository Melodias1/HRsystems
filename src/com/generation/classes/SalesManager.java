package com.generation.classes;

import java.util.HashMap;

public class SalesManager extends SalesRep {
	
	  private HashMap<Integer, SalesRep> salesTeam;
	  
	  
	
	   public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked,
			int vacationsDaysTaken, double salary, int yearsWorked, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationsDaysTaken, salary, yearsWorked, salesMade);
		 this.salesTeam = new HashMap<>();
	}
	public double calculateComission(){
		      // 0.03 * all sales made by team
		   double totalSales=0;
		   
		   		for (SalesRep seller : salesTeam.values()) {
		   			
		   			totalSales+= seller.getSalesMade();
					
				}
		   		double totalComission=totalSales*0.03;
		   		
		   		return totalComission;
		   	
		   }//calculateComission
	   public void addSalesRep(int repId, SalesRep salesRep) {
	        salesTeam.put(repId, salesRep);
	    }

	    // Obtener un SalesRep por su ID
	    public SalesRep getSalesRep(int repId) {
	        return salesTeam.get(repId);
	    }

	  

	
	
}//class
