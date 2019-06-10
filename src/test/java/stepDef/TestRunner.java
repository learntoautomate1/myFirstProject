package stepDef;

        import org.junit.runner.RunWith;

        import cucumber.api.CucumberOptions;
        import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/featureFiles", plugin = { "pretty", "html:target/ReportsDestination"}, tags = "@AutomatedScenario")

public class TestRunner {
}

