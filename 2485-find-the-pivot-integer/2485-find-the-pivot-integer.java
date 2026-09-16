class Solution {
    public int pivotInteger(int n) {
        int s=(n*(n +1))/2;
        int pre=0;
        for(int i=1;i<=n;i++){
            pre+=i;
            if(pre==s-pre+i){
                return i;
            }
        }
        return -1;
    }
}