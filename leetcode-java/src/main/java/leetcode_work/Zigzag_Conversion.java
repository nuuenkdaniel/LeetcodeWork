package leetcode_work;

import java.lang.StringBuilder;

public class Zigzag_Conversion {
  public static String convert(String s, int numRows) {
    int n = s.length();
    // I should fix this T_T
    int numCols = (n/Math.max((numRows*2-2),1)+1)*(numRows);
    char[][] zigzag = new char[numRows][numCols];
    int i = 0;
    int j = 0;
    int k = 0;
    while(i < n) {
      // Downwards
      while(i < n && j < numRows) {
        zigzag[j][k] = s.charAt(i);
        i++;
        j++;
      }
      j -= Math.min(numRows, 2);
      k++;

      // Diagnol up
      while(i < n && j > 0) {
        zigzag[j][k] = s.charAt(i);
        i++;
        j--;
        k++;
      }
    }

    StringBuilder zigzagged = new StringBuilder();
    for(i = 0; i < numRows; i++) {
      for(j = 0; j < numCols; j++) {
        char atij = zigzag[i][j];
        if(atij != 0)
          zigzagged.append(zigzag[i][j]);
      }
    }
    
    return zigzagged.toString();
  }
}
