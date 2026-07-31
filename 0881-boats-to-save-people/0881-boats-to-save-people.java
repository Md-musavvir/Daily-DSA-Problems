class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int l=0;
        int b=0;
        int r=people.length-1;
        Arrays.sort(people);
        while(l<=r){
            if(people[l]+people[r]<=limit){
                b++;
                l++;
            }
            else if(people[r]<=limit){
                b++;
            }
            r--;
        }
        return b;
        
    }
}