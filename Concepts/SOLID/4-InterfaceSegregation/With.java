/*
 * Interface Segmentation Principle
 *  -   Interfaces should be such that, clients should not implement function that they dont wnat
 *  -   Solution: segment the interfaces to even smaller, focussed interfaces
 */

 interface WaiterInterface {
    public void takeOrders();
    public void serveCustomers();
 }

 interface ChefInterface {
    public void decideMenu();
    public void cookFood();
 }

 class Waiter implements WaiterInterface {
    String name;
    int salary;

    @Override
    public void takeOrders() {  System.out.println("Taking Ordered"); }
    @Override
    public void serveCustomers() {  System.out.println("Serving Food"); }
 }

 class Chef implements ChefInterface {
    String name;
    int salary;

    @Override
    public void decideMenu() {  System.out.println("Deciding menu"); }
    @Override
    public void cookFood() {  System.out.println("Cooking Food"); }
 }
