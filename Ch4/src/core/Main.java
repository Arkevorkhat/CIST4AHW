package core;

import java.util.Scanner;

public class Main {
	public static long square(int input) {
		return input * input;
	}

	public static long cube(int input) {
		return input * input * input;
	}

	public static long fourth(int input) {
		return (long) Math.pow(input, 4);
	}

	/*
	 * public static void main(String[] args) { Scanner in = new Scanner(System.in);
	 * System.out.println("Input a number to square");
	 * System.out.printf("squared, equals %d\n",square(in.nextInt()));
	 * System.out.println("Input a number to cube");
	 * System.out.printf("cubed, equals %d\n",cube(in.nextInt()));
	 * System.out.println("Input a number to raise to the fourth power.");
	 * System.out.printf("Raised to the Fourth, Equals %d\n",fourth(in.nextInt()));
	 * in.close(); }
	 */
	/*public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input the first operand.");
		int inputA = in.nextInt();
		int inputB = in.nextInt();
		System.out.printf("%d + %d = %d", inputA, inputB, inputA + inputB);
		System.out.printf("%d - %d = %d", inputA, inputB, inputA - inputB);
		System.out.printf("%d * %d = %d", inputA, inputB, inputA * inputB);
		System.out.printf("%d / %d = %d", inputA, inputB, inputA / inputB);
		System.out.printf("Distance between %d and %d is %d", inputA, inputB, (int) Math.abs(inputA - inputB));
		System.out.printf("the greater of %d and %d is %d", inputA, inputB, (int) Math.max(inputA, inputB));
		System.out.printf("the lesser of %d and %d is %d", inputA, inputB, (int) Math.min(inputA, inputB));
	}*/
	public static void main(String[] args){
		String[] input = {"   /\\   ","  /  \\   "," /    \\ ", "/      \\","--------","  \"  \"  ","  \"  \"  ","  \"  \"  "};
		for (int i=0;i<8;i++) {
			System.out.println(input[i]);
		}
	}
}
