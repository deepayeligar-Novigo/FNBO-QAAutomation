package com.cztffa.page.account;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SmbAccountDetailsPageModel {

    @FindBy(xpath = "//div[contains(@class, 'd-flex') and contains(@class, 'justify-content-start')]/h2[text()='Business CD']")
    public WebElement BusinessCdInfo;

    @FindBy(xpath = "//div[@class='input-group tf-input-group']//input[@type='text' and starts-with(@aria-labelledby, 'CertificateTerm') and @role='combobox']")
    public WebElement certificateTerm;

    @FindBy(xpath = "//div[contains(@class, 'dropdown-item ng-star-inserted') and contains(text(), '12 months 4.20%')]")
    public WebElement certificateTermSelect;

    @FindBy(xpath = "//div[@class='input-group tf-input-group']//input[@type='text' and @inputmode='decimal' and starts-with(@aria-labelledby, 'Amount')]")
    public WebElement amountToEnter;

    @FindBy(xpath = "//button[@class='btn btn-primary float-end tf-step-action-next']")
    public WebElement accountDetailsNextButon;


    @FindBy(xpath = "//h2[contains(text(),'Everyday Checking')]")
    public WebElement everyDayCheckingClick;

    @FindBy(xpath = "//label[contains(text(), 'Do you want to add a debit card?')]/ancestor::div[@class='tf-checkbox-layout tf-left-label']//input")
    public WebElement debitCardToggleButton;

    @FindBy(xpath = "//tf-input[@t-model='CZNickname__c']//input")
    public WebElement nickNameTextBox;

    @FindBy(xpath = "//tf-select-button[@class='col tf-select-button']//img[contains(@src,'OrangeKnoxvilleMapDebit')]")
    public WebElement orangeVisaDebitCard;

    @FindBy(xpath = "//label[contains(text(), 'Linked Overdraft Protection')]/ancestor::div[@class='tf-checkbox-layout tf-left-label']//input")
    public WebElement linkedOverdraftToggleButton;

    @FindBy(xpath = "//label[contains(text(), 'Do you want to add a beneficiary?')]/ancestor::div[@class='tf-checkbox-layout tf-left-label']//input")
    public WebElement addBeneFiciaryButton;

    @FindBy(xpath = "//label[contains(text(), 'Alert')]/ancestor::div[@class='tf-checkbox-layout tf-left-label']//input")
    public WebElement alertButton;

    @FindBy(xpath = "//button[@class='btn btn-outline-primary']")
    public WebElement addLinkedOverDraftProtection;

    @FindBy(xpath = "//div[contains(text(),'Overdraft Coverage')]//ancestor::div[@class='row ng-star-inserted']//tf-radio//input[@value='No']")
    public WebElement OverDraftCoverageNoCheckBox;

    @FindBy(xpath = "//tf-radio//label[contains(text(),'Email')]")
    public WebElement emailRadioButton;

    @FindBy(xpath = "//tf-radio//label[contains(text(),'Text')]")
    public WebElement textRadioButton;

    @FindBy(xpath = "//tf-radio//label[contains(text(),'Both')]")
    public WebElement bothRadioButton;

    @FindBy(xpath = "//tf-dropdown[@t-model='AccountNumber__c']/descendant::input")
    @CacheLookup
    public WebElement accountNumberSelect;

    @FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'Everyday')]")
    @CacheLookup
    public WebElement accountNumberApply;

    @FindBy(xpath = "//tf-checkbox[@t-model='Accepted__c']//input")
    public WebElement acceptCheckBox;

    @FindBy(xpath = "//button[@class='btn btn-primary float-end tf-step-action-next']")
    public WebElement accountDetailsNextButton;

    @FindBy(xpath = "//h2[contains(text(),'Premier Checking')]")
    public WebElement checkingSection;

    @FindBy(xpath = "//h2[contains(text(),'Basic Savings')]")
    public WebElement basicSavingsSection;

    @FindBy(xpath = "//h2[contains(text(),'Premier Certificate')]")
    public WebElement certificateSection;

    @FindBy(xpath = "//h2[contains(text(),'Business CD')]")
    public WebElement businesscdSection;

    @FindBy(xpath = "//tf-dropdown[@t-model='TermCode__c']/descendant::input")
    public WebElement certificateTermDrp;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'12')]")
    public WebElement certificateTermValue;

    @FindBy(xpath = "//div[@class='input-group tf-input-group']//input[@type='text' and @inputmode='decimal' and starts-with(@aria-labelledby, 'Amount')]")
    public WebElement certificateAmount;

    @FindBy(xpath = "//small[contains(text(),'Account Number is required')]")
    public WebElement accountNumberError;

    @FindBy(xpath = "//small[contains(text(),'is required')]")
    public WebElement acceptCheckBoxError;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    public WebElement closeButton;

    @FindBy(xpath = "//button[contains(text(),' Add  Debit Card ')]")
    public WebElement addDebitCardButton;

    @FindBy(xpath = "//small[contains(text(),'Use this account for overdraft protection')]")
    public WebElement overdraftProtectionError;

    @FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'Spouse')]")
    public WebElement beneficiaryRelashionshipApply;

    @FindBy(xpath = "//tf-account-number[@t-model='AccountNumber__c']//input")
    public WebElement accountNumberOverDraftProtectionTextBox;

    @FindBy(xpath = "//tf-checkbox[@t-model='Accepted__c']//input")
    public WebElement accountAcceptcheckBox;



    public String beneficiaryFirstName = "//div[@t-model='Beneficiaries__r.%s']//tf-input[@t-model='FirstName__c']//input";
    public String beneficiaryLastName = "//div[@t-model='Beneficiaries__r.%s']//tf-input[@t-model='LastName__c']//input";
    public String beneficiarySSN = "//div[@t-model='Beneficiaries__r.%s']//tf-ssn[@t-model='NationalIdentifierValue__c']//input";
    public String beneficiaryDob = "//div[@t-model='Beneficiaries__r.%s']//tf-date[@t-model='BirthDate__c']//input";
    public String beneficiaryRelashionship = "//div[@t-model='Beneficiaries__r.%s']//tf-dropdown[@t-model='RelationCode__c']//input";
    public String beneficiaryPercentage = "//div[@t-model='Beneficiaries__r.%s']//tf-number[@t-model='SharePercentage__c']//input";
    public String beneficiaryStreetAddress1 = "//div[@t-model='Beneficiaries__r.%s']//tf-input[@t-model='Line1__c']//input";
    public String beneficiaryCity = "//div[@t-model='Beneficiaries__r.%s']//tf-input[@t-model='City__c']//input";
    public String beneficiaryState = "//div[@t-model='Beneficiaries__r.%s']//tf-dropdown[@t-model='State__c']//input";
    public String beneficiaryZip = "//div[@t-model='Beneficiaries__r.%s']//tf-input[@t-model='ZipCode__c']//input";
    public String orangeCard = "//tf-select-button-group[@id='tf-select-button-group-%s']//tf-select-button[@class='col tf-select-button']//img[contains(@src,'OrangeKnoxvilleMapDebit')]";
    public String verticalCard = "//tf-select-button-group[@id='tf-select-button-group-1']//tf-select-button[@class='col tf-select-button']//img[contains(@src,'VerticalMountainsDebit')]";
    public String redCard = "//tf-select-button-group[@id='tf-select-button-group-1']//tf-select-button[@class='col tf-select-button']//img[contains(@src,'TNStateFlag')]";

}
