package core;

public class Main{
	private int value;
	public int getValue() {
		return this.value;
	}
	public void click() {
		this.value++;
	}
	public void reset() {
		this.value=0;
	}
	public Boolean undo() {
		if(this.value>0) {
			this.value--;
			return true;
		}
		else return false;
	}
}
