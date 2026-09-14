class Solution {
    public int maxScore(String s) {
        int res[]=new int [s.length()];
        int z=0;
        int o=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                z++;
            }
            res[i]=z;
        }
        for(int i=s.length()-1;i>=0;i--){
            res[i]+=o;
            if(s.charAt(i)=='1'){
                o++;
            }
            
        }
        for(int i=0;i<res.length-1;i++){
            ans=Math.max(ans,res[i]);
        }
        return ans;
    }
}