class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int res=0;
        int sum=0;
        for(int x:nums){
            sum+=x;
            int mod=sum%k;
            if(mod<0){
                mod+=k;
            }
            if(map.containsKey(mod)){
                res+=map.get(mod);
            }
            map.put(mod,map.getOrDefault(mod,0)+1);
        }
        return res;
        
    }
}