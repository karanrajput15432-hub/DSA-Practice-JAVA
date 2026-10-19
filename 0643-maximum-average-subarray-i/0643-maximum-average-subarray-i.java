class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int count=0;

        for(int i=0;i<k;i++){
            count+=nums[i];
        }

        double max=count;

        for(int i=1;i<=nums.length-k;i++){
            count=count-nums[i-1]+nums[i+k-1];
            if(count>max){
                max=count;
            }
        }
        
        double max_avg=max/k;

        return max_avg;
        
    }
}