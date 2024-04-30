package be6_hw10;

public class Square_Root {

	public static void main(String[] args) {
		int a = 40;
		System.out.printf("The square root of " + a + " is %.2f", squareRoot(a));

	}
	
	public static double squareRoot (int a) {
		double x = a;
		double y = 1;
		double z = 0.01;
		do {
			x = (x + y)/2;
			y = a / x;
		}while (x - y > z);
		return x;
	}

}
