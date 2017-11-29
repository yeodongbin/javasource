package tcp;

import java.io.IOException;
import java.io.*;
import java.net.*;

public class ClientExample {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket();
			System.out.println("���� ��û");
			socket.connect(new InetSocketAddress("localhost",5001));
			
			System.out.println("���� ����");
			
			OutputStream os = socket.getOutputStream();
			String message = "Hello I am Client";
			byte[] bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("������ ���� ����");
			
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes);
			message = new String(bytes, 0, readByteCount,"UTF-8");
			System.out.println("Server���� ������ �޼��� : " + message);
			
			os.close();
			is.close();
		} catch (Exception e) {}
		
		if (socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException ioe) {}
		}
	}
}
