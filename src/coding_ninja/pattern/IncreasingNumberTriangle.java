package coding_ninja.pattern;

/**
 * Date 30-Oct-2023
 */
public class IncreasingNumberTriangle {
    public static void nLetterTriangle(int n) {
        int value = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(value);
                value++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        nLetterTriangle(3);
    }

}
