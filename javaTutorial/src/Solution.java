import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> commonChars(String[] A) {
        int[] minfreq = new int[26]; 
        Arrays.fill(minfreq, Integer.MAX_VALUE);
        for (String word : A){
            int[] freq = new int[26];
            for (int i = 0; i < word.length() ; i++){
                freq[word.charAt(i) - 'a']++;
            }
            for (int i = 0 ; i < 26 ; i++){
                minfreq[i] = Math.min(minfreq[i], freq[i]);
            }
        }
        List<String> ans = new ArrayList<String>();
        for (int i = 0 ; i < 26 ; i++) {
            for (int j = 0; j < minfreq[i] ;j++) {
                ans.add(Character.toString(i+'a'));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] A = {"bella","label","roller"};
        System.out.println("Answer:" + s.commonChars(A)); 
    }
}