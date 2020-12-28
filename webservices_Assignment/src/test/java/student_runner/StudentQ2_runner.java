package student_runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"},
		glue = {"student_stepDef"},
		features = {"src/test/resources/student_features"})

public class StudentQ2_runner {

}
