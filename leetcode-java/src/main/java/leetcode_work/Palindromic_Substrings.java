package leetcode_work;

import java.lang.StringBuilder;

public class Palindromic_Substrings {
  public static int countSubstrings(String s) {
    StringBuilder mod_s = new StringBuilder();
    for(char c : s.toCharArray()) {
      mod_s.append("#").append(c);
    }
    mod_s.append("#");
    String modded_s = mod_s.toString();

    int count = 0;
    int n = modded_s.length();
    int[] p = new int[n];
    int c = 0, r = 0;
    for(int i = 0; i < n; i++) {
      if(i < r) {
        p[i] = Math.min(p[c*2 - i], r-i);
      }
      while(i-p[i]-1 >= 0 && i+p[i]+1 < n) {
        if(modded_s.charAt(i-p[i]-1) != modded_s.charAt(i+p[i]+1)) {
          break;
        }
        p[i]++;
      }

      if(p[i]+i > r) {
        c = i; r = p[i]+i;
      }
      count += p[i]/2;
      if(modded_s.charAt(i) != '#') count++;
    }
    return count;
  }
}
