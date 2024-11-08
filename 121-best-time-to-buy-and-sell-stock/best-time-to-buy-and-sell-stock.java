class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int maxProfit=0;
        for(int i=1;i<prices.length;i++)
        {
            maxProfit=Math.max(maxProfit,prices[i]-buy);
            if(prices[i]<buy){
              buy=prices[i];
            }
        }
        return maxProfit;
        
    }
}