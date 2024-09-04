import java.util.Scanner; 

/*Program Name: Double.java 
Author: Elijah Batchelor
Class:CSC 110 
Date Written: 8/29/2024
Brief Description: Write a Java program that gets an integer input and then displays 
the double of that integer. 
Description of inputs: Integer number 
Description of outputs: double the number
*/ 

public class Double {

    public static void main(String[] args) {
       
        //1.Declare variables needed
    	int num1;
    	double double1;
        //2. Create a Scanner object
        Scanner scnr = new Scanner(System.in);
        //3. Prompt the user for the input
        System.out.print("Please enter an integer: ");
        //4. Read the input using Scanner object and store it in appropriate variable
        num1 = scnr.nextInt();  
        //5. Process the input: Calculate double the number
        double1 = num1 * 2;
        //6. Display output
        System.out.println(num1 + " multiplied by 2 is: " + double1);
        
    }

}