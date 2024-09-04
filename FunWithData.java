// Name: Elijah Batchelor
// Date: 8/27/2024
// Project: Praticing with data
// Input: None
// Output: The value of an anotherInt and aDouble
public class FunWithData {
	public static void main(String [] args) {
		int anInt;
		int anotherInt;
		double aDouble;
		char aChar;
		String name;
		double result;
		int num = 4;
		
		anInt = 90;
		aDouble = 45.789;
		aChar = 'A';
		anotherInt = anInt + 20;
		
		aDouble = aDouble + anInt;
		
		result = anInt * 4 + anotherInt * 5 / aDouble;
		
		anInt = anInt + 1;
		
		anInt++;
		anInt--;
		
		anInt = anInt + 3;
		
		anInt += 3;
		
		anotherInt *= num;
		
		name += "World";
		
		System.out.println("The value of anotherInt: " + anotherInt);
		System.out.println("The value of aDouble is: " + aDouble);
		System.out.println("The value of result is: " + result);
		
	}

}

// ++ is an increament operator: it adds one to the variable
// -- is an decreament operator: it subtracts one to the variable