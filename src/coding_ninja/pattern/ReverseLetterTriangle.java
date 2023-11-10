package coding_ninja.pattern;

/**
 * Date 30-Oct-2023
 */
public class ReverseLetterTriangle {

    public static void nLetterTriangle(int n) {

        for(int i=1;i<=n;i++){
            char valueChar = 'A';
            for(int j=i;j<=n;j++){
                System.out.print(valueChar);
                valueChar +=1;
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        nLetterTriangle(3);
    }
}
