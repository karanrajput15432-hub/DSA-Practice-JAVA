class Solution {
    public int missingNumber(int[] nums) {

        HashSet<Integer> set=new HashSet<>();
        
        for(int ele:nums){
            set.add(ele);
        }
        
        int missing_ele=-1;

        for(int i=0;i<=nums.length;i++){
            
            if(set.contains(i)) continue;
            else{
                missing_ele=i;
                break;
            } 
            
        }

        return missing_ele;

    }
}