class Solution {
    public int maxProfit(int[] prices) {
        int pro=0;
        int min=prices[0];
        for(int x:prices){
            if(x<min){
                min=x;
            }
            else{
                pro=Math.max(pro,x-min);
            }
        }
        return pro;
    }
}