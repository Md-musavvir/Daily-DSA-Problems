class Solution {
    public int[] arrayRankTransform(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[arr.length];

        for (int x : arr) {
            list.add(x);
        }

        Collections.sort(list);

        int rank = 1;
        for (int num : list) {
            if (!map.containsKey(num)) {
                map.put(num, rank++);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            res[i] = map.get(arr[i]);
        }

        return res;
    }
}