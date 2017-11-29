package gyeo;

public class MyCountToken {

	public void mytokenizer() {
		String Mytokenizer = "I am Seon";

		String[] data = Mytokenizer.split(" ");

		for (String i : data) {
			System.out.println(i);

		}
		System.out.println(data.length);
	}
}