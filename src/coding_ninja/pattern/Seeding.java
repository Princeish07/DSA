package coding_ninja.pattern;

public class Seeding {
    public static void nForest(int n) {
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        nForest(3);
    }
}
