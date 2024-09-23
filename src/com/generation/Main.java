package com.generation;

import com.generation.classes.SalesManager;
import com.generation.classes.SalesRep;

public class Main {

	public static void main(String[] args) {
//		public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked,
//				int vacationsDaysTaken, double salary, int yearsWorked, double salesMade) {
//			super(firstName, lastName, registration, age, daysWorked, vacationsDaysTaken, salary, yearsWorked, salesMade);
//			// TODO Auto-generated constructor stub
//		}//salesManager
		
		
		SalesRep fernando = new SalesRep("Carlos", "generatios", 101, 25, 30, 5, 1000, 1, 10000);
        SalesRep jc = new SalesRep("Ana","generatios", 102, 25, 30, 5, 1000, 1, 10000);
        SalesRep sahary = new SalesRep("Luis", "generatios", 103, 30, 30, 3, 1000, 1, 10000);
        SalesManager magaly = new SalesManager("Luis", "generatios", 103, 30, 30, 3, 1000, 1, 10000);
        
        magaly.addSalesRep(fernando.getRegistration(), fernando);
        magaly.addSalesRep(jc.getRegistration(), jc);
        magaly.addSalesRep(sahary.getRegistration(), sahary);
        
        
       
       System.out.println(fernando.getSalesMade()); 
       System.out.println(magaly.calculateComission());

	}

}
