/**
	* File: Lesson 1.11 - Math
	* Author: Leo
	* Date Created: Mar 11, 2026
	* Date Last Modified: Mar 11, 2026
	*/
import java.util.Scanner;
	public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = input.nextDouble();
		System.out.println(Math.abs(num));
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = input.nextDouble();
		System.out.print("Input another number: ");
		double num2 = input.nextDouble();
		System.out.println(Math.floor(num1 / num2));
		System.out.println(Math.ceil(num1 / num2));
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		int num1 = input.nextInt();
		System.out.println(Math.round(Math.sqrt(num1)));
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = input.nextDouble();
		System.out.print("Input another number: ");
		double num2 = input.nextDouble();
		System.out.println(Math.pow(num1, num2));
	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = input.nextDouble();
		System.out.print("Input another number: ");
		double num2 = input.nextDouble();
		System.out.print("Input one more number: ");
		double num3 = input.nextDouble();
		System.out.println(Math.max(Math.max(num1, num2), num3));
		System.out.println(Math.min(Math.min(num1, num2), num3));
	}

}
