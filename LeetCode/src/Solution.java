import java.util.*;
/**
 * Commit Message Example:
 * LeetCode-xxx.xxxx
 */

class Solution {
    int[][] visit;
    public int findRotateSteps(String ring, String key) {
        //记忆化搜索，初始化visit数组
        visit = new int[ring.length()][key.length()];
        for(int i = 0; i < ring.length(); i++){
            for(int j = 0; j < key.length(); j++){
                visit[i][j] = -1;
            }
        }

        //递归产生答案
        return myFind(ring,0,key,0); 
    }

    public int myFind(String ring,int i, String key, int j){
        //已经计算过过了，则直接返回
        if(visit[i][j] != -1){
            return visit[i][j];
        }
        //指向ring的指针与key的最后一个字符匹配时。按下button，操作数加一，递归结束。
        if(j == key.length()-1 && key.charAt(j)==ring.charAt(i)){
            return 1;
        }

        //如果指向ring的指针与当前key值匹配，则ring不动，对key的下一个字符进行匹配
        if(key.charAt(j)==ring.charAt(i)){
            //按下botton需要一次操作
            return 1+myFind(ring,i,key,j+1);
        }

        //分别顺时针逆时针拨动ring。找出操作次数最小的情况。
        //将ring顺时针转动至idx可以找到下一个匹配   
        int idx = ring.indexOf(key.charAt(j),i);
        int step = idx - i;
        if(idx == -1){
            idx = ring.indexOf(key.charAt(j));
            step = idx + ring.length() - i;
        }

        //将ring逆时针转动到lastIdx可以找到下一个匹配
        int lastIdx = ring.lastIndexOf(key.charAt(j),i);
        int lastStep = i - lastIdx;
        if(lastIdx == -1){
            lastIdx = ring.lastIndexOf(key.charAt(j));
            lastStep = ring.length() - lastIdx + i;
        }

        int count= step + myFind(ring,idx,key,j);//顺时针方向匹配成功的最小操作次数
        int lastCout = lastStep + myFind(ring,lastIdx,key,j);//逆时针方向匹配成功的最小操作次数

        //记忆化
        visit[i][j] = Math.min(count,lastCout);
        return Math.min(count,lastCout);
    }   
}
