import pytest
from src.medium.reverseInteger import Solution

@pytest.fixture
def solution():
    return Solution()

@pytest.mark.parametrize(
        "x, reversed_x",
        [
            (123, 321),
            (-123, -321),
            (120, 21),
            (1563847412, 0)
            ]
        )
def test_reverseInteger(solution, x, reversed_x):
    new_x = solution.reverse(x)
    assert new_x == reversed_x
