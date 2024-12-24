package main;

import java.util.ArrayList;

class DotList extends ArrayList<Dot> {
	
	private static final long serialVersionUID = 1L;

	private DotList() {}

	private static final DotList instance = new DotList();
	
	public static DotList getInstance() {
		
		return instance;
		
	}
	
}
