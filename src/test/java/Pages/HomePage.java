package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"overview-instructor\"]/img")
    WebElement instructorImage_xpath;


    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    public void verifyInstructorImageIsDisplayed() {
        instructorImage_xpath.isDisplayed();
    }


}
