/*
 * Interface Segmentation Principle
 *  -   Interfaces should be such that, clients should not implement function that they dont wnat
 *  -   Solution: segment the interfaces to even smaller, focussed interfaces
 */

 interface RestaurantWorkers {
    public void takeOrders();
    public void washDishes();
    public void cookFood();
    public void serveCustomers();
 }

 class Waiter_ implements RestaurantWorkers {
    String name;
    int salary;

    @Override
    public void takeOrders() {  System.out.println("Taking Ordered"); }
    @Override
    public void washDishes() {  /* Not My Job */ }
    @Override
    public void cookFood() {  /* Not My Job */ }
    @Override
    public void serveCustomers() {  System.out.println("Serving Food"); }
 }

 class Chef_ implements RestaurantWorkers {
    String name;
    int salary;

    @Override
    public void takeOrders() {  /* Not My Job */ }
    @Override
    public void washDishes() {  /* Not My Job */ }
    @Override
    public void cookFood() {  System.out.println("Cooking Food"); }
    @Override
    public void serveCustomers() {  /* Not My Job */ }
 }
