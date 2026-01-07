package leetcode_work;

public class Longest_Common_Prefix {
  private static String longestCommonPrefixHelper(String[] str, int start, int end) {
    int arr_size = end-start;
    if(arr_size == 1) return str[start];
    else {
      int mid = (end-start)/2 + start;
      String p1 = longestCommonPrefixHelper(str, start, mid);
      String p2 = longestCommonPrefixHelper(str, mid, end);
      int min_str_len = Math.min(p1.length(), p2.length());
      for(int i = 0; i < min_str_len; i++) {
        if(p1.charAt(i) != p2.charAt(i)) return p1.substring(0, i);
      }
      return p1.substring(0, min_str_len);
    }
  }

  public static String longestCommonPrefix(String[] str) {
    return Longest_Common_Prefix.longestCommonPrefixHelper(str, 0, str.length);
  }
}
