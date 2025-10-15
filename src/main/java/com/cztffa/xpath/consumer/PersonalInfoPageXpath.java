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
    public static final String STATEAPPLY = "//div[@class='dropdown-item'][contains(text(),'Alaska')]";
    public static final String countyoptapply = "//div[@class='dropdown-item'][contains(text(),'Douglas')]";
    public static final String City = "//tf-input[@t-model='City__c']//input";
    public static final String State = "//tf-dropdown[@t-model='State__c']//input";
    public static final String County = "//tf-dropdown[@t-model='County__c']//input";
    public static final String Zip = "//tf-input[@t-model='ZipCode__c']//input";
    public static final String stateOptApply = "//div[@class='dropdown-item'][contains(text(),'Nebraska')]";
    public static final String IDTYPEMILITARYAPPLY = "//div[@class='dropdown-item'][contains(text(),'Military')]";
    public static final String idTypeStateIdApply = "//div[@class='dropdown-item ng-star-inserted'][contains(text(),'State ID')]";

<<<<<<< HEAD

}
=======
    public static final String IDTYPEMILITARYAPPLY = "//div[contains(text(),'Military')]";
    public static final String idTypeStateIdApply ="//div[@class='dropdown-item ng-star-inserted'][contains(text(),'State ID')]";
}
>>>>>>> 878906a17998d994d2f9afdf4688b9eafed2ecec
