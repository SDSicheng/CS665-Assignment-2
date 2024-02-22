/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2024
 * File Name: Shop.java
 * Description: Request class structure by assignment2 and it is used to manage the real observer class and important
 * implementation detail included
 */
import java.util.ArrayList;
import java.util.List;

public class Shop implements Subject{

    private List<Observer> drivers = new ArrayList<Observer>();
    private String message;
    /***register new driver into arrylist like a subscriber*/

    @Override
    public void registerObserver(Observer observer) {
        drivers.add(observer);
    }

    /***you can remove the register driver if no longer needed*/
    @Override
    public void removeObserver(Observer observer) {
        drivers.remove(observer);
    }

    /***send message to all driver like send message to all subscribers*/
    @Override
    public void notifyObserver() {
        for (Observer driver : drivers) {
            if (subscribedYoN(driver)) {
                driver.update();
                System.out.println(message);
            }
        }
    }

    /***method to receive the new message*/
    public void receiveRequest(DeliveryRequest request){
        message = request.getMessage();
    }

    /***Implementation detail before notify, see if the driver is registered*/
    private boolean subscribedYoN(Observer observer){
        return drivers.contains(observer);
    }
}

