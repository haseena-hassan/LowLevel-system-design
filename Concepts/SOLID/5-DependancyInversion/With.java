/*
 * Dependancy Inversion Principle
 *  -   Class should depend on Interfaces rather than concrete classes
 */

 interface Keyboard {
    public void keyStroke();
 }

 interface Mouse {
    public void click();
    public void scroll();
 }

 class WiredKeyboard implements Keyboard {
    String model;
    String cableType;
    public void keyStroke() {   }
 }

 class BluetoothMouse implements Mouse {
    String model;
    String connectionType;
    public void click() {   }
    public void scroll() {   }
 }

 class BluetoothKeyboard implements Keyboard {
    String model;
    String cableType;
    public void keyStroke() {   }
 }

 class WiredMouse implements Mouse {
    String model;
    String connectionType;
    public void click() {   }
    public void scroll() {   }
 }

 class Macbook {
    private final Keyboard keyboard;
    private final Mouse mouse;

    public Macbook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
 }

 class Maain {
    public static void main() {
        Macbook myMacbook = new Macbook(new WiredKeyboard(), new BluetoothMouse());
        Macbook sistersMacbook = new Macbook(new BluetoothKeyboard(), new WiredMouse());
        Macbook officeMacbook = new Macbook(new WiredKeyboard(), new WiredMouse());
        Macbook oldMacbook = new Macbook(new BluetoothKeyboard(), new BluetoothMouse());
    }
 }