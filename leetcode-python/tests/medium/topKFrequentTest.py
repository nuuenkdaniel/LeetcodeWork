import pytest
from src.medium.topKFrequent import Solution

@pytest.fixture
def solution():
    return Solution()

@pytest.mark.parametrize(
    "nums, k, expected_k",
    [
        ([1,1,1,2,2,3], 2, [1,2]),
        ([1], 1, [1]),
        ([1,2,1,2,1,2,3,1,3,2], 2, [1,2])
    ]
)
def test_topKMostFrequent(solution, nums, k, expected_k):
    k_freq = solution.topKFrequent(nums, k)
    assert k_freq == expected_k
