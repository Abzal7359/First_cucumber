package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/features",
		glue = {"stepdefenations","hooks"},
		tags = "@all",
		
		plugin = {"pretty","html:target/CucumberReport.html"}
		)
public class MyRunnerTest extends AbstractTestNGCucumberTests{

}
