package leetcode_work;

import java.util.Map;
import java.util.HashMap;

public class Roman_To_Int {
  public static int romanToInt(String s) {
    Map<Character, Integer> roman_numerals_map = Map.of(
    'I', 1,
    'V', 5,
    'X', 10,
    'L', 50,
    'C', 100,
    'D', 500,
    'M', 1000);
    HashMap<Character, Integer> roman_numerals = new HashMap<>(roman_numerals_map);

    int total = 0;
    int i = s.length()-1;
    while(i >= 0) {
      int numeral_eval = roman_numerals.get(s.charAt(i));
      int acc = 0;
      while(i >= 0) {
        int numeral_curr = roman_numerals.get(s.charAt(i));
        if(numeral_curr < numeral_eval) {
          acc -= numeral_curr;
          i--;
          break;
        }
        else if(numeral_curr > numeral_eval) {
          numeral_eval = numeral_curr;
          acc += numeral_curr;
        }
        else acc += numeral_curr;
        i--;
      }
      total += acc;
    }
    return total;
  }
}
