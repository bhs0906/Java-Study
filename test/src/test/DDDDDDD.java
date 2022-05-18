package test;

public class DDDDDDD {
	public static void main(String[] args) {
		int max=0;
		int[]array= {1,5,3,8,2};
		
		//for문을 활용해보세요.  array의 크기만큼 i를 증가시키면서 반복.
		for(int i=0;i<array.length;i++) {
			//array[i]의 값이 max보다 크면 max의 값을 변경.
			if(max <= array[i]) {
				max=array[i];
			}
		}
		//최종적으로 가장 큰 값을 출력.
		System.out.println("max:"+ max);
		
		
	}
}


