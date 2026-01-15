package leetcode_work;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Zigzag_Conversion_Test {
  @Test
  void test1() {
    String s = "PAYPALISHIRING";
    int numRows = 3;
    String result = Zigzag_Conversion.convert(s, numRows);
    assertEquals("PAHNAPLSIIGYIR", result);
  }

  @Test
  void test2() {
    String s = "PAYPALISHIRING";
    int numRows = 4;
    String result = Zigzag_Conversion.convert(s, numRows);
    assertEquals("PINALSIGYAHRPI", result);
  }

  @Test
  void test3() {
    String s = "A";
    int numRows = 1;
    String result = Zigzag_Conversion.convert(s, numRows);
    assertEquals("A", result);
  }


  @Test
  void test4() {
    String s = "A";
    int numRows = 2;
    String result = Zigzag_Conversion.convert(s, numRows);
    assertEquals("A", result);
  }

  @Test
  void test5() {
    String s = "AB";
    int numRows = 1;
    String result = Zigzag_Conversion.convert(s, numRows);
    assertEquals("AB", result);
  }
}
