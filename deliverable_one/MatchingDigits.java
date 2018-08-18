package deliverable_one;
import java.util.Scanner;

   /*
     This program reads 2 separate 3-digit integers and checks 
     to see if each corresponding place in each number sums to
     the same number.
     
     Author: Mariah Hall
     Date:   August 16th, 2018
   */

public class MatchingDigits {
   public static void main(String[] args) {
   
   Scanner scnr = new Scanner(System.in);
   int firstInt;       // first number entered by user
   int secondInt;      // second number entered by user
   String firstDigit;  // converts firstInt into String
   String secondDigit; // converts secondInt into String
   int a;              // number at index 0 in firstDigit
   int A;              // number at index 0 in secondDigit
   int b;              // number at index 1 in firstDigit
   int B;              // number at index 1 in secondDigit
   int c;              // number at index 2 in firstDigit
   int C;              // number at index 2 in secondDigit
   int sumOfIndex0;    // sum of digits in index 0 of both integers
   int sumOfIndex1;    // sum of digits in index 1 of both integers
   int sumOfIndex2;    // sum of digits in index 2 of both integers 
   
   //INPUT: read 2 integers from user with same number of digits
   System.out.print("Enter your first 3 digit integer: ");
   firstInt = scnr.nextInt();
   
   System.out.print("Enter your second 3 digit integer: ");
   secondInt = scnr.nextInt();
   
   // check that user entered two 3-digit integers
   if ((firstInt >= 100 && firstInt <= 999) && (secondInt >= 100 && secondInt <= 999)) {
	  // TASK: check if corresponding place sums to same total
	  firstDigit = String.valueOf(firstInt);
	  secondDigit = String.valueOf(secondInt); 
      
	  // finds number at index0
	  a = firstDigit.charAt(0);
      A = secondDigit.charAt(0);
      sumOfIndex0 = a + A;
      
      // first set of integers must be positive
      if (sumOfIndex0 >= 0) {
      }
      b = firstDigit.charAt(1);
      B = secondDigit.charAt(1);
      sumOfIndex1 = b + B; 
      
      // sum of second set of integers must be == to the sum of first
      if (sumOfIndex0 == sumOfIndex1) {
      }
      c = firstDigit.charAt(2);
      C = secondDigit.charAt(2);
      sumOfIndex2 = c + C;
      
      // sum of third set of integers must be == to the sum of first
	  if (sumOfIndex0 == sumOfIndex2) {
	     System.out.print("True");
	  }
	  // if one or more of the three sums are not the same 
	  else {
	     System.out.print("False"); 
	  }
   }
   // user did not enter two 3-digit integers
   else {
      System.out.print("Error: both integers must be between 100 and 999.");
	}
scnr.close();
   }
}