package com.cztffa.page.review;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmbReviewPageModel {
    @FindBy(xpath = "(//tf-checkbox[@t-model='Accepted__c']//input)")
    public WebElement termAndConditions;


    @FindBy(xpath = "//tf-checkbox[@t-model='Accepted__c']//label")
    public WebElement termAndConditionsLabel;

    @FindBy(xpath = "//button[@class=\"btn btn-primary d-block w-100 mw-490 m-auto tf-step-action-next\"]")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@t-model='Accepted__c']//tf-checkbox")
    public WebElement IHaveReadCheckBox;

    @FindBy(xpath = "//div[@t-model='Disclosures__r.%s']//tf-checkbox")
    public WebElement IHaveReadDisclosure;

    @FindBy(xpath = "//p[contains(text(),'Submission')]")
    public WebElement successMsg;

    @FindBy(xpath = "//small[contains(text(),'is required')]")
    public WebElement isRequiredError;

    public String disclosureCheckbox="//div[@t-model='Disclosures__r.%s']//tf-checkbox//input";
}
