package chap03;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception{
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) { // 엔터기가 입력되면 캐리지리턴(13)과 라인피드(10)이 입력되므로 값 제외시킨다
				System.out.println("---------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("---------------------");
				System.out.println("선택: ");
			}
			
			keyCode = System.in.read(); // 키보드의 코드를 읽음
			
			if (keyCode == 49) { //1을 읽었을 경우
				speed++;
				System.out.println("현재 속도=" + speed);
			} else if(keyCode == 50) { //2를 읽었을 경우
				speed--;
				System.out.println("현재 속도=" + speed);
			} else if(keyCode == 51) { //3를 읽었을 경우
				run = false; // while문을 종료하기 위해 run 변수에 false를 저장
			}
		}
			System.out.println("프로그램 종료");
	}

}
