package leetcode_work;

import java.lang.StringBuilder;

public class Longest_Palindromic_Substring {
  public static String longestPalindrome(String s) {
    // Create modded string
    StringBuilder mod_s = new StringBuilder();
    for(char c : s.toCharArray()) {
      mod_s.append("#").append(c);
    }
    mod_s.append("#");
    String modded_s = mod_s.toString();
    
    int n = modded_s.length();
    int[] p = new int[n];
    int c = 0, r = 0;
    int largest_p = 0;
    for(int i = 0; i < n; i++) {
      // Check if mirror possible
      if(i < r) {
        p[i] = Math.min(p[c*2-i], r-i);
      }
      // Now check past mirror
      int j = 1;
      while(i-p[i]-j >= 0 && i+p[i]+j < n) {
        if(modded_s.charAt(i-p[i]-j) != modded_s.charAt(i+p[i]+j)) break;
        j++;
      }
      p[i] = p[i]+j-1;

      //update largest_p
      if(p[largest_p] < p[i]) largest_p = i;

      // Move boundary and new center when exceeded by current palindrome
      if(i+p[i] > r) {
        c = i;
        r = i+p[i];
      }
    }

    // Find biggest 
    String modded_s_largest_p = modded_s.substring(largest_p-p[largest_p], largest_p+p[largest_p]+1);
    return modded_s_largest_p.replace("#", "");
  }
}
