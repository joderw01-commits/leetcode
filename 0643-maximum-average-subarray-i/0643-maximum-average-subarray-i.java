class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int low=0;
        int high = k-1;
        int sum=0;
        for(int i=low;i<=high;i++){
            sum+=nums[i];
        }
        double avg = (double)sum/k;
        double result=avg;
        while(high<nums.length-1){
             low++;
            high++;
            sum=sum-nums[low-1]+nums[high];
            avg=(double)sum/k;
            if(result<avg){
                result=avg;
            }
           
    

        }
        return result;
    }
}