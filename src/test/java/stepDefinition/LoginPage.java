package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static pages.loginPage.*;
import static utility.sharedData.email;

public class LoginPage {
    @When("User send the email address and password")
    public void User_send_the_email_address_and_password() throws InterruptedException {
        setEmailAddress(email);
        setPassword(password);
        clickLoginButton();
    }

    @Then("^User should be able to see verfication popup$")
    public void user_should_be_able_to_view_the_registration_page() {
        String mailVerificationText = checkMailVerificationPopup();
        assertEquals(mailVerificationText, "Verify Your Email Address");
    }
}
