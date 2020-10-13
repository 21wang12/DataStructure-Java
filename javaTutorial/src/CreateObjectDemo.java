
public class CreateObjectDemo {
    int a;
    

    int varInt = setValueFun();

    int setValueFun(){
        return varInt;
    }

    public static void main(String[] args) {
        System.out.println(new CreateObjectDemoSub().varInt);
    }
}

class CreateObjectDemoSub extends CreateObjectDemo{


}