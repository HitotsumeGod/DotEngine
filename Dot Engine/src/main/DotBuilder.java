package main;

import java.util.Random;

public class DotBuilder extends Thread {
	
	private static Random rand = new Random();
	private static final DotList duh = DotList.getInstance();
	private int max = 5000;
	private int min = 1500;
	
	public void run() {
		
		while (true) {
			
			try {
				Dot d = new Dot();
				duh.addDot(d);
				synchronized(DotCounter.getInstance()) {
					DotCounter.getInstance().notify();
				}
				Thread.sleep(rand.nextInt((max - min) + 1) + min);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
