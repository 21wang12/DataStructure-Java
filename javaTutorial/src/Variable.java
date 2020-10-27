
public class Variable  {
    //类变量
    static int classVariable = 10 ;

    public static void main(String[] args) {
        System.out.println("类变量classVariable初始值:"+Variable.classVariable);
        /*
        Variable v1 = new Variable() ;
        Variable v2 = new Variable() ;
        v1.classVariable=11;
        System.out.println("类变量classVariable修改后:"+Variable.classVariable);
        System.out.println("通过实例v1访问类变量:"+v1.classVariable);
        System.out.println("通过实例v2访问类变量:"+v2.classVariable);
        */
    }
    
}
