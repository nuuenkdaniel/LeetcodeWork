import java.util.HashMap;

public class Longest_substr_wo_repeating_chars {
  public static int longest_substr(String s) {
    int max_substr_length = 0;
    HashMap<Character, Integer> hashed_chars = new HashMap<Character, Integer>();

    int left, right;
    left = right = 0;
    for(; right < s.length(); right++) {
      char c = s.charAt(right);
      // Put character and starting index into table if it doesn't exist or is outdated
      if(!hashed_chars.containsKey(c) || hashed_chars.get(c) < left)
        hashed_chars.put(c, right);
      else {
        // Set new max substr len and update the last known index of character as well as the left index to the repeating character
        max_substr_length = Math.max(max_substr_length, right-left);
        left = hashed_chars.get(c)+1;
        hashed_chars.put(c, right);
      }
      System.out.println(left);
    }
    return Math.max(max_substr_length, right-left);
  }

  public static void main(String[] args) {
    String s = "abba";
    System.out.println(longest_substr(s));
  }
}
