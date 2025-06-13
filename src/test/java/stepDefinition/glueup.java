package stepDefinition;

import io.cucumber.java.en.When;

import static pages.glueupPage.clickJoinButton;
import static pages.glueupPage.clickRegisterNowButton;

public class glueup {
    @When("^the_user_should_see_the_glue-up_page$")
    public void user_should_see_the_glueup_page() throws  InterruptedException {
        clickJoinButton();
        clickRegisterNowButton();
    }
}
