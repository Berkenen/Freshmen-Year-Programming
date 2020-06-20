/*
*Name: J. William Berkenpas
 *Assignment: Lab03
 *Title: WordPlay
 *Course: CS 144
 *Class section: 3
 *Lab Section: 3
 *Semester: Fall 2019
 *Instructor: Professor Blaha
 *Date: 10/17/19
 *Sources consulted: StackOverflow
 *Known Bugs: N/A
 *Program description: Takes in a setence, and returns whether its an alliteration, palindrome, lipogram of e, or lipogram of s along with sentence statistics.
 *Creativity: Repeating loop to allow for the repeat of entries, until "quit" is entered, and word statistics are also returned (longest, average letters, total word number)
 *Instructions: cmd -> javac WordPlay.java -> java WordPlay
 */
import java.util.Scanner; //initiate scanner utility
public class WordPlay
{
	public static void main(String[] args)
	{
    String input="egg"; // input string initiation
    Scanner scan=new Scanner(System.in);
    int count=1; // count for first word initiation
    char alit='a'; //base initiation for alliteration variable

    boolean alitYN= true; //alliteration boolean
    boolean eContain=false; // e lipgram boolean
    boolean sContain=false; // s lipgram boolean
		int wordCount=0; // word count
		int currentLongest=0; //longest length (letter count)
		String longestWord=""; //longest word string
		int average=0; //average word length
    String lowerInput="egg"; //the input in all lower case (egg is a placeholder)
    String cleanInput=""; // the inout with only letters and no spaces
    String reverseInput=""; // the cleaned input reversed
		String cleanSpacesInput=""; // the input with only letters and with spaces
    System.out.print("Please enter a sentence: "); //prompt
    input=scan.nextLine();
		while(!(input.equalsIgnoreCase("quit"))) //while loop for Creativity
		{

   		char letter=input.charAt(0); //letter grab for alliteration
			letter=Character.toLowerCase(letter); //Convert to lowercase for easier check




			System.out.println("Your input was: "+input);



			//Convert to lowercase
			lowerInput=input.toLowerCase();
			alit=input.charAt(0);
			for(int i=0;i< lowerInput.length();i++)
			{
				if(Character.isLetter(lowerInput.charAt(i)))
				{
					cleanInput+=lowerInput.charAt(i);
				}
				if(Character.isLetter(lowerInput.charAt(i)) || lowerInput.charAt(i)==' ')
				{
					cleanSpacesInput+=lowerInput.charAt(i);
				}
			}




			//Removes nonletters but keeps spaces (allows for an easier count for longest word [since only letters are counted and not connection commas and periods])
			Scanner stringScan = new Scanner(cleanSpacesInput);




			//Alliteration check
			String word = "";
			while( stringScan.hasNext() )
			{
				word=stringScan.next();
				word=word.toLowerCase();
				wordCount++; //word count Creativity
				if(word.length()>currentLongest)
				{
					currentLongest=word.length();
					longestWord=word; // longest check Creativity
				}
				average+=word.length();
				if(word.charAt(0)!=letter && word.length()>3) // if the words longer than 3 and it doesn't have the same first letter as the first word then it sets alliteration to false
				{
					alitYN=false;
				}
			}




			//Average calculation (Creativity)
			average=average/wordCount;





			//Remove spaces and non-letters
			for(int i=cleanInput.length()-1; i>=0 ;i--)
			{
			  reverseInput+=cleanInput.charAt(i);
			}




			//Check if it has the letter e
			for(int i= 0;i<input.length();i++)
			{
			  if(input.charAt(i)=='e'||input.charAt(i)=='E')
			  {
			    eContain=true;
			  }
			}





			//Check if it has the letter s
			for(int i= 0;i<input.length();i++)
			{
			  if(input.charAt(i)=='s'||input.charAt(i)=='S')
			  {
			    sContain=true;
			  }
			}




			//Checks if its a palindrome by checking if the cleaned reverse is the same as the cleaned forward
			if(cleanInput.equalsIgnoreCase(reverseInput)==true)
			{
			  System.out.println("The input is a palindrome.");
			}
			else{
			  System.out.println("The input is not a palindrome.");
			}





			//Checks if its an alliteration
			if(alitYN==true)
			{
				System.out.println("The input is an alliteration.");
			}
			else{
				System.out.println("The input is not an alliteration.");
			}





			// Checks if its an e lipgram
			if(eContain==true)
			{
			  System.out.println("The input is not a lipogram avoiding E.");
			}
			else{
			  System.out.println("The input is a lipogram avoiding E.");
			}





			//Checks if its an s lipgram
			if(sContain==true)
			{
			  System.out.println("The input is not a lipogram avoiding S.");
			}
			else{
			  System.out.println("The input is a lipogram avoiding S.");
			}

			System.out.println("The input had " +wordCount + " words, an average of " + average + " letters a word, and the longest word was "+ longestWord+ ".");





			// Variable reset (don't seem to be reset and cleared unless this is done, looks ugly but works) only here because of the loop for Creativity
			lowerInput="";
			reverseInput="";
			cleanInput="";
			word="";
			longestWord="";
			currentLongest=0;
			cleanSpacesInput="";
			letter=input.charAt(0);
			letter=Character.toLowerCase(letter);
			wordCount=0;
			average=0;
			alitYN=true;
			eContain=false;
			sContain=false;




			System.out.print("\n\n\nPlease enter a sentence: "); // loop repeat Creativity
	    input=scan.nextLine();

		}
  }
}
