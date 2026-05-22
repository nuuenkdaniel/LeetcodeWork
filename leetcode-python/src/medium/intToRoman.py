from math import log10

class Solution:
    def intToRoman(self, num: int) -> str:
        roman_numerals = ['M', 'D', 'C', 'L', 'X', 'V', 'I']
        digits = int(log10(abs(num)))+1
        romanized_num = ""
        for i in range(4-digits, 4):
            curr_digit = int(10**(4-i-1))
            curr_digit_val = int(num/curr_digit)
            num -= curr_digit*curr_digit_val
            if curr_digit_val == 4:
                romanized_num += (roman_numerals[i*2] + roman_numerals[i*2-1])
            elif curr_digit_val == 9:
                romanized_num += (roman_numerals[i*2] + roman_numerals[i*2-2])
            else:
                while curr_digit_val != 0:
                    if curr_digit_val > 4:
                        curr_digit_val -= 5
                        romanized_num += roman_numerals[i*2-1]
                    else:
                        curr_digit_val -= 1
                        romanized_num += roman_numerals[i*2]

        return romanized_num

if __name__ == "__main__":
    solution = Solution()
    # solution.intToRoman(3749)
    print(solution.intToRoman(3749))
