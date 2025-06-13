package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {
    public static WebDriver driver;

    public ChromeOptions options;

    public BrowserDriver(){
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        this.driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://owasp.org/www-project-juice-shop/");
    }
    public void close(){

        this. driver.close();
    }
}
