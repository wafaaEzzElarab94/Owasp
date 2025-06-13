package pages;

import org.openqa.selenium.By;
import utility.browserDriver;

public class HomePage extends browserDriver {
    public static String JoinButton ="//a[@class=\"cta-button\"]";

    //actions
    public static void clickJoinButton(){
        driver.findElement(By.xpath(JoinButton)).click();
    }
}
