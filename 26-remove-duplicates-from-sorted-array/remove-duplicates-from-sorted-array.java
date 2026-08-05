class Solution {
    public int removeDuplicates(int[] nums) {
        int low = 0;
        int high = 1 ;
        int unique = 1;
        while(high<nums.length){
            if(nums[high]==nums[high-1]){
                high++;
                continue;
            }
            
                nums[low+1]=nums[high];
                high++;
                unique++ ;
                low++;
            
        }
        return unique ;
    }
}