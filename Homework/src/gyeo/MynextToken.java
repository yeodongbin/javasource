package gyeo;

public class MynextToken {
	
	public static void main(String[] args) {
		
		MyString str = new MyString("This is dog");
		System.out.println("My Count : " + str.myCountToken(" "));
		System.out.println("My Next Token : " + str.myNextToken(" "));
		
		System.out.println("text : " + str.text);
	}
}
