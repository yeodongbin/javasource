package arrayforeach;

public class ArrayFor {

	public static void main(String[] args) {
		// int[][] arr = new int[3][4];
		int[][] arr = { { 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 } };

		
		
		for (int temp : arr[0]) {
			System.out.print(temp+ " ");
		}
		
		for (int temp : arr[1]) {
			System.out.print(temp+ " ");
		}
		
		for (int temp : arr[2]) {
			System.out.print(temp+ " ");
		}
		System.out.println();
		
		for (int[] arr1 : arr) {
			for (int temp : arr1) {
				System.out.print(temp+ " ");
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
		}
		

	}
}
