/*
 * Liskov Substitution Principle
 *  -   If B is a subclass of A : 
 *          => object(B) should be replacable with object(A)
 *          => without breaking the behaviour
 *  -   Sunclass should extend the capability
 *  -   Subclass should not be narrowing it down 
 */


 interface TwoWheeler {
    public void turnOnEngine();
    public void accelerate();
 }

 class Bike implements TwoWheeler {
    Boolean engineOn;
    int speed;

    @Override
    public void turnOnEngine() {
        engineOn = true;
    }

    @Override
    public void accelerate() {
        speed = speed + 10;
    }
 }

class Bicycle implements TwoWheeler {
    int speed;

    @Override
    public void turnOnEngine() {
        throw new AssertionError("Engine Not found");
    }

    @Override
    public void accelerate() {
        speed = speed + 5;
    }
}