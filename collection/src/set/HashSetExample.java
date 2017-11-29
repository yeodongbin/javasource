package set;
import java.util.*;
public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Serlet/JSP");
		set.add("Spring Framework");
		
		int size = set.size(); // 개수
		//System.out.println("갯수 : " + size);
		
		set.add("Java"); //저장이 안됨
		
		size = set.size(); // 개수
		//System.out.println("갯수 : " + size);
		
		Iterator<String> it = set.iterator();
		
		while (it.hasNext()) {
			String element = it.next();
			System.out.println(element);
		}
		
		set.remove("Java");
		
		size = set.size(); // 개수
		System.out.println("갯수 : " + size);
		
		Iterator<String> it2 = set.iterator();
		
		while (it2.hasNext()) {
			String element = it2.next();
			System.out.println(element);
		}
		
		System.out.println(set.isEmpty());
		set.clear();//모두 삭제
		
		System.out.println(set.isEmpty());
		
	}

}
