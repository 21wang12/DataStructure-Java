import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
/**
 * 提交说明：
 * LeetCode-140. 单词拆分 II
 */


class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> l = new ArrayList<>();
        for(int i = s.length()-1; i >= 0; i++){
            for(int j = 0; j < s.length(); j++){
                String word = s.substring(i-j, i+1);
                    if( wordDict.contains(word)){
                        i -= j;
                        l.add(word);
                    }
            }
        }
        return l;
    }
}