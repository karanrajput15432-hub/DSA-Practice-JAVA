class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse_arr(nums,0,nums.length-1);
        reverse_arr(nums,0,k-1);
        reverse_arr(nums,k,nums.length-1);
        
    }
    static void reverse_arr(int[] nums,int start_idx,int last_idx){
         int i=start_idx;
         int j=last_idx;

         while(i<j){
             int temp=nums[i];
             nums[i]=nums[j];
             nums[j]=temp;
             i++;
             j--;
         }

    }
}