package main;

import java.util.Random;

public class DotCounter extends Thread {
	
	public DotCounter() {
		
		monitor = Monitor.getInstance();
		duh = DotList.getInstance();
		
	}
	
	private Monitor monitor;
	private DotList duh;
	private static int count;
	private static int margin;
	
	public void run() {
		
		synchronized(monitor) {
		try {
			monitor.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		Random rand = new Random();
		int max = 3;
		int min = 1;
		while (true) {
			margin = 0;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if ((rand.nextInt((max - min) + 1) + min) == 1) {
				
				for (Dot d : duh) {
					
					count++;
					margin++;
					
				}
				
			}
			if (margin > 5) {
				System.out.println("PANICKING !!!");
				panicMode();
			}
			System.out.println(count);
		}
		
	}
	
	private void panicMode() {
		
		while (true) {
			
			synchronized(monitor) {
				try {
					monitor.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for (Dot d : duh) {
				
				count++;
				
			}
			System.out.println(count);
		}
		
	}

}
