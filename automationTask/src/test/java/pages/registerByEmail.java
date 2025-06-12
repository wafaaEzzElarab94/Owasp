package pages;

import org.openqa.selenium.By;
import utility.browserDriver;

public class registerByEmail extends browserDriver {
    public static String firstNameTextBox = "//input[@name=\"firstName\"]";
    public static String lastNameTextBox = "//input[@name=\"lastName\"]";
    public static String passwordTextBox = "//input[@name=\"password\"]";
    public static String emailCheckbox = "//div[@class=\"InputElement hasAgreedWithTermsHolder fullWidth autoHeight checkbox-input-type initialized\"]";
    public static String createAccountButton = "//button[@type=\"submit\"]";

    //actions
    public static void setFirstNameTextBox() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(firstNameTextBox)).sendKeys();
    }
    public static void setLastNameTextBoxNameTextBox() {
        driver.findElement(By.xpath(lastNameTextBox)).sendKeys();
    }
    public static void setPasswordTextBox()  {
        driver.findElement(By.xpath(passwordTextBox)).sendKeys();
    }
    public static void setEmailCheckboxcheckbox()  {
        driver.findElement(By.xpath(emailCheckbox)).click();
    }
    public static void clickOnCreateAccountButton()  {
        driver.findElement(By.xpath(createAccountButton)).click();
    }
}
