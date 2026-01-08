public class assignmentArrays3 {
    
    public static int buySellStocks(int prices[]){

        int maxProfit = 0;
        int buyPrice = prices[0];

        for(int i = 0 ; i < prices.length; i++){
            if(buyPrice < prices[i]){
                int todayProfit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, todayProfit);
            }
            else{
                buyPrice = prices[i];
            }

        }
        return maxProfit;
      

    }


    public static void main(String[] args) {
        int prices[]  = {7,6,4, 3, 1};

        int profit =  buySellStocks(prices);
        System.out.println("profit is: " + profit);
    }
}
