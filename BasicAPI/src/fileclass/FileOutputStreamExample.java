package fileclass;

import java.io.*;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		String filePath = "c:/test/";
		String fileInput = "test.txt";
		String fileOutput = "testOutput.txt";
		
		try (FileInputStream fis = new FileInputStream(filePath+fileInput);
			 FileOutputStream fos = new FileOutputStream(filePath+fileOutput);) 
		{
					
		byte[] readBytes = new byte[100];
		int readByteNo;
		
		while ((readByteNo = fis.read(readBytes))!=-1) {
			fos.write(readBytes, 0, readByteNo);
		}
		fos.flush();
		//fis.close();
		//fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
