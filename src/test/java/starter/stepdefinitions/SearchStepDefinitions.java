package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.navigation.NavigateTo;
import starter.search.GoogleResult;
import starter.search.LookForInformation;

public class SearchStepDefinitions {

    @Given("{actor} is searching things on the internet")
    public void searchingThings(Actor actor) {
        actor.wasAbleTo(NavigateTo.theGoogleHomePage());
    }

    @When("{actor} input to search field {string}")
    public void searchesFor(Actor actor, String term) {
        actor.attemptsTo(
                LookForInformation.about(term)
        );
    }

    @Then("{actor} should see information about {string}")
    public void should_see_information_about(Actor actor, String term) {
        actor.attemptsTo(
                Ensure.that(GoogleResult.FIRST_TITLE).hasText(term)
        );
    }
}
