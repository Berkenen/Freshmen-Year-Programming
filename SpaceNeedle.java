/*
*Name: J. William Berkenpas
 *Assignment: Lab05
 *Title: WordPlay
 *Course: CS 144
 *Class section: 3
 *Lab Section: 3
 *Semester: Fall 2019
 *Instructor: Professor Blaha
 *Date: 10/24/19
 *Sources consulted:
 *Known Bugs: N/A
 *Program description:
 *Creativity:
 *Instructions: cmd -> javac SpaceNeedle.java -> java SpaceNeedle
 */
import java.util.Scanner; //initiate scanner utility
public class SpaceNeedle
{
	public static void main(String[] args)
	{
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter the scale: ");
    int scale=scan.nextInt();
    String space=" ";
    String underUnderSlash= "__/";
    String colons=":::";
    String slash="\\ hhh";
    char slashChar=slash.charAt(0);
    String slashUnderUnder= slashChar+"__";

    for(int i=0;i<scale;i++)
    {
      for(int j=0;j<(scale*3);j++)
      {
        System.out.print(" ");
      }
      System.out.println("||");
    }




    int sectionTwo=0;
    int counter=(scale*6)+2;
    int counterTwo=0;
    for(int j=(scale*3)-3;j>=0;j-=3)
      {
        System.out.print(space.repeat(j));
        System.out.print(underUnderSlash);
        System.out.print(colons.repeat(counterTwo));
        System.out.print("||");
        System.out.print(colons.repeat(counterTwo));
        System.out.print(slashUnderUnder);
        System.out.print(space.repeat(j));
        System.out.print("\n");
        counterTwo++;
      }
    counterTwo=0;




    System.out.print("|");
    for(int i=0;i<counter-2;i++)
    {
      System.out.print("\"");
    }
    System.out.print("|");
    System.out.print("\n");




    counterTwo=scale*3-1;
    int counterThree=0;
    for(int h=0;h<scale;h++)
    {
      System.out.print(space.repeat(counterThree));
      System.out.print("\\_");
      System.out.print("/\\".repeat(counterTwo));
      System.out.print("_/");
      counterTwo-=2;
      counterThree+=2;
      System.out.print("\n");
    }
    counterTwo=0;
    for(int a=0;a<scale;a++)
    {
      for(int g=0;g<(scale*3);g++)
      {
        System.out.print(" ");
      }
      System.out.println("||");
    }
    counterTwo=0;



    for(int f=0;f<(scale*4);f++)
    {
      System.out.print(space.repeat((scale*3)-3));
      System.out.print("|%%||%%|");
      System.out.print("\n");
    }

    sectionTwo=0;
    counter=(scale*6)+2;
    counterTwo=0;


    for(int r=(scale*3)-3;r>=0;r-=3)
      {
        System.out.print(space.repeat(r));
        System.out.print(underUnderSlash);
        System.out.print(colons.repeat(counterTwo));
        System.out.print("||");
        System.out.print(colons.repeat(counterTwo));
        System.out.print(slashUnderUnder);
        System.out.print(space.repeat(r));
        System.out.print("\n");
        counterTwo++;
      }
    counterTwo=0;




    System.out.print("|");
    for(int v=0;v<counter-2;v++)
    {
      System.out.print("\"");
    }
    System.out.print("|");
    System.out.print("\n");

  }
}
