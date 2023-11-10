package coding_ninja.pattern;

/**
 * Date :- 26-Oct-2023
 * Binary Number Triangle
 */
public class BinaryNumberTriangle {
    public static void nForest(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;

            }
            System.out.println();


        }
    }

    public static void main(String[] args) {
        nForest(5);
    }
}
