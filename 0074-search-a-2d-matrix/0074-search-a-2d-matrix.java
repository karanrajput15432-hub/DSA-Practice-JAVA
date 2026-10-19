class Solution {
    public boolean searchMatrix(int[][] arr, int tar) {
        int rows=arr.length , cols=arr[0].length;
        int lo=0 , hi=(rows*cols)-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            
            int mid_row=mid/cols , mid_col=mid%cols;
            
            if(arr[mid_row][mid_col]==tar) return true;
            else if(arr[mid_row][mid_col]>tar) hi=mid-1;
            else lo=mid+1;
            
        }
        return false;
    }
}