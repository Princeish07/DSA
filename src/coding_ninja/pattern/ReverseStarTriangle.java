package coding_ninja.pattern;

public class ReverseStarTriangle {
    public static void nForest(int n) {
        for(int i=n;i>0;i--){
            for(int j=n;j>i;j--){
                System.out.print("#");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        nForest(7);
    }
}
