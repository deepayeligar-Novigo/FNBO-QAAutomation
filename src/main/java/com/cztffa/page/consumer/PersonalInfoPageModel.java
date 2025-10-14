package com.cztffa.page.consumer;
import com.cztffa.xpath.consumer.PersonalInfoPageXpath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class PersonalInfoPageModel {
    private WebDriver driver;

    public PersonalInfoPageModel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String dateofBirth = "//tf-expansion-panel//tf-date[@t-model='Party__r.BirthDate__c']//input";
    
    public String streetAddress1 = "//div[@class='input-group tf-input-group']/input[@aria-labelledby='StreetAddress1-7-label']";
    
    public String ssn = "//tf-ssn[@t-model='Party__r.NationalIdentifierValue__c']/descendant::input";
    
    public String idType = "//tf-dropdown[@t-model='Type__c']/descendant::input";
    
    public String identificationNumber = "//tf-expansion-panel//[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='IdentificationNumber__c']/descendant::input";
    
    public String stateIssued = "//tf-expansion-panel//[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='IssuingState__c']/descendant::input";
    
    public String issueDate = "//tf-expansion-panel//[@t-model='Submission__c.PartyXrefs__r.%s']//tf-date[@t-model='IssueDate__c']/descendant::input";
    public String addressText="//div[contains(text(),'%s')]";

    @FindBy(xpath = PersonalInfoPageXpath.PERSONALINFONEXTBUTON)
    public WebElement personalInfoNextButon;

    @FindBy(xpath = PersonalInfoPageXpath.IDTYPEMILITARYAPPLY)
    public WebElement idTypeMilitaryApply;

    @FindBy(xpath = PersonalInfoPageXpath.STATEAPPLY)
    public WebElement stateApply;
    @FindBy(xpath = PersonalInfoPageXpath.idTypeStateIdApply)
    public WebElement idTypeStateIdApply;

}
