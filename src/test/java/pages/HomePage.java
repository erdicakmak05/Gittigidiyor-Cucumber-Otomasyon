package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    /*
    aut

     */

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@title='Giriş Yap']")
    public WebElement girisYapHoverElement;

    @FindBy(xpath = "//span[contains(text(),'Giriş Yap')]")
    public WebElement girisYapButtonHomePage;

    @FindBy(xpath = "//input[@id='L-UserNameField']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@id='L-UserNameField']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//input[@id='L-PasswordField']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//input[@id='gg-login-enter']")
    public WebElement girisYapLoginButton;

    @FindBy(xpath = "//div[@title='Hesabım']")
    public WebElement hesabimElement;
}
