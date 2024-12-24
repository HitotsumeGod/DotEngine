package main;

import java.util.Random;

public class DotBuilder extends Thread {
	
	public void run() {
		
		Random rand = new Random();
		DotList duh = DotList.getInstance();
		int max = 5000;
		int min = 1500;
		
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
