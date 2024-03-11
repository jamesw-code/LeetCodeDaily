package org.jameskodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
*   349. Intersection of Two Arrays
*   03/10/2024
 */
public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> arrayList = new ArrayList<>();

        for(int x = 0; x < nums1.length; x++) {
            map.put(nums1[x],nums1[x]);
        }

        for(int i = 0; i < nums2.length; i++) {
            if(map.containsKey(nums2[i])){
                if(!arrayList.contains(nums2[i])){
                    arrayList.add(nums2[i]);
                }
            }
        }

        int[] returnArray = new int[arrayList.size()];
        for(int j = 0; j < returnArray.length; j++) {
            returnArray[j] = arrayList.get(j);
        }

        return returnArray;
    }

}
