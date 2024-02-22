/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2024
 * File Name: DeliveryRequest.java
 * Description: Request structure class by assignment2 to create new messages that will push to observers
 */
public class DeliveryRequest {
    private String message;
    /***constructor*/
    public DeliveryRequest(String message){
        this.message = message;
    }

    /***getter*/
    public String getMessage() {
        return message;
    }
}
