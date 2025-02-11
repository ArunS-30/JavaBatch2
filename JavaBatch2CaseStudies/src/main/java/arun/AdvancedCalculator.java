package arun;

import java.util.Scanner;

public class AdvancedCalculator extends Calculator {

	public AdvancedCalculator(int a, int b) {
		super(a, b);
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The First value is: ");
		int isFirstValue = scanner.nextInt();
		System.out.println("Enter The Second value is: ");
		int isSecondValue = scanner.nextInt();

		System.out.println("Make a Select Your Correct Operation");
		System.out.println("1.addition" + "(+)");
		System.out.println("2.Subtraction" + "(-)");
		System.out.println("3.Multiplication" + "(*)");
		System.out.println("4.Division" + "(/)");
		System.out.println("5.Modulus Operation" + "(%)");
		System.out.println("6.Percentage Operation" + "(%)");

		int Operators = scanner.nextInt();

		String operend = null;
		double result = 0;
		AdvancedCalculator advCalculator = new AdvancedCalculator(isFirstValue, isSecondValue);
		while (Operators > 6) {
			System.out.println("Please Enter The Correct Operation Its Invalid");
			Operators = scanner.nextInt();
		}
		switch (Operators) {
		case 1:
			if (Operators == 1) {
				result = advCalculator.addition();
				operend = "+";
				break;
			}
		case 2:
			if (Operators == 2) {
				result = advCalculator.subtraction();
				operend = "-";
				break;
			}
		case 3:
			if (Operators == 3) {
				result = advCalculator.multiplication();
				operend = "*";
				break;
			}
		case 4:
			if (Operators == 4) {
				result = advCalculator.division();
				operend = "/";
				break;
			}
		case 5:
			if (Operators == 5) {
				result = advCalculator.modulus();
				operend = "%";
				break;
			}
		case 6:
			if (Operators == 6) {
				result = advCalculator.PercentageOperation();
				operend = "*100/";
				break;
			}
		default:
			System.out.println("Invalid operation code!!!\n" + "--------------------------");
			break;
		}

		if (Operators == 6) {
			System.out.println(isFirstValue + " " + operend + " " + isSecondValue + " = " + result + "%");
			scanner.close();
		} else {
			System.out.println(isFirstValue + " " + operend + " " + isSecondValue + " = " + result);
			scanner.close();
		}
	}
}
