import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
/**
 * Commit Message Example:
 * LeetCode-xxx.xxxx
 */



class Solution {
    
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root;
        while(currentNode != null || ! stack.empty()){
            if(currentNode != null){
                l.add(currentNode.val);
                stack.push(currentNode);
                currentNode = currentNode.left;
            }else{
                currentNode = stack.pop().right;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        
    }

}