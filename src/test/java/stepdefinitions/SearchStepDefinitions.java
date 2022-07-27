package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import navigation.NavigateTo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import search.GoogleResult;
import search.SearchInformation;

public class SearchStepDefinitions {

    @Given("{actor} is searching things on the internet")
    public void searchingThings(Actor actor) {
        actor.wasAbleTo(NavigateTo.theGoogleHomePage());
    }

    @When("{actor} input to search field {string}")
    public void searchesFor(Actor actor, String term) {
        actor.attemptsTo(
                SearchInformation.about(term)
        );
    }

    @Then("{actor} should see information about {string}")
    public void should_see_information_about(Actor actor, String term) {
        actor.attemptsTo(
                Ensure.that(GoogleResult.FIRST_TITLE).hasText(term)
        );
    }
}
