class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low=0;
        int high=0;
        int max=0;
        HashMap<Character,Integer> map= new HashMap<>();
        while(high<s.length()){
            char ch1 = s.charAt(high);
            map.put(ch1,map.getOrDefault(ch1,0)+1);
             while (map.get(ch1) > 1) {

                char ch2 = s.charAt(low);

                map.put(ch2, map.get(ch2) - 1);

                if (map.get(ch2) == 0) {
                    map.remove(ch2);
                }

                low++;
            }
            max=Math.max(max,high-low+1);
            high++;
        }
        return max;
    }
}