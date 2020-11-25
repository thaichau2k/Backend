package Homework2211;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> list1 = new ArrayList<Character>();
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<10; i++) {
			char input = scanner.next().charAt(0);
			list1.add(input);
		}
		ArrayList<Character> list2 = (ArrayList) list1.clone();
		Collections.reverse(list2);
		System.out.println(list1);
		System.out.println(list2);
	}
}
