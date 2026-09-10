class Solution {
    public int minStartValue(int[] nums) {
        int pre = 0;
        int min = 0;

        for (int x : nums) {
            pre += x;
            min = Math.min(min, pre);
        }

        return 1 - min;
    }
}