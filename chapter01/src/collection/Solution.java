package collection;
import java.util.*;

/**
 * 提交说明：
 * LeetCode-140. 单词拆分 II
 */

class Solution {
    public int[][] kClosest(int[][] points, int K) {
        List<int[]> l = new ArrayList<>();
        for(int[] array : points){
            l.add(array);
        }
        Collections.sort(l, new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2) {
                return (o1[0]*o1[0]+o1[1]*o1[1]) - (o2[0]*o2[0]+o2[1]*o2[1]);
            };
        });
        int[][] res = new int[K][2];
        for (int i = 0; i < res.length; i++) {
            res[i] = l.get(i);
        }
        return res;
    }
}