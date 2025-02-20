package main;

public class Driver {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("System starting...");
		Thread.sleep(3000);
		DotBuilder db = new DotBuilder();
		DotCounter dc = DotCounter.getInstance();
		db.start();
		dc.start();
		
	}

}
