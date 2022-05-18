package P349;

public class RemoteControlExample {

	public static void main(String[] args) {
			
			RemoteControl rc = null; // 인터페이스 변수 선언
			
			rc = new Television();
			rc.turnOn();
			rc.turnOff();
			rc.setMute(true);
			
			// RemoteControl rc = new RemoteControl();  <<원래는 그동안 이렇게 만들었었는데 인터페이스에서는 작성법이 다름
			// Audio rc = new Audio();
			rc = new Audio();
			rc.turnOn();
			rc.turnOff();
			rc.setMute(true);


		}
	}


