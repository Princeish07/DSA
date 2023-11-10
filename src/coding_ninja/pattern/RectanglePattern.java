package coding_ninja.pattern;

import leet_code.MinCostClimbing;

/**
 * Rectangle Pattern
 * ***
 * ***
 * ***
 */
public class RectanglePattern {
    public static void nForest(int n) {
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               System.out.print("*");
           }
           System.out.println();

       }
    }

    public static void main(String[] args) {
        nForest(3);
    }

}
