package facade;

public class Car extends Vehicle {
    @Override
    public void changeTires() {
        System.out.println("changing 4 tires");
    }
}
