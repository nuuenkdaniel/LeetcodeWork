import pytest
from src.medium.reverseWords import Solution

@pytest.fixture
def solution():
    return Solution()

@pytest.mark.parametrize(
    "words, reversed_words",
    [
        ("the sky is blue", "blue is sky the"),
        ("  hello world  ", "world hello"),
        ("a good   example", "example good a")
    ]
)
def test_reverseWords(solution, words, reversed_words):
    rev = solution.reverseWords(words)
    assert rev == reversed_words
