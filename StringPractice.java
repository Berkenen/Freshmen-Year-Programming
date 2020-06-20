// Names:  berk                                                             ____ / 5
//
// Practice using the String class methods
// Work with your partner to write the lines of code specified below
// At the end of class turn in a single printout with both your names on it

import java.util.Scanner;

public class StringPractice
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		// declare two String variables to hold two names
		String name1, name2;
		String name3, name4;
		// (1) prompt for your names and read them into the string variables
		System.out.println("What is the first person's name? (First)");
		name1= scan.nextLine();
		System.out.println("What is the first person's name? (Last)");
		name2= scan.nextLine();
		System.out.println("What is the second person's name? (First)");
		name3= scan.nextLine();
		System.out.println("What is the second person's name? (Last)");
		name4= scan.nextLine();

		// (2) print the length of each name
		System.out.println(name1.length() + name2.length());
		System.out.println(name3.length() + name4.length());

		// (3) print one name in all capital letters and the other in all
		// lower case -- no fighting!
		System.out.println(name1.toUpperCase() + " " + name2.toUpperCase());
		System.out.println(name3.toLowerCase() + " " + name4.toLowerCase());
		// (4) print each partner's first initial
		System.out.println(name1)

		// (5) print the last letter in each name (hint: use both length and charAt)

	}
}
