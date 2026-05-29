import pytest
from src.medium.minRotSortedArr import Solution

@pytest.fixture
def solution():
    return Solution()

@pytest.mark.parametrize(
        "nums, expected_min",
        [
            ([3,4,5,1,2], 1),
            ([4,5,6,7,0,1,2], 0),
            ([4,5,6,7], 4),
            ([2,1], 1)
            ]
        )
def test_minRotSortedArr(solution, nums, expected_min):
    min = solution.findMin(nums)
    assert min == expected_min

