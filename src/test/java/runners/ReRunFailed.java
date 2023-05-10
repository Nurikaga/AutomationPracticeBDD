package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/report.html" //will create report
        },
        features = "@target/rerun.txt", //if you want to run failed scenarios from rerun do "@target/rerun.txt" for features
        glue = "step_definitions",
        stepNotifications = true
)
public class ReRunFailed {
}


