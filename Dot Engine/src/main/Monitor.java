package main;

class Monitor {

	private Monitor() {}
	
	private static final Monitor instance = new Monitor();
	
	public static Monitor getInstance() {
		
		return instance;
		
	}
	
}
