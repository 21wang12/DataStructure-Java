package test;

import java.util.*;

import encap_1.Student;

public class Test {
    Student s1 = new Student();
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] res = new int[intervals.length + 1][2];
        int idx = 0;
        // ���������б�
        // ���Ƚ����������������������������
        int i = 0;
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            res[idx++] = intervals[i++];
        }
        // �����жϵ�ǰ�����Ƿ����������ص����ص��Ļ��ͽ��кϲ���ֱ����������ǰ��������������ұ������룬
        // �����պϲ�����������������
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        res[idx++] = newInterval;
        // ����������ұ�������������������
        while (i < intervals.length) {
            res[idx++] = intervals[i++];
        }

        return Arrays.copyOf(res, idx);
    }


    public static void main(String[] args) {
        Date d = new Date();
        d.getTime();
        System.out.println(1);
        int[][] a = new int[10][2];
    }
    
}
