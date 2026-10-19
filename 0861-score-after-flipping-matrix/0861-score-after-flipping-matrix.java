class Solution {

    void flip_row(int[][] arr){
    int n = arr.length;
    int m = arr[0].length;

    for(int i = 0; i < n; i++){
        if(arr[i][0] == 0){
            for(int j = 0; j < m; j++){
                arr[i][j] ^= 1;
            }
        }
    }

    }

    void flip_col(int[][] arr,int fix){
    int n = arr.length;
    int m = arr[0].length;

    for(int i = 0; i < n; i++){
        arr[i][fix] ^= 1;  
    }

    }

    public int matrixScore(int[][] arr) {

    int n = arr.length;
    int m = arr[0].length;
    flip_row(arr);
    
    for(int i=0;i<m;i++){

        int count=0;

        for(int j=0;j<n;j++){
            if(arr[j][i]==0){
               count++;
            }
        }

        if(count>(n-count)){
            flip_col(arr,i);
        }

    }

    
    int sum=0;
  
    for(int j=0;j<n;j++){
        int x=1;
        for(int i=m-1;i>=0;i--){
            sum=sum+arr[j][i]*x;
            x=x*2;
        }
    }

    return sum;
    
    }
}