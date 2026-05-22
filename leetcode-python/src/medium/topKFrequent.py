from typing import List

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        num_count_dict = {}
        
        for num in nums:
            if num in num_count_dict:
                num_count_dict[num] += 1
            else:
                num_count_dict[num] = 1

        buckets = [[] for _ in range(len(nums) + 1)]
        for num, freq in num_count_dict.items():
            buckets[freq].append(num)

        k_freq = []
        for i in range(len(buckets)-1, 0, -1):
            for num in buckets[i]:
                k_freq.append(num)
                if len(k_freq) == k:
                    return k_freq

        return []
