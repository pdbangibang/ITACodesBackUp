package Day3_exercise6;

public class Tank {

 static boolean isEmpty = true;
 static boolean isClean = false;
 //static boolean isFull;
 
 public void isEmpty(){
	 
	 if(isEmpty) {
		 System.out.println("Filling up tank...");
		 isEmpty = false;
	 } else {
		 isEmpty = true;
	 }
 }
 
 public void isClean() {
	 
	 if(!isClean) {
		 System.out.println("Clean.. clean..");
		 isClean = true;
	 } else {
		 isClean = false;
	 }
	// isClean = true;
 }

 
 public void finalize() {
	 if(isClean) {
		 System.out.println("System terminate..");
		 System.exit(0);
	 }else {
		 System.out.println("Tank not clean. Please clean");
	 }
 }
 
 public static void main(String args[]) {
	 
	 Tank tank = new Tank();
	 
	 System.out.println("Tank is empty? " + tank.isEmpty);
	 tank.isEmpty();
	 System.out.println("Is Tank still empty? "+ tank.isEmpty);
	 System.out.println("Tank is now full. Please empty");
	 tank.isEmpty();
	 System.out.println("Is Tank clean? " + tank.isClean);
	 System.gc();
	new Tank();
	 tank.isClean();
	 System.gc();
	 System.runFinalization();
	 //tank.finalized();
	 //tank.isClean();
	// System.out.println("Is Tank clean? " + tank.isClean);
	// tank.finalized();
 }
 
}
