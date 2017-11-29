package inetaddress;

import java.net.InetAddress;

public class InetAddressExample {

	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println(local.getHostAddress());

			InetAddress[] naver = InetAddress.getAllByName
								  ("www.naver.com");
			for (InetAddress inet : naver) {
				System.out.println("naver: "+inet.getHostAddress());
				System.out.println(inet.toString());
			}
			
			InetAddress[] daum = InetAddress.getAllByName
								("www.daum.net");
			for (InetAddress inet2 : daum) {
				System.out.println("daum: "+inet2.getHostAddress());
				System.out.println(inet2.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
