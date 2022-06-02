package P728;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");			// 2번 배열이여야 하는데 아래에서 2번을 지정했기때문에 밀려서 3번에 출력
		list.add(2, "Database");			// 2번 배열로 지정했기때문에 먼저 출력
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("총 객체수 : " + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2 : " + skill);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String str= list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		for(int i=0; i<list.size(); i++) {
			String str= list.get(i);
			System.out.println(i + ":" + str);
		}
	}

}
