package leetcode_work;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class Group_Anagram_Test {
  @Test
  void test_multi_element() {
    String[] strs = {"act","pots","tops","cat","stop","hat"};
    List<List<String>> result = Group_Anagrams.groupAnagrams(strs);
    assertEquals(3, result.size());
    assertTrue(result.stream().anyMatch(g -> g.containsAll(List.of("hat")) && g.size() == 1));
    assertTrue(result.stream().anyMatch(g -> g.containsAll(List.of("act","cat")) && g.size() == 2));
    assertTrue(result.stream().anyMatch(g -> g.containsAll(List.of("stop","pots","tops")) && g.size() == 3));
  }

  @Test
  void test_single_element() {
    String[] strs = {"x"};
    List<List<String>> result = Group_Anagrams.groupAnagrams(strs);
    assertEquals(1, result.size());
    assertTrue(result.stream().anyMatch(g -> g.containsAll(List.of("x")) && g.size() == 1));
  }

  @Test
  void test_empty() {
    String[] strs = {""};
    List<List<String>> result = Group_Anagrams.groupAnagrams(strs);
    assertEquals(1, result.size());
    assertTrue(result.stream().anyMatch(g -> g.containsAll(List.of("")) && g.size() == 1));
  }
}
