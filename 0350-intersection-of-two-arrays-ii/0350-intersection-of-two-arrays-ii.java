class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mapA=new HashMap<>();
        
        for(int ele:nums1){
            
            if(mapA.containsKey(ele)){
               int freq=mapA.get(ele);
               mapA.put(ele,freq+1);
            }
            
            else{
              mapA.put(ele,1);
            }
        }
        
        
        HashMap<Integer,Integer> mapB=new HashMap<>();
        
        for(int ele:nums2){
            
            if(mapB.containsKey(ele)){
               int freq=mapB.get(ele);
               mapB.put(ele,freq+1);
            }
            
            else{
              mapB.put(ele,1);
            }
        }
        
        ArrayList<Integer> list=new ArrayList<>();

        for(int ele:mapB.keySet()){
            
            if(!mapA.containsKey(ele)) continue;
            int freq=mapB.get(ele);
            int Afreq=mapA.get(ele);

            int min =Math.min(freq,Afreq);

            for(int i=0;i<min;i++){
                list.add(ele);
            } 
        }
        
        int[] res=new int[list.size()];

        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }

        return res;
    }
}