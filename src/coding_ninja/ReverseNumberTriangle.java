package coding_ninja;

public class ReverseNumberTriangle {

    public static void nForest(int n) {
        for(int i=n;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        nForest(3);
    }
}
