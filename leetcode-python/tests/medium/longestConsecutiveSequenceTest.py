import pytest
from src.medium.longestConsecutiveSequence import Solution

@pytest.fixture
def solution():
    return Solution()

@pytest.mark.parametrize(
        "nums, expected_con",
        [
([2,20,4,10,3,4,5], 4),
([0,3,2,5,4,6,1,1], 7)
            ]
        )
def test_longestConsecutiveSequence(solution, nums, expected_con):
    con = solution.longestConsecutive(nums)
    assert con == expected_con

