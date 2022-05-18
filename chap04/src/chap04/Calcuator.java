package chap04;

public class Calcuator {

	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("resul1 : " + result1);
		System.out.println("resul2 : " + result2);
		System.out.println("resul3 : " + result3);

	}

}
