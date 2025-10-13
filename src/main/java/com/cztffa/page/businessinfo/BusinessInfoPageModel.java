package com.cztffa.page.businessinfo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessInfoPageModel {

	@FindBy(xpath = "//tf-dropdown[@t-model='Party__r.Suffix__c']/descendant::input")
	public WebElement suffixSelect;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'Sr.')]")
	public WebElement suffixSrApply;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'Jr.')]")
	public WebElement suffixJrApply;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'II')]")
	public WebElement suffixIIApply;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'III')]")
	public WebElement suffixIIIApply;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'IV')]")
	public WebElement suffixIVApply;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'Permanent Resident Alien')]")
	public WebElement citizenshipAlienApply;

	@FindBy(xpath = "//div[contains(@class, 'dropdown-item') and @role='option' and normalize-space(text())='Sole Proprietorship']")
	public WebElement businessTypeSelectSole;

	@FindBy(xpath = "//div[contains(@class, 'dropdown-item') and @role='option' and normalize-space(text())='Corporation']")
	public WebElement businessTypeSelectCorporation;

	@FindBy(xpath = "//div[contains(@class, 'dropdown-item') and @role='option' and normalize-space(text())='General Partnership']")
	public WebElement businessTypeSelectGenralPartnership;


	@FindBy(xpath = "//div[contains(@class, 'dropdown-item') and @role='option' and normalize-space(text())='Limited Liability Company']")
	public WebElement businessTypeSelectLlc;


	@FindBy(xpath = "//div[contains(@class, 'dropdown-item ng-star-inserted') and normalize-space()='Arizona']")
	public WebElement stateOptApply;

	@FindBy(xpath = "//button[contains(text(), 'Start Application')]")
	public WebElement startApplicationButton;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'Mobile Phone')]")
	public WebElement preferredContactMobileApply;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'Home Phone')]")
	public WebElement preferredContactHomeApply;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'Employed')]")
	public WebElement employmentEmployedApply;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'unemployed')]")
	public WebElement employmentUnEmployedApply;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'Disabled')]")
	public WebElement employmentDisabledApply;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'Retired')]")
	public WebElement employmentRetiredApply;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'Homemaker')]")
	public WebElement employmentHomeMakerApply;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'Minor')]")
	public WebElement employmentHomeMinorApply;

	@FindBy(xpath = "//div[contains(@class, 'dropdown-item') and normalize-space(text())='SSN']")
	public WebElement idTypeSSNApply;

	@FindBy(xpath = "//div[contains(@class, 'dropdown-item') and normalize-space(text())='TIN']")
	public WebElement idTypeTINApply;


	@FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Soybean Farming')]")
	public WebElement soybeanFarmingSelected;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'State ID')]")
	public WebElement idTypeStateIdApply;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'Passport')]")
	public WebElement idTypePassportApply;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'Resident Alien Card')]")
	public WebElement idTypeResidentAlienApply;

	@FindBy(xpath = "//button[@class='btn btn-primary float-end tf-step-action-next']")
	public WebElement businessInfoNextButon;

//	@FindBy(xpath = "//button[@class='btn btn-primary float-end tf-step-action-next']")
//	public WebElement personalInfoNextButon;

	@FindBy(xpath = "//tf-checkbox[@t-model='Accepted__c']//input")
	public WebElement termAndConditions;



	@FindBy(xpath = "//tf-checkbox[@t-model='Accepted__c']//label")
	public WebElement termAndConditionsLabel;

	@FindBy(xpath = "(//tf-checkbox[@t-model='Accepted__c']//input)[2]")
	public WebElement termAndConditions2;

	@FindBy(xpath = "(//tf-checkbox[@t-model='Accepted__c']//input)[3]")
	public WebElement termAndConditions3;

	@FindBy(xpath = "(//tf-checkbox[@t-model='Accepted__c']//input)[4]")
	public WebElement termAndConditions4;

	@FindBy(xpath = "(//tf-checkbox[@t-model='Accepted__c']//input)[5]")
	public WebElement disclosure;

	@FindBy(xpath = "//tf-dropdown[@t-model='Type__c']")
	public WebElement flagPinfoID;

	@FindBy(xpath = "//button[normalize-space()='Add a Person']")// accessibility removed
	public WebElement addAdditionalApplicantButton;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'Albania')]")
	public WebElement citizenshipCountryApply;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'Yes')]")
	public WebElement willingFreignApply;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'Alaska')]")
	public WebElement stateApply;

	@FindBy(xpath = "//div[contains(text(),' 12300 Bermuda Road, Henderson, NV, USA ')]")
	public WebElement address1Text;
	//*[@id="tf-input-4-input"]

	@FindBy(xpath = "//input[@type='text' and contains(@aria-labelledby, 'SSN')]")
	public WebElement ssn;

	@FindBy(xpath = "//input[@type='text' and contains(@aria-labelledby, 'TIN')]")
	public WebElement tin;

	public String businessName = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.1']//tf-input[@t-model='Party__r.LegalName__c']/descendant::input";
	public String businessType = "//label[contains(text(), 'Business Type')]/following::input[@role='combobox' and contains(@class, 'form-select')][1]";
