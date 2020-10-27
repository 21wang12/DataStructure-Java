package poly_1;

/**
 * 动物抽象类
 */
public abstract class Animal {
    //姓名
    String name;
    //年龄
    int age;
    /**
     * 构造方法
     */
    Animal(){
        name = "animal";
    }
    // 吃方法
    void eat(){
        System.out.println("Animal eat");
    }
}