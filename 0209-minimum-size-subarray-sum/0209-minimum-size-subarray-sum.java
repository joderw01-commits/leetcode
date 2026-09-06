class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low =0;
        int high=0;
        int res = Integer.MAX_VALUE;
        int sum = 0;
        while(high<nums.length){
           sum = sum+nums[high];
            while(sum>=target){
                int length = high-low+1;
                if(length<res){
                  res = length;
                }
                sum = sum - nums[low];
                low++;
            }    
                high++;
            
        }
        if(res==Integer.MAX_VALUE){
            res=0;
        }
        return res;
    }
}