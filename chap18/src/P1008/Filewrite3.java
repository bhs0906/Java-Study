package P1008;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Filewrite3 {

	public static void main(String[] args) throws Exception {


		Writer writer = new FileWriter("c:/temp/test.txt");
		char[] data = "안녕 자바 프로그램" .toCharArray();
		writer.write(data, 3,2);
		writer.flush();
		writer.close();
	}

}