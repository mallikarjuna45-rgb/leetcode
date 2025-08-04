class Solution {
    public int maxProfit(int[] prices) {
        int mintracker=Integer.MAX_VALUE;
        int maxpro=0;
        for(int price :prices){
            mintracker= Math.min(mintracker,price);
            maxpro = Math.max(price-mintracker,maxpro);
        }
    return maxpro;
    }
}