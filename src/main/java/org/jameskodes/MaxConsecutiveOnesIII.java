package org.jameskodes;

public class MaxConsecutiveOnesIII {

    public int longestOnes(int[] nums, int k) {

        int n = nums.length;
        int flips = 0;
        int i = 0; // Current Index
        int follow = 0; // track the index of the first window
        int currentCons = 0;

        // Open window, finding first k amount of zero to flip
        while(flips < k) {
            if(nums[i] == 0) {
                flips += 1;
            }
            currentCons += 1;
            i++;
            if(i == n-1) {
                break;
            }

        }
        // Set for window max,
        int maxCons = currentCons;

        // Start Searching after first Window which has 3 Zeros
        for(int j = i; j < n; j++) {
            // Grow window un till we encounter an additional Zero

            if(nums[i] == 0) {
                // Shrink window un till we remove a Zero, because we encounter a Zero
                while(flips == k) {
                    if(nums[follow] == 0) {
                        flips -= 1;
                    }
                    follow += 1;
                    currentCons -= 1;
                }
                flips += 1;
            }
            currentCons +=1;
            i++;

            // evaluate max
            if(currentCons > maxCons) {
                maxCons = currentCons;
            }
        }

        return maxCons;
    }

}
