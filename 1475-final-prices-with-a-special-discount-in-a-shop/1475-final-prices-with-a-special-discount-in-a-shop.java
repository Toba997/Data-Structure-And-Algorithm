class Solution {
    public int[] finalPrices(int[] prices) {
        
        for(int i = 0;i<prices.length;i++){
            int current_price = prices[i];
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]>=prices[j]){
                    current_price=current_price-prices[j];
                    break;
                }
            }
            prices[i] = current_price;
        }
        return prices;
    }
}