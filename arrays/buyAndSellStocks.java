// Time complexity = O(n)
/*
Buy and Sell Stocks – Maximum Profit Problem

→ This problem finds the maximum profit that can be achieved by buying
  a stock on one day and selling it on a later day.
→ Only ONE transaction is allowed (one buy and one sell).

Approach:
→ Traverse the prices array only once.
→ Keep track of the minimum buying price seen so far.
→ For each day, check if selling on that day gives a higher profit.
→ Update the maximum profit whenever a better profit is found.

Logic Explanation:
→ buyPrice stores the lowest stock price till the current day.
→ If the current price is higher than buyPrice, calculate profit.
→ Update maxProfit with the maximum of current profit and previous profit.
→ If current price is lower than buyPrice, update buyPrice.

Pre-condition:
- At least one stock price should be present.

Time Complexity:
- O(n) since the array is traversed only once.

Space Complexity:
- O(1) as no extra space is used.

This implementation uses a greedy approach for optimal performance.
*/




public class buyAndSellStocks {

    public static int buySellStocks(int prices[]){

        int buyPrice = Integer.MAX_VALUE;  // to track minimum buying price
        int maxProfit = 0;    // to track max profit
        for(int i = 0; i < prices.length; i++){
            if(buyPrice < prices[i]){  //case 1 - when profit is possible
                int profit = prices[i] - buyPrice;  //today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else{  // update buying price
                buyPrice = prices[i];   // case 2 - when buying price is lower than current today's price- so instead of selling we will buy at lower price
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};

        System.out.println(buySellStocks(prices));
    }
}
