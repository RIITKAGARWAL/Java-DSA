public class StockBuyAndSell {
        public int maxProfit(int[] prices) {
            int maxProfit = 0;
            for(int i =0;i<prices.length-1;i++){
                for(int j=i+1; j<prices.length; j++){
                    if(maxProfit<= (prices[j] - prices[i])){
                        maxProfit = prices[j] - prices[i];
                    }
                }
            }
            return maxProfit;
        }

        public int maxProfitOn(int[] prices) {
            int leastBuyValue= Integer.MAX_VALUE;
            int maxProfit = 0;
    
            for(int i=0; i<prices.length; i++){
                if(leastBuyValue >prices[i]){
                    leastBuyValue = prices[i];
                }
                else if(maxProfit< (prices[i]-leastBuyValue)){
                    maxProfit = prices[i] - leastBuyValue;
                }
            }
            return maxProfit;
        }
    }    


