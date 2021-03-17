package scanners;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		/*Ask user to give 2 double input for length and breadth 
		 * of a rectangle and print area type casted to int
		 */
		
		System.out.println("Input length and breadth: ");
		Scanner scanner = new Scanner(System.in);
		double length = scanner.nextDouble();
		double breadth = scanner.nextDouble();
		double area = length * breadth;
		int areaInt = (int)area;
		System.out.println(areaInt);
		
	}

}
