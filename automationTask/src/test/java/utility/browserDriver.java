package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserDriver {
    public static WebDriver driver;

    public ChromeOptions options;

    public browserDriver(){
        options = new ChromeOptions();
        this.driver = driver;
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+
                "/src/test/resources/chromedriver.exe" );
        this.driver=new ChromeDriver();
        driver.get("https://owasp.org/www-project-juice-shop/");
    }
    public void close(){
        this. driver.close();
    }
}
