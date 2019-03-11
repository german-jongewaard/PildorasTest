/*
 * 1.4  PrintNumberInWord (nested-if, switch-case)
 *
 * Write a program called PrintNumberInWord which prints 
 * "ONE", "TWO",... , "NINE", "OTHER" if the int variable "number" 
 * is 1, 2,... , 9, or other, respectively. Use (a) a "nested-if" 
 * statement; (b) a "switch-case-default" statement.
 *
 *
 */
package ExercisesonJavaBasics;

/**
 *
 * @author german
 */
public class PrintNumberInWord_1_4 {
 
    public static void main(String[] args) {
      int number = 5;  // Set the value of "number" here!
 
      // Using nested-if
      if (number == 1) {   // Use == for comparison
         System.out.println( "ONE" );
      } else if (number == 2) {
         System.out.println( "TWO" );
      } else if ( number == 3 ) {
          System.out.println( "THREE" );
      } else if (number == 4) {
         System.out.println( "FOUR" );
      } else if ( number == 5 ) {
          System.out.println( "FIVE" );
      } else if (number == 6) {
         System.out.println( "SIX" );
      } else if ( number == 7 ) {
          System.out.println( "SEVEN" );
      } else if (number == 8) {
         System.out.println( "EIGHT" );
      } else if ( number == 9 ) {
          System.out.println( "NINE" );
      } else {
         System.out.println( "OTHER" );
      }
 
      // Using switch-case-default
      switch(number) {
         case 1: 
            System.out.println( "ONE" ); break;  // Don't forget the "break" after each case!
         case 2: 
            System.out.println( "TWO" ); break;
         case 3: 
            System.out.println( "THREE" ); break;
        case 4: 
            System.out.println( "FOUR" ); break;
        case 5: 
            System.out.println( "FIVE" ); break;
        case 6: 
            System.out.println( "SIX" ); break;
        case 7: 
            System.out.println( "SEVEN" ); break;
        case 8: 
            System.out.println( "EIGHT" ); break;
        case 9: 
            System.out.println( "NINE" ); break;
         default: System.out.println( "OTHER" ); 
      }
   }
}


/*
*
*Try number = 0, 1, 2, 3, ..., 9, 10 and verify your results.
*
*/
