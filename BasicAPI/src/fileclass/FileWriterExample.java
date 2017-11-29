package fileclass;

import java.io.*;

public class FileWriterExample {

	public static void main(String[] args) {
		String filePath = "c:/test/testOutput.txt";
		File file = new File(filePath);
		
		try (FileWriter fw = new FileWriter(file, true);){//붙여쓰기
			fw.write("FileWriter는 한글로된\n");
			fw.write("문자열을 바로 출력할 수 있다.");
			fw.flush();
			//fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("File 저장 완료");
		}
	}
}
