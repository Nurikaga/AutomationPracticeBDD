package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {
                    "pretty",
                    "html:target/report.html", //will create report
                    "json:target/cucumber-reports/cucumber.json",
                    "rerun:target/rerun.txt", //will create a report containing any failed scenarios
            },
            features = "src/test/resources/features", //if you want to run failed scenarios from rerun do "@target/rerun.txt" for features
            glue = "step_definitions",
            stepNotifications = true,
            dryRun = false /*if true, it will only run all feature steps not implemented and implement them*/
            ,tags = "@IN-4d"

            //keywords
            //"and not" - 'x and not y' to exclude scenarios with that tag
            //"and" - 'x and y' to run scenarios with both tags
    )
    public class CukesRunner {
    }


