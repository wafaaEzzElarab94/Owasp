package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static pages.loginPage.verifyPageHeader;
import static pages.registerAccountPage.*;
import static pages.registerByEmail.*;
import static utility.sharedData.*;

public class RegisterByEmail {
    @When("^the_user_set_firstname_lastname_and_password$")
    public void the_user_set_firstname_lastname_and_password() throws InterruptedException {
        setFirstNameTextBox(firstName);
        setLastNameTextBoxNameTextBox(lastName);
        setPasswordTextBox(password);
        setEmailCheckboxcheckbox();
        clickOnCreateAccountButton();
    }
    @Then("^the user should be redirected to the login screen$")
    public void user_should_be_redirected_to_the_login_screen() throws InterruptedException {
        String loginPageHeader = verifyPageHeader();
        assertEquals(loginPageHeader, "Log in to your account");
    }
}
