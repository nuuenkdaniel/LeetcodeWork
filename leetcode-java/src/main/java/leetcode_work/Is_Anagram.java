package leetcode_work;

import java.util.HashMap;

public class Is_Anagram {
  public static boolean isAnagram(String s, String t) {
    HashMap<Character, Integer> char_count_s = new HashMap<>();
    HashMap<Character, Integer> char_count_t = new HashMap<>();
    if(s.length() == t.length()) {
      // Count all characters in the first string
      for(int i = 0; i < s.length(); i++) {
        // Input string s
        char curr_char = s.charAt(i);
        int curr_char_count = char_count_s.get(curr_char);
        if(curr_char_count != null && curr_char_count != 0) char_count_s.put(curr_char, curr_char_count+1);
        else char_count_s.put(curr_char, 1);

        // Input string t
        curr_char = t.charAt(i);
        curr_char_count = char_count_t.get(curr_char);
        if(curr_char_count != null && curr_char_count != 0) char_count_t.put(curr_char, curr_char_count+1);
        else char_count_t.put(curr_char, 1);
      }
      return char_count_s.equals(char_count_t);
    }
    return false;
  }
}
