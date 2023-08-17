package login.com;

public class Sample2 {

	public static void main(String[] args) {
		int a[] = { 20, 90, 5, 100, 25 }, temp;
		int b[] = new int[a.length - 1];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i] - a[i + 1];
			System.out.println(b[i]);
		}
		for (int c = 0; c < b.length; c++) {
			for (int d = c + 1; d < b.length; d++) {

				if (b[c] > b[d]) {
					temp = b[c];
					b[c] = b[d];
					b[d] = temp;

				}
			}

		}
		for (int c = 0; c < b.length; c++) {
			System.out.println("After Sorting" + b[c]);
		}
		System.out.println("Max" + b[b.length - 1]);
		System.out.println("Min" + b[0]);
	}

}
