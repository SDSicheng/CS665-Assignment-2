/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2024
 * File Name: DeliveryRequestTest.java
 * Description: Test class for DeliveryRequest class
 */
import junit.framework.TestCase;
import org.junit.Test;

public class DeliveryRequestTest extends TestCase {

    @Test
    public void testGetMessage() {
        String message = "Test message";
        DeliveryRequest deliveryRequest = new DeliveryRequest(message);
        assertEquals(message, deliveryRequest.getMessage());
    }

}