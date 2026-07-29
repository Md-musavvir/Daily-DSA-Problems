class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int p=power;
        int res=0;
        int l=0;
        int r=tokens.length-1;
        int max=0;
        while(l<=r){
            if(tokens[l]<=p){
                p-=tokens[l];
                l++;
                res++;
                max=Math.max(res,max);


            }
            else if(res>=1){
                p+=tokens[r];
                r--;
                res--;
            }
            else{
                break;
            }
        }
        return max;
    }
}