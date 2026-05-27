import pytest
from src.medium.productExceptSelf import Solution

@pytest.fixture
def solution():
    return Solution()

@pytest.mark.parametrize(
        "nums, expected_products",
        [
            ([1,2,4,6],[48,24,12,8]),
            ([-1,0,1,2,3],[0,-6,0,0,0])
            ]
        )
def test_productExceptSelf(solution, nums, expected_products):
    products = solution.productExceptSelf(nums)
    assert products == expected_products
    
