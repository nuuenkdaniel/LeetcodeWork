class Solution:
    def mergeAlternately(self, w1: str, w2: str) -> str:
        merged_word = []
        n = min(len(w1), len(w2))
        
        for i in range(0, n):
            merged_word.append(w1[i])
            merged_word.append(w2[i])

        merged_word.append(w1[n:])
        merged_word.append(w2[n:])
        
        return "".join(merged_word)

if __name__ == "__main__":
    solution = Solution()
    solution.mergeAlternately("abc", "def")
