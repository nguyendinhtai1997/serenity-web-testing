package search;

import net.serenitybdd.screenplay.targets.Target;

class GoogleSearchForm {
    static Target SEARCH_FIELD = Target.the("search field").locatedBy("//*[@maxlength='2048']");
}