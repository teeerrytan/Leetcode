#
# @lc app=leetcode id=123 lang=python3
#
# [123] Best Time to Buy and Sell Stock III
#
# https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/description/
#
# algorithms
# Hard (32.71%)
# Total Accepted:    135.7K
# Total Submissions: 414.8K
# Testcase Example:  '[3,3,5,0,0,3,1,4]'
#
# Say you have an array for which the ith element is the price of a given stock
# on day i.
#
# Design an algorithm to find the maximum profit. You may complete at most two
# transactions.
#
# Note: You may not engage in multiple transactions at the same time (i.e., you
# must sell the stock before you buy again).
#
# Example 1:
#
#
# Input: [3,3,5,0,0,3,1,4]
# Output: 6
# Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit =
# 3-0 = 3.
# Then buy on day 7 (price = 1) and sell on day 8 (price = 4), profit = 4-1 =
# 3.
#
# Example 2:
#
#
# Input: [1,2,3,4,5]
# Output: 4
# Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit =
# 5-1 = 4.
# Note that you cannot buy on day 1, buy on day 2 and sell them later, as you
# are
# engaging multiple transactions at the same time. You must sell before buying
# again.
#
#
# Example 3:
#
#
# Input: [7,6,4,3,1]
# Output: 0
# Explanation: In this case, no transaction is done, i.e. max profit = 0.
#
#


class Solution:
    def maxProfit(self, prices: 'List[int]') -> 'int':
        if len(prices) == 0 or len(prices) == 1:
            return 0

        buy1, buy2 = -prices[0], -prices[0]
        sell1, sell2 = 0, 0

        for price in prices[1:]:
            buy1 = max(buy1, -price)
            sell1 = max(sell1, price+buy1)

            # profit for last transaction is sell1
            buy2 = max(buy2, sell1-price)
            sell2 = max(sell2, price+buy2)

        return sell2
        1,2,5,2,5,7,2,9,0