package P314;

public class HankookTire extends Tire{
	//필드
	//생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//메소드
	@Override
	public boolean roll() {
		++accmulatedRotation;		//누적 회전수 1증가
		if(accmulatedRotation<maxRotaion) {
			System.out.println(location + " HankookTire 수명:" + 
		(maxRotaion-accmulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
	}
}
}
