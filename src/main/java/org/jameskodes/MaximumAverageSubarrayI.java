package org.jameskodes;

public class MaximumAverageSubarrayI {

    //Working Solution
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;
        double currentSum = 0;
        for(int x = 0; x < k; x++) {
            currentSum += nums[x];
        }
        double maxAverage = currentSum/k;

        for(int j = k; j < n; j++) {
            currentSum += nums[j];
            currentSum -= nums[j-k];
            double currentAverage = currentSum / k;
            if (currentAverage > maxAverage) {
                maxAverage = currentAverage;
            }
        }

        return maxAverage;
    }

    // First Attempt
    public double findMaxAverage2(int[] nums, int k) {

        double averageMax = 0;

        for(int x = 0; x <= nums.length-k; x++){
            double numsSum = 0;
            for(int i = 0; i < k;i++) {
                numsSum += nums[x+i];
            }
            double currentAverage =numsSum/k;
            if(currentAverage > averageMax) {
                averageMax = currentAverage;
            }
        }

        return averageMax;
    }
}
