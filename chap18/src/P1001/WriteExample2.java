package P1001;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {

		OutputStream os = new FileOutputStream("c:/temp/test.txt");
		byte[] data = "안녕하세요 자바 파일을 배우고 있는데 너무 힘들어요".getBytes();
		os.write(data);
		os.flush();
		os.close();

	}

}
