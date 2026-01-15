package leetcode_work;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Palindromic_Substrings_Test {
  @Test
  void test1() {
    String s = "abc";
    int result = Palindromic_Substrings.countSubstrings(s);
    assertEquals(3, result);
  }

  @Test
  void test2() {
    String s = "aaa";
    int result = Palindromic_Substrings.countSubstrings(s);
    assertEquals(6, result);
  }
}
