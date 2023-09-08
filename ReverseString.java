// Name:    Reese Johnson
// Class:   CS 3305/Section W01
// Term:    Summer 2023
//Instructor:   Prof. Majeed
// Assignment   2

import java.util.Scanner;

public class ReverseString {
    public static void main (String[] args) {
        Stack<String> myStack = new Stack(); //creates a stack of strings
        Scanner input = new Scanner(System.in); //create scanner for usage of getting user input
        //prints out and gets the first user input
        System.out.print("Enter a String: ");
        String userIn = input.nextLine();
        //puts the string into an array split by spaces
        String[] words = userIn.split(" ");
        //puts the array into the stack by pushing each index
        for(int i = 0; i < words.length; i++){
            myStack.push(words[i]);
        }
        //prints the original then reverse string
        System.out.println("Input String:       " +   userIn);
        System.out.print("Reversed String:   ");
        //pops for the amount of words put into the stack.
        for(int i = 0; i < words.length; i++){
            System.out.print(" " + myStack.pop());
        }
        System.out.println();
        System.out.println("Do you want to re-run code with different input string (Y/N)?");
        userIn = input.nextLine();
        //switch case to ensure that the program will not stop until N is given
        while (!userIn.equals("N")) switch (userIn){
            case "Y":
                //repeat of above
                System.out.print("Enter a String: ");
                userIn = input.nextLine();
                words = userIn.split(" ");
                for(int i = 0; i < words.length; i++){
                    myStack.push(words[i]);
                }
                System.out.println("Input String:       " +   userIn);
                System.out.print("Reversed String:   ");
                for(int i = 0; i < words.length; i++){
                    System.out.print(" " + myStack.pop());
                }
                System.out.println();
                //asking if they would like to continue
                System.out.println("Do you want to re-run code with different input string (Y/N)?");
                userIn = input.nextLine();
                break;
                //stops the program given an N
            case "N": break;
            //Ensures that given anything other than Y or N it will repeat the question.
            default:
                System.out.println("Not a correct input please input 'Y' or 'N'");
                userIn = input.nextLine();
                break;
        }
    }
}
