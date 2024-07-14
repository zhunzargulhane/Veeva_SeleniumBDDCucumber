package com.org.awesomecucumber.pages;

import com.org.awesomecucumber.base.BasePage;
import com.org.awesomecucumber.pages.components.HeadersAndMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CoreProductHomePage extends BasePage {
    private HeadersAndMenu headersAndMenu;

    public CoreProductHomePage(WebDriver driver) {
        super(driver);
        headersAndMenu = new HeadersAndMenu(driver);
    }

    public HeadersAndMenu getHeadersAndMenu() {
        return headersAndMenu;
    }
    @FindBy(xpath = "//div[contains(@class,'hover:cursor-pointer')]")
    private WebElement closingIconPopUp;

    public void closePopUp() {
        waitUntilVisibilityOfElement(closingIconPopUp).click();
    }

}
