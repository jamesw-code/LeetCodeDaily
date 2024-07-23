package org.jameskodes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** 1636. Sort Array by Increasing Frequency
* https://leetcode.com/problems/sort-array-by-increasing-frequency/?envType=daily-question&envId=2024-07-23
*
* */

public class SortArrayByIncreasingFrequency {

    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // Make a map to count values of each element
        Integer[] newNums = new Integer[nums.length]; // Integer Array for Array Sort

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) { // If Key exist, increment value
                map.put(nums[i], map.get(nums[i]) + 1);
            } else { // If Key doesnt Exist, add at 1
                map.put(nums[i],  1);
            }
            newNums[i] = nums[i]; // Set Values of newNums, for sorting
        }

        /** Array sort with custom comparator a and b
         * Return depending on how to two elements you're given should be ordered
         * negative number - if a should be lower than b
         * zero - if the two values are equally placed
         * positive number - if a should be higher then b
        **/
        Arrays.sort(newNums, (a, b) -> { // Sort newNums, with index values
            if (map.get(a) != map.get(b)) { // if the frequency values don't match,
                return map.get(a) - map.get(b); // return how to adjust
            } else { // If the frequency values match, sort by largest to smallest
                return b - a; // b - a for decreasing order
            }
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = newNums[i];
        }

        return nums;
    }
}
