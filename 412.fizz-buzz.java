import java.util.*;

/*
 * @lc app=leetcode id=412 lang=java
 *
 * [412] Fizz Buzz
 *
 * https://leetcode.com/problems/fizz-buzz/description/
 *
 * algorithms
 * Easy (58.72%)
 * Total Accepted:    181.7K
 * Total Submissions: 308.9K
 * Testcase Example:  '1'
 *
 * Write a program that outputs the string representation of numbers from 1 to
 * n.
 * 
 * But for multiples of three it should output “Fizz” instead of the number and
 * for the multiples of five output “Buzz”. For numbers which are multiples of
 * both three and five output “FizzBuzz”.
 * 
 * Example:
 * 
 * n = 15,
 * 
 * Return:
 * [
 * ⁠   "1",
 * ⁠   "2",
 * ⁠   "Fizz",
 * ⁠   "4",
 * ⁠   "Buzz",
 * ⁠   "Fizz",
 * ⁠   "7",
 * ⁠   "8",
 * ⁠   "Fizz",
 * ⁠   "Buzz",
 * ⁠   "11",
 * ⁠   "Fizz",
 * ⁠   "13",
 * ⁠   "14",
 * ⁠   "FizzBuzz"
 * ]
 * 
 * 
 */
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        if(n <= 0) return result;
        for(int i = 1; i <= n; i++){
            if(i % 3 != 0 && i % 5 != 0){
                result.add(i + "");
            }else if(i % 3 == 0 && i % 5 != 0){
                result.add("Fizz");
            }else if(i % 3 != 0 && i % 5 == 0){
                result.add("Buzz");
            }else{
                result.add("FizzBuzz");
            }
        }
        return result;
    }
}
