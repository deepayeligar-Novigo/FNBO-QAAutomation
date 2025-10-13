package com.cztffa.page.personalinfo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmbPersonalInfoPageModel {

    @FindBy(xpath = "//tf-dropdown[@t-model='Party__r.Suffix__c']/descendant::input")
    public WebElement suffixSelect;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Sr.')]")
    public WebElement suffixSrApply;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Jr.')]")
    public WebElement suffixJrApply;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'II')]")
    public WebElement suffixIIApply;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'III')]")
    public WebElement suffixIIIApply;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'IV')]")
    public WebElement suffixIVApply;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Permanent Resident Alien')]")
    public WebElement citizenshipAlienApply;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Citizen')]")
    public WebElement citizenshipCitizenOptApply;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Arizona')]")
    public WebElement stateOptApply;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Mobile Phone')]")
    public WebElement preferredContactMobileApply;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Home Phone')]")
    public WebElement preferredContactHomeApply;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Employed')]")
    public WebElement employmentEmployedApply;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'unemployed')]")
    public WebElement employmentUnEmployedApply;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Disabled')]")
    public WebElement employmentDisabledApply;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Retired')]")
    public WebElement employmentRetiredApply;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Homemaker')]")
    public WebElement employmentHomeMakerApply;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Minor')]")
    public WebElement employmentHomeMinorApply;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Military')]")
    public WebElement idTypeMilitaryApply;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Drivers License')]")
    public WebElement idTypeDriverLicenceApply;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'State ID')]")
    public WebElement idTypeStateIdApply;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Passport')]")
    public WebElement idTypePassportApply;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Resident Alien Card')]")
    public WebElement idTypeResidentAlienApply;

    @FindBy(xpath = "//button[@class='btn btn-primary float-end tf-step-action-next']")
    public WebElement personalInfoNextButon;

    @FindBy(xpath = "//tf-dropdown[@t-model='Type__c']")
    public WebElement flagPinfoID;

    @FindBy(xpath = "//button[normalize-space()='Add a Person']")// accessibility removed
    public WebElement addAdditionalApplicantButton;

    @FindBy(xpath = "//button[normalize-space()='Proceed without prefill']")
    public WebElement proceedWithoutPrefillBtn;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Albania')]")
    public WebElement citizenshipCountryApply;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Yes')]")
    public WebElement willingFreignApply;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Alaska')]")
    public WebElement stateApply;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Owner')]")
    public WebElement relationSelect;

    @FindBy(xpath = "//div[contains(text(),' 12300 Bermuda Road, Henderson, NV, USA ')]")
    public WebElement address1Text;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Proprietor')]")
    public WebElement relationSelectProprietor;

    @FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Primary Contact')]")
    public WebElement relationSelectPrimaryContact;

    @FindBy(xpath = "//button[contains(text(), 'Start Application')]")
    public WebElement startApplicationButton;




    @FindBy(xpath = "(//tf-dropdown[@t-model='Employment_Status']//input)")
    public WebElement employmentStatus;

    //*[@id="tf-input-4-input"]
    @FindBy(xpath = "//tf-input[@t-model='Party__r.FirstName__c']//input")
    public WebElement fName;
    @FindBy(xpath = "//tf-input[@t-model='Party__r.LastName__c']//input")
    public WebElement lName;

    @FindBy(xpath = "//tf-phone[@t-model='Party__r.PrimaryPhone__c']//input")
    public WebElement phoneNumber;

    @FindBy(xpath = "//tf-email[@t-model='Party__r.PrimaryEmail__c']//input")
    public WebElement personalEmail;

    @FindBy(xpath="//tf-checkbox[@t-model='Accepted__c']//input")
    public WebElement acceptPolicy;
    @FindBy(xpath = "//button[contains(text(),'Accept')]")
    public WebElement acceptBtn;

    public String selectionYes="//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-declaration[@t-model='Party__r']//input[@value='Yes']" ;

    public String firstName = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='Party__r.FirstName__c']/descendant::input";
    public String middleName = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='Party__r.MiddleName__c']/descendant::input";
    public String lastName = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='Party__r.LastName__c']/descendant::input";
    public String dateOfBirth = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-date[@t-model='Party__r.BirthDate__c']//input";
    public String citizenship = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='Party__r.Citizenship__c']/descendant::input";
    public String streetAddress1 = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-address[@t-model='Party__r.AddressXrefs__r.0.Address__r']//tf-input[@t-model='Line1__c']/descendant::input";
    public String city = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='City__c']//input";
    public String state = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='State__c']/descendant::input";
    public String zip = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='ZipCode__c']//input";
    public String prefferedContact = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='Party__r.PreferredContactMethod__c']/descendant::input";
    public String mobilePhone = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-phone[@t-model='Party__r.PrimaryPhone__c']//input";
    public String homePhone = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-phone[@t-model='Party__r.TertiaryPhoneNumber__c']//input";
    public String workPhone = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-phone[@t-model='Party__r.SecondaryPhone__c']//input";
    public String email = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-email[@t-model='Party__r.PrimaryEmail__c']//input";
    public String employment = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='Party__r.Employments__r.0.Type__c']/descendant::input";
    public String employer = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='Party__r.Employments__r.0.EmployerName__c']//input";
    public String occupation = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='Party__r.Employments__r.0.Occupation__c']//input";
    public String ssn = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-ssn[@t-model='Party__r.NationalIdentifierValue__c']//input";
    public String idType = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='Type__c']/descendant::input";
    public String idNumber = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='IdentificationNumber__c']//input";
    public String mother = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='Party__r.MothersMaidenName__c']//input";
    public String securityWord = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='Party__r.CZSecurityWord__c']//input";
    public String issueDate = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-date[@t-model='IssueDate__c']//input";
    public String expiryDate = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-date[@t-model='ExpirationDate__c']//input";
    public String citizenshipCountry = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='Party__r.CountryOfCitizenship__c']//input";
    public String willingForeign = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='Party__r.CZAffiliatedWithForeignGoverment__c']//input";
    public String formerOccupation = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='Party__r.Employments__r.0.Occupation__c']//input";
    public String stateIssued = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='IssuingState__c']//input";
    public String countryIssued ="//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='IssuingCountry__c']//input";
