package f01_rekursjon;

public class Potens {
	public static void main(String[] args) {
		
		System.out.println(potens1(2, 5)); //Forventar 32.0
		System.out.println(potens2(2, 5));
		
		System.out.println(potens1(4.5, 2)); //Forventar 20.25
		System.out.println(potens2(4.5, 2));
	}
	
	public static double potens1(double a, int n) {
		if(n == 0) {
			return 1.0;
		}
		return a * potens1(a, n - 1);
	}
	public static double potens2(double a, int n) {
		if(n == 0) {
			return 1.0;
		}
		double potensHalve = potens2(a, n / 2); 
		if( n % 2 == 0)
			return potens2(a, n / 2) * potens2(a, n / 2);
		} else {
			return a * potensHalve * potensHalve;
	}
}
