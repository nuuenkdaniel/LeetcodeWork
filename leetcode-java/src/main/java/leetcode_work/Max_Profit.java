package leetcode_work;

public class Max_Profit {
  public static int maxProfit(int[] prices) {
    int largest_price_ptr = 1;
    int smallest_price = Integer.MAX_VALUE;
    for(int i = 1; i < prices.length; i++) {
      if(prices[i] > prices[largest_price_ptr]) largest_price_ptr = i;
      if(prices[i-1] < prices[largest_price_ptr] && prices[i-1] < smallest_price && i-1 < largest_price_ptr) smallest_price = prices[i-1]; 
    }
    return (smallest_price != Integer.MAX_VALUE)? prices[largest_price_ptr]-smallest_price : 0;
  }
}
