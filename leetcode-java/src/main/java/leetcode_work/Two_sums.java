import java.util.HashMap;

public class Two_sums {

  public int[] twoSum(int[] num, int target) {

    //Create HashMap
    HashMap<Integer, Integer> hashedArr = new HashMap<Integer, Integer>();
    for(int i = 0; i < num.length; i++) hashedArr.put(num[i], i);
    
    //Find the second sum
    int secondSum;
    for(int j = 0; j < num.length; j++) {
      secondSum = target - num[j];
      if(hashedArr.containsKey(secondSum) && hashedArr.get(secondSum) != j) return new int[] {j, hashedArr.get(secondSum)};
    }
    
    throw new IllegalArgumentException("Solution not found");
  }
}

