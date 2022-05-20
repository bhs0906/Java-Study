package P1008;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Filewrite2 {

	public static void main(String[] args) throws Exception {


		Writer writer = new FileWriter("c:/temp/test.txt");
		char[] data = "홍길동" .toCharArray();
		writer.write(data, 1,2);
		writer.flush();
		writer.close();
	}

}