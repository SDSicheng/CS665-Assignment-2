/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2024
 * File Name: ShopTest.java
 * Description: Junit test for Shop class
 */

import junit.framework.TestCase;
import org.junit.Test;


public class ShopTest extends TestCase {

    @Test
    public void testRegisterObserver() {
        Shop shop = new Shop();
        Observer observer = new Driver("a");
        shop.registerObserver(observer);
    }

    @Test
    public void testRemoveObserver() {
        Shop shop = new Shop();
        Observer observer = new Driver("b");
        shop.registerObserver(observer);
        shop.removeObserver(observer);
    }

    @Test
    public void testNotifyObserver() {
        Shop shop = new Shop();
        Observer observer = new Driver("c");
        shop.registerObserver(observer);
        DeliveryRequest request = new DeliveryRequest("Test message");
        shop.receiveRequest(request);
    }

}