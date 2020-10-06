package helloworld;



public class HelloWorld {
    
    /**
     * 主函数
     * @Author Wang1
    */
    void sayHello(){
        System.out.println("Hello");
    }

    void sayHello(int i, String s){
        for (int j = 0; j < i; j++) {
            System.out.println(s);

        }
    }

    void sayHello(String s, int i){
        for (int j = 0; j < i; j++) {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        System.out.println("hello");
        HelloWorld hw = new HelloWorld();
        hw.sayHello(2,"Fuck");
        hw.sayHello("fucku",3);
    }
}