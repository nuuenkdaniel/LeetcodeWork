package leetcode_work;

class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Merge_Two_Sorted_Lists {
  private static ListNode mergeNodes(ListNode node1, ListNode node2) {
    if(node1 == null) return node2;
    if(node2 == null) return node1;
    if(node1.val <= node2.val) { 
      node1.next = mergeNodes(node1.next, node2);
      return node1;
    }
    else { 
      node2.next = mergeNodes(node1, node2.next);
      return node2;
    }
  }
  
  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    return mergeNodes(list1, list2);
  }
}
