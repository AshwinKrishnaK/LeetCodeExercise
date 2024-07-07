package Org.example.arrays;

import org.example.arrays.MergeSortedArray;
import org.junit.Assert;
import org.junit.Test;


public class MergeSortedArrayTest {

    @Test
    public void testMerge(){
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        MergeSortedArray.merge(nums1,m,nums2,n);
        int[] expectedArray = {1,2,2,3,5,6};
        Assert.assertArrayEquals(expectedArray,nums1);
    }

    @Test
    public void testEmptyNums2() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;

        MergeSortedArray.merge(nums1, m, nums2, n);

        int[] expected = {1};
        Assert.assertArrayEquals(expected, nums1);
    }

    @Test
    public void testMergeWithEmptyNums2() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {};
        int n = 0;
        int[] expected = {1, 2, 3, 0, 0, 0};
        MergeSortedArray.merge(nums1, m, nums2, n);
        Assert.assertArrayEquals(expected, nums1);
    }

    @Test
    public void testMergeWithEmptyNums1() {
        int[] nums1 = {0, 0, 0, 0, 0, 0};
        int m = 0;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        int[] expected = {2, 5, 6, 0, 0, 0};
        MergeSortedArray.merge(nums1, m, nums2, n);
        Assert.assertArrayEquals(expected, nums1);
    }

    @Test
    public void testMergeWithBothEmpty() {
        int[] nums1 = {0, 0, 0};
        int m = 0;
        int[] nums2 = {};
        int n = 0;
        int[] expected = {0, 0, 0};
        MergeSortedArray.merge(nums1, m, nums2, n);
        Assert.assertArrayEquals(expected, nums1);
    }

    @Test
    public void testMergeWithAllElementsSame() {
        int[] nums1 = {1, 1, 1, 0, 0, 0};
        int m = 3;
        int[] nums2 = {1, 1, 1};
        int n = 3;
        int[] expected = {1, 1, 1, 1, 1, 1};
        MergeSortedArray.merge(nums1, m, nums2, n);
        Assert.assertArrayEquals(expected, nums1);
    }
}
