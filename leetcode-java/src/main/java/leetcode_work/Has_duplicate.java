import java.util.HashMap;

public class Has_duplicate {
  public static Boolean has_duplicate(int[] arr) {
    HashMap<Integer, Integer> num_count = new HashMap<Integer, Integer>();
    for(int i = 0; i < arr.length; i++) {
      if(num_count.containsKey(arr[i]) != false) return true;
      else num_count.put(arr[i], 1);
    }
    return true;
  }
}
