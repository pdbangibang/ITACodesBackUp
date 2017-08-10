package Day3_exercise6;

public class Tank2 {
	
	
	boolean filled = false;
	public void fill(){
			filled = true;
		}
		public void empty(){
			filled = false;
		}
		protected void finalize() {
			if(filled) {
			System.out.println("Full not full na!");
			}
		}
	
		public static void main(String[] args){
			Tank2 bigtank = new Tank2();
			System.out.println("Initial fillness for tank is " + bigtank.filled);
			bigtank.fill();
			System.out.println("Filled fillness is " + bigtank.filled);
			System.gc(); //A full tank is being marked for garbage collection
			new Tank2();
			System.out.println("Tank respawn fillness is still " + bigtank.filled);
			bigtank.empty();
			System.out.println("Emptied fillness is " + bigtank.filled);
			System.gc(); //An empty tank is being marked for garbage collection, so no message folks
		}
	
	
}
