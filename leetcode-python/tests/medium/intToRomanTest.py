import pytest
from src.medium.intToRoman import Solution

@pytest.fixture
def solution():
    return Solution()

@pytest.mark.parametrize(
        "num, expected_roman_num",
        [
            (3749, "MMMDCCXLIX"),
            (58, "LVIII"),
            (1994, "MCMXCIV")
            ]
        )
def test_intToRoman(solution, num, expected_roman_num):
    val = solution.intToRoman(num)
    assert val == expected_roman_num
