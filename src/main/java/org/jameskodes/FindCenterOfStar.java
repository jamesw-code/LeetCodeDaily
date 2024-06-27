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

        int n = edges.length;

        for(int x = 0; x < n; x++) {

            if(map.containsKey(edges[x][0])) {
               int count = map.get(edges[x][0]) + 1;
               map.put(edges[x][0], count +1);
               if(count > maxCount) {
                   maxCount = count;
                   centerNumber =  edges[x][0];
               }
            } else {
                map.put(edges[x][0], 1);

            }

            if(map.containsKey(edges[x][1])) {
                int count = map.get(edges[x][1]) + 1;
                map.put(edges[x][1], count +1);
                if(count > maxCount) {
                    maxCount = count;
                    centerNumber =  edges[x][1];
                }
            } else {
                map.put(edges[x][1], 1);
            }


        }

        return centerNumber;
    }


}
