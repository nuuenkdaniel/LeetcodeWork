package leetcode_work;

import java.util.Stack;

public class Valid_Parentheses {
  public static boolean isValid(String s) {
    Stack<Character> pStack = new Stack<Character>();
    for(int i = 0; i < s.length(); i++) {
      char curr_bracket = s.charAt(i);
      if(curr_bracket == '(' ||
      curr_bracket == '[' ||
      curr_bracket == '{') pStack.push(curr_bracket);

      else {
        if(pStack.isEmpty()) {
          return false;
        }
        switch(pStack.pop()) {
          case '(':
            if(curr_bracket != ')') return false;
            break;
          case '[':
            if(curr_bracket != ']') return false;
            break;
          case '{':
            if(curr_bracket != '}') return false;
            break;
        }
      }
    }
    return (pStack.isEmpty())? true : false;
  }
}
