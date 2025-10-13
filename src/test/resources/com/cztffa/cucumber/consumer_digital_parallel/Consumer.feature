Feature: Review page flow

  @ConsumerFlow
  Scenario Outline: Happy flow of single applicant scenario "<submissionId>"
  Given : I am at the home page   
  When : I click on the consumer tab
  Then : I click on product for "<submissionId>"
  And : I click on the checkout
  Then : I should navigate to getting started page
  When : I provide the following details for "<submissionId>"
  And : I click on start Application
  And : I should navigate to personal details page
  When : I provide the below personal details for "<submissionId>"

  Then : I click on personal details next button
    When : I provide the below Cdd details for "<submissionId>"
  Then : I close promotion close button
  Then : I click on the overdraft Coverage no checkbox
  Then : I click on the account details next button
 And : I should see the funding page
 Then : I provide below funding details for "<submissionId>"
  Then : I click on funding details next button
 Then : I should accept the all terms and conditions 3
  And : I click on review details submit button
  And : I click on signable disclosures button
  Then : I should see the reference Id page.

  Examples:
    | submissionId |
    | 1            |

  


  
  
  #@Review
  #Scenario: Happy flow of multiapplicant scenario
    #Given : I am at the home page
    #When : I click on the consumer tab
    #Then : I click on "PremierChecking" product 
    #And : I click on the checkout
    #Then : I should navigate to getting started page
    #When : I provide the following details
      #| membershipQualify | test                 |
      #| firstName         | mult                 |
      #| lastName          | user                 |
      #| phoneNumber       |           3802387248 |
      #| email             | yterafinan@gmail.com |
    #Then : I select the accept option
    #And : click on start Application
    #Then : I should navigate to personal details page
    #When : I provide the below personal details
      #| firstName              | Siva                 |
      #| middleName             | Reddy                |
      #| lastName               | Kunduru              |
      #| phoneNumber            |           3802387248 |
      #| email                  | yterafinan@gmail.com |
      #| ssn                    |            133435437 |
      #| motherName             | Angel                |
      #| securityWord           | Security             |
      #| streetAddress1         |  12300 Bermuda Road, Henderson, NV, USA   |
      #| dob                    |             05051990 |
      #| city                   | Arizona              |
      #| zip                    |                32456 |
      #| homePhone              |           3802387247 |
      #| workPhone              |           3802387246 |
      #| occupation             | self employed        |
      #| employer               | test                 |
      #| identificationNumber   |             12345678 |
      #| issueDate              |             01012020 |
      #| expiryDate             |             01012026 |
      #| suffix                 | Sr                   |
      #| citizenShip            | citizen              |
      #| prefferedContactMethod | mobile               |
      #| employmentStatus       | Employed             |
      #| prefferedId            | Passport             |
      #| membershipQualify      | relate               |
      #| memberName             | TestUser             |
      #| relationship           | Brother              |
    #Then : I click on Additional applicant details
    #And : I provide the below additional applicant details
      #| firstName              | hari             |
      #| middleName             | K                |
      #| lastName               | hh               |
      #| phoneNumber            |       3802387248 |
      #| email                  | test1@gmail.com  |
      #| ssn                    |        133435438 |
      #| motherName             | Angel1           |
      #| securityWord           | Security1        |
      #| streetAddress1         |  12300 Bermuda Road, Henderson, NV, USA |
      #| dob                    |         05051990 |
      #| city                   | Arizona          |
      #| zip                    |            32456 |
      #| homePhone              |       3802387247 |
      #| workPhone              |       3802387246 |
      #| occupation             | self employed    |
      #| employer               | test             |
      #| identificationNumber   |         12345678 |
      #| issueDate              |         01012020 |
      #| expiryDate             |         01012026 |
      #| suffix                 | Sr               |
      #| citizenShip            | citizen          |
      #| prefferedContactMethod | mobile           |
      #| employmentStatus       | Employed         |
      #| prefferedId            | military         |
      #| relationship           |  Spouse          |
    #Then : I click on personal details next button
    #Then : I close promotion close button
    #Then : I click on the account details next button 
    #And : I should see the funding page
    #Then : I provide below funding details
#	    | sourceOfFunding | External Account |
#	    | bank            | Citibank Online  |
#	    | userId          | user_good        |
#	    | password        | pass_good        |
#	  Then : I click on the overdraft Coverage no checkbox
#	  Then : I click on the account details next button
#	  Then : I should accept the all terms and conditions 2
#	  And : I click on review details submit button
#	  Then : I should see the reference Id page.