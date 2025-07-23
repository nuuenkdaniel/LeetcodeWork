package leetcode_work;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    Add_Two_Numbers solver = new Add_Two_Numbers();

    // Helper to build a linked list from an array of ints
    private Add_Two_Numbers.ListNode buildList(int[] vals) {
        Add_Two_Numbers.ListNode dummy = solver.new ListNode(0);
        Add_Two_Numbers.ListNode curr = dummy;
        for (int v : vals) {
            curr.next = solver.new ListNode(v);
            curr = curr.next;
        }
        return dummy.next;
    }

    // Helper to convert linked list to array
    private int[] toArray(Add_Two_Numbers.ListNode node) {
        java.util.List<Integer> vals = new java.util.ArrayList<>();
        while (node != null) {
            vals.add(node.val);
            node = node.next;
        }
        return vals.stream().mapToInt(i -> i).toArray();
    }

    @Test
    void testSimpleAddition_noCarry() {
        var l1 = buildList(new int[]{2, 4, 3});
        var l2 = buildList(new int[]{5, 6, 4});
        var result = solver.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{7, 0, 8}, toArray(result),
            "342 + 465 should equal 807 -> [7,0,8]");
    }

    @Test
    void testAddition_withMultipleCarries() {
        var l1 = buildList(new int[]{9,9,9,9,9,9,9});
        var l2 = buildList(new int[]{9,9,9,9});
        var result = solver.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{8,9,9,9,0,0,0,1}, toArray(result),
            "9999999 + 9999 should handle cascading carries properly");
    }

    @Test
    void testDifferentLengths_withoutCarryAtEnd() {
        var l1 = buildList(new int[]{1,2});
        var l2 = buildList(new int[]{8});
        var result = solver.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{9,2}, toArray(result),
            "21 + 8 = 29 -> [9,2]");
    }

    @Test
    void testSingleZeroNodes() {
        var a = buildList(new int[]{0});
        var b = buildList(new int[]{0});
        var result = solver.addTwoNumbers(a, b);
        assertArrayEquals(new int[]{0}, toArray(result),
            "0 + 0 should return single zero node");
    }
}

