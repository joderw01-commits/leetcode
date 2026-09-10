class Solution {
    public int totalFruit(int[] fruits) {
        int low = 0;
        int high = 0;
        int max = 1;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(high<fruits.length){
            int a = fruits[high];
            map.put(a,map.getOrDefault(a,0)+1);
            while(map.size()>2){
                int b = fruits[low];
                map.put(b,map.get(b)-1);
                if(map.get(b)==0){
                    map.remove(b);
                }
                low++;
            }
            
                max=Math.max(max,high-low+1);
            
            high++;
    
        }
        return max;
    }

}