package org.jameskodes;

/*
*   2540. Minimum Common Value
* Leet Code Daily 03/09/2024
 */
public class MinimumCommonValue {

    public int getCommon(int[] nums1, int[] nums2) {

        int match = -1;
        int bottomIndex = 0;
        int bottomMax = nums2.length-1;

        for(int topIndex = 0; topIndex < nums1.length; topIndex++) {

            while(nums1[topIndex] >= nums2[bottomIndex] && bottomIndex > bottomMax) {
                if(nums1[topIndex] == nums2[bottomIndex]) {
                    return nums1[topIndex];
                }
                bottomIndex++;
            }
        }
        return match;
    }
}
