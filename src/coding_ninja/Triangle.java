package coding_ninja;

/**
 * Triangle Pattern
 *
 *
 *
 */
public class Triangle {
    public static void nForest(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        nForest(3);
    }
}
