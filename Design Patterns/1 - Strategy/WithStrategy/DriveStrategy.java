

public interface DriveStrategy {
    public void drive();
}


class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Normal drive capability");
    }
}


class SportyDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Sports drive capability");
    }
}