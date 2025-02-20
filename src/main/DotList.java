package main;

import java.util.ArrayList;

class DotList extends ArrayList<Dot> {
	
	private static final DotList instance = new DotList();

	private DotList() {}
	
	public static DotList getInstance() {
		
		return instance;
		
	}
	
	public synchronized void addDot(Dot d) {
		
		this.add(d);
		
	}
	
	public synchronized int getSize() {
		
		return this.size();
		
	}
	
}
