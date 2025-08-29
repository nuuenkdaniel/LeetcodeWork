package leetcode_work;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class Group_Anagrams {
  public static List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, List<String>> grouped_anagrams = new HashMap<>();
    // Create a 26 size array to store counts of each letter for each string
    for(int i = 0; i < strs.length; i++) {
      int[] char_count = new int[26];
      for(int j = 0; j < strs[i].length(); j++) char_count[strs[i].charAt(j) - 'a']++;
      // Turn array to string representation and place string in hashmap with the key being the array and the value being an arraylist of matching strings
      String count_str = Arrays.toString(char_count);
      grouped_anagrams.putIfAbsent(count_str, new ArrayList<>());
      grouped_anagrams.get(count_str).add(strs[i]);
    }
    // Return an arraylist of all the arraylist in the hashmap
    return new ArrayList<>(grouped_anagrams.values());
  }
}
