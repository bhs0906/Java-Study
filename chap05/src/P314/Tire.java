package P314;

public class Tire {
	//필드
	public int maxRotaion;
	public int accmulatedRotation;
	public String location;
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotaion = maxRotation;
	
	}
	
	//메소드
	public boolean roll() {
		++accmulatedRotation;		//누적 회전수 1증가
		if(accmulatedRotation<maxRotaion) {
			System.out.println(location + " Tire 수명:" + 
		(maxRotaion-accmulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
		
	}

}
