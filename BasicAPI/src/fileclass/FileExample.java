package fileclass;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class FileExample {

	public static void main(String[] args) {
		File dir = new File("c:/test");
		File test = new File("c:/test/");
		
		File[] contents = dir.listFiles();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd hh:mm");
		
		for (File content : contents) {
			System.out.print(content.getName()+"  ");
			System.out.print(content.length()+" Byte  ");
			System.out.println(sdf.format(
									new Date(
										content.lastModified())));
			System.out.print(content.getPath() + "  ");
			System.out.println(content.getParent());
		}	
	}
}
