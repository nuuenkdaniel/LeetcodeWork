from typing import List

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n = len(nums)
        if n == 0:
            return 0

        k = 1
        curr_num = nums[0]
        for i in range(1, n):
            if nums[i] != curr_num:
                nums[k] = nums[i]
                curr_num = nums[i]
                k += 1
        return k

if __name__ == "__main__":
    test_list = [0,0,1,1,1,2,2,3,3,4]
    solution = Solution()
    k = solution.removeDuplicates(test_list)
    print(test_list)
    print(k)
