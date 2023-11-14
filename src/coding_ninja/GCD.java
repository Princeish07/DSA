package coding_ninja;

public class GCD {
    public static int calcGCD(int n, int m){
        if (m == 0) {
            return n;
        }
        return calcGCD(m, n % m);
    }
    public static void main(String[] args) {

        // Here, we have taken the value of N as 5.
        // We can also take input from the user.
        System.out.println(calcGCD(6,4));

    }
}
