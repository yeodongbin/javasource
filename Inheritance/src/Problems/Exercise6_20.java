package Problems;

public class Exercise6_20 {

	public static int[] shuffle(int[] input) {
		
		int[] output = new int[input.length];
		
		for (int i=0; i<input.length; i++)
		{
			output[i]= input[(int)(Math.random()*9)];
		}
		
		
		
		
		for (int i=0; i<input.length; i++)
		{
			output[i]= input[i];
		}
		int temp = 0;
		int ran = 0;
		for (int i=0; i<input.length; i++)
		{
			ran = (int)(Math.random()*9);
			temp = output[ran];
			output[ran] = output[0];
			output[0] = temp;
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
}
