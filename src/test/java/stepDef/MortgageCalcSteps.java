package stepDef;

import base.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MortageHomepage;

public class MortgageCalcSteps extends BaseUtil {
    private BaseUtil base;
    public MortgageCalcSteps(BaseUtil base){this.base = base;}

    @Given("^i am on the mortgage calculator page$")
    public void iAmOnTheMortgageCalculatorPage() {
        base.driver.navigate().to("https://www.mortgagecalculator.org/");

    }

    @When("^i enter loan amount as (\\d+)$")
    public void iEnterLoanAmountAs(String amount) {
        MortageHomepage mortgageHomepage = new MortageHomepage(base.driver);
        mortgageHomepage.enterLoanAmount(amount);

    }

    @Then("^done$")
    public void done() {
        System.out.println("All done");
    }
}
