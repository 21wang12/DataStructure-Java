import java.util.*;
/**
 * Commit Message Example:
 * LeetCode-xxx.xxxx
 */

class Solution {
    public int countPrimes(int n) {
        int cnt = 0;
        for(int i = 2;i < n;i++){
            if(isPrime(i)){
                cnt++;
            }
        }
        return cnt;
    }
    public boolean isPrime(int n){
        boolean result = true;
        for(int i = 2;i*i<=n;i++){
            if(n%i==0){
                result = false;
                break;
            }
        }
        return result;
    }
}