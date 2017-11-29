package gyeo;

public class MyString {
	//필드
	static String text;

	//생성자
	MyString(String input) { 
		this.text = input;
	}
	
	//매서드
	public static String myNextToken(String delim) {
		String[] value = text.split(delim);
		
		int endIndex = text.indexOf(delim);
		String nextToken = text.substring(endIndex+1);
		text = nextToken;
		
		return value[0];
	}
	
	public int myCountToken(String delim) {
		String[] data = text.split(delim);

		for (String i : data) {
			System.out.println(i);

		}
		return data.length;
	}
}
