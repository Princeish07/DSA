package coding_ninja.math;

public class Palindrom {
        public static boolean palindromeNumber(int n){
            int Y = 0;
            int X = n;
            while (X > 0) {
                int digit = X % 10;
                Y = Y * 10 + digit;
                X = X / 10;
            }
            return n==Y;
        }
        public static void main(String[] args) {

            int X = 121;
            palindromeNumber(X);
        }
    }

