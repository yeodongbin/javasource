package Problems;

public class Exercise6_23 {

	public static int max(int[] data) {
		if ((data == null || data.length == 0)) {
			return -999999;
		}
		int max = data[0];
		for (int i = 0; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}
		return max;
	}

	public static int[] maxArray(int[] data) {
		int max = data[0];
		int maxArrPit = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
				maxArrPit = i;
			}
		}

		max = data[0];
		data[0] = data[maxArrPit];
		data[maxArrPit] = max;

		return data;
	}

	public static int min(int[] arr) {

		int minTemp = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < minTemp) {
				minTemp = arr[i];
			}
		}
		return minTemp;

		/*
		 * if ((data == null || data.length == 0)) { return -999999; } int min =
		 * data[0]; for (int i = 0; i < data.length; i++) { if (data[i] < min) { min =
		 * data[i]; } } return min;
		 */
	}

	public static int[] selectSort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				return arr;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}

	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값: " + max(data));
		System.out.println("최대값: " + max(null));
		System.out.println("최대값: " + max(new int[] {}));
		System.out.println(java.util.Arrays.toString(maxArray(data)));
		System.out.println("최소값: " + min(data));
	}
}
