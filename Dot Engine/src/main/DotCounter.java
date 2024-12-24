package main;

import java.util.Random;

public class DotCounter extends Thread {
	
	private static int count;
	
	public void run() {
		
		Random rand = new Random();
		DotList duh = DotList.getInstance();
		int max = 3;
		int min = 1;
		while (true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if ((rand.nextInt((max - min) + 1) + min) == 1) {
				
				for (Dot d : duh) {
					
					count++;
					
				}
				
			}
			System.out.println(count);
		}
		
	}

}
