package guvi;

import java.util.Scanner;

public class Count {
public static void main(String[] args) {
	 Scanner s  = new Scanner(System.in);
     System.out.print("Enter a sentence: ");
     String input = s.nextLine();
     String r = "";
     char firstChar = input.charAt(0);
     r = r + Character.toUpperCase(firstChar);
     for (int i = 1; i < input.length(); i++) {
         char currentChar = input.charAt(i);
                 char previousChar = input.charAt(i - 1);
                if (previousChar == ' ') {
             r = r + Character.toUpperCase(currentChar);
         } else {
             r = r + currentChar;
         }
     }
     System.out.println(r);
 }


}
