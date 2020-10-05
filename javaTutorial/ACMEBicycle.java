package javaTutorial;


interface Bicycle {

    //  wheel revolutions per minute
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}

public class ACMEBicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    public void changeCadence(int newValue) {
         cadence = newValue;
    }

    public void changeGear(int newValue) {
         gear = newValue;
    }

    public void speedUp(int increment) {
         speed = speed + increment;   
    }

    public void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }

    void printf(Object... obj){

    }

    public static void main(String[] args) {
        String[] s = {new String("hello"),"fuck","you"};
        String[] s1 = new String[10];
        System.out.printf("%s %s %s",s);
    }
}