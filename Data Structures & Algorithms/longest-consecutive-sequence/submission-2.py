class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        nums = set(nums)

        longest = 0

        for num in nums:

            befor = num - 1

            if befor not in nums:

                next_num = num + 1

                while next_num in nums:
                    next_num += 1

                longest = max(next_num - num, longest)

        return longest