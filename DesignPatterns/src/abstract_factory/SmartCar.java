package abstract_factory;

public class SmartCar extends Vehicle {
    @Override
    public void changeTires() {
        System.out.println("changing 4 tires & reconfiguring mechanics");
    }
}
