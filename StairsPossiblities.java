package com.capg.coderpad.programs;

public class StairsPossiblities {

    static int num_ways_Stairs(int n) {
        if (n == 0 || n == 1)
            return 1;
        int[] nums = new int[n + 1];
        nums[0] = 1;
        nums[1] = 1;
        for (int i = 2; i <= n; i++)
            nums[i] = nums[i - 1] + nums[i - 2];
            return nums[n];
    }

    /* Driver program to test above function */
    public static void main(String args[]) {
        int n = 4;
       int numberofways=num_ways_Stairs(n);
       System.out.println(numberofways);
    }
}
