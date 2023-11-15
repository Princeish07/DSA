package coding_ninja;
import java.util.Arrays;

public class Fibonnaci_Recurstion {

        public static int[] generateFibonacciNumbers(int n) {
            int[] result = new int[n];
            int[] memo = new int[n];
            Arrays.fill(memo, -1); // Initialize memoization array with -1

            for (int i = 0; i < n; i++) {
                result[i] = fibonacci(i, memo);
            }
            return result;
        }

        private static int fibonacci(int n, int[] memo) {
            if (n <= 1) {
                return n;
            }

            if (memo[n] != -1) {
                return memo[n];
            }

            memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
            return memo[n];
        }

}
