package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"login-heading\"]/span")
    WebElement loginPageTitle_xpath;
    @FindBy(id = "login-email")
    WebElement loginEmail_id;
    @FindBy(id = "login-password")
    WebElement EnterInvalidPassword_id;
    @FindBy(id = "login-submit")
    WebElement loginSubmit_id;

    @FindBy(id = "login-email")
    WebElement EmptyEmail_id;
    @FindBy(id = "login-password")
    WebElement EmptyPassword_id;
    @FindBy(id = "login-submit")
    WebElement LoginButton_id;

    @FindBy(id = "login-email")
    WebElement Email_id;
    @FindBy(id = "login-password")
    WebElement Password_id;
    @FindBy(id = "login-submit")
    WebElement LoginButton_id2;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[3]")
    WebElement LearnDropDownButton_xpath;
    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]")
    WebElement LearningMaterialButton_xpath;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/button/span[2]")
    WebElement MenuButton_xpath;
    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/div/button[3]/span[2]")
    WebElement LogOutButton_xpath;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public void verifyLoginPageTitleIsDisplayed() {
        loginPageTitle_xpath.isDisplayed();
    }


    public void enterLoginEmail() {
        loginEmail_id.sendKeys("Kgosi.Msekati@gmail.com");
    }

    public void EnterInvalidPassword_idIsDisplayed() {
        EnterInvalidPassword_id.sendKeys("1991**");
    }

    public void clickLoginSubmitButton() {
        loginSubmit_id.click();
    }

    public void enterEmptyEmail() {
        EmptyEmail_id.sendKeys("");
    }

    public void enterEmptyPassword() {
        EmptyPassword_id.sendKeys("");
    }

    public void clickLoginButton_id() {
        LoginButton_id.click();
    }

    public void enterEmail() {
        Email_id.sendKeys("Kgosi.Msekati@gmail.com");
    }

    public void enterPassword() {
        Password_id.sendKeys("Modise1991**");

    }

    public void clickLoginButton_id2() {
        LoginButton_id2.click();
    }
    public void clickLearnDropDownButton_xpath() {
        LearnDropDownButton_xpath.click();
    }

    public void clickLearningMaterialButton_xpath() {
        LearningMaterialButton_xpath.click();
    }

    // public void clickMenuButton_xpath() {

     //   MenuButton_xpath.click();
    }

// public void clickLogOutButton_xpath() {
     //   LogOutButton_xpath.click();



