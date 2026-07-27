class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int s=0;
        int res=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
        }
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            if(map.containsKey(s)){
                res=Math.max(res,i-map.get(s));

            }
            else{
                map.put(s,i);
            }
        }
        return res;
    }
}