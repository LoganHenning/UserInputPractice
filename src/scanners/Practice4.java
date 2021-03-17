package scanners;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		/*Take name, roll number and field of interest
		 * from user and print in the format below:
		 * Hey, my name is xyz and my roll number is xyz.  
		 * My field of interest is xyz.
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name: ");
		String a = s.next();
		System.out.println("Enter roll number: ");
		int b = s.nextInt();
		System.out.println("Enter field of interest");		
		s.next();
		String c = s.nextLine();
		System.out.println("Hey, my name is " + a + " and my roll number is "
				+ b + ".  My field of interest is " + c + ".");
		
		
		
	}

}
