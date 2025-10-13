package com.cztffa.page.funding;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmbFundingPageModel {
    @FindBy(xpath = "//tf-dropdown[@t-model='Type__c']/descendant::input")
    public WebElement sourceOfFundDrApply;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'External')]")
    public WebElement sourceOfFundOpApply;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Credit')]")
    public WebElement sourceOfFundCCApply;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Debit')]")
    public WebElement sourceOfFundDCApply;

    @FindBy(xpath = "//label[contains(text(),'Do you want to fund now?')]/ancestor::div[@class='tf-checkbox-layout tf-left-label ng-star-inserted']//div[@class='tf-switch-input-wrapper']//input")
    public WebElement fundingToggleButton;

    @FindBy(xpath = "//h4[.='Funding Details']")
    public WebElement fundingDetailsLabel;

    @FindBy(xpath = "//button[@class='btn btn-primary float-end tf-step-action-next']")
    public WebElement fundingNextButton;

    //html/body/app-root/div/main/app-consumer/div/tf-stepper/div/div[2]/tf-stepper-body/tf-consumer-account-details/form/div/div[3]/app-stepper-footer/div/div[1]/div[2]/button
    //*[@id="consumer"]/tf-stepper/div/div[2]/tf-stepper-body/tf-consumer-account-details/form/div/div[3]/app-stepper-footer/div/div[1]/div[2]/button
    //html/body/app-root/div/main/app-consumer/div/tf-stepper/div/div[2]/tf-stepper-body/tf-consumer-account-details/form/div/div[3]/app-stepper-footer/div/div[1]/div[2]/button

    @FindBy(xpath="//div[@class='tf-toast-message']")
    public WebElement floaterMsgValidation;

    @FindBy(xpath = "//button[contains(text(),' Verify with ')]")
    public WebElement btnPlaid;

    @FindBy(id = "plaid-link-iframe-1")
    public WebElement framePlaid;

    //*[@id="card-number"]/iframe
    //*[@id="card-number"]/iframe

    @FindBy(xpath = "//*[@title='CARD NUMBER']")
    public WebElement frameCardNumber;

    @FindBy(xpath = "//*[@title='CARD NAME']")
    public WebElement frameCardName;

    @FindBy(xpath = "//*[@title='CARD DATE']")
    public WebElement frameCardDate;

    @FindBy(xpath = "//*[@title='CARD CVV']")
    public WebElement frameCardCVV;

    @FindBy(xpath = "//*[@title='CARD POSTAL CODE']")
    public WebElement frameCardZip;

    @FindBy(xpath = "//*[@title='CARD STREET ADDRESS']")
    public WebElement frameCardStreet;

    @FindBy(xpath = "//tf-dropdown[@t-model='accountKey']/descendant::input")
    public WebElement drpAcNum;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Plaid Checking')]")
    public WebElement optAcNum;

    @FindBy(xpath = "//label[.=' How much would you like to transfer to your account? ']")
    public WebElement flagTrantoAcc;

    @FindBy(xpath="//label[contains(text(),'I acknowledge that I want to use Plaid to verify my external account')]//ancestor::div[@class='tf-checkbox-layout ng-star-inserted']//input")
    public WebElement acknowledgePalidToggle;

    @FindBy(xpath="//label[contains(text(),'I authorize the institution to perform Electronic Funds Transfer')]//ancestor::div[@class='tf-checkbox-layout ng-star-inserted']//input")
    public WebElement authorizePalidToggle;

    @FindBy (xpath="//*[@id=\"tf-radio-2-input\"]")
    public WebElement noOverdraft;

    @FindBy(xpath = "//span[.='Continue']")
    public WebElement btnAuthContinue;

    @FindBy(xpath = "//span[.='Continue as guest']")
    public WebElement btnAuthContinueGuest;

    @FindBy(xpath = "//*[@id=\"clover-btn\"]")
    public WebElement btnPay;

    @FindBy(xpath = "//input[@name='cardnumber' and @placeholder='Card Number']")
    public WebElement cardNumber;

    //*[@id="card-number"]

    @FindBy(xpath = "//input[@name='billingName' and @placeholder='Card Holder Name']")
    public WebElement cardHolder;

    @FindBy(xpath = "//input[@name='cc-exp' and @placeholder='MM/YY']")
    public WebElement cardExpiry;

    @FindBy(xpath = "//input[@name='cvc' and @placeholder='CVV']")
    public WebElement cvv;

    @FindBy(xpath = "//input[@name='postal' and @placeholder='Zip']")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@name='street-address' and @placeholder='Street Address']")
    public WebElement street;

    @FindBy(xpath = "//p[.='www.citi.com']")
    public WebElement selectBank;

    @FindBy(xpath = "//*[@id=\"username\"]")
    public WebElement txtUsername;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement txtPassword;

    @FindBy(xpath = "//*[@id=\"submit-credentials\"]")
    public WebElement btnAuthSubmit;

    @FindBy(xpath = "//*[@id=\"submit-device\"]")
    public WebElement btnAuthContinueAfter;

    @FindBy(xpath = "//*[@id=\"submit-code\"]")
    public WebElement btnAuthContinueAfterSuccess;

    @FindBy(xpath = "//*[@id=\"aut-button\"]")
    public WebElement btnLogin;

    @FindBy(xpath = "/html/body/main/div/div[4]/ul/li[1]/label/input")
    public WebElement checkbox;

    @FindBy(xpath = "//*[@id=\"submit-accounts\"]")
    public WebElement btnSubmit;

    @FindBy(xpath = "//*[@id=\"terms\"]")
    public WebElement checkboxTerms;

    @FindBy(xpath = "//*[@id=\"submit-confirmation\"]")
    public WebElement btnSubmitConfirm;

    @FindBy(xpath = "//*[@id=\"aut-secondary-button\"]")
    public WebElement btnContinue;

    //*[@id="aut-secondary-button"]/span
    //*[@id="aut-button"]

    //	button[@id="aut-ins_56"]
    public String plaidInstutionName ="//button[@aria-label='%s']";
}
