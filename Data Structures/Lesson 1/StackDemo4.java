import java.util.Stack;
public class StackDemo{
    public static void main(String[] args){
        Stack <String> stkSource = new Stack<>();
        Stack <String> stkTmp = new Stack<>();
        Stack <String> stkFinal = new Stack<>();
        stkSource.push("This");
        stkSource.push("is");
        stkSource.push("the");
        stkSource.push("demonstration");
        stkSource.push("of");
        stkSource.push("stack");
        stkSource.push("operation.");
        System.out.println("Elements of the source stack: " + stkSource);
        while(!stkSource.isEmpty()){
            stkTmp.push(stkSource.pop());
        }
        System.out.println("Elements of the temporary stack: " + stkTmp);
        while(!stkTmp.isEmpty()){
            stkFinal.push(stkTmp.pop());
        }
        System.out.println("Elements of the final stack: " + stkFinal);
    }
}