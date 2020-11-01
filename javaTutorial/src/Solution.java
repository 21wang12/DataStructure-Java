import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public List<Integer> partitionLabels(String S) {
        Map<Character,Integer> m = new HashMap<>();
        List<Integer> l = new ArrayList<>();
        for (int i = 0 ; i < S.length() ; i++ ){
            m.put(S.charAt(i),i);
        }
        int tempIndex;
        int maxIndex = -1;
        for (int i = 0; i < S.length() ; i++){
            tempIndex = m.get(S.charAt(i));
            if (tempIndex > maxIndex){
                maxIndex = tempIndex;
            }
            if (i == maxIndex){
                l.add(i+1);
            }
        }
        for (int i = l.size()-1 ; i >0 ; i--){
            l.set(i,l.get(i)-l.get(i-1));
        }
        return l;
    }
}