package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import utilities.Driver;

public class US1002_negativeLoginTestStepDefinitions {
    HomePage homePage = new HomePage();

    @Then("kullanici basarili giris yapılmadigini test eder")
    public void kullanici_basarili_giris_yapilmadigini_test_eder() {
        String actualUrl =Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://www.gittigidiyor.com/uye-girisi";
        Assert.assertTrue(actualUrl.equals(expectedUrl));
    }

}
