import java.util.*;
public class StackDemo{
    public static void main(String args[]){
        Stack<Integer> myStack = new Stack<Integer>();
        myStack.push(10);
        myStack.push(15);
        myStack.push(30);
        myStack.push(20);
        myStack.push(5);
        System.out.println("Elements of the stack: " + myStack);
    }
}