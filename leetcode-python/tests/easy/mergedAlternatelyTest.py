import pytest
from src.easy.mergeAlternately import Solution

@pytest.fixture
def solution():
    return Solution()

@pytest.mark.parametrize(
    "w1, w2, expected_word",
    [
        ("abc", "pqr", "apbqcr"),
        ("ab", "pqrs", "apbqrs"),
        ("abcd", "pq", "apbqcd")
    ]
)
def test_mergeAlternately(solution, w1, w2, expected_word):
    merged_word = solution.mergeAlternately(w1, w2)
    assert merged_word == expected_word

