/*
 Write a function to find the longest common prefix string amongst an array of strings.
 
 If there is no common prefix, return an empty string "".

 Input: strs = ["flower","flow","flight"]
 Output: "fl"
*/

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        Arrays.sort(strs);
        
        String first = strs[0];
        String last = strs[strs.length - 1];
        String commonPrefix = "";

        for(int i = 0; i < first.length(); i++) {
            if (first.charAt(i) == last.charAt(i)) {
                commonPrefix += first.charAt(i);
            } else {
                break;
            }
        }

        return commonPrefix;
    }
}