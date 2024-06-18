public class Add_Two_Numbers {
  
  //While loop through both linked list and add the values together while carrying over when necessary
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int carryOver = (l1.val + l2.val)/10;
    ListNode l3 = new ListNode((l1.val + l2.val)%10);
    while(l1.next != null && l2.next != null) {
      l1 = l1.next;
      l2 = l2.next;
      carryOver = (l1.val + l2.val)/10;
      l3.next = new ListNode((l1.val + l2.val)%10);
      l3 = l3.next;
    }
    //Once the end of one of the linked list append to the end of the new linked list and carrying over when necessary
    ListNode trailingL = l1.next == null? l2 : l1;
  
  }

}
