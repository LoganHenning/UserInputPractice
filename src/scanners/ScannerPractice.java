package scanners;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		/*Write a program to take 2 integer inputs
		 * from user and print sum and product of them		  
		 */
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter input");
		int input1 = scanner1.nextInt();
		int input2 = scanner1.nextInt();
		int sum = input1 + input2;
		int product = input1 * input2;
		System.out.println("The sum of the inputs is " + sum);
		System.out.println("The product of the inputs is " + product);

	}

}
