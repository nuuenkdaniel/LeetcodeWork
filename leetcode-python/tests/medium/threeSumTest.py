import pytest
from src.medium.threeSum import Solution

@pytest.fixture
def solution():
    return Solution()

@pytest.mark.parametrize(
        "nums, expected_trips",
        [
            ([-1,0,1,2,-1,-4], [[-1,-1,2],[-1,0,1]]),
            ([0,1,1], []),
            ([0,0,0], [[0,0,0]])
            ]
        )
def test_threeSum(solution, nums, expected_trips):
    trips = solution.threeSum(nums)
    assert trips == expected_trips
