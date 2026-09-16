class Solution {
    public int largestAltitude(int[] gain) {
        int res=Integer.MIN_VALUE;
        int pre=0;
        for(int x:gain){
            res=Math.max(pre,res);
            pre+=x;  
        }
        res=Math.max(pre,res);
        return res;
    }
}