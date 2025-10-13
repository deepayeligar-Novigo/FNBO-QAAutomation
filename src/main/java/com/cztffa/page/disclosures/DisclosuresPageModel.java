package com.cztffa.page.disclosures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DisclosuresPageModel {

    @FindBy(xpath = "//button[normalize-space()='Sign']")
    public WebElement signBtn;

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    public WebElement continueBtn;

    @FindBy(xpath = "//div[@class='tab-text'][contains(text(),'Sign')]")
    public WebElement SigningBtn;

    @FindBy(xpath = "//button[normalize-space()='Adopt and Sign']")
    public WebElement adoptAndSignBtn;

    @FindBy(xpath = "//button[normalize-space()='Finish']")
    public WebElement finishBtn;

    @FindBy(xpath = "//button[normalize-space()='Submit Application']")
    public WebElement submitBtn;

}
