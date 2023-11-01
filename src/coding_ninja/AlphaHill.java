package coding_ninja;

public class AlphaHill {
    public static void nLetterTriangle(int n) {
       for(int i=0;i<=n;i++){

           for(int k=i;k<=n;k++){
               System.out.print("  ");
           }
           char valueChar = 'A';

           for(int j=0;j<2*i+1;j++){
               int mid = (2*i+1)/2;

               System.out.print(valueChar+" ");
               if(j <= mid)
               {valueChar++;}

               else{ valueChar--;}

           }
           System.out.println();
       }

    }

    public static void main(String[] args) {
        nLetterTriangle(1);
    }
}
