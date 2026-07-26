class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int n[]=new int[nums.length+1];
        for(int x:nums){
            n[x]=x;
        }
        for(int i=1;i<n.length;i++){
            if(n[i]==0){
                res.add(i);
            }
        }
        return res; 
    }
}