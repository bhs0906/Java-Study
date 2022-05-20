package P1004;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.Reader;

public class readExample1 {
	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader("c:/temp/test.txt");
		int readData;
		while(true) {
			readData = reader.read();
			if(readData == -1) break;
			System.out.println((char)readData);
		}
		reader.close();
	}
}
