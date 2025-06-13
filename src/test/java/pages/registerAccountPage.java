package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;


import static utility.sharedData.email;

public class registerAccountPage extends BrowserDriver {
    public static String emailAddressTextBox = "//input[@type=\"text\"]";
    public static String checkbox = "//span[@class=\"label-content\"]";
    public static String continueButton = "//button[@class=\"bigger filled marked filled continue-button button\"]";

    //actions
    public static void setEmailAddressTextBox(String email) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(emailAddressTextBox)).sendKeys(email);
    }
    public static void acceptCheckbox()  {
    driver.findElement(By.xpath(checkbox)).click();
}
    public static void clickContinueButton() {
        driver.findElement(By.xpath(continueButton)).click();
    }
}