//    public String relationCode = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='RelationCode__c']//input";
    //	String addAddittionalApplicant = "//tf-expansion-panel//div[@t-model='Submission__c.PartyXrefs__r.%s']//tf-date[@t-model='ExpirationDate__c']//input";
    public String relation ="//div[@class='dropdown-item ng-star-inserted'][contains(text(),'%s')]";
    public String addressText="(//div[contains(text(),'%s')])[1]";
    //validation
    public String selectRelation = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='RelationCode__c']//input";
    public String getRelationionshipOfPerson="//div[@class='dropdown-item ng-star-inserted'][contains(text(),'%s')]";



    @FindBy(xpath = "//small[contains(text(),'Mother’s Maiden Name')]")
    public WebElement motherMaidenNameError;

    @FindBy(xpath = "//small[contains(text(),'Security Word')]")
    public WebElement securityWordError;

    @FindBy(xpath = "//small[contains(text(),'Date of Birth (MM/DD/YYYY)')]")
    public WebElement dobError;

    @FindBy(xpath = "//small[contains(text(),'Citizenship')]")
    public WebElement citizenshipError;

    @FindBy(xpath = "//small[contains(text(),'Street Address 1')]")
    public WebElement streetAddressError;

    @FindBy(xpath = "//small[contains(text(),' City')]")
    public WebElement cityError;

    @FindBy(xpath = "//small[contains(text(),'State')]")
    public WebElement stateError;

    @FindBy(xpath = "//small[contains(text(),'Zip')]")
    public WebElement zipError;

    @FindBy(xpath = "//small[contains(text(),'Preferred Contact')]")
    public WebElement preferredContactError;

    @FindBy(xpath = "//small[contains(text(),'Employment Status')]")
    public WebElement employeeStatusError;

    @FindBy(xpath = "//small[contains(text(),'Social Security Number')]")
    public WebElement ssnError;

    @FindBy(xpath = "//small[contains(text(),'Identification Number')]")
    public WebElement idError;

    @FindBy(xpath = "//small[contains(text(),'State Issued')]")
    public WebElement stateIssueError;

    @FindBy(xpath = "//small[contains(text(),'Issue Date')]")
    public WebElement issueDateError;

    @FindBy(xpath = "//small[contains(text(),'Expiration Date')]")
    public WebElement expirationError;

    @FindBy(xpath = "//input[@type='text' and @inputmode='decimal' and @class='form-control']")
    public WebElement percentage;

}
