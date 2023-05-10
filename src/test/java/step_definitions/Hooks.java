package step_definitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.BrowserUtils;
import utils.CucumberLogUtils;

public class Hooks {

@Before
    public void setUp(Scenario scenario){
    CucumberLogUtils.initScenario(scenario);
    scenario.log(CucumberLogUtils.getLogTime() + "");
}
@After
    public void rearDown(Scenario scenario){
    if(BrowserUtils.checkDriverStatus() != null){
        if(scenario.isFailed()){
            CucumberLogUtils.logFail("Scenario failed", true);
        }else{
            CucumberLogUtils.logPass("Scenario passed", true);
        }
    }
   BrowserUtils.quitDriver();
}
}
