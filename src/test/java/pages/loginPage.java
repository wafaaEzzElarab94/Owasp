package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;


import static utility.sharedData.email;

public class loginPage extends BrowserDriver {
    public static String loginTitle = "//h1[@class=\"loginTitle\"]";
    public static String emailAddress = "//input[@name=\"email\"]";
    public static String password = "//input[@name=\"password\"]";
    public static String loginButton = "//button[@type=\"submit\"]";
    public static String mailVerificationPopup = "//h1[contains(text(),'Verify Your Email Address')]";
    public static String mailVerificationOkButton = "//button[contains(text(),'OK')]";


//actions
public static String verifyPageHeader()  {
     String loginPageHeader =driver.findElement(By.xpath(loginTitle)).getText();
     return loginPageHeader;
    }
    public static void setEmailAddress(String email) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(emailAddress)).sendKeys(email);
    }
    public static void setPassword(String password){
        driver.findElement(By.xpath(password)).sendKeys(password);
    }
    public static void clickLoginButton()  {
        driver.findElement(By.xpath(loginButton)).click();
    }
    public static String checkMailVerificationPopup()  {
        String mailVerificationText= driver.findElement(By.xpath(mailVerificationPopup)).getText();
        return mailVerificationText;
    }
    public static void clickOnOKButton()  {
        driver.findElement(By.xpath(mailVerificationOkButton)).click();
    }
}

