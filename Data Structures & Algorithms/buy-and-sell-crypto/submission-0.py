class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        l = 0
        n = len(prices)
        profit = 0

        # initialise r as 1 and iterate until r is at the end of the array
        for r in range(1, n):

            # if we're at a loss, then move l to r
            if prices[l] >= prices[r]:
                l = r

            # else (profit) ->  check if profit higher than previously profit 
            else:
                profit = max(profit, prices[r] - prices[l])
                
        return profit