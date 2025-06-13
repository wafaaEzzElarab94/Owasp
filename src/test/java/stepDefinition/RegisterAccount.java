package stepDefinition;

import io.cucumber.java.en.When;

import static pages.glueupPage.clickJoinButton;
import static pages.glueupPage.clickRegisterNowButton;
import static pages.registerAccountPage.*;
import static utility.sharedData.email;

public class RegisterAccount {
    @When("^ the_user_create_new_account_using_email_Only$")
    public void the_user_create_new_account_using_email_Only() throws  InterruptedException {
        setEmailAddressTextBox(email);
        acceptCheckbox();
        clickContinueButton();
    }
}
