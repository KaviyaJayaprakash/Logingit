package login.com;

public class Sample1 {

	public static void main(String[] args) {
		int[] a = { 10, 90, 50, 5, 20 };
		int temp;
		for (int b = 0; b < a.length; b++) {
			for (int c = b + 1; c < a.length; c++) {
				if (a[b] > a[c]) {
					temp = a[b];
					a[b] = a[c];
					a[c] = temp;
				}

			}

		}

		for (int b = 0; b < a.length; b++) {
			System.out.println(a[b]);
		}
	}

}
