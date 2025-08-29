package leetcode_work;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Is_Palindrome_Test {
  @Test
  void test_palindrome() {
    String s = "Was it a car or a cat I saw?";
    Boolean result = Is_Palindrome.is_palindrome(s);
    assertEquals(true, result);
  }

  @Test
  void test_non_palindrome() {
    String s = "tab a cat";
    Boolean result = Is_Palindrome.is_palindrome(s);
    assertEquals(false, result);
  }
}
