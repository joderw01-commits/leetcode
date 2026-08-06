class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0]+nums[1]+nums[2];
        int diff = Math.abs(target - closest);
        for(int i=0;i<nums.length-2;i++){
        int left=i+1;
        int right = nums.length-1;
        while(left<right){
            int sum = nums[i]+nums[left]+nums[right];
            int currentdiff = Math.abs(target-sum);
            if(currentdiff<diff){
                diff = currentdiff;
                closest = sum;
            }
            if (sum==target){
                return sum;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        }
        return closest;
    }
}