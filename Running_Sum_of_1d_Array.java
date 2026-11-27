/*
* Copyright (C) 2026 Ajay Dhage
* SPDX-License-Identifier: MIT
* Problem Statement: Return the running sum of nums
* Time Complexity: O(n)
* Space Complexity: O(n)
* Auxiliary Space Complexity: O(1)
*/

class Running_Sum_of_1d_Array{
  public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            runningSum[i] = sum;
        }
        return runningSum;
    }
}
