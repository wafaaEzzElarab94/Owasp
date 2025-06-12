package stepDefinition;

import io.cucumber.java.en.Given;

import static pages.HomePage.clickJoinButton;

public class BasePage {
    @Given("^the_user_opens_the_Juice_Shop_website$")
    public void user_navigate_to_homepage() throws Throwable{
        clickJoinButton();
    }

}

