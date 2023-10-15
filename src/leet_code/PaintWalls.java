package leet_code;

import java.sql.Array;

/**
 *Painting the Walls
 *
 *
 * You are given two 0-indexed integer arrays, cost and time, of size n representing the costs and the time taken to paint n different walls respectively. There are two painters available:
 *
 * A paid painter that paints the ith wall in time[i] units of time and takes cost[i] units of money.
 * A free painter that paints any wall in 1 unit of time at a cost of 0. But the free painter can only be used if the paid painter is already occupied.
 * Return the minimum amount of money required to paint the n walls.
 */
public class PaintWalls {
        public int paintWalls(int[] cost, int[] time) {
            int n=cost.length;
            return (int)paintWallsHelper(cost,time,0,0,new Long[n][501]);
        }

        private long paintWallsHelper(int[] cost, int[] time, int index, int total, Long[][] memo) {
            if(total >= cost.length)
                return 0;
            if(index >= cost.length)
                return Integer.MAX_VALUE;
            if(memo[index][total] != null)
                return memo[index][total];

            long with=cost[index] + paintWallsHelper(cost,time,index+1,total+time[index]+1,memo);
            long without=paintWallsHelper(cost,time,index+1,total,memo);
            return memo[index][total]=Math.min(with,without);
        }

    public static void main(String[] args) {

       int[] cost = new int[]{1,2,3,2};
        int[] time = new int[]{1,2,3,2};
    System.out.printf("Hello and welcome!");
        System.out.println(new PaintWalls().paintWalls(cost,time));

    }
}
