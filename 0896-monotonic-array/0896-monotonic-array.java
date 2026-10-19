class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing=true;
        boolean decreasing=true;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
                continue;
            }
            else{
                increasing=false;
                break;
            }
        }

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                continue;
            }
            else{
                decreasing=false;
                break;
            }
        }

        return decreasing || increasing;
    }
}