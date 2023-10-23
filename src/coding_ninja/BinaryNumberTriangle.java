package coding_ninja;

public class BinaryNumberTriangle {
    public static void nForest(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                //if(j%2==0) {
                   // System.out.print("1");
             //   }else{
                    System.out.print(i);
             //   }

            }
            System.out.println();



        }
    }

    public static void main(String[] args) {
        nForest(5);
    }
}
