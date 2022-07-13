package arun;

import java.util.LinkedList;
import java.util.Scanner;

public class CollectionShuffleDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LinkedList<Integer> beforelist1 = new LinkedList<Integer>();
		System.out.println("Enter the Size of list");
		int n = sc.nextInt();

		// Before The List
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the number of Elements");
			int x = sc.nextInt();
			beforelist1.add(x);
		}

		//After The New List
		LinkedList<Integer> afterlistnew = new LinkedList<Integer>();
		System.out.println("Before List-->" + beforelist1);

		// for(int i=0;i<list.size()+2;i++){
		for (int i = beforelist1.size(); i > 0; i--) {
			if (beforelist1.size() != 0) {
				int x = beforelist1.pollFirst();
				afterlistnew.add(x);
				int y = beforelist1.pollLast();
				afterlistnew.add(y);
			}

		}

		// System.out.println(newlist);
		System.out.println("After List-->" + afterlistnew);
		sc.close();
	}
}
