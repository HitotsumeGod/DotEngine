package main;

public class Driver {
	
	public static void main(String[] args) {
		
		DotBuilder db = new DotBuilder();
		DotCounter dc = new DotCounter();
		db.start();
		dc.start();
		
	}

}
