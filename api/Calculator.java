package api;

public class Calculator {
	static final double PI = 3.14;
	int left;
	int right;
	
	public void setOprands(int left, int right ) {
		this.left = left;
		this.right = right;
	}
	
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
	
	public void sum() {
		System.out.println((this.left + this.right));
	}
}

//final class는 Overriding 할 수 없다. 
