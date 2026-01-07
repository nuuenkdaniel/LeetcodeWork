package leetcode_work;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Longest_Common_Prefix_Test {
  @Test
  void test_fl() {
    String str[] = {"flower", "flow", "flight"};
    String result = Longest_Common_Prefix.longestCommonPrefix(str);
    assertEquals("fl", result);
  }

  @Test
  void test_empty() {
    String str[] = {"dog", "racecar", "car"};
    String result = Longest_Common_Prefix.longestCommonPrefix(str);
    assertEquals("", result);
  }
}
