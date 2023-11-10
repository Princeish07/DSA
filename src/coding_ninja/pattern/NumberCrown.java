package coding_ninja.pattern;

/**
 * Date:- 27-10-2023
 * NumberCrown
 */
public class NumberCrown {
    public static void solution(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print("* ");
            }
            for(int s=i;s>=1;s--){
                System.out.print(s+" ");
            }
            System.out.println();


        }

    }

    public static void main(String[] args) {
        solution(3);
    }
}
