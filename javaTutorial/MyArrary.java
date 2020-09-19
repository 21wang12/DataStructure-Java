package javaTutorial;

public class MyArrary{
    public static void main(String[] args) {
        /**
         * 一维数组
         */
        //声明
        int[] intArrary;
        //创建
        intArrary = new int[10];
        //初始化
        intArrary[0] = 1;
        //访问
        System.out.println("intArray[0]=:"+intArrary[0]);
        //一维数组的简化的声明、创建和初始化
        int[] intArrary01 = {
            10,11,12,
            13,14
        };
        System.out.println("intArrary01[0]=:"+intArrary01[0]);

        /**
         * 多维数组
         */
        //声明
        int[][] multiArrary;
        //创建
        multiArrary = new int[10][4];
        //初始化
        multiArrary[0][3] = 3;
        //访问
        System.out.println("multiArrary[0][3]=:"+multiArrary[0][3]);
        //多维数组的简化声明、创建和初始化
        int[][] multiArrary01={
            intArrary,
            intArrary01,
        };
        //多维数组的简化初始化也可以使用字面量
        int[][] multiArrary02={
            {1,2,3},
            {4,5,6,7},
        };
        //也可以二者结合使用
        int[][] multiArrary03={
            intArrary,
            {4,5,6,7}
        };
        

    }

}