package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import cucumber.api.junit.Cucumber;







@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\Feature",
		glue = {"StepDefn","Hooks"},
		plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json" },
		dryRun = false,
		monochrome = true,
		tags =  {"@E2ENew"}
//		tags =  {"@E2E", "@Sanity"} //AND
		)


public class Runner {

}
