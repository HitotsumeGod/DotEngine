package main;

import java.util.Random;

public class DotCounter extends Thread {
	
	private final static DotCounter instance = new DotCounter();
	private static int total;
	private static final DotList duh = DotList.getInstance();
	private Random rand = new Random();
	private int max = 5000;
	private int min = 5000;
	
	public void run() {
		
		while(true) {
		try {
			synchronized(this) {
				this.wait();
			}
			Thread.sleep(rand.nextInt((max - min) + 1 + min));
		} catch (InterruptedException e) {
			System.out.println("Did not wait!!!");
			System.exit(0);
		}
			total = duh.size();
			System.out.println(total + " dots present");
		}
	}
	
	public static DotCounter getInstance() {
		
		return instance;
		
	}

}
