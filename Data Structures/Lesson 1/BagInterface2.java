import java.util.*;
interface BagInterface{
    int searchEntry(ArrayList<String> myBag, String searchValue);
}
class LinkedBag implements BagInterface{
    public int searchEntry(ArrayList<String> myBag, String searchValue){
        int index = 0;
        for(int i = 0; i < myBag.size(); i++){
            if(myBag.get(i) == searchValue){
                index = i + 1;
                break;
            }
        }
        return index;
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
        int index = obj.searchEntry(myBag,"50");
        if(index == 0)
            System.out.println("Search value not found!!");
        else
            System.out.println("Search value found at position " + index);
    }
}