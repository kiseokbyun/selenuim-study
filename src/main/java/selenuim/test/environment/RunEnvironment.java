package selenuim.test.environment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RunEnvironment {
    private static WebDriver driver = null;
    
    public static void setWebDriver(WebDriver driver) {
        if (RunEnvironment.driver == null) {
            RunEnvironment.driver = driver;
        }
    }
    
    public static WebDriver getWebDriver() {
        return RunEnvironment.driver;
    }
    
    public static WebElement findElement(By by) {
        return driver.findElement(by);
    }
}
