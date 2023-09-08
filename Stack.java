// Name:    Reese Johnson
// Class:   CS 3305/Section W01
// Term:    Summer 2023
//Instructor:   Prof. Majeed
// Assignment   2

public class Stack<E> {

    public Node head;
    int size;
    //constructor method to create a list of object with head, head, and size.
    public Stack()
    {
        head = null;
        size = 0;
    }

    //check for empty stack
    public boolean isEmpty()
    {
        return head == null; //checks is empty by checking if the head is empty
    }

    //gets the size of the stack
    public int size(){
        return size; //just gives stacking size variable.
    }

    //push new node onto stack
    public void push(E P){
       Node newNode = new Node(P); //makes new node
       newNode.next = head; //sets the next node to the head
       head = newNode; //points the head to the new node
       size++; //increments size
    }

    //pops the top node of the stack or the head in this case
    public E pop(){
        //checks for empty stack
        if(head == null){
            System.out.println("The stack is empty");
            return null;
        } else {
            Node temp = head; //makes temp node the head
            head = head.next; //makes head node the next node
            temp.next = null; //removes temp
            size--; //increments size down
            return temp.data; //returns what temp was
        }
    }

    //gets the top element but keeps it in the stack
    public E  top(){
        //checks for empty stack
        if(head == null){
            System.out.println("The stack is empty");
            return null;
        } else {
            return head.data; //gets the top of the stack
        }
    }

    //prints the stack
    public void printStack()
    {
        if (head == null){
            System.out.println("The Stack is currently empty");
    }
        Node temp; //makes temp node
        temp = head; //makes the temp the head
        while (temp != null)
        {
            System.out.print(temp.data + "   ");
            temp = temp.next;
        }
    }

    //class to create nodes as objects
    private class Node
    {
        private E data;  //data field
        private Node next; //link field

        public Node(E item) //constructor method
        {
            data = item;
            next = null;
        }
    }
}
