/*
 * Write a program called CheckOddEven which prints "Odd Number" if the 
int variable “number” is odd, or “Even Number” otherwise. The program shall 
always print “bye!” before exiting.

Hints

n is an even number if (n % 2) is 0; otherwise, it is an odd number. 
Use == for comparison, e.g., (n % 2) == 0.
 */
package ExercisesonJavaBasics;

/**
 *
 * @author german
 */
public class CheckOddEven_iif_else_1_3 {
    
     public static void main(String[] args) {  // Program entry point
      int number = 49;       // Set the value of "number" here!
      System.out.println("The number is " + number);
      if ( number % 2 == 0 ) {
         System.out.println( "Even Number" );   // even number
      } else {
         System.out.println( "Odd Number" );   // odd number
      }
      System.out.println( "“bye!”" );
   }
}


/*

    Try number = 0, 1, 88, 99, -1, -2 and verify your results.

    Again, take note of the source-code identation! Make it a good 
    habit to ident your code properly, for ease of reading your program.

*/