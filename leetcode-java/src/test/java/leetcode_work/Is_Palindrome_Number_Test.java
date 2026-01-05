package leetcode_work;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Is_Palindrome_Number_Test {
  @Test
  void test_palindrome() {
    int x = 121;
    Boolean result = Is_Palindrome_Numbers.is_palindrome_number(x);
    assertEquals(true, result);
  }

  @Test
  void test_palindrome2() {
    int x = 12021;
    Boolean result = Is_Palindrome_Numbers.is_palindrome_number(x);
    assertEquals(true, result);
  }

  @Test
  void test_palindrome3() {
    int x = 1410110141;
    Boolean result = Is_Palindrome_Numbers.is_palindrome_number(x);
    assertEquals(true, result);
  }

  @Test
  void test_palindrome4() {
    int x = 1222222221;
    Boolean result = Is_Palindrome_Numbers.is_palindrome_number(x);
    assertEquals(true, result);
  }

  @Test
  void test_non_palindrome() {
    int x = 10;
    Boolean result = Is_Palindrome_Numbers.is_palindrome_number(x);
    assertEquals(false, result);
  }
}
