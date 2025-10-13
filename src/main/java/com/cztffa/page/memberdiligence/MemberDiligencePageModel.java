package com.cztffa.page.memberdiligence;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MemberDiligencePageModel {

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'None')]")
	@CacheLookup
	public WebElement domesticWiresNonepply;


	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	public WebElement closeButton;

	@FindBy(xpath = "//tf-dropdown[@t-model='CustomerTradeArea']//input")
	public WebElement tradeArea;

	@FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Local')]")
	public WebElement tradeLocal;


	@FindBy(xpath = "//button[@class='btn btn-primary float-end tf-step-action-next']")
	public WebElement personalInfoNextButon;

	@FindBy(xpath = "//tf-number[@t-model='NumberOfLocations']//input")
	public WebElement location;


	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'Less than quarterly')]")
	@CacheLookup
	public WebElement domesticWiresLessThanQuarterlyApply;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'Quarterly')]")
	@CacheLookup
	public WebElement domesticWiresQuarterlyApply;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'Monthly or more frequently')]")
	@CacheLookup
	public WebElement domesticWiresMonthlyApply;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'None')]")
	@CacheLookup
	public WebElement internationalWiresNonepApply;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'Less than quarterly')]")
	@CacheLookup
	public WebElement internationalWiresLessThanQuarterlyApply;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'Quarterly')]")
	@CacheLookup
	public WebElement internationalWiresQuarterlyApply;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'Monthly or more frequently')]")
	@CacheLookup
	public WebElement internationalWiresMonthlyApply;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'None')]")
	@CacheLookup
	public WebElement monetaryWiresNoneApply;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'Less than quarterly')]")
	@CacheLookup
	public WebElement monetaryWiresLessThanQuarterlyApply;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'Quarterly')]")
	@CacheLookup
	public WebElement monetaryWiresQuarterlyApply;

	@FindBy(xpath = "//div[@class='dropdown-item'][contains(text(),'Monthly or more frequently')]")
	@CacheLookup
	public WebElement monetaryWiresMonthlyApply;

	@FindBy(xpath = "//button[@class='btn btn-primary float-end tf-step-action-next']")
	public WebElement memeberDiligenceNextButton;

	@FindBy(xpath = "//button[@class='close']")
	public WebElement complementoryProdButton;

	@FindBy(xpath = "//button[@class='btn btn-primary float-end tf-step-action-next']")
	public WebElement accountDetailsNextButton;

	@FindBy(xpath = "/html/body/div[1]/div[3]/div/div[2]/div/div[2]/tf-modal-body/form/tfcz-recommendations/div/section/tf-carousel/div/div[1]/div[2]/div/tfcz-product-card/div/div[3]/div/div[2]/button")
	public WebElement jumpStartProductAddToCartButton;

	@FindBy(xpath = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.1']//span[contains(text(),'Related Person')]")
	public WebElement realtedPersonButton;

	@FindBy(xpath = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Self Employed')]")
	public WebElement selfEmployed;

	//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Self Employed')]

	public String domesticWiresXpath = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-due-diligence[@t-model='Party__r.DueDiligences__r.0'] //tf-dropdown[@t-model='Domestic_Wires']";
	public String internationalWiresXpath = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-due-diligence[@t-model='Party__r.DueDiligences__r.0'] //tf-dropdown[@t-model='International_Wires']";
	public String monetoryWiresXpath = "//tf-expansion-panel[@t-model='Submission__c.PartyXrefs__r.%s']//tf-due-diligence[@t-model='Party__r.DueDiligences__r.0'] //tf-dropdown[@t-model='Monetary_Instruments']";

}
