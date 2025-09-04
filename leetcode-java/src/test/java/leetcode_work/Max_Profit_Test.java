package leetcode_work;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Max_Profit_Test {
  @Test
  void normal_test() {
    int[] prices = { 7, 1, 5, 4, 6, 4 };
    int result = Max_Profit.maxProfit(prices);
    assertEquals(5, result);
  }

  @Test
  void no_profit_test() {
    int[] prices = { 7, 6, 4, 3, 1 };
    int result = Max_Profit.maxProfit(prices);
    assertEquals(0, result);
  }
}
