import pytest
from src.easy.removeDuplicates import Solution

@pytest.fixture
def solution():
    return Solution()

@pytest.mark.parametrize(
    "nums, expected_k, expected_nums",
    [
        ([1, 1, 2], 2, [1, 2]),
        ([0, 0, 1, 1, 1, 2, 2, 3, 3, 4], 5, [0, 1, 2, 3, 4]),
        
        ([], 0, []),
        ([1], 1, [1]),
        ([1, 1, 1, 1], 1, [1]),
        ([1, 2, 3, 4], 4, [1, 2, 3, 4]),
        ([-5, -5, -1, 0, 0, 2], 4, [-5, -1, 0, 2])
    ]
)
def test_removeDuplicates(solution, nums, expected_k, expected_nums):
    k = solution.removeDuplicates(nums)
    assert k == expected_k
    assert nums[:k] == expected_nums
