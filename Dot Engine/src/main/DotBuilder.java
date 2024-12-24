package main;

import java.util.Random;

public class DotBuilder extends Thread {
	
	public DotBuilder() {
		
		monitor = Monitor.getInstance();
		duh = DotList.getInstance();
		
	}
	
	private Monitor monitor;
	private DotList duh;
	
	public void run() {
		
		Random rand = new Random();
		int max = 5000;
		int min = 1500;
		
		while (true) {
			
			try {
				Dot d = new Dot();
				duh.add(d);
				monitor.notify();
				Thread.sleep(rand.nextInt((max - min) + 1) + min);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
