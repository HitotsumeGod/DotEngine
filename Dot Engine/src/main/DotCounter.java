package main;

import java.util.Random;

public class DotCounter extends Thread {

	private static int margin;
	private static int count;
	private static int size;
	Random rand;
	DotList duh;
	int max;
	int min;
	
	public DotCounter() {
		
		
		rand = new Random();
		duh = DotList.getInstance();
		size = duh.size();
		max = 3;
		min = 1;
		
	}
	
	private boolean changeCheck() {
		
		if (duh.size() > size) {
			
			size = duh.size();
			return true;
			
		}
		return false;
		
	}
	
	public void run() {
		
		while (true) {
			margin = 0;
			if (changeCheck()) {
				try {
					Thread.sleep(2000);
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
		
	}
	
	private void panicMode() {
		
		while (true) {
			
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
