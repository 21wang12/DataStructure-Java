import java.util.*;
/**
 * Commit Message Example:
 * LeetCode-xxx.xxxx
 */

class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,new Comparator<int[]>(){

			@Override
			public int compare(int[] o1, int[] o2) {
                // TODO Auto-generated method stub
				return o1[0]==o2[0]?o1[1]-o2[1]:o2[0]-o1[0];
			}
            
        });
        List<int[]> l = new ArrayList<>();
        for (int[] a : people) {
            l.add(a[1], a);            
        }
        return l.toArray(new int[0][]);
    }
}
