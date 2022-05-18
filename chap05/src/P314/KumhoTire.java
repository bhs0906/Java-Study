package P314;

public class KumhoTire extends Tire {
	//필드
	//생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accmulatedRotation;		//누적 회전수 1증가
		if(accmulatedRotation<maxRotaion) {
			System.out.println(location + " KumhoTire 수명:" + 
		(maxRotaion-accmulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire 펑크 ***");
			return false;
	}
}
}