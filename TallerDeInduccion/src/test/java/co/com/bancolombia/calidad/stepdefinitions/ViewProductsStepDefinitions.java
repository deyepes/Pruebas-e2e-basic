package co.com.bancolombia.calidad.stepdefinitions;

import co.com.bancolombia.calidad.questions.ValidateLoginErrorMessage;
import co.com.bancolombia.calidad.tasks.LoginWith;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class ViewProductsStepDefinitions {

    @Before
    public void doBefore() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("User is on the login page")
    public void userIsOnTheLoginPage() {
        theActorCalled("Maryy").wasAbleTo(Open.url("https://www.saucedemo.com/"));
    }

    @When("User attempts to login with username {string} and password {string}")
    public void userAttemptsToLoginWithUsernameAndPassword(String username, String password) {
        theActorInTheSpotlight().attemptsTo(LoginWith.credetials(username, password));
    }

    @Then("he should be presented with the error message {string}")
    public void heShouldBePresentedWithTheErrorMessage(String message) {
        theActorInTheSpotlight().should(seeThat(ValidateLoginErrorMessage.withMessage(),equalTo(message)));
    }

}
