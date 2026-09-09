class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        // Track minimum price and maximum profit
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int price: prices){
            // Calculate the profit on this day
            int profit = price - minPrice;
            // Update the maximum profit if this profit is greater
            maxProfit = Math.max(maxProfit, profit);
            // Update minimum price seen so far
            minPrice = Math.min(minPrice, price);
        }
        return maxProfit;
    }
}
