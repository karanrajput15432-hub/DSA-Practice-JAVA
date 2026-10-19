class Solution {
    public int maximumCount(int[] nums) {

        int n=nums.length;

        int low_1=0;
        int high_1=n-1;
        int neg_lst_idx=-1;   
        while(low_1 <= high_1){

            int mid=(low_1+high_1)/2;
            
            if(nums[mid]<0){
                neg_lst_idx=mid;
                low_1=mid+1;
            }
            else{
                high_1=mid-1;
            }

        }
        int neg_count=neg_lst_idx+1;



        int low_2=0;
        int high_2=n-1;
        int pos_first_idx=n; 
        while(low_2 <= high_2){

            int mid=(low_2+high_2)/2;
            
            if(nums[mid]>0){
                pos_first_idx=mid;
                high_2=mid-1;
            }
            else{
                low_2=mid+1;
            }

        }
        int pos_count=n-pos_first_idx;


        int ans=Math.max(neg_count,pos_count);
        return ans;
    }
}