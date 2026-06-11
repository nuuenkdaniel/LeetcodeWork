import pytest
from typing import Optional, List
from src.easy.reverseList import Solution
from src.easy.reverseList import ListNode

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
            ([1, 2], [2, 1]),
            ([1, 2, 3, 4, 5], [5, 4, 3, 2, 1]),
            ([-1, -2, 0, 1], [1, 0, -2, -1]),
            ([5, 5, 5, 5], [5, 5, 5, 5]),
            ([1, 2, 3], [3, 2, 1]),
            ([1, 2, 3, 4], [4, 3, 2, 1]),
            ]
        )
def test_reverse_list(solution, head, expected_out):
    head_list = build_linked_list(head)
    result = solution.reverseList(head_list)

    assert to_values(result) == expected_out

    if result is not None:
        curr = result
        while curr.next:
            curr = curr.next
        assert curr.next is None, "Last node's .next should be None"
