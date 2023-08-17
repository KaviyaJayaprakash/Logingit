
package login.com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Sample3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a candles: ");
		String candles = scanner.nextLine();

		Map<Character, Integer> map = new HashMap<>();
		for (char c : candles.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		System.out.println("Character count:");
		int count = 0;
		int max = 0;

		for (char c : map.keySet()) {
			int square = map.get(c) * map.get(c);
			count = count + square;
			System.out.println(c + ":" + square);

			if (map.get(c) > max) {
				max = map.get(c);
			}
		}
		max = max - 2;
		System.out.println(max);
		max = max * max;
		max = count - max;
		System.out.println("" + "Total square :" + count);
		System.out.println("total of square candles request :" + max);

	}

}
