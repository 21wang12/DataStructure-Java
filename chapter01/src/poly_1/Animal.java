package poly_1;

/**
 * ���������
 */
public abstract class Animal {
    //����
    String name;
    //����
    int age;
    /**
     * ���췽��
     */
    Animal(){
        name = "animal";
    }
    // �Է���
    void eat(){
        System.out.println("Animal eat");
    }
}