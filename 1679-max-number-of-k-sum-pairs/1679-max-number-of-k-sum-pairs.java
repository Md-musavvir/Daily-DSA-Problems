class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        int res=0;
        while(l<r){
            int s=nums[l]+nums[r];
            if(s==k){
                res++;
                l++;
                r--;
            }
            else if(s<k){
                l++;
            }
            else{
                r--;
            }
        }
        return res;
    }
}