package javaTutorial;

public class MyArrary{
    public static void main(String[] args) {
        /**
         * һά����
         */
        //����
        int[] intArrary;
        //����
        intArrary = new int[10];
        //��ʼ��
        intArrary[0] = 1;
        //����
        System.out.println("intArray[0]=:"+intArrary[0]);
        //һά����ļ򻯵������������ͳ�ʼ��
        int[] intArrary01 = {
            10,11,12,
            13,14
        };
        System.out.println("intArrary01[0]=:"+intArrary01[0]);

        /**
         * ��ά����
         */
        //����
        int[][] multiArrary;
        //����
        multiArrary = new int[10][4];
        //��ʼ��
        multiArrary[0][3] = 3;
        //����
        System.out.println("multiArrary[0][3]=:"+multiArrary[0][3]);
        //��ά����ļ������������ͳ�ʼ��
        int[][] multiArrary01={
            intArrary,
            intArrary01,
            {11,12,13}
        };
        System.out.println("multiArrary[1][4]=:"+multiArrary01[1][4]);

    }

}