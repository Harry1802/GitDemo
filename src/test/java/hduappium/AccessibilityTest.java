package hduappium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AccessibilityTest extends Baseclass {

    @Test
	public void accessibilityTest() throws MalformedURLException, InterruptedException {
        
    	WebElement ele = driver.findElement(By.xpath("(//android.widget.TextView)[2]"));
    	String str = ele.getAttribute("text");
    	if (str != null && !str.isEmpty()) {
            System.out.println("Alt text for the image: " + str);
        } else {
            System.out.println("Alt text is missing for the image.");
        }
        
        

        
    }
}

    