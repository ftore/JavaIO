package Formatting;

public class RootFormat {
	public static void main(String[] args) {
		int i = 2;
		double r = Math.sqrt(i);
		
		System.out.format("The square root of %d is %f.", i, r);
	}
}
