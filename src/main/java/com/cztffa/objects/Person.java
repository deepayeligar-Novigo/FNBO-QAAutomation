package com.cztffa.objects;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

	private String firstName;

	private String lastName;

	private String middleName;

	private String phoneNumber;

	private String email;

	private String ssn;

	private String dob;
    private String unknown;

	private String motherName;

	private String securityWord;

	private String streetAddress1;

	private String city;

	private String zip;
    private String state;
    private String county;


	private String homePhone;

	private String workPhone;

   //private String PrimaryPhone;


	private String occupation;
    private String WireActivity;

	private String employer;

    private String idType;

    private String identificationNumber;

	private String issueDate;

	private String suffix;

	private String expiryDate;

	private String citizenShip;
    private String stateIssued;

	private String prefferedContactMethod;

	private String employmentStatus;

	private String preferredId;

	private String membershipQualify;

	private String memberName;
    private String relationship;

	private List<Applicant> applicants;

	private Validation validation;

	private MemeberDeligence memeberDeligence;

	private AccountDetails accountDetails;

	private Funding funding;
	
	private String ownershipPercentage;
	
	private String submissionId;
}
