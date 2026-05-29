from typing import List

class Solution:
    def findMinHelper(self, nums: List[int], i, j) -> int:
        if j-i == 1:
            return nums[i]

        if nums[i] < nums[j-1]:
            return nums[i]

        mid = (i+j)//2

        if nums[mid] > nums[j-1]:
            return self.findMinHelper(nums, mid+1, j)
        else:
            return self.findMinHelper(nums, i, mid+1)

    def findMin(self, nums: List[int]) -> int:
        return self.findMinHelper(nums, 0, len(nums))
