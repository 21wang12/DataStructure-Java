package javaTutorial;

public class NestedClass{
    int a=1;
    class InnerClass{
        
    }
    class StaticNestedClass{
        int a = 3;
        void sayHello(int a){
            System.out.println("hello"+a);
            System.out.println(this.a);
            System.out.println(NestedClass.this.a);
        }
    }

    public static void main(String[] args) {
        NestedClass nestedObj = new NestedClass();
        NestedClass.StaticNestedClass staticNestedObj =nestedObj.new StaticNestedClass();
        staticNestedObj.sayHello(2);
    }
    
}