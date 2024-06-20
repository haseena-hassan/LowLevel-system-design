/*
 * Dependancy Inversion Principle
 *  -   Class should depend on Interfaces rather than concrete classes
 */

 class WiredKeyboard_ {
    String model;
    int cost;
    String cableType;
    String layout;
 }

 class BluetoothMouse_ {
    String model;
    int cost;
    String connectionType;
    int batteryLife;
 }

 class Computer {
    private final WiredKeyboard_ keyboard;
    private final BluetoothMouse_ mouse;

    public Computer(WiredKeyboard_ keyboard, BluetoothMouse_ mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
 }

 class Main {
    public static void main() {
        Computer myComputer = new Computer(new WiredKeyboard_(), new BluetoothMouse_());

        // Macbook cant be instantiated with bluetooth keyboard and bluetooth mouse
        // Macbook cant be instantiated with wired keyboard and wired mouse
    }
 }