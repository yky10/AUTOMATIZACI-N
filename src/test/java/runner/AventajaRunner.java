package runner;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/advantage.feature",
        glue = {"stepdefinitions"},
        snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE
)
public class AventajaRunner {


}
