import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class KeyboardOperation
{
    public static void main(String[] args) throws AWTException, InterruptedException {
        System.setProperty("webdriver.chrome.driver","X:\\Selenium jar and drivers\\drivers\\ChromeDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        Robot robo = new Robot();
        robo.keyRelease(KeyEvent.VK_N);
        Thread.sleep(100);
        robo.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(100);
        driver.quit();
    }
}
