package exercise2_Day2;

public class DerivedClass extends BaseClass {

	public DerivedClass (){
		
	}
	
	@Override //override
	public String secondMethod() {
		   
		return "I am second method but in another class";
		}
	
	public static void main(String args[]) {
		DerivedClass devClass = new DerivedClass();
		
		BaseClass baseClass = (BaseClass)devClass; //upcast or casting
		
		System.out.println(baseClass.firstMethod());
	}
	
}
