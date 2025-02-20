package main;

public class DotCounter extends Thread {
	
	private final static DotCounter instance = new DotCounter();
	private int total;
	private int prev;
	private static final DotList duh = DotList.getInstance();
	
	public void run() {
		
		prev = 0;
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
			if ((total - prev) == 1) {
				System.out.println(total + " dots present; " + (total - prev) + " has been added.");
			} else {
				System.out.println(total + " dots present; " + (total - prev) + " have been added.");
			}
			prev = total;
		}
	}
	
	public static DotCounter getInstance() {
		
		return instance;
		
	}

}
