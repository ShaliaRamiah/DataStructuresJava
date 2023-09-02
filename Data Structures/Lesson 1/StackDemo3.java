import java.util.Stack;
public class StackDemo{
    public static void main(String[] args){
        Stack<String> myStack = new Stack<>();
        myStack.push("This");
        myStack.push("is");
        myStack.push("the");
        myStack.push("demonstration");
        myStack.push("of");
        myStack.push("search");
        myStack.push("operation.");
        int position = myStack.search("demonstration");
        System.out.println("Element found at position " + position);
    }
}