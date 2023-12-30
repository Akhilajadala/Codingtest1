 package com.anp.exceptionhandling;
import java.util.Scanner;

public class ReverseString {
	
public static void msin(String[] args) {
	Scanner Sc= new Scanner(System.in);
	try {
		// Get user input
		System.out.print("Enter a String: ");
		String userInput= Sc.nextLine();
    // Reverse the string and display the result
		String reversedString = reverseString(userInput);
          System.out.println("Reversed string: " + reversedString);
		        } 
	      catch (NullPointerException e) {
	    	  //Handle null input
		     System.out.println("Error: Please provide a non-null string.");
		        } 
	      catch (Exception e) {
	    	  //Handle unexpected errors
		     System.out.println("An unexpected error occurred: " + e.getMessage());
		        }
	       finally {
		      Sc.close();
		        }
		    }
      private static String reverseString(String input) 
      {
    	  // check for null input
		        if (input == null)
		        {
		            throw new NullPointerException("Input string is null.");
		        }
       //Reverse the string using StringBuilder
		        StringBuilder reversed = new StringBuilder();
		        for (int i = input.length() - 1; i >= 0; i--) {
		            reversed.append(input.charAt(i));
		        }
          return reversed.toString();
		    }
		}
		
	
