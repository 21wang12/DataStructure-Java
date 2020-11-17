import java.util.*;
/**
 * Commit Message Example:
 * LeetCode-xxx.xxxx
 */

class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int count = R*C;
        int[][] ret = new int[count][2];
        int k = 0;
        for(int i = 0; i < R; i++){
            for(int j = 0; j < C; j++){
                ret[k][0] = i;
                ret[k][1] = j;
                k++;
            }
        }
        Arrays.sort(ret,new Comparator<int[]>(){

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return Math.abs(o1[0]-r0)+Math.abs(o1[1]-c0)-Math.abs(o2[0]-r0)-Math.abs(o2[1]-c0);
			}
            
        });
        return ret;
    }
}
