package test;

public class jum3 {

	public static void main(String[] args) {
		int hakjum = 100;
		char mygrade;

		switch(hakjum/10) {
		case 10:			
		case 9:
			mygrade = 'A';
			break;
		case 8:
			mygrade = 'B';
			break;
		case 7:
			mygrade = 'D';
			break;
		case 6:
			mygrade = 'E';
			break;
		default :
			mygrade = 'F';
		}
		System.out.println(mygrade);
	}

}