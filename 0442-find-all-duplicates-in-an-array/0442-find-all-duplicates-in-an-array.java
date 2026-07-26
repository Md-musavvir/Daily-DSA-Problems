class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> res=new ArrayList<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
            if(map.get(x)==2){
                res.add(x);
            }
        }
        return res;
        
    }
}