class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int[] ans=new int[2];
        int x=target;
        int low_1=0;
        int high_1=n-1;
        int idx1=-1;
        
        while(low_1<=high_1){
            
            int mid=(low_1+high_1)/2;
            
            if(nums[mid]==x){
                idx1=mid;
                high_1=mid-1;
            }
            else if(nums[mid]<x){
                low_1=mid+1;
            }
            else{
                high_1=mid-1;
            }
        }
        
        if(idx1!=-1) ans[0]=idx1;
        else ans[0]=-1;
        
        
        int low_2=0;
        int high_2=n-1;
        int idx2=-1;
        
        while(low_2<=high_2){
            
            int mid=(low_2+high_2)/2;
            
            if(nums[mid]==x){
                idx2=mid;
                low_2=mid+1;
            }
            else if(nums[mid]<x){
                low_2=mid+1;
            }
            else{
                high_2=mid-1;
            }
        }
        
        if(idx2!=-1) ans[1]=idx2;
        else ans[1]=-1;
        
        
        return ans; 
    }
}