package main;

public class DotCounter extends Thread {
	
	private final static DotCounter instance = new DotCounter();
	private static int total;
	private static final DotList duh = DotList.getInstance();
	
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
			total = duh.size();
			System.out.println(total + " dots present");
		}
	}
	
	public static DotCounter getInstance() {
		
		return instance;
		
	}

}
