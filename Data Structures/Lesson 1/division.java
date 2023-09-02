public class division{
    public static void main(String []args){
        int n = 10, d = 20;
        try{
            if(d > n)
                throw new Exception();
            else
                System.out.println("Numerator/Denominator = " + (n / d));
        } 
        catch(Exception e){
            System.out.println("Exception: Denominator is greater than numerator");
        }
    }
}