package starter.search;

import net.serenitybdd.screenplay.targets.Target;

public class GoogleResult {
    public static final Target FIRST_TITLE = Target.the("article identifier").locatedByFirstMatching("//*[@class = 'LC20lb MBeuO DKV0Md']");
}
