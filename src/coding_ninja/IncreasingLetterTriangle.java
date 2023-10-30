package coding_ninja;

/**
 * Date 30-Oct-2023
 */
public class IncreasingLetterTriangle {
    public static void nLetterTriangle(int n) {

        for(int i=1;i<=n;i++){
            char valueChar = 'A';
            for(int j=1;j<=i;j++){
                System.out.print(valueChar);
                valueChar+=1;

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        nLetterTriangle(3);
    }

}

