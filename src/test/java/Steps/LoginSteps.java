package Steps;

import io.cucumber.java.en.Given;


public class LoginSteps {
    @io.cucumber.java.en.
            Given("user is on login page")
    public void userIsOnLoginPage() {
        System.out.println("user is on login page");
        System.out.println("teachers day");
    }

    @io.cucumber.java.en.
            When("user enters user name and password")
    public void userEntersUserNameAndPassword() {
    }

    @io.cucumber.java.en.
            And("clicks on login button")
    public void clicksOnLoginButton() {
    }

    @io.cucumber.java.en.
            Then("User is navigated to the home page")
    public void userIsNavigatedToTheHomePage() {
    }

    @io.cucumber.java.en.
            Then("error message is displayed - invalid Credentials")
    public void errorMessageIsDisplayedInvalidCredentials() {
    }


    @Given("user calculated {int}+{int}")
    public void userCalculated(int arg0, int arg1) {
    }
}
