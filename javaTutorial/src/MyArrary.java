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
            1,2,3,
            4,5,6,7
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
        /*
        //��ά����ļ������������ͳ�ʼ��
        int[][] multiArrary01={
            intArrary,
            intArrary01,
        };
        //��ά����ļ򻯳�ʼ��Ҳ����ʹ��������
        int[][] multiArrary02={
            {1,2,3},
            {4,5,6,7},
        };
        //Ҳ���Զ��߽��ʹ��
        int[][] multiArrary03={
            intArrary,
            {4,5,6,7}
        };
        */
    }

}