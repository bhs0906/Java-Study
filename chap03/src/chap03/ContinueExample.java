package chap03;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=0; i<=50; i++) {
			if(i%5 !=0) {
				continue;
			}
		if(i!=0) { // 0 표시 안하기
			System.out.println(i);
		   }
		}
	}
}
