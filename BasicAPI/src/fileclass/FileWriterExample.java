package fileclass;

import java.io.*;

public class FileWriterExample {

	public static void main(String[] args) {
		String filePath = "c:/test/testOutput.txt";
		File file = new File(filePath);
		
		try (FileWriter fw = new FileWriter(file, true);){//�ٿ�����
			fw.write("FileWriter�� �ѱ۷ε�\n");
			fw.write("���ڿ��� �ٷ� ����� �� �ִ�.");
			fw.flush();
			//fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("File ���� �Ϸ�");
		}
	}
}