//	public String dateOfEstablishment = "//*[@id=\"tf-date-0-input\"]";
    public String dateOfEstablishment="//div[contains(@class, 'tf-input-group')]//input[starts-with(@aria-labelledby, 'DateOfEstablishment') and @type='text']";
	public String citizenship = "//tf-expansion-panel//div[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='Party__r.Citizenship__c']/descendant::input";
	public String streetAddress1 = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.1']//tf-input[@t-model='Line1__c']/descendant::input";
	public String city = "//label[contains(text(), 'City')]/following::input[@type='text'][1]";
	public String state = "//input[@type='text' and @role='combobox' and contains(@class, 'form-control') and starts-with(@aria-labelledby, 'State-')]";
	public String zip = "//input[@placeholder='Zip' and contains(@class, 'form-control')]";
	public String prefferedContact = "//tf-expansion-panel//div[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='Party__r.PreferredContactMethod__c']/descendant::input";
	public String mobilePhone = "//input[@type='tel' and contains(@class, 'tf-phone-number')]";
	public String homePhone = "//tf-expansion-panel//div[@t-model='Submission__c.PartyXrefs__r.%s']//tf-phone[@t-model='Party__r.TertiaryPhoneNumber__c']//input";
	public String workPhone = "//tf-expansion-panel//div[@t-model='Submission__c.PartyXrefs__r.%s']//tf-phone[@t-model='Party__r.SecondaryPhone__c']//input";
	public String email = "//input[@type='email' and contains(@class, 'form-control')]";
	public String employment = "//tf-expansion-panel//div[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='Party__r.Employments__r.0.Type__c']/descendant::input";
	public String employer = "//tf-expansion-panel//div[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='Party__r.Employments__r.0.EmployerName__c']//input";
	public String occupation = "//tf-expansion-panel//div[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='Party__r.Employments__r.0.Occupation__c']//input";
//	public String ssn = "//*[@id=\"tf-ssn-1-input\"]";
	public String idType = "//input[contains(@class, 'form-select') and contains(@aria-labelledby, 'TaxIDType')]";
	public String idNumber = "//tf-expansion-panel//div[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='IdentificationNumber__c']//input";
//	public String naicsCode = "//*[@id=\"tf-dropdown-3-input\"]";
    public String naicsCode ="//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.1']//tf-dropdown[@t-model='Party__r.IndustryClassificationValue__c']/descendant::input";
	public String securityWord = "//tf-expansion-panel//div[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='Party__r.CZSecurityWord__c']//input";
	public String issueDate = "//tf-expansion-panel//div[@t-model='Submission__c.PartyXrefs__r.%s']//tf-date[@t-model='IssueDate__c']//input";
	public String expiryDate = "//tf-expansion-panel//div[@t-model='Submission__c.PartyXrefs__r.%s']//tf-date[@t-model='ExpirationDate__c']//input";
	public String citizenshipCountry = "//tf-expansion-panel//div[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='Party__r.CountryOfCitizenship__c']//input";
	public String willingForeign = "//tf-expansion-panel//div[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='Party__r.CZAffiliatedWithForeignGoverment__c']//input";
	public String formerOccupation = "//tf-expansion-panel//div[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='Party__r.Employments__r.0.Occupation__c']//input";
	public String stateIssued = "//tf-expansion-panel//div[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='IssuingState__c']//input";
	public String countryIssued ="//tf-expansion-panel//div[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='IssuingCountry__c']//input";
	public String relationCode = "//tf-expansion-panel//div[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='RelationCode__c']//input";
//	String addAddittionalApplicant = "//tf-expansion-panel//div[@t-model='Submission__c.PartyXrefs__r.%s']//tf-date[@t-model='ExpirationDate__c']//input";
	public String relation ="//div[@class='dropdown-item'][contains(text(),'%s')]";
//	public String addressText="//div[contains(text(),'%s')]";
    public String addressText="//div[contains(text(),'%s')]";
	//validation
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
}
