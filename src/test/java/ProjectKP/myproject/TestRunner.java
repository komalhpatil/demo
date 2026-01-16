package ProjectKP.myproject;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Test.feature",
        glue = "ProjectKP.myproject",
        monochrome = true,
        tags = "@Happypath",
        plugin = {
                "pretty",
                "html:target/cucumber.html"
        }
)
public class TestRunner extends AbstractTestNGCucumberTests {

}


