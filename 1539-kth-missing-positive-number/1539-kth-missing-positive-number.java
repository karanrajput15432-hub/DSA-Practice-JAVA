class Solution {
    public int findKthPositive(int[] arr, int k) {
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            
            int correct_no=mid+1;
            int missing_no=arr[mid]-correct_no;
            
            if(missing_no>=k) hi=mid-1;
            else lo=mid+1;
        }
        return lo+k;
    }
}