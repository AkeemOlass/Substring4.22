import java.util.Scanner;
/**GNU GENERAL PUBLIC LICENSE
 Version 3, 29 June 2007

 Copyright (C) 2014  Author Akeem Prince Olass.
 Everyone is permitted to copy and distribute verbatim copies
 of this license document, but changing it is not allowed.
*/
/**Prompts user to enter two strings and displays a result if one is a substring of the other or not*/
public class Sub_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a String: ");
        String string1 = input.next();
        System.out.print("Please enter a second String: ");
        String string2 = input.next();
        boolean k;
        k=Compare(string1,string2);
            if (k == true) {
                System.out.println( "It's is a substring  ");
            }
            if (k == false) {
                System.out.println( "It's is not a substring  " );
            }
        }



/**Checks if two strings are substrings*/
    public static boolean Compare(String string1, String string2) {
        if (string2.length() > string1.length()) {
            string1 = string2;
            string2 = string1;
            return ( string1.contains(string2));
        }else{
            return ( string1.contains(string2));
        }

        }}
