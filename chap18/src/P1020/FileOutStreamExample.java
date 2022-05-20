package P1020;

import java.io.FileInputStream;
import java.io.FileOutputStream;

// Temp , Target 폴더와 이미지를 미리 생성해둬야함 이미지는 Temp에만 저장
public class FileOutStreamExample {

	public static void main(String[] args) throws Exception { 
		String originalFileName = "C:\\Temp\\tsp.hwp";
		String TargetFileNmae = "C:\\Target\\tsp.hwp";

		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(TargetFileNmae);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
		}
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었습니다.");		
	}

}
