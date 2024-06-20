import java.util.ArrayList;

class Vehicles {
    public int getWheelCount()  { return 2; }
}

class EnginedVehicle extends Vehicles {
    public String turnOnEngine()   { return "Engine Turned On"; }
}

class Bus extends EnginedVehicle {
    @Override
    public int getWheelCount()  { return 4; } 
}

class Kawasaki extends EnginedVehicle {
    // takes super class properties
}

class Cycle extends Vehicles {
    // takes super class properties
}

class Mainn {
    public static void main() {
        ArrayList<Vehicles> vehicleList = new ArrayList<>();
        vehicleList.add(new Bus());
        vehicleList.add(new Kawasaki());
        vehicleList.add(new Cycle());

        for(Vehicles vehicle: vehicleList) {
            System.out.println("Status " + vehicle.getWheelCount());     
            // System.out.println("Status " + vehicle.turnOnEngine());     Compile time Error : method not found 
        }


        ArrayList<EnginedVehicle> engineVehicleList = new ArrayList<>();
        engineVehicleList.add(new Bus());
        engineVehicleList.add(new Kawasaki());
        // engineVehicleList.add(new Cycle());          Compile time Error : incompatible type 

        for(EnginedVehicle vehicle: engineVehicleList) {
            System.out.println("Status " + vehicle.getWheelCount());     
            System.out.println("Status " + vehicle.turnOnEngine());      
        }
    }
}