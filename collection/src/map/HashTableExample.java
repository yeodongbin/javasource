package map;

import java.util.*;

public class HashTableExample {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>(); 
		
		map.put("dongbin", "12345");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("id: ");
		String id =sc.nextLine();
		System.out.println("password: ");
		String password = sc.nextLine();
		
		if(map.containsKey(id)) {
			if(map.containsValue(password)) {
				System.out.println("로그인 되었습니다.");
			} else {
				System.out.println("로그인을 다시 시도하세요");
			}
		} else {
			System.out.println("로그인을 다시 시도하세요");
		}
	}
}
