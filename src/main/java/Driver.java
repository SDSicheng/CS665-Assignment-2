/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2024
 * File Name: Driver.java
 * Description: The actual observer class
 */
public class Driver implements Observer{
    private String driverName;
    /***constructor*/
    public Driver(String driverName){
        this.driverName = driverName;
    }
    /***method to push update to all drivers*/
    @Override
    public void update() {
            System.out.println("Driver "+driverName+" received");
        }

}
