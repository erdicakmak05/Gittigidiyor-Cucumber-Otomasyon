package stepdefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
public class Hooks {

    @After
    public void after(Scenario scenario) {
        if (scenario.isFailed()) {
            scenario.log("Scenario failed so capturing a screenshot");

            TakesScreenshot screenshot = (TakesScreenshot) Driver.getDriver();
            scenario.attach(screenshot.getScreenshotAs(OutputType.BYTES), "image/png", scenario.getName());
        }
        if (Driver.getDriver() != null) {
            Driver.getDriver().quit();
        }
    }
}