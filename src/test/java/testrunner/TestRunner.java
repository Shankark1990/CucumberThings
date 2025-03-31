package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "feature/OrderPlace.feature",
        glue = "stepdefination",
        dryRun = false

)

public class TestRunner {
}
