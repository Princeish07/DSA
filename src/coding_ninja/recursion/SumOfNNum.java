package coding_ninja.recursion;

public class SumOfNNum {

    public static long sumFirstN(long n) {

        // Recursive approach

        // if(n==0) return 0;

        // return n + sumFirstN(n-1);



        //using formula

        return (n*(n+1))/2;

    }

}
