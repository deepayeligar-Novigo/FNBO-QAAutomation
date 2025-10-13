package com.cztffa.page.product;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SmbProductSelectorPageModel {
    @FindBy(xpath = "//tf-tabset[@class='tf-tabset']//button[contains(text(), 'CHECKING')]")
    public WebElement checkingTab;

    @FindBy(xpath = "//tf-tabset[@class='tf-tabset']//button[contains(text(), 'SAVINGS')]")
    public WebElement savingsTab;

    @FindBy(xpath = "//tf-tabset[@class='tf-tabset']//button[contains(text(), 'MONEY MARKET')]")
    public WebElement moneyMarketTab;

    @FindBy(xpath = "//tf-tabset[@class='tf-tabset']//button[contains(text(), 'SHARE CERTIFICATE')]")
    public WebElement shareCertificateTab;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-lg d-block w-100'][1]")
    public WebElement selectAddToCart;

    @FindBy(xpath = "//button[@id='tf-product-cart-1']")
    public WebElement cartBtn;

    @FindBy(xpath = "//tf-input[@t-model='memberName']//input")
    public WebElement memberName;

    @FindBy(xpath = "//tf-input[@t-model='Relationship']//input")
    public WebElement relationShip;

    @FindBy(xpath = "//tf-dropdown[@t-model='county_List']/descendant::input")
    @CacheLookup
    public WebElement countryDrApply;
    @FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'Blount')]")

    @CacheLookup
    public WebElement countryOptApply;

    @FindBy(xpath = "//tf-input[@t-model='Party__r.FirstName__c']//input")
    public WebElement firstName;

    @FindBy(xpath = "//tf-radio[@class='tf-radio']//input[@value='CZTFFA_Gives_Foundation']")
    public WebElement qualifyFoundationButton;

    @FindBy(xpath = "//tf-radio[@class='tf-radio']//input[@value='You_are_related_to_a_current_member']")
    public WebElement relatedToCurrentButton;

    @FindBy(xpath = "//tf-radio[@class='tf-radio']//input[@value='QualifyingCounty']")
    public WebElement qualifyCounty;

    @FindBy(xpath = "//tf-input[@t-model='Party__r.LastName__c']//input")
    public WebElement lastName;

    @FindBy(xpath = "//tf-phone[@t-model='Party__r.PrimaryPhone__c']//input")
    public WebElement phoneNumber;

    @FindBy(xpath = "//tf-email[@t-model='Party__r.PrimaryEmail__c']//input")
    public WebElement personalEmail;

    @FindBy(xpath="//tf-checkbox[@t-model='Accepted__c']//input")
    public WebElement acceptPolicy;

    @FindBy(xpath = "//input[@id='tf-checkbox-1-input']")
    public WebElement termAndConditions1;

    @FindBy(xpath = "//input[@id='tf-checkbox-2-input']")
    public WebElement termAndConditions2;

    @FindBy(xpath = "//div[@class='tf-checkbox-layout']//input")
    public WebElement termAndConditions3;


    //validation
    @FindBy(xpath = "//small[@id='tf-question-0-error']")
    public WebElement qualifyError1;

    @FindBy(xpath = "//small[@id='tf-question-1-error']")
    public WebElement qualifyError2;

    @FindBy(xpath = "//small[@id='tf-question-2-error']")
    public WebElement qualifyError3;

    @FindBy(xpath = "//small[contains(text(),'First Name')]")
    public WebElement firstNameError;

    @FindBy(xpath = "//small[contains(text(),'Last Name')]")
    public WebElement lastNameError;

    @FindBy(xpath = "//small[contains(text(),'Primary Phone')]")
    public WebElement primaryPhoneError;

    @FindBy(xpath = "//small[contains(text(),'Personal Email')]")
    public WebElement personalEmailError;

    //save resume functionality
    @FindBy(xpath = "//button[@tfstepaction='save']")
    public WebElement saveButton;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    public WebElement popupSaveButton;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    public WebElement popupContinue;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement gmailUserName;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement gmailPassword;

    @FindBy(xpath = "//span[contains(text(),'Next')]")
    public WebElement signinSubmit;

    @FindBy(xpath = "//a[contains(text(),'click here')]")
    public WebElement clickHereLink;

    @FindBy(xpath = "//span[contains(text(),'Login With Credentials')]")
    public WebElement loginWithCredentials;

    @FindBy(xpath = "//tf-input[@t-model='LastName__c']//input")
    public WebElement lastNameTextBox;

    @FindBy(xpath = "//tf-input[@t-model='Last4NationalIdentifierValue__c']//input")
    public WebElement lastFourSSNTextBox;

    @FindBy(xpath = "//tf-email[@t-model='PrimaryEmail__c']//input")
    public WebElement primaryEmailTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//tf-input[@t-model='zipCode']//input")
    public WebElement zipCodeTextbox;

    @FindBy(xpath = "//*[contains(text(),'Consumer')]")
    public WebElement clickConsumerTab;

    @FindBy(xpath = "//div[contains(text(),'Business')]")
    public WebElement clickBusinessTab;

    @FindBy(xpath = "//button[contains(text(),'Checkout')]")
    public WebElement checkOutBtn;

    @FindBy(xpath = "//button[contains(text(),'Proceed')]")
    public WebElement proceedBtn;

    @FindBy(xpath = "//button[normalize-space()='Proceed without prefill']")
    public WebElement proceedWithoutPrefillBtn;


}
