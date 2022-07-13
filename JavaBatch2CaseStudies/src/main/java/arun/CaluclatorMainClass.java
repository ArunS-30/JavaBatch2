package arun;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CaluclatorMainClass {

	public static String read() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Example Input expression(for eg:4*3/2)");
		String inputLine = scan.nextLine();
		scan.close();
		return inputLine;
	}

	public static void main(String[] args) {

		final String inputExp = CaluclatorMainClass.read();// read the input to
															// the read() method
		Queue<String> operations;
		Queue<String> numbers;

		String numbersArr[] = inputExp.split("[-+*/]");
		String operArr[] = inputExp.split("[0-9]+");

		numbers = new LinkedList<String>(Arrays.asList(numbersArr));
		operations = new LinkedList<String>(Arrays.asList(operArr));

		Double res = Double.parseDouble(numbers.poll());

		while (!numbers.isEmpty()) {
			String oper = operations.poll();// remove();
			Operators operate;
			switch (oper) {
			case "+":
				operate = new Addition();
				break;
			case "-":
				operate = new Subtract();
				break;
			case "*":
				operate = new Multiply();
				break;
			case "/":
				operate = new Division();
				break;
			default:
				continue;
			}
			Double num = Double.parseDouble(numbers.poll());

			res = operate.getResult(res, num);
		}

		System.out.println(res);
	}
}
