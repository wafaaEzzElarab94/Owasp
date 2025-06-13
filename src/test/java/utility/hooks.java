package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class hooks {
    public static WebDriver driver;

    public ChromeOptions options;

    @Before
    public void setUP() {
        this.driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
