package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target\\cucumber-html-report","json:target\\cucumber.json","junit:target\\cucumber.xml"},
        features = "src/test/resources/ViewFunctionality.feature",
        glue = "StepDefinitions",
        dryRun = false,
        monochrome = true


)
public class cukesRunner {
//src\test\resources\com.cucumber.features\RunnerTest.feature

}
