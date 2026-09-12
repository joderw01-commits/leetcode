class Solution {
    public int characterReplacement(String s, int k) {
        int high=0;
        int low=0;
        int maxfreq = 0;
        int max=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(high<s.length()){
            char ch1 = s.charAt(high);
            map.put(ch1,map.getOrDefault(ch1,0)+1);
            maxfreq=Math.max(maxfreq,map.get(ch1));
            while((high-low+1)-maxfreq>k){
                char ch2 = s.charAt(low);
                map.put(ch2,map.get(ch2)-1);
                low++;
            }
            max = Math.max(max,high-low+1);
            high++;
        }
        return max;
    }
}