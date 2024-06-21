

public class Vehicle {
    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    } 
}


class SportsCar extends Vehicle {
    int racingSpeed;

    SportsCar() {
        super(new SportyDriveStrategy());
    }
} 

class PassengerVehicle extends Vehicle {

    PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}

class OffRoadVehicle extends Vehicle {
    int maxElevation;

    OffRoadVehicle() {
        super(new SportyDriveStrategy());
    }
}

class GoodsVehicle extends Vehicle {

    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}

