/*
*Name: J. William Berkenpas
 *Assignment: Lab03
 *Title: PizzaOrder
 *Course: CS 144
 *Class section: 3
 *Lab Section: 3
 *Semester: Fall 2019
 *Instructor: Professor Blaha
 *Date: 10/03/19
 *Sources consulted: StackOverflow
 *Known Bugs: N/A
 *Program description: Prompts the user for details on a pizza, calcualtes the cost, tax, and total price of the pizza
 *Creativity: Format name to always be properly cased (Name, not nAmE), switch statment instead of if-else for crust, and default size of 12 if input is irregular
 *Instructions: cmd -> javac PizzaOrder.java -> java PizzaOrder
 */
import java.util.Scanner; //initiate scanner utility
public class PizzaOrder
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String firstName; // First name of orderer
		char crustType; // code for type of crust
		String crust="default"; //name of crust type
		int inches; //the size of the pizza
		final double TAX_RATE=0.08; //the sales tax
		double cost=0; // cost of the pizza
		double tax; //the additonal cost tax adds
		String toppings = "Cheese"; // the list of toppings
		int numberOfToppings=0; // topping counter variable
		char checker; //checks the char for the yes or no portion
		String name1 = "MIKE"; // name for comparison for discount
		String name2 = "DIANE"; // name for comparison for discount
		System.out.println("Welcome to Mike and Diane's Pizza");
		System.out.print("Enter your first name: "); //Prompts
		firstName = scan.nextLine(); // input of name from user
		System.out.println("Pizza size (inches)" + '\t' + " Cost"); //menu display
		System.out.println('\t'+"10" +'\t'+ '\t' +"$10.99"); //menu display
		System.out.println('\t'+"12" +'\t'+ '\t' +"$12.99"); //menu display
		System.out.println('\t'+"14" +'\t'+ '\t' +"$14.99"); //menu display
		System.out.println('\t'+"16" +'\t'+ '\t' +"$16.99"); //menu display
		System.out.println("What size pizza would you like?"); //prompt
		System.out.print("10, 12, 14, 16 (enter the number only): "); //prompt cont.
		inches= scan.nextInt(); //inputs inches
		if(inches==10) //if-else for size, checks entry
		{
			cost=10.99;
		}
		else if(inches==12) //if-else for size, checks entry
		{
			cost=12.99;
		}
		else if(inches==14) //if-else for size, checks entry
		{
			cost=14.99;
		}
		else if(inches==16) //if-else for size, checks entry
		{
			cost=16.99;
		}
		else{
			System.out.println("Sorry, what you entered wasn't an option, default is 12 inches"); //creativity, default value if input wasn't any of the options presented
			cost=12.99;
		}
		System.out.println("What type of crust do you want?"); //prompt
		System.out.print("(H)and-tossed, (T)hin-crust, or (D)eep-dish (enter H, T, or D): "); //prompt cont.
		crustType= scan.next().charAt(0); //input set
		switch(crustType){ //creativity, switch statement instead of if-else
			case 'H':
				crust="Hand-tossed";
				break;
			case 'h':
				crust="Hand-tossed";
				break;
			case 'T':
				crust="Thin-crust";
				break;
			case 't':
				crust="Thin-crust";
				break;
			case 'D':
				crust="Deep-dish";
				break;
			case 'd':
				crust="Deep-dish";
				break;
		}
		System.out.println("All pizzas come with cheese.");
		System.out.println("Additional toppings are 1.25 each, choose from");
		System.out.println("Pepperoni, Sausage, Onion, Mushroom"); //prompt
		System.out.print("Do you want Pepperoni? (Y/N): "); //prompt cont.
		checker=scan.next().charAt(0); // checks to see if the user entered yes or no for the proposed topping
		if(checker=='Y' || checker =='y')
		{
			toppings = toppings.concat(" Pepperoni"); //adds the topping name to the topping string
			numberOfToppings++;
		}
		checker='A'; //resets 
		System.out.print("Do you want Sausage? (Y/N): "); // checks to see if the user entered yes or no for the proposed topping
		checker=scan.next().charAt(0);
		if(checker=='Y' || checker =='y')
		{
			toppings = toppings.concat(" Sausage"); //adds the topping name to the topping string
			numberOfToppings++;
		}
		checker='A'; //resets
		System.out.print("Do you want Onion? (Y/N): "); // checks to see if the user entered yes or no for the proposed topping
		checker=scan.next().charAt(0);
		if(checker=='Y' || checker =='y')
		{
			toppings = toppings.concat(" Onion"); //adds the topping name to the topping string
			numberOfToppings++;
		}
		checker='A'; //resets
		System.out.print("Do you want Mushroom? (Y/N): "); // checks to see if the user entered yes or no for the proposed topping
		checker=scan.next().charAt(0);
		if(checker=='Y' || checker =='y')
		{
			toppings = toppings.concat(" Mushroom"); //adds the topping name to the topping string
			numberOfToppings++;
		}
		checker='A'; //resets
		cost=cost+(numberOfToppings*1.25); //additional cost of toppings
		System.out.println('\n');
		System.out.println(Character.toUpperCase(firstName.charAt(0))+firstName.substring(1).toLowerCase() + ", your order is as follows: "); //creativity, properly caps name
		System.out.println(inches + " inch pizza"); //displays size
		System.out.println(crust + " crust"); //displays crust type name
		System.out.println(toppings); //displays the list of toppings
		if(firstName.equalsIgnoreCase(name1) || firstName.equalsIgnoreCase(name2)) //checks to see if the user shares a name with one of the owners (and thus gets a discount)
		{
			cost=cost-2;
			System.out.println("You are eligible for a $2.00 discount");
		}
		else{
			System.out.println("You are not eligible for a $2.00 discount");
		}
		System.out.printf("The cost of your order is: " + "%.2f", cost); //price
		System.out.print('\n');
		System.out.printf("The tax is: " + "%.2f", cost*0.08); //tax
		System.out.print('\n');
		System.out.printf("The total due is: " + "%.2f", cost*1.08); //total cost
		System.out.print('\n');
		System.out.println("Your order will be ready for pickup in 30 minutes.");
  }
}
