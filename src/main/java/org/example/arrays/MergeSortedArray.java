package org.example.arrays;

import java.util.Arrays;

/**
 * Leetcode Merge Sorted Array Problem
 * https://leetcode.com/problems/merge-sorted-array/description/
 * Tags : Array, Two pointers, Sorting
 * Time Complexity : O(M+N)
 * Space complexity : O(1)
 *  merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
 * */
public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
