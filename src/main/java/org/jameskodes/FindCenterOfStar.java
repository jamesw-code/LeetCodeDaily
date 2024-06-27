package org.jameskodes;

import java.util.HashMap;

/*
* Leet Code Daily
* 1791. Find Center of Star Graph
* */
public class FindCenterOfStar {

    public int findCenter(int[][] edges) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int centerNumber = 0;
        int maxCount = 0;

        for (int[] edge : edges) {

            for(int x = 0; x < 2; x++) {
                if (map.containsKey(edge[x])) {
                    int count = map.get(edge[x]) + 1;
                    map.put(edge[x], count + 1);
                    if (count > maxCount) {
                        maxCount = count;
                        centerNumber = edge[x];
                    }
                } else {
                    map.put(edge[x], 1);
                }
            }
        }

        return centerNumber;
    }


}
