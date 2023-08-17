package login.com;

public class Amazon {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 9 };
		int missingNumber = 0;
		for (int i = 0; i <= a.length; i++) {
			if (a[i] != i + 1) {
				missingNumber = i + 1;
				break;
			}

		}
		System.out.println(missingNumber);
	}

}
