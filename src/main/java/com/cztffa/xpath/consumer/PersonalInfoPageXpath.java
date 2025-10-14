package com.cztffa.xpath.consumer;

public class PersonalInfoPageXpath {
    public static final String DATEOFBIRTH = "//tf-expansion-panel//tf-date[@t-model='Party__r.BirthDate__c']//input";
    public static final String STREETADDRESS1 = "//div[@class='input-group tf-input-group']/input[@aria-labelledby='StreetAddress1-7-label']";
    public static final String SSN = "//tf-expansion-panel//[@t-model='Submission__c.PartyXrefs__r.%s']//tf-ssn[@t-model='Party__r.NationalIdentifierValue__c']/descendant::input";
    public static final String IDTYPE = "//tf-dropdown[@t-model='Type__c']/descendant::input";
    public static final String IDENTIFICATIONNUMBER = "//tf-expansion-panel//[@t-model='Submission__c.PartyXrefs__r.%s']//tf-input[@t-model='IdentificationNumber__c']/descendant::input";
    public static final String STATEISSUED = "//tf-expansion-panel//[@t-model='Submission__c.PartyXrefs__r.%s']//tf-dropdown[@t-model='IssuingState__c']/descendant::input";
    public static final String ISSUEDATE = "//tf-expansion-panel//[@t-model='Submission__c.PartyXrefs__r.%s']//tf-date[@t-model='IssueDate__c']/descendant::input";
    public static final String PERSONALINFONEXTBUTON = "//button[normalize-space()='Next']";
    public static final String STATEAPPLY = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Alaska')]";

    public static final String IDTYPEMILITARYAPPLY = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'Military')]";
    public static final String idTypeStateIdApply ="//div[@class='dropdown-item ng-star-inserted'][contains(text(),'State ID')]";
}
