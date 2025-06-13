package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static utility.sharedData.*;

public class registerByEmail extends BrowserDriver {
    public static String firstNameTextBox = "//input[@name=\"firstName\"]";
    public static String lastNameTextBox = "//input[@name=\"lastName\"]";
    public static String passwordTextBox = "//input[@name=\"password\"]";
    public static String emailCheckbox = "//div[@class=\"InputElement hasAgreedWithTermsHolder fullWidth autoHeight checkbox-input-type initialized\"]";
    public static String createAccountButton = "//button[@type=\"submit\"]";

    //actions
    public static void setFirstNameTextBox(String Name) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(firstNameTextBox)).sendKeys(firstName);
    }
    public static void setLastNameTextBoxNameTextBox(String Name) {
        driver.findElement(By.xpath(lastNameTextBox)).sendKeys(lastName);
    }
    public static void setPasswordTextBox(String Password) throws InterruptedException  {

        driver.findElement(By.xpath(passwordTextBox)).sendKeys(password);
    }
    public static void setEmailCheckboxcheckbox()  {

        driver.findElement(By.xpath(emailCheckbox)).click();
    }
    public static void clickOnCreateAccountButton()  {

        driver.findElement(By.xpath(createAccountButton)).click();
    }
}
