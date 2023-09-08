// Name:    Reese Johnson
// Class:   CS 3305/Section W01
// Term:    Summer 2023
//Instructor:   Prof. Majeed
// Assignment   2

import java.util.Scanner;

public class TestPalindrome {
    public static void main (String[] args) {
        Stack<Character> myStack = new Stack(); //creates a stack of strings
        String ReverseString = "";
        Scanner input = new Scanner(System.in); //create scanner for usage of getting user input
        //prints out and gets the first user input for the menu
        System.out.print("Enter a String: ");
        String userIn = input.nextLine();
        //pushes the string into the stack splitting after each Char
        for(int i = 0; i < userIn.length(); i++){
            myStack.push(userIn.charAt(i));
        }
        //prints the original input
        System.out.println("Input String:       " +   userIn);
        //gets the revers of the string to check if it is a palindrome
        for(int i = 0; i < userIn.length(); i++){
            ReverseString += myStack.pop();
        }
        //comparing the orignial string to the reverse string, lower casing both to ensure case does not affect it
        if (ReverseString.toLowerCase().equals(userIn.toLowerCase())){
            System.out.println("Judgement:          Palindrome");
        } else {
            System.out.println("Judgement:          Not Palindrome");
        }
        //asking if continue or not
        System.out.println();
        System.out.println("Do you want to re-run code with different input string (Y/N)?");
        userIn = input.nextLine();
        //switch case checking to make sure that an N is not input
        while (!userIn.equals("N")) switch (userIn){
            case "Y":
                //remakes the reverse string into a blank string.
                ReverseString = "";
                System.out.print("Enter a String: ");
                userIn = input.nextLine();
                //repeats the code from above to get the reverse string and check if it is a palindrome
                for(int i = 0; i < userIn.length(); i++){
                    myStack.push(userIn.charAt(i));
                }
                //gets the reverse string
                System.out.println("Input String:       " +   userIn);
                for(int i = 0; i < userIn.length(); i++){
                    ReverseString += (myStack.pop());
                }
                //checks for palindrome
                if (ReverseString.toLowerCase().equals(userIn.toLowerCase())){
                    System.out.println("Judgement:          Palindrome");
                } else {
                    System.out.println("Judgement:          Not Palindrome");
                }
                //asks if they want to continue
                System.out.println();
                System.out.println("Do you want to re-run code with different input string (Y/N)?");
                userIn = input.nextLine();
                break;
                //if N is given program stops
            case "N": break;
            //Checks for everything that is not Y or N and forces them to reenter something that is Y or N.
            default:
                System.out.println("Not a correct input please input 'Y' or 'N'");
                userIn = input.nextLine();
                break;
        }
    }
}
