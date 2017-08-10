package com.oocl.runner;

class Runner extends Thread { // to use multi-thread

	@Override
	public void run() {

		for (int i = 0; i <= 10; i++) {
			System.out.println("Hello" + i);

			try {
				Thread.sleep(1000); // causes the Thread to 'sleep' for a given millisecond. Stops the thread for a
									// given time
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Multithread {
	public static void main(String[] args) {
		Runner runner = new Runner();
		runner.start(); // start() method causes the tread to be executed. Used in extends Thread

		Runner runner2 = new Runner();
		runner2.start(); // start() method causes the tread to be executed. Used in extends Thread

		Runner runner3 = new Runner();
		runner3.start(); // start() method causes the tread to be executed. Used in extends Thread

		if (runner.isAlive()) {
			System.out.println("1st thread is stopped");
			runner.suspend(); // suspends thread indefinitely
		}

		if (runner2.isAlive()) {
			System.out.println("2nd runner is alive");
			runner.resume(); // used in combination with suspend. resumes thread where it was suspended
		}

		if (runner3.isAlive()) {
			System.out.println("3rd runner is interrupted");
			runner3.interrupt(); // force interrupt thread
		}

		if (runner3.isInterrupted()) {
			System.out.println("3rd runner was interrupted!");
			runner3.resume();
		}
	}
}
