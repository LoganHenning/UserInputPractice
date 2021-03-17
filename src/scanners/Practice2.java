package scanners;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		/* Take 2 integer inputs from user.  First calculate
		 * the sum of two then product of two.  Finally pring the sum
		 * and product of both obtained results.
		 */
		System.out.println("Enter input:");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		System.out.println("The sum is " + (x+y));
		System.out.println("The product is " + (x*y));
	}

}
