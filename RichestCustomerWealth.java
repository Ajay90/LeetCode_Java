/*
* Copyright (C) 2026 Ajay Dhage
* SPDX-License-Identifier: MIT
* Problem Statement: Find the maximum wealth among the given customers across banks
* Time Complexity: O(n x m)
* Space Complexity: O(1)
*/

class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int[] account: accounts){
            int customerWealth = 0;
            for (int bankBalance: account){
                customerWealth += bankBalance;
            }
            maxWealth = Math.max(maxWealth, customerWealth);
        }
        return maxWealth;
    }
}
