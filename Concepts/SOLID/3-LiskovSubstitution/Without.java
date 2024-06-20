import java.util.ArrayList;

class Vehicle {
    public int getWheelCount()  { return 2; }
    public String turnOnEngine()   { return "Engine Turned On"; }
}

class Car extends Vehicle {
    @Override
    public int getWheelCount()  { return 4; } 
}

class Scooter extends Vehicle {

}

class TriCycle extends Vehicle {
    @Override
    public String turnOnEngine()   { throw new AssertionError("Engine not present"); } 
}

class Main {
    public static void main() {
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car());
        vehicleList.add(new Scooter());
        vehicleList.add(new TriCycle());

        for(Vehicle vehicle: vehicleList) {
            System.out.println("Status " + vehicle.turnOnEngine());     // Tricycle function call throws error
        }
    }
}