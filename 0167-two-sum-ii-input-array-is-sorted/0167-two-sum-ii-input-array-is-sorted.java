class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int i=0;
        int j=numbers.length-1;
        int idx_1=0;
        int idx_2=0;

        while(i<j){
            if(numbers[i]+numbers[j]==target){
                idx_1=i;
                idx_2=j; 
                break;
            }
            else if(numbers[i]+numbers[j]<target){
                i++;
            }
            else{
                j--;
            }
        }

        int[] res={idx_1+1,idx_2+1};
        return res;

    /*  This metehod can also be used to return :-
        return new int[]{idx_1, idx_2};
    */

    }
}