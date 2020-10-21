import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> ss = new Stack<>();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '#'){
                if (!ss.empty()){
                    ss.pop();
                }
            }else {
                ss.push(S.charAt(i));
            }
        }

        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) == '#'){
                if (!st.empty()){
                    st.pop();
                }
            }else {
                st.push(S.charAt(i));
            }
        }

        while (st.empty() && ss.empty()){
            if (st.size() != ss.size()){
                return false;
            }
            if (st.pop() != ss.pop()){
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        s.pop();
    }
}

