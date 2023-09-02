import java.util.*;
interface BagInterface{
    int getCurrentSize(ArrayList<String> myBag);
}
class LinkedBag implements BagInterface{
    public int getCurrentSize(ArrayList<String> myBag){
        int totalEntries = myBag.size();
        return totalEntries;
    }
}
public class LinkedBagClass{
    public static void main(String[] args){
        ArrayList<String> myBag = new ArrayList<String>();
        myBag.add("30");
        myBag.add("40");
        myBag.add("50");
        myBag.add("10");
        myBag.add("60");
        myBag.add("20");
        LinkedBag obj = new LinkedBag();
        System.out.println("Total number of entries in the bag is " + obj.getCurrentSize(myBag));
    }
}