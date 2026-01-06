package leetcode_work;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Is_Roman_To_Int_Test {
  @Test
  void testIII() {
    String s = "III";
    int result = Roman_To_Int.romanToInt(s);
    assertEquals(3, result);
  }
  
  @Test
  void testIV() {
    String s = "IV";
    int result = Roman_To_Int.romanToInt(s);
    assertEquals(4, result);
  }

  @Test
  void testLVIII() {
    String s = "LVIII";
    int result = Roman_To_Int.romanToInt(s);
    assertEquals(58, result);
  }

  @Test
  void testMCMXCIV() {
    String s = "MCMXCIV";
    int result = Roman_To_Int.romanToInt(s);
    assertEquals(1994, result);
  }

  @Test
  void testMCMXCVI() {
    String s = "MCMXCVI";
    int result = Roman_To_Int.romanToInt(s);
    assertEquals(1996, result);
  }
}
