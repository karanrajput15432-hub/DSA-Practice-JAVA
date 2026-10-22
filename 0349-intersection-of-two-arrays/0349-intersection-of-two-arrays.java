class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> res=new HashSet<>();

        for(int ele:nums1){
            set.add(ele);
        }

        for(int ele:nums2){
            if(set.contains(ele)){
                res.add(ele);
            }
        }

        int[] res_arr=new int[res.size()];
        int i=0;

        for(int ele:res){
            res_arr[i]=ele;
            i++;
        }
        
        return res_arr;
    }
}