package collection;
import java.util.*;
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
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for (int i : nums1) {
            s1.add(i);            
        }
        for (int i : nums2) {
            s2.add(i);
        }
        s1.retainAll(s2);
        int[] array = new int[s1.size()];
        int index = 0;
        for (int i : s1) {
            array[index++] = i;
        }
        return array;
    }

    public static void main(String[] args){
        List<Integer> l = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l.add(2);
        l.add(2);
        l2.add(2);
        l.removeAll(l2);
        System.out.println("l:"+l);

    }
}