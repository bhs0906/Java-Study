package chap03;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 0를 입력하세요");

		
		Scanner scanner = new Scanner(System.in);
				String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();		//키보드로 입력한 문자열을 얻음
			System.out.println(inputString);
		} while(!inputString.equals("0"));
		
		System.out.println();
		System.out.println("프로그램 종료");		

	}

}
