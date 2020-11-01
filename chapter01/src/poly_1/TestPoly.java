package poly_1;

public class TestPoly {
    public static void main(String[] args) {
        Animal a = new Dog();
        
        //只能访问父类的属性和方法
        a.age = 2;
        a.name = "samo";

        //多态当中的方法覆盖依旧遵循覆盖原则，如果子类覆盖了父类中的方法，则执行子类中覆盖后的方法
        a.eat();
    }
    
}

