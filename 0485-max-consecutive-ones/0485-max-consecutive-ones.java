class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int res=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==1){
                c++;
                res=Math.max(res,c);
            }
            else{
                c=0;
            }
           
        }
        return res;
    }
}