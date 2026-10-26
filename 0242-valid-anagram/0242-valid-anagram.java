class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) return false;
        
        HashMap<Character,Integer> map_s=new HashMap<>();

        for(int i=0;i<s.length();i++){

            if(map_s.containsKey(s.charAt(i))){
                int freq=map_s.get(s.charAt(i));
                map_s.put(s.charAt(i),freq+1);
            }

            else map_s.put(s.charAt(i),1);
        }


        HashMap<Character,Integer> map_t=new HashMap<>();

        for(int i=0;i<t.length();i++){

            if(map_t.containsKey(t.charAt(i))){
                int freq=map_t.get(t.charAt(i));
                map_t.put(t.charAt(i),freq+1);
            }

            else map_t.put(t.charAt(i),1);
        }


        for(int i=0;i<t.length();i++){

            if(!map_s.containsKey(t.charAt(i))) return false;

            int freq_t=map_t.get(t.charAt(i));
            int freq_s=map_s.get(t.charAt(i));

            if(freq_t!=freq_s) return false;
        }

        return true;
    }
}