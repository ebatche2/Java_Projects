import java.util.Scanner;// java.util is a package and Scanner is in it
//Name: Elijah Batchelor
//Date: 8/29/2024
//Project:
//Input:
//Output
public class DataDemoInteractive {
	public static void main (String [] args) {
		
		int aNum;
		int sum;
		double dNum;
		String string;
		char aLetter;
		
		Scanner scan = new Scanner(System.in);// System.in represents the keyboard
		
		System.out.print("Please enter an integer: ");
		aNum = scan.nextInt();
		
		System.out.print("Please enter a decimal number: ");
		dNum = scan.nextDouble();
		
		System.out.print("Please enter a string: ");
		string = scan.nextLine();
		
		sum = aNum + 5;
		
		System.out.println(aNum + " plus 5 is: " + sum);
	}

}
