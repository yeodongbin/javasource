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
				System.out.println("���� ���");
				
				Socket socket = serverSocket.accept();
				InetSocketAddress isa = (InetSocketAddress)
						socket.getRemoteSocketAddress();
				System.out.println("���� ����" + isa.getHostName());
				
				InputStream is = socket.getInputStream();
				byte[] bytes = new byte[100];
				int readByteCount = is.read(bytes);
				String message = new String(bytes, 0, readByteCount,"UTF-8");
				System.out.println("������ �޼��� : " + message);
				
				OutputStream os = socket.getOutputStream();
				message = "I am Server";
				bytes = message.getBytes();
				os.write(bytes); //����
				os.flush();
				System.out.println("Client�� ������ ���� ����");
				
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
