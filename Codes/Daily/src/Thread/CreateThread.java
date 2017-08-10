package Thread;

import java.lang.Thread.State;

class Threads implements Runnable{
	
	public String text;
	public Thread thre;

	public void ThreadsText(String text){
		this.text = text;
	}
	
	public String getText(String text) {
		return text;
	}
	
	@Override
	public void run() {		
		try {
			
				for (int i = 0; i <= 5; i++) {
					 System.out.println("Thread Running: "+ this.text +" " + i);
				}

			Thread.sleep(100); 
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}	
		System.out.println("Exit " + this.text);
		
	}
	
	public void start() {

		thre = new Thread(this, text);
		for (int i = 0; i<=5; i++) {
			System.out.println("Thread Creating: "+ this.text +" " + i);
		}
		thre.run();
	}
}

public class CreateThread {

	
	public static void main(String[] args) {
		Threads run = new Threads();
	
		run.ThreadsText("Thread 1");
		run.start();
		

		run.ThreadsText("Thread 2");
		run.start();
			
		
		

	}

}
