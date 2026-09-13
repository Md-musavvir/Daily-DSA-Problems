class Solution {
    public int[] leftRightDifference(int[] nums) {
        int res[]=new int [nums.length];
        int pre=0;
        int pos=0;
        for(int i=0;i<nums.length;i++){
            res[i]=pre;
            pre+=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            res[i]=Math.abs(pos-res[i]);
            pos+=nums[i];
        }
        return res; 
    }
}