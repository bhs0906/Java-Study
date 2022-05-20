package P997;

import java.io.FileInputStream;

import java.io.InputStream;


public class ReadExample3 {

	public static void main(String[] args) throws Exception{

		InputStream is = new FileInputStream("c:/temp/test.txt");
		int readByteNo;
		byte[]readByets = new byte[8];
		readByteNo = is.read(readByets, 2, 3);   // 2 = 두번째부터 / 3= 3개의 숫자를 불러와라는뜻
		for(int i=0; i<readByets.length; i++) {
			System.out.println((char)readByets[i]);
		}		
		is.close();				
	}
}
