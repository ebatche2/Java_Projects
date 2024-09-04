//Name: Elijah Batchelor
//Class: CSC110
//Date: 9/3/2024
//Brief Description: This program displays the decimal equivalent of a fraction
//Description of inputs: integer numerator, integer denominator
//Description of outputs: decimal equivalent

import java.util.Scanner;

public class Fraction {
	public static void main (String [] args) {
		Scanner scnr = new Scanner(System.in);
		
		int num1;
		int num2;
		double result;
		
		System.out.print("Please enter the numerator of the fraction: ");
		num1 = scnr.nextInt();
		
		System.out.print("Please enter the denominator of the fraction: ");
		num2 = scnr.nextInt();
		
		result = (double) num1 / num2;
		
		System.out.println(num1 + "/" + num2 + " = " + result);
		
	}
	

}

//Expected Output
/*
Please enter the numerator of fraction: 5
Please enter the denominator of fraction: 3
5/3 = 1.6666666666666667
*/