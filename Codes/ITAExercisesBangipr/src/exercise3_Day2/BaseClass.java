package exercise3_Day2;

public class BaseClass {

	public static void main(String[] args) {
		
		Rodent[] arrRod = new Rodent[3];
		
		arrRod[0] = new MouseClass();
		arrRod[1] = new HamsterClass();
		arrRod[2] = new GerbilClass();
		
		for(int i=0; i<arrRod.length; i++) {
			System.out.println(arrRod[i].RodentInfo());
			
		}
		
		
	}

}
