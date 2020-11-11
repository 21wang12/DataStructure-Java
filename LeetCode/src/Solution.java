import java.util.*;
/**
 * Commit Message Example:
 * LeetCode-xxx.xxxx
 */

class Solution {
    int[][] visit;
    public int findRotateSteps(String ring, String key) {
        //���仯��������ʼ��visit����
        visit = new int[ring.length()][key.length()];
        for(int i = 0; i < ring.length(); i++){
            for(int j = 0; j < key.length(); j++){
                visit[i][j] = -1;
            }
        }

        //�ݹ������
        return myFind(ring,0,key,0); 
    }

    public int myFind(String ring,int i, String key, int j){
        //�Ѿ���������ˣ���ֱ�ӷ���
        if(visit[i][j] != -1){
            return visit[i][j];
        }
        //ָ��ring��ָ����key�����һ���ַ�ƥ��ʱ������button����������һ���ݹ������
        if(j == key.length()-1 && key.charAt(j)==ring.charAt(i)){
            return 1;
        }

        //���ָ��ring��ָ���뵱ǰkeyֵƥ�䣬��ring��������key����һ���ַ�����ƥ��
        if(key.charAt(j)==ring.charAt(i)){
            //����botton��Ҫһ�β���
            return 1+myFind(ring,i,key,j+1);
        }

        //�ֱ�˳ʱ����ʱ�벦��ring���ҳ�����������С�������
        //��ring˳ʱ��ת����idx�����ҵ���һ��ƥ��   
        int idx = ring.indexOf(key.charAt(j),i);
        int step = idx - i;
        if(idx == -1){
            idx = ring.indexOf(key.charAt(j));
            step = idx + ring.length() - i;
        }

        //��ring��ʱ��ת����lastIdx�����ҵ���һ��ƥ��
        int lastIdx = ring.lastIndexOf(key.charAt(j),i);
        int lastStep = i - lastIdx;
        if(lastIdx == -1){
            lastIdx = ring.lastIndexOf(key.charAt(j));
            lastStep = ring.length() - lastIdx + i;
        }

        int count= step + myFind(ring,idx,key,j);//˳ʱ�뷽��ƥ��ɹ�����С��������
        int lastCout = lastStep + myFind(ring,lastIdx,key,j);//��ʱ�뷽��ƥ��ɹ�����С��������

        //���仯
        visit[i][j] = Math.min(count,lastCout);
        return Math.min(count,lastCout);
    }   
}
