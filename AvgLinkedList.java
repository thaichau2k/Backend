package Homework2211;

import java.util.Collections;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class AvgLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> numberList = new LinkedList<Integer>();
		int avg = 0;

		for (int i=0; i<25;i++) {
			int randomNum = ThreadLocalRandom.current().nextInt(0, 100 + 1);
			numberList.add(randomNum);
			avg += randomNum;
		}
		Collections.sort(numberList);	
		System.out.println(numberList);
		System.out.println("Average: "+avg/25);
		
	}

}


