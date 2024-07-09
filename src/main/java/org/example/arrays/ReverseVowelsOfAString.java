package org.example.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Leetcode Reverse Vowels Of A String Problem
 * https://leetcode.com/problems/reverse-vowels-of-a-string
 * Tags : String, Two pointers
 * Time Complexity : O(n) - size of largest word
 * Space complexity : O(1)
 * */

public class ReverseVowelsOfAString {

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }

    public static String reverseVowels(String s) {
        int left = 0;
        int right = s.length() -1 ;
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u',
                                'A','E','I','O','U'));
        char[] word = s.toCharArray();
        while (left<right){
            if(vowels.contains(word[left]) && vowels.contains(word[right])){
                var temp = word[left];
                word[left] = word[right];
                word[right] = temp;
                right --;
                left ++;
            }
            else if(vowels.contains(word[left]))
                right--;
            else if(vowels.contains(word[right]))
                left ++;
            else{
                right--;
                left++;
            }
        }
        return new String(word);
    }
}
