public class Add_Two_Numbers {

  //While loop through both linked list and add the values together while carrying over when necessary
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int carryOver = (l1.val + l2.val)/10;
    ListNode l3 = new ListNode((l1.val + l2.val)%10);
    ListNode head = l3;
    while(l1.next != null && l2.next != null) {
      l1 = l1.next;
      l2 = l2.next;
      l3.next = new ListNode((l1.val + l2.val + carryOver)%10);
      carryOver = (l1.val + l2.val + carryOver)/10;
      l3 = l3.next;
    }
    //Once the end of one of the linked list append to the end of the new linked list and carrying over when necessary
    l3.next = l1.next == null? l2.next : l1.next;
    while(carryOver != 0) {
      if(l3.next == null && carryOver != 0) l3.next = new ListNode(0);
      l3 = l3.next;
      carryOver = (l3.val + 1)/10;
      l3.val = (l3.val + 1)%10;
    }
    return head;
  }
}
