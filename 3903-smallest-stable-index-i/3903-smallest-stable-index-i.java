class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int res[]=new int[nums.length];
        int max=nums[0];
        int min=nums[nums.length-1];
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            res[i]=max;
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<min){
                min=nums[i];
            }
            res[i]-=min;
        }
        for(int i=0;i<res.length;i++){
            if(res[i]<=k){
                ans=Math.min(ans,i);
            }
        }
        if(ans!=Integer.MAX_VALUE){
            return ans;
        }
        return -1;
    }
}