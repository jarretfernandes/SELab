package factory;

public class Bike extends Vehicle {
    @Override
    public void changeTires() {
        System.out.println("changing 2 tires");
    }
}
