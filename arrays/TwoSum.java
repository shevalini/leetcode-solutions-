/*
 * Problem: Two Sum
 * LeetCode: #1 (Easy)
 * Link: https://leetcode.com/problems/two-sum/
 *
 * Problem Statement:
 * Given an array of integers nums and an integer target, return indices of
 * the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you
 * may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 * Constraints:
 * - 2 <= nums.length <= 10^4
 * - -10^9 <= nums[i] <= 10^9
 * - -10^9 <= target <= 10^9
 * - Only one valid answer exists.
 *
 * Approach:
 * Use a HashMap to store each number's value as key and its index as value,
 * while iterating through the array. For each number, compute its
 * complement (target - number) and check if that complement already
 * exists in the map. If it does, we've found our pair. If not, add the
 * current number and its index to the map and continue.
 * This avoids the O(n^2) brute-force approach of checking every pair.
 *
 * Time Complexity: O(n) - single pass through the array
 * Space Complexity: O(n) - HashMap can store up to n elements
 */

import java.util.*;

public class TwoSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[] {};

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                result = new int[] { map.get(complement), i };
                break;
            }

            map.put(nums[i], i);
        }

        if (result.length == 2) {
            System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No valid pair found.");
        }

        sc.close();
        
    }

}