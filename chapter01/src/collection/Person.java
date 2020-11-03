package collection;

public class Person {
    int age;
    String name;
    Person(){

    }
    Person(int age,String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "["+this.name +"-" + this.age+"]";
    }
    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(this == obj){
            return true;
        }
        if(obj instanceof Person){
            Person person = (Person) obj;
            if(this.name.equals(person.name)){
                if(this.age == person.age){
                    return true;
                }
            }
        }
        return false;
    }
}
