class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        result = []
        for i in range (n):
            j = n + i
            result.append(nums[i])
            result.append(nums[j])
        return result

            
