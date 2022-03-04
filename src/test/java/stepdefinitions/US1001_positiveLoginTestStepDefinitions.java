package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US1001_positiveLoginTestStepDefinitions {
    HomePage homePage = new HomePage();

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("URL"));
    }
    @Given("kullanici giris yap linkine tiklar")
    public void kullanici_giris_yap_linkine_tiklar() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(homePage.girisYapHoverElement).perform();
        homePage.girisYapButtonHomePage.click();
    }
    @Then("kullanici mail olarak {string} girer")
    public void kullanici_mail_olarak_girer(String mail) {
        homePage.emailTextBox.sendKeys(ConfigReader.getProperty(mail));
    }
    @Then("kullanici password olarak {string} girer")
    public void kullanici_password_olarak_girer(String password) {
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty(password));
    }
    @Then("kullanici giris yap butonuna tiklar")
    public void kullanici_giris_yap_butonuna_tiklar() {
        homePage.girisYapLoginButton.click();
    }
    @Then("kullanici basarili giris yaptigini test eder")
    public void kullanici_basarili_giris_yaptigini_test_eder() {
        Assert.assertTrue(homePage.hesabimElement.isDisplayed());
    }
    @Then("kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici username olarak {string} girer")
    public void kullaniciUsernameOlarakGirer(String arg0) {
        homePage.usernameTextBox.sendKeys(ConfigReader.getProperty("ValidUsername"));
    }
}
