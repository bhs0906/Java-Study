package chap03;

public class test {

	public static void main(String[] args) {

		int num = 5;
		
		int sum = ++num + num++;
//			   (6이 되있음) + (6인 상태)
		
		++num;
		num++;
		
		System.out.println("num = " + num);
		System.out.println("sum = " + sum);

	}

}
