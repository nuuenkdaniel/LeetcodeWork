package leetcode_work;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Longest_Palindromic_Substring_Test {
  @Test
  void test1() {
    String s = "babad";
    String result = Longest_Palindromic_Substring.longestPalindrome(s);
    assertEquals("bab", result);
  }

  @Test
  void test2() {
    String s = "cbbd";
    String result = Longest_Palindromic_Substring.longestPalindrome(s);
    assertEquals("bb", result);
  }

  @Test
  void test3() {
    String s = "ccc";
    String result = Longest_Palindromic_Substring.longestPalindrome(s);
    assertEquals("ccc", result);
  }
}
