package test;

public class FFFFF {

	public static void main(String[] args) {
		int[] arr = {68, 70, 45, 60, 83}; // 점수
		int[] rankArr = new int[5];
		
		for(int i = 0; i<arr.length; i++) {
			rankArr[i] = 1; // 순위 배열을 for 돌때마다 1등으로 초기화
			for(int j = 0; j<arr.length; j++) { // 배열 i 인덱스의 점수와 나머지 점수 비교
				if(arr[i] < arr[j]) { // i 인덱스의 값보다 크다면
					rankArr[i] = rankArr[i] + 1; // 순위 증가
				}
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println("점수 : " + arr[i] + " 순위 : " + rankArr[i] );
		}
	}
}