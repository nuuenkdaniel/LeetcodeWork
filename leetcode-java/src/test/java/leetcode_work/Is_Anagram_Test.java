package leetcode_work;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Is_Anagram_Test {
  @Test
  void test_Anagram() {
    String s1 = "carrace";
    String s2 = "racecar";
    Boolean result = Is_Anagram.isAnagram(s1, s2);
    assertEquals(true, result);
  }

  @Test
  void test_different_length() {
    String s1 = "poop";
    String s2 = "poopy";
    Boolean result = Is_Anagram.isAnagram(s1, s2);
    assertEquals(false, result);
  }

  @Test
  void test_NonAnagram() {
    String s1 = "JohnWick";
    String s2 = "Jhimothy";
    Boolean result = Is_Anagram.isAnagram(s1, s2);
    assertEquals(false, result);
  }
}
