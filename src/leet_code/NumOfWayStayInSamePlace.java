package leet_code;

/**
 * 1269. Number of Ways to Stay in the Same Place After Some Steps
 *
 * You have a pointer at index 0 in an array of size arrLen. At each step, you can move 1 position to the left, 1 position to the right in the array, or stay in the same place (The pointer should not be placed outside the array at any time).
 *
 * Given two integers steps and arrLen, return the number of ways such that your pointer is still at index 0 after exactly steps steps. Since the answer may be too large, return it modulo 109 + 7.
 *
 *
 *
 * Example 1:
 *
 * Input: steps = 3, arrLen = 2
 * Output: 4
 * Explanation: There are 4 differents ways to stay at index 0 after 3 steps.
 * Right, Left, Stay
 * Stay, Right, Left
 * Right, Stay, Left
 * Stay, Stay, Stay
 */
public class NumOfWayStayInSamePlace {
    public int numWays(int steps, int arrLen) {
        int m = steps;
        int n = Math.min(steps / 2 + 1, arrLen);

        int[][] dp = new int[m + 1][n];
        dp[0][0] = 1;

        int mod = 1000000007;

        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j > 0) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - 1]) % mod;
                }
                if (j < n - 1) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j + 1]) % mod;
                }
            }
        }

        return dp[m][0];
    }

    public static void main(String[] args) {

       int step =3;
       int arrLength =2;
        System.out.println(new NumOfWayStayInSamePlace().numWays(step,arrLength));

    }
}
