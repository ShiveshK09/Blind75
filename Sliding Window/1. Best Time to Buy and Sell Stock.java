//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class Solution {
    public int maxProfit(int[] prices) {
        int left=0,profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[left]){
                profit=Math.max(profit,prices[i]-prices[left]);
            }
            else left=i;
        }
        return profit;
    }
}
/*
Lowest Buy → Current Sell → Max Profit
a. If today's price > buying price
       → Calculate profit
       → Update maximum profit
b. Else
       → Today's price is cheaper
       → Move buying day to today
c. Continue until the end

*/
