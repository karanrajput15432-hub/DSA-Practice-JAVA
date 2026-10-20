class Solution {
    public int countGoodSubstrings(String s) {
        
        int good_substr_count=0;

        for(int i=0;i<=s.length()-3;i++){

            if(s.charAt(i) != s.charAt(i+1) && s.charAt(i) != s.charAt(i+2) && s.charAt(i+1) != s.charAt(i+2) ){
                good_substr_count++;
            }

        }

        return good_substr_count;
    }
}