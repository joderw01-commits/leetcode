class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int index;
        for(int i=0;i<nums.length;i++){
            if(nums[left]*nums[left]>nums[right]*nums[right]){
                index = nums[left]*nums[left];
                left++;
            }
            else {
                index = nums[right]*nums[right];
                right--;
            }
             ans[nums.length-1-i]=index;
        }
        return  ans;
    }
}