// Name:    Reese Johnson
// Class:   CS 3305/Section W01
// Term:    Summer 2023
//Instructor:   Prof. Majeed
// Assignment   2

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestMyStack {
        public static void main (String[] args)
        {
            Stack<Integer> myStack = new Stack(); //creates a stack of integers
            Scanner input = new Scanner(System.in); //create scanner for usage of getting user input
            //prints out and gets the first user input for the menu
            System.out.print("---------MAIN MENU--------\n" +
                    "1 – Push Element\n" +
                    "2 – Pop Element\n" +
                    "3 – Top Element\n" +
                    "4 – Size of Stack\n" +
                    "5 – Is Empty Stack\n" +
                    "6 – Print Stack Content\n" +
                    "7 – Exit Program\n" +
                    "Enter option number:  ");
            int userIn = input.nextInt();
            //while and switch case for each of the different menu options every case has the menu options and user input again except 10
            while (userIn != 7) switch (userIn){
                //case 1 Pushing Element
                case 1:
                    System.out.println("List content before pushing element");
                    myStack.printStack();
                    boolean isInteger = false;
                    //while to make sure that an int is given for the push and nothing else
                    while (!isInteger) {
                        System.out.println("\nGive value for element");
                        Scanner newScan = new Scanner(System.in);
                        if(newScan.hasNextInt()){
                            userIn = newScan.nextInt();
                            myStack.push(userIn);
                            isInteger = true;
                        } else {
                            System.out.println("Not an integer enter an integer please");
                        }
                    }
                    System.out.println("List content after adding element");
                    myStack.printStack();
                    System.out.print("\n---------MAIN MENU--------\n" +
                            "1 – Push Element\n" +
                            "2 – Pop Element\n" +
                            "3 – Top Element\n" +
                            "4 – Size of Stack\n" +
                            "5 – Is Empty Stack\n" +
                            "6 – Print Stack Content\n" +
                            "7 – Exit Program\n" +
                            "Enter option number:  ");
                    userIn = input.nextInt();
                    break;
                    //Popping Top element
                case 2:
                    System.out.println("List content before popping");
                    myStack.printStack();
                    //checks if the stack is empty to prevent saying "null was popped"
                    if(myStack.isEmpty()) {
                        System.out.println("The stack is empty");
                    }
                    if(!myStack.isEmpty()) {
                        System.out.println();
                        System.out.println("The Popped Element: " + myStack.pop());
                        System.out.println("List content after popping");
                        myStack.printStack();
                    }
                    System.out.print("\n---------MAIN MENU--------\n" +
                            "1 – Push Element\n" +
                            "2 – Pop Element\n" +
                            "3 – Top Element\n" +
                            "4 – Size of Stack\n" +
                            "5 – Is Empty Stack\n" +
                            "6 – Print Stack Content\n" +
                            "7 – Exit Program\n" +
                            "Enter option number:  ");
                    userIn = input.nextInt();
                    break;
                //Top Element
                case 3:
                    System.out.println("Current List Content");
                    myStack.printStack();
                    //checks for empty stack to stop from "null is on top"
                    if(myStack.isEmpty()) {
                        System.out.println("The stack is empty no current top of the stack");
                    }
                    if(!myStack.isEmpty()) {
                        System.out.println("Current Top element " + myStack.top());
                    }
                    System.out.print("\n---------MAIN MENU--------\n" +
                            "1 – Push Element\n" +
                            "2 – Pop Element\n" +
                            "3 – Top Element\n" +
                            "4 – Size of Stack\n" +
                            "5 – Is Empty Stack\n" +
                            "6 – Print Stack Content\n" +
                            "7 – Exit Program\n" +
                            "Enter option number:  ");
                    userIn = input.nextInt();
                    break;
                //Size of Stack
                case 4:
                    System.out.println("Current List Content");
                    myStack.printStack();
                    System.out.println("\nCurrent Size of Stack " + myStack.size());
                    System.out.print("\n---------MAIN MENU--------\n" +
                            "1 – Push Element\n" +
                            "2 – Pop Element\n" +
                            "3 – Top Element\n" +
                            "4 – Size of Stack\n" +
                            "5 – Is Empty Stack\n" +
                            "6 – Print Stack Content\n" +
                            "7 – Exit Program\n" +
                            "Enter option number:  ");
                    userIn = input.nextInt();
                    break;
                //Checking for empty stack
                case 5:
                    if(!myStack.isEmpty()) {
                        System.out.println("The Stack is not Empty here is the Current List Content");
                        myStack.printStack();
                    }
                    if(myStack.isEmpty()){
                        System.out.println("List is currently empty");
                    }
                    System.out.print("\n---------MAIN MENU--------\n" +
                            "1 – Push Element\n" +
                            "2 – Pop Element\n" +
                            "3 – Top Element\n" +
                            "4 – Size of Stack\n" +
                            "5 – Is Empty Stack\n" +
                            "6 – Print Stack Content\n" +
                            "7 – Exit Program\n" +
                            "Enter option number:  ");
                    userIn = input.nextInt();
                    break;
                //Prints Current Stack Content
                case 6:
                    System.out.println("Current Stack Content");
                    myStack.printStack();
                    System.out.print("\n---------MAIN MENU--------\n" +
                            "1 – Push Element\n" +
                            "2 – Pop Element\n" +
                            "3 – Top Element\n" +
                            "4 – Size of Stack\n" +
                            "5 – Is Empty Stack\n" +
                            "6 – Print Stack Content\n" +
                            "7 – Exit Program\n" +
                            "Enter option number:  ");
                    userIn = input.nextInt();
                    break;
                case 7: break;
                //makes sure if number that is not an option repeats the menu
                default:
                    System.out.println("Number not in menu");
                    System.out.print("\n---------MAIN MENU--------\n" +
                            "1 – Push Element\n" +
                            "2 – Pop Element\n" +
                            "3 – Top Element\n" +
                            "4 – Size of Stack\n" +
                            "5 – Is Empty Stack\n" +
                            "6 – Print Stack Content\n" +
                            "7 – Exit Program\n" +
                            "Enter option number:  ");
                    userIn = input.nextInt();
                    break;
            }
        }

    }
