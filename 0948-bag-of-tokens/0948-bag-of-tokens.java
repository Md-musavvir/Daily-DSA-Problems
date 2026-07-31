class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int res=0;
        int max=0;
        int p=power;
        int l=0;
        int r=tokens.length-1;
        Arrays.sort(tokens);
        while(l<=r){
            if(p>=tokens[l]){
                p-=tokens[l];
                res++;
                l++;
                max=Math.max(res,max);
            }
            else if(res>=1){
                p+=tokens[r];
                res--;
                r--;
            }
            else{
                break;
            }
        }
        return max;
    }
}