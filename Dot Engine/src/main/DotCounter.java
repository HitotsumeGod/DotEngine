package main;

public class DotCounter extends Thread {
	
	private final static DotCounter instance = new DotCounter();
	private static int count;
	
	public void run() {
		
		while(true) {
		try {
			synchronized(this) {
				this.wait();
			}
		} catch (InterruptedException e) {
			System.out.println("Did not wait!!!");
			System.exit(0);
		}
				count++;
				System.out.println(count + " dots present");
			}
		}
	
	public static DotCounter getInstance() {
		
		return instance;
		
	}

}
