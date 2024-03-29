#
# @lc app=leetcode id=53 lang=python3
#
# [53] Maximum Subarray
#
# https://leetcode.com/problems/maximum-subarray/description/
#
# algorithms
# Easy (42.50%)
# Total Accepted:    447.2K
# Total Submissions: 1.1M
# Testcase Example:  '[-2,1,-3,4,-1,2,1,-5,4]'
#
# Given an integer array nums, find the contiguous subarray (containing at
# least one number) which has the largest sum and return its sum.
# 
# Example:
# 
# 
# Input: [-2,1,-3,4,-1,2,1,-5,4],
# Output: 6
# Explanation: [4,-1,2,1] has the largest sum = 6.
# 
# 
# Follow up:
# 
# If you have figured out the O(n) solution, try coding another solution using
# the divide and conquer approach, which is more subtle.
# 
#
class Solution:
    #nums: [-2,1,-3,4,-1,2,1,-5,4]
    def maxSubArray(self, nums: 'List[int]') -> 'int':
        f = nums
        for i in range(1, len(f)):
            f[i] = nums[i] if f[i-1] <= 0 else nums[i] + f[i-1]
        return max(f)

