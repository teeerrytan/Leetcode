/*
 * @lc app=leetcode id=375 lang=java
 *
 * [375] Guess Number Higher or Lower II
 *
 * https://leetcode.com/problems/guess-number-higher-or-lower-ii/description/
 *
 * algorithms
 * Medium (37.37%)
 * Total Accepted:    42.4K
 * Total Submissions: 113.4K
 * Testcase Example:  '1'
 *
 * We are playing the Guess Game. The game is as follows:
 * 
 * I pick a number from 1 to n. You have to guess which number I picked.
 * 
 * Every time you guess wrong, I'll tell you whether the number I picked is
 * higher or lower.
 * 
 * However, when you guess a particular number x, and you guess wrong, you pay
 * $x. You win the game when you guess the number I picked.
 * 
 * Example:
 * 
 * 
 * n = 10, I pick 8.
 * 
 * First round:  You guess 5, I tell you that it's higher. You pay $5.
 * Second round: You guess 7, I tell you that it's higher. You pay $7.
 * Third round:  You guess 9, I tell you that it's lower. You pay $9.
 * 
 * Game over. 8 is the number I picked.
 * 
 * You end up paying $5 + $7 + $9 = $21.
 * 
 * 
 * Given a particular n ≥ 1, find out how much money you need to have to
 * guarantee a win.
 */
class Solution {
    // // DFS
    // int[][] dp;

    // // 数字在1和n之间
    // public int getMoneyAmount(int n) {
    // dp = new int[n + 1][n + 1];
    // return helper(1, n);
    // }

    // private int helper(int i, int j) {
    // if (i > j)
    // return 0;
    // if (dp[i][j] != 0)
    // return dp[i][j];
    // int res = Integer.MAX_VALUE;
    // for (int x = i; x < j; x++) {
    // res = Math.min(res, x + Math.max(helper(i, x - 1), helper(x + 1, j)));
    // }
    // dp[i][j] = res;
    // return res;
    // }

    // divide and conquer

    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 1][n + 1];
        for (int i = n - 1; i > 0; i--) {
            for (int j = i + 1; j <= n; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int x = i; x < j; x++) {
                    dp[i][j] = Math.min(dp[i][j], x + Math.max(dp[i][x - 1], dp[x + 1][j]));
                }
            }
        }
        return dp[1][n];
    }
}
