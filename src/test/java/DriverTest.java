/**
 * Name: Sicheng Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2024
 * File Name: DriverTest.java
 * Description: Test class for Driver class
 */

import junit.framework.TestCase;
import org.junit.Test;

public class DriverTest extends TestCase {


    @Test
    public void testDriverClass(){
        Driver driver1 = new Driver("ab");
        assertNotNull(driver1);
    }

}