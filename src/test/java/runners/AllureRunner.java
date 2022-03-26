package runners;

import courgette.api.CourgetteOptions;
import courgette.api.CourgettePlugin;
import courgette.api.CourgetteRunLevel;
import courgette.api.CucumberOptions;
import courgette.api.junit.Courgette;
import org.junit.runner.RunWith;

@RunWith(Courgette.class)
@CourgetteOptions(
        threads = 1,
        runLevel = CourgetteRunLevel.SCENARIO,
        rerunFailedScenarios = false,
        showTestOutput = true,
        reportTargetDir = "build",
        environmentInfo = "browser=chrome; git_branch=master; project_info=Courgette-JVM is awesome!",
        cucumberOptions = @CucumberOptions(
                features = "src/test/resources/features",
                glue = "stepdefinitions",
                tags = {"@us01"},

                plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
        ))
public class AllureRunner {
        //allure serve
}
