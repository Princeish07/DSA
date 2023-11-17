package coding_ninja.recursion;

import java.util.List;
public class printNTimes
{    public static void printNtimes(int n){



    printRecursive(1,n);

}



    public static void printRecursive(int x,int n){



        if(x>n){

            return;

        }



        System.out.print("Coding Ninjas"+" ");

        x++;

        printRecursive(x,n);



    }
}