import java.util.*;
/**
 * Commit Message Example:
 * LeetCode-xxx.xxxx
 */

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while(i<=j){
            if(nums[i]==nums[j]&&nums[i]==target){
                break;
            }
            if(nums[i]!=target){
                i++;
            }
            if(nums[j]!=target){
                j--;
            }
        }
        if(i<=j){
            return new int[]{i,j};
        }
        return new int[]{-1,-1};
        
    }
}