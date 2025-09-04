package leetcode_work;

public class Max_Profit {
  public static int maxProfit(int[] prices) {
    int i = 1;
    int smallest_price_ptr = 0;
    int max_profit = 0;

    while(i < prices.length) {
      if(prices[smallest_price_ptr] < prices[i]) {
        int curr_profit = prices[i] - prices[smallest_price_ptr];
        if(curr_profit > max_profit) max_profit = curr_profit;
      }
      else smallest_price_ptr = i;
      i++;
    }
    return max_profit;
  }
}
