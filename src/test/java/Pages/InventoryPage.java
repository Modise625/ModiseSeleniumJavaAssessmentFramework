package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage {

    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"deviceType\"]")
    WebElement SelectDeviceType_xpath;
    @FindBy(id = "brand")
    WebElement SelectBrand_id;
    @FindBy(id = "storage-128GB")
    WebElement SelectStorage_id;
    @FindBy(id = "color")
    WebElement SelectColor_id;
    @FindBy(id = "quantity")
    WebElement EnterQuantity_id;
    @FindBy(id = "address")
    WebElement EnterAddress_id;
    @FindBy(id = "inventory-next-btn")
    WebElement ClickNextButton_id;
    @FindBy(id = "shipping-option-express")
    WebElement SelectShippingOption_id;
    @FindBy(id = "warranty-option-1yr")
    WebElement SelectYearWarrantyOption_id;
    @FindBy(id = "discount-code")
    WebElement EnterDiscountCode_id;
    @FindBy(id = "add-to-cart-btn")
    WebElement ClickAddToCartButton_id;
    @FindBy(id = "review-cart-btn")
    WebElement ClickReviewCartButton_id;
    @FindBy(id = "confirm-cart-btn")
    WebElement ClickConfirmCartButton_id;
    @FindBy(id = "view-history-btn")
    WebElement ClickViewHistoryButton_id;


    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectDeviceType() {
        SelectDeviceType_xpath.sendKeys("Phone");
    }

    public void selectBrand() {
        SelectBrand_id.sendKeys("iPhone");
    }

    public void selectStorage() {
        SelectStorage_id.sendKeys("128");
    }

    public void selectColor() {
        SelectColor_id.sendKeys("Gold");
    }

    public void enterQuantity() {
        EnterQuantity_id.sendKeys("3");
    }

    public void enterAddress() {
        EnterAddress_id.sendKeys("4040 Gunners street London 1989");
    }

    public void clickNextButton() {
        ClickNextButton_id.click();
    }

    public void clickAddToCartButton() {
        ClickAddToCartButton_id.click();
    }

    public void clickReviewCartButton() {
        ClickReviewCartButton_id.click();
    }

    public void clickViewHistoryButton() {
        ClickViewHistoryButton_id.click();
    }

}
