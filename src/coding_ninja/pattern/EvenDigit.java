package coding_ninja.pattern;

public class EvenDigit {
    public static int evenDigit(int n){
        int x=n;
        int count = 0;
        while(x!=0){
            x = x%10;
            if(n%x==0){
                count ++;
            }
        }
        return count;
    }

    public static void main(String args[])
    {
        int n = 35;
        System.out.println("Number of digits in "+n+" is "+evenDigit(n));
    }
}
