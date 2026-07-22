class Solution {
    public void sortColors(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int i=0;
        while(i<map.getOrDefault(0,0)){
            nums[i]=0;
            i++;
        }
    
        int c=map.getOrDefault(1,0);
        while(c>0){
            nums[i]=1;
            i++;
            c--;
        }
        while(i<nums.length){
            nums[i]=2;
            i++;
        }
        
    }
}