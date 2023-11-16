package coding_ninja.recursion;

public class oneToN {

    public static int[] printNos(int x) {

        // Write Your Code Here

        int[] ans = new int[x];

        callMe(ans,x);

        return ans;



    }

    public static void callMe(int[] ans, int n){

        if(n>1){

            callMe(ans,n-1);

        }

        ans[n-1] = n;

    }
    public static void main(String[] args) {
        System.out.println(printNos(3));
    }


}