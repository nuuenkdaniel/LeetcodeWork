package leetcode_work;

public class Is_Palindrome {
  public static boolean is_palindrome(String s) {
    String parsed_str = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
    int i = 0;
    int j = parsed_str.length()-1;
    while(i <= j) {
      if(parsed_str.charAt(i++) != parsed_str.charAt(j--)) return false;
    }
    return true;
  }
}
