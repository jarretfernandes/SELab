package factory;

public class MainApp {
    public static void main(String[] args) {
        Vehicle v1 = VehicleFactory.createVehicle("bike");
        Vehicle v2 = VehicleFactory.createVehicle("car");
        v1.changeTires();
        v2.changeTires();
    }
}
