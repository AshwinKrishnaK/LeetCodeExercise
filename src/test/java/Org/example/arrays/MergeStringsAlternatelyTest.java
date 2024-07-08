package Org.example.arrays;

import org.example.arrays.MergeStringsAlternately;
import org.junit.Assert;
import org.junit.Test;

public class MergeStringsAlternatelyTest {

    @Test
    public void testMergeAlternately_BothWordsEqualLength() {
        String word1 = "abc";
        String word2 = "xyz";
        String expected = "axbycz";
        String result = MergeStringsAlternately.mergeAlternately(word1, word2);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testMergeAlternately_Word1Longer() {
        String word1 = "abcd";
        String word2 = "xy";
        String expected = "axbycd";
        String result = MergeStringsAlternately.mergeAlternately(word1, word2);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testMergeAlternately_Word2Longer() {
        String word1 = "ab";
        String word2 = "wxyz";
        String expected = "awbxyz";
        String result = MergeStringsAlternately.mergeAlternately(word1, word2);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testMergeAlternately_EmptyWord1() {
        String word1 = "";
        String word2 = "xyz";
        String expected = "xyz";
        String result = MergeStringsAlternately.mergeAlternately(word1, word2);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testMergeAlternately_EmptyWord2() {
        String word1 = "abc";
        String word2 = "";
        String expected = "abc";
        String result = MergeStringsAlternately.mergeAlternately(word1, word2);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testMergeAlternately_BothWordsEmpty() {
        String word1 = "";
        String word2 = "";
        String expected = "";
        String result = MergeStringsAlternately.mergeAlternately(word1, word2);
        Assert.assertEquals(expected, result);
    }
}
