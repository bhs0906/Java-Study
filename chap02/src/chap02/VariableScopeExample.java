package chap02;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 13;
		int v2 = 0;
		if(v1>10) {
			v2 = v1-10;
		}
		int v3 = v1 + v2 + 5;
		System.out.println("v3="+v3);
	}
/*
 * 디버깅 : ex) 9,11라인 더블클릭(브레이크 포인트) 후 디버깅실행해보면 그 영역의 값이 나옴
 * Syntex Eerror : 오타 = 컴파일러가 해결
 * Logic Error : 논리적 오류 = 디버깅툴로 찾음 
 * Running Error : 실행오류(Exception : Try~catch)
*/
	
}
