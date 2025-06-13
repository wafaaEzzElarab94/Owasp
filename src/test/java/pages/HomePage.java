package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class HomePage extends BrowserDriver {
    public static String JoinButton ="//a[@class=\"cta-button\"]";

    //actions
    public static void clickJoinButton(){
        driver.findElement(By.xpath(JoinButton)).click();
    }
}
