class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int pre=0;
        int res=0;
        for(int x:nums){
            pre+=x;
            int re=pre-goal;
            if(map.containsKey(re)){
                res+=map.get(re);
            }
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        return res;
    }
}