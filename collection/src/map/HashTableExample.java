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
				System.out.println("�α��� �Ǿ����ϴ�.");
			} else {
				System.out.println("�α����� �ٽ� �õ��ϼ���");
			}
		} else {
			System.out.println("�α����� �ٽ� �õ��ϼ���");
		}
	}
}
