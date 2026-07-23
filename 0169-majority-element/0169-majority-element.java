class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length/2;
        Map<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
            if(map.get(x)>n){
                return x;
            }
        }
        return -1;
        
    }
}