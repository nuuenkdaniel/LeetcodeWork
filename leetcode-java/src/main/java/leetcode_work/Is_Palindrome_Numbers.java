package leetcode_work;

public class Is_Palindrome_Numbers {
  public static boolean is_palindrome_number(int x) {
    if(x < 0) return false;
    if(x < 10) return true;
    long i = 1;
    long reversed = 0;
    while(x/i != 0) {
      reversed *= 10;
      reversed += (long)x%(i*10)/i;
      i *= 10;
    }
    System.out.println(x);
    System.out.println(reversed);
    if(reversed == x) return true;
    return false;
  }
}
