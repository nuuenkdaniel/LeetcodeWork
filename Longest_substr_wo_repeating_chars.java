import java.util.HashMap;

public class Longest_substr_wo_repeating_chars {
  public int longest_substr(String s) {
    int max_substr_length = 0;
    int curr_substr_length = 0;
    HashMap<Character, Boolean> hashed_chars = new HashMap<Character, Boolean>();

    // Loop through each letter and check whether it repeats
    for(int i = 0; i < s.length(); i++) {
      // Check if character is already in the substry by comparing against the hashmap if it does compare new substr with prev max
      if(hashed_chars.get(s.charAt(i)) != null) {
        if(max_substr_length < curr_substr_length) max_substr_length = curr_substr_length;
        hashed_chars.clear();
        curr_substr_length = 0;
      }
      else {
        hashed_chars.put(s.charAt(i), true);
        curr_substr_length++;
      }
    }
    if(max_substr_length < curr_substr_length) max_substr_length = curr_substr_length;
    return max_substr_length;
  }
}
