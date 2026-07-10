class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<=2){
            return -1;
        }
        int max=Integer.MIN_VALUE;
        int min=nums[0];
        for(int x:nums){
            if(x>max){
                max=x;
            }
            if(x<min){
                min=x;
            }
        }
        for(int i:nums){
            if(i!=max && i!=min){
                return i;
            }
        }
        return -1;
        
    }
}