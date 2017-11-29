package tcp;

import java.io.IOException;
import java.io.*;
import java.net.*;

public class ClientExample {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket();
			System.out.println("연결 요청");
			socket.connect(new InetSocketAddress("localhost",5001));
			
			System.out.println("연결 성공");
			
			OutputStream os = socket.getOutputStream();
			String message = "Hello I am Client";
			byte[] bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("데이터 전송 성공");
			
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes);
			message = new String(bytes, 0, readByteCount,"UTF-8");
			System.out.println("Server에서 보내온 메세지 : " + message);
			
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
