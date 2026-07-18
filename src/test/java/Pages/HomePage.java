package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"overview-instructor\"]/img")
    WebElement instructorImage_xpath;
    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[3]/button")
    WebElement loginButton_xpath;


    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    public static void VerifyInstructorImageIsDisplayed() {
    }

    public void verifyInstructorImageIsDisplayed() {
        instructorImage_xpath.isDisplayed();
    }
    public void clickLoginButton_xpath() {
        loginButton_xpath.click();
    }


}
