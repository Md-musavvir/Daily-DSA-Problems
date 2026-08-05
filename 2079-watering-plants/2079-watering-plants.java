class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int r=-1;
        int res=0;
        int av=capacity;
        for(int i=0;i<plants.length;i++){
            if(plants[i]<=av){
                res++;
                av-=plants[i];
            }
            else{
                res+=i;
                av=capacity;
                res+=i+1;
                av-=plants[i];
            }
        }
        return res;
    }
}