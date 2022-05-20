package P1001;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {

		OutputStream os = new FileOutputStream("c:/temp/test.txt");
		byte[] data = "abcd".getBytes();
		os.write(data,1,2);
		os.flush();
		os.close();

	}

}
