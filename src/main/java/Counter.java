package src.main.java;

public class Counter {

	private int Currentcount;
	
	public Counter() {
		this.reset();
	}
		
	public void reset() {
		Currentcount = 0;
	}
	
	public void increment() {
		Currentcount++;
	}
	
	public void decrement() {
		Currentcount--;
	}
	
	public int getCount() {
		return Currentcount;
	}
	
}
