package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;


public class glueupPage extends BrowserDriver {
    public static String LoginButton = "//a[@class=\"signin\"]";
    public static String RegisterNow = "//a[contains(text(), 'Register Now')]";


    public static void clickJoinButton() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(LoginButton)).click();
    }

    public static void clickRegisterNowButton() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(RegisterNow)).click();
    }
}
