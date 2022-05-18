package P296;

public class Computer extends Calculator{
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCirecle() 실행");
		return Math.PI * r * r;
	}
}
