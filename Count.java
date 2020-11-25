package Homework2211;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Count {

	public static void main(String[] args) {
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		createMap(myMap);
		displayMap(myMap);
	}

	private static void createMap(Map<String, Integer> map) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a string:");
			String input = scanner.nextLine();

			String[] tokens = input.split(" ");

			for (String token : tokens) {
				String[] tokenss = token.split("");
				for(String abc : tokenss) {
					String word = abc.toLowerCase();

					if (map.containsKey(word)) {
						int count = map.get(word);
						map.put(word, count + 1);
					} else {
						map.put(word, 1);
					}
				}
			}
		}

	}

	private static void displayMap(Map<String, Integer> map) {
		Set<String> keys = map.keySet(); // get keys
		TreeSet<String> sortedKeys = new TreeSet<String>(keys);
		System.out.println("\nMap contains:\nKey\t\tValue");
		for (String key : sortedKeys) {
			System.out.printf("%-10s%10s\n", key, map.get(key));
		}
	}

}