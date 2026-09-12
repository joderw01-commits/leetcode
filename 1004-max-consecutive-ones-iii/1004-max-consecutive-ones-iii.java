class Solution {

    public int longestOnes(int[] nums, int k) {

        int high = 0;
        int low = 0;
        int maxfreq = 0;
        int max = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        while(high < nums.length){

            int a = nums[high];

            map.put(a, map.getOrDefault(a, 0) + 1);

            maxfreq = Math.max(maxfreq, map.get(a));

            while(map.getOrDefault(0,0)> k){

                int b = nums[low];

                map.put(b, map.get(b) - 1);

                low++;
            }

            max = Math.max(max, high - low + 1);

            high++;
        }

        return max;
    }
}