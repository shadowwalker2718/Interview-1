public class Solution {
    // 中心拓展法:
    // O(1) space, O(n^2) time
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0)
            return null;
        String longest = "";
        for(int i = 0; i < s.length(); i++){
            String str = helper(s, i, i);
            if(str.length() > longest.length())
                longest = str;
            str = helper(s, i, i+1);
            if(str.length() > longest.length())
                longest = str;
        }
        return longest;
    }
    
    private String helper(String s, int start, int end){
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
        }
        return s.substring(start+1, end);
    }

    // DP:
    // O(n^2) space, O(n^2) time
    
}