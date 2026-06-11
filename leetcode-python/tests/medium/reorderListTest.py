import pytest
from typing import Optional, List
from src.medium.reorderList  import Solution
from src.medium.reorderList import ListNode

def build_linked_list(values: List[int]) -> Optional[ListNode]:
    """Converts a Python list to a linked list head."""
    if not values:
        return None
    head = ListNode(values[0])
    curr = head
    for v in values[1:]:
        curr.next = ListNode(v)
        curr = curr.next
    return head

def to_values(head: Optional[ListNode]) -> List[int]:
    """Converts a linked list head to a Python list of values."""
    res = []
    curr = head
    while curr:
        res.append(curr.val)
        curr = curr.next
    return res

@pytest.fixture
def solution():
    return Solution()

@pytest.mark.parametrize(
        "head, expected_out",
        [
            ([], []),
            ([1], [1]),
            ([2,4,6,8], [2,8,4,6]),
            ([2,4,6,8,10], [2,10,4,8,6])
            ]
        )
def test_reorder_list(solution, head, expected_out):
    head_list = build_linked_list(head)
    solution.reorderList(head_list)

    assert to_values(head_list) == expected_out

    if head_list is not None:
        curr = head_list
        while curr.next:
            curr = curr.next
        assert curr.next is None, "Last node's .next should be None"
