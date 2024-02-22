/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2024
 * File Name: Main.java
 * Description: Create instances and actual combine and put all these method to work and modify the delivery app
 */
public class Main {
    public static void main(String[] args) {
        /***one shop instance*/
        Shop shop = new Shop();

        /***Five driver instance*/
        Driver driver1 = new Driver("a");
        Driver driver2 = new Driver("b");
        Driver driver3 = new Driver("c");
        Driver driver4 = new Driver("d");
        Driver driver5 = new Driver("e");

        /***only register 4 to see if it works as expected*/
        shop.registerObserver(driver1);
        shop.registerObserver(driver2);
        shop.registerObserver(driver3);
        shop.registerObserver(driver4);
        shop.registerObserver(driver5);

        /***we remove driver3 from register driver*/
        shop.removeObserver(driver3);

        /***one deliveryRequest instance*/
        DeliveryRequest message = new DeliveryRequest("customer want a water from 711");

        /***get the message*/
        shop.receiveRequest(message);

        /***push the update to all registered drivers*/
        shop.notifyObserver();

    }
}
