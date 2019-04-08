package abstract_factory;

public class SmartBike extends Vehicle {
    @Override
    public void changeTires() {
        System.out.println("changing 2 tires & reconfiguring mechanics");
    }
}
