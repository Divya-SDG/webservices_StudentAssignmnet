package student_runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty",  "json:target/cucumber/cucumber.json"},
		glue = {"student_stepDef"},
		features = {"src/test/resources/student_features"})

public class StudentQ2_runner extends AbstractTestNGCucumberTests {

}
