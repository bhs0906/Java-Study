package chap04;

public class array {

	public static void main(String[] args) {
		int score[] = {1,2,3,4,5,6,7,8,9,10};
		
		int sum = 0;
		int avg = 0;
		
		for(int i=0; i<10; i++) {
			sum += score[i];
			System.out.println("score["+i+"] = " +score[i]);		
		}
		
	
		avg = sum/10;

		System.out.println(sum);
		System.out.println(avg);

	}

}
