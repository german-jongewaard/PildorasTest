/*
 * Write a program called CheckPassFail which prints "PASS" if the int variable 
   "mark" is more than or equal to 50; or prints "FAIL" otherwise. The program shall 
   always print “DONE” before exiting.

   Hints

   Use >= for greater than or equal to comparison.

 */
package ExercisesonJavaBasics;

import java.util.List;

/**
 *
 * @author german
 */
public class CheckPassFail_if_else_1_2 {
   
    public static void main(String[] args) {  // Program entry point
        int mark = 49;   // Set the value of "mark" here!       
              
        System.out.println("The mark is " + mark);       
      
      // if-else statement
      if (mark >= 50) {
         System.out.println( "PASS" );
      } else {
         System.out.println( "FAIL" );
      }
      System.out.println( "DONE" );
   }
}

/*
*
*    Try mark = 0, 49, 50, 51, 100 and verify your results.
*
*    Take note of the source-code indentation!!! Whenever you open a block 
*    with '{', indent all the statements inside the block by 3 (or 4 spaces). 
*    When the block ends, un-indent the closing '}' to align with 
*    the opening statement.
*
*
*/