import math

class Solution:
    def reverse(self, x: int) -> int:
        MAX_INT32 = (1 << 31) - 1
        MIN_INT32 = -(1 << 31)

        digits = 1
        if x != 0:
            digits = int(math.log10(abs(x))) + 1
        new_x = 0
        for i in range(0, digits):
            digit_shift = 10**(digits-i-1)
            curr_digit = int(x/digit_shift)
            new_x += curr_digit*(10**i)
            x -= curr_digit*digit_shift

        if new_x > MAX_INT32 or new_x < MIN_INT32:
            return 0
        else:
            return new_x


if __name__ == "__main__":
    solution = Solution()
    print(solution.reverse(-123))
