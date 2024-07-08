package org.example.arrays;

/**
 * Leetcode Merge Strings Alternately Problem
 * https://leetcode.com/problems/merge-strings-alternately/
 * Tags : Array, Two pointers
 * Time Complexity : O(n) - size of largest word
 * Space complexity : O(n)
 * */
public class MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()){
            if(i < word1.length()) {
                stringBuilder.append(word1.charAt(i));
            }
            if(i < word2.length()) {
                stringBuilder.append(word2.charAt(i));
            }
             i++;
            }
        return stringBuilder.toString();
        }
}
