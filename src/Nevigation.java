import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nevigation
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","X:\\Selenium jar and drivers\\drivers\\ChromeDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");
        Thread.sleep(1000);
        driver.navigate().to("https://www.flipkart.com/");
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(500);
        driver.navigate().forward();
        Thread.sleep(500);
        driver.navigate().refresh();
        Thread.sleep(500);

        driver.quit();
    }
}
