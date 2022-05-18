package p207;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("박자바", "011225-1234567");
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		System.out.println(k1.nation);
		
		Korean k2 = new Korean("ddd", "0333325-1234567");
		System.out.println(k2.name);
		System.out.println(k2.ssn);		

	}

}
