package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LearningMaterialPage {

    WebDriver driver;

    @FindBy(id = "practice-heading")
    WebElement VerifyLearningMaterialPageTitleIsDisplayed_id;
    @FindBy(xpath = "//*[@id=\"tab-btn-web\"]/span[2]")
    WebElement WebAutomationAdvanceButton_xpath;



    public LearningMaterialPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyLearningMaterialPageTitleIsDisplayed() {
        VerifyLearningMaterialPageTitleIsDisplayed_id.isDisplayed();
    }

    public void clickWebAutomationAdvanceButton_xpath() {
        WebAutomationAdvanceButton_xpath.click();
    }

}
