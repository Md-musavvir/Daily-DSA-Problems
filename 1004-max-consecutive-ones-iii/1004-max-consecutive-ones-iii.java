class Solution {
    public int longestOnes(int[] nums, int k) {
        int z=k;
        int res=0;
        int l=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                z--;
            }
            while(z<0){
                if(nums[l]==0){
                    z++;
                }
                l++;
            }
            res=Math.max(res,r-l+1);
        }
        return res;
    }
}