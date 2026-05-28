from typing import List

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        triplets = []
        seen = {}
        for i in range(n-2):
            for j in range(i+1, n-1):
                for k in range(j+1, n):
                    if nums[i]+nums[j]+nums[k] == 0:
                        trips = sorted([nums[i],nums[j],nums[k]])
                        str_trips = str(trips)
                        if str_trips in seen:
                            continue
                        seen[str_trips] = 1
                        triplets.append(trips)
        return triplets
