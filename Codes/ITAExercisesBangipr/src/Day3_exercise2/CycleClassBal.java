package Day3_exercise2;

import Day3_exercise1.*;


public class CycleClassBal {

	public static void main(String[] args) {
		
		
		CycleClass[] cycle = new CycleClass[3];
		
//		Bicycle bike = new Bicycle();
//		UniCycle uni = new UniCycle();
//		Tricycle trike = new Tricycle();
		
		cycle[0] = new Bicycle();
		cycle[1] = new UniCycle();
		cycle[2] = new Tricycle();
		
		Bicycle bike2 = (Bicycle)cycle[0]; // ((Cycle)bike).ride();
		UniCycle uni2 =  (UniCycle)cycle[1]; 
		Tricycle trike2 = (Tricycle)cycle[2];
		
		
		System.out.println(bike2.balance());
		System.out.println(uni2.balance());
		
		
	
		

		
	}
}


