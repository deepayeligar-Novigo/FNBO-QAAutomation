package com.cztffa.page.gettingstarted;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmbGettingStartedPageModel {


    @FindBy(xpath = "//tf-input[@t-model='Party__r.FirstName__c']//input")
    public WebElement firstName;
    @FindBy(xpath = "//tf-input[@t-model='Party__r.LastName__c']//input")
    public WebElement lastName;

    @FindBy(xpath = "//tf-phone[@t-model='Party__r.PrimaryPhone__c']//input")
    public WebElement phoneNumber;

    @FindBy(xpath = "//tf-email[@t-model='Party__r.PrimaryEmail__c']//input")
    public WebElement personalEmail;

    @FindBy(xpath="//tf-checkbox[@t-model='Accepted__c']//input")
    public WebElement acceptPolicy;
    @FindBy(xpath = "//button[contains(text(),'Accept')]")
    public WebElement acceptBtn;
}
