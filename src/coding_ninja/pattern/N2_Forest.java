package coding_ninja.pattern;

/**
 * Triangle Pattern
 * *
 * **
 * ***
 */
public class N2_Forest {
    public static void nForest(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        nForest(3);
    }
}
