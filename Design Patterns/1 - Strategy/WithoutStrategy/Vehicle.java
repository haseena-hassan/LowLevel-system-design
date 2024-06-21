/*
 * Strategy Design Pattern
 * 
 *  -   When special capabilities across subclasses are duplicated or common with some children
 *  -   Prevent code duplication by creating interfaces and implementing interfaces specially
 * 
 */

class Vehicle {
    int wheels;
    String model;

    public void drive() {
        System.out.println("Normal driving mode");
    }
 }

class SportyVehicle extends Vehicle {
    int racingSpeed;

    @Override
    public void drive() {
        System.out.println("Sports driving capability");        // Duplicated Common Functionality
    }
 }

class PassengerVehicle extends Vehicle {

 }

class OffRoadVehicle extends Vehicle {
    int maxElevation;

    @Override
    public void drive() {
        System.out.println("Sports driving capability");         // Duplicated Common Functionality
    }
 }

class GoodsVehicle extends Vehicle {

 }