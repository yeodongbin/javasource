package Problems;

public class Exercise6_22 {
	static boolean isNumber(String str) {
		boolean tf = true;
		
		if (str == "" || str == null) {
			return tf;
		} else {
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if ((ch < 48) || (ch > 57)) {
					tf = false;
				}
			}
		}
		
		return tf;
	}

	public static void main(String[] args) {
		//String str = "123";
		//System.out.println(str + "는 숫자입니까? " + isNumber(str));
		String str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}
}
