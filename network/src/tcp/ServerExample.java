package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;

public class ServerExample {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost",5001));
			
			while (true) {
				System.out.println("연결 대기");
				
				Socket socket = serverSocket.accept();
				InetSocketAddress isa = (InetSocketAddress)
						socket.getRemoteSocketAddress();
				System.out.println("연결 수락" + isa.getHostName());
				
				InputStream is = socket.getInputStream();
				byte[] bytes = new byte[100];
				int readByteCount = is.read(bytes);
				String message = new String(bytes, 0, readByteCount,"UTF-8");
				System.out.println("보내온 메세지 : " + message);
				
				OutputStream os = socket.getOutputStream();
				message = "I am Server";
				bytes = message.getBytes();
				os.write(bytes); //전송
				os.flush();
				System.out.println("Client로 데이터 전송 성공");
				
				is.close();
				os.close();
				socket.close();
			}
		} catch (Exception e) {}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException ioe) {}
		}
	}
}
