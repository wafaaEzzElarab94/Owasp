package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"utility", "stepDefinition"},
        plugin ={"pretty", "html:target/cucumber-html-report","json:cucumber.json"}
)
public class TestRunner {

}
