class Solution {
    public int countPartitions(int[] nums) {
        int res[]=new int[nums.length];
        int pre=0;
       
        int ans=0;
        for(int i=0;i<nums.length;i++){
            pre+=nums[i];
            res[i]=pre;
        }
        int s=res[res.length-1];
        for(int i=0;i<res.length-1;i++){
            int l=Math.abs(res[i]-(s-res[i]));
            if(l%2==0){
                ans++;
            }
        }
        return ans;

        
    }
}