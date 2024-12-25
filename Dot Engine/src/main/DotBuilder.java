package main;

import java.util.Random;

public class DotBuilder extends Thread {
	
	Random rand;
	DotList duh;
	int max;
	int min;
	
	public DotBuilder() {
		
		rand = new Random();
		duh = DotList.getInstance();
		max = 5000;
		min = 1500;
		
	}
	
	public void run() {
		
		while (true) {
			
			try {
				Dot d = new Dot();
				duh.add(d);
				Thread.sleep(rand.nextInt((max - min) + 1) + min);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
