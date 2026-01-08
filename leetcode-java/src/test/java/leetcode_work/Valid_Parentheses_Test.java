package leetcode_work;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Valid_Parentheses_Test {
  @Test
  void test_isValid() {
    String s = "()";
    boolean result = Valid_Parentheses.isValid(s);
    assertEquals(true, result);
  }

  @Test
  void test_isValid2() {
    String s = "()[]{}";
    boolean result = Valid_Parentheses.isValid(s);
    assertEquals(true, result);
  }
  @Test
  void test_isValid3() {
    String s = "(]";
    boolean result = Valid_Parentheses.isValid(s);
    assertEquals(false, result);
  }
  @Test
  void test_isValid4() {
    String s = "([])";
    boolean result = Valid_Parentheses.isValid(s);
    assertEquals(true, result);
  }
  @Test
  void test_isValid5() {
    String s = "([)]";
    boolean result = Valid_Parentheses.isValid(s);
    assertEquals(false, result);
  }
}
