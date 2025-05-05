package com.vaadin.testbenchexample;
import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.datepicker.testbench.DatePickerElement;
import com.vaadin.flow.component.radiobutton.testbench.RadioButtonGroupElement;
import com.vaadin.flow.component.select.testbench.SelectElement;
import com.vaadin.flow.component.textfield.testbench.TextAreaElement;
import com.vaadin.flow.component.textfield.testbench.TextFieldElement;
import com.vaadin.flow.component.upload.testbench.UploadElement;
import com.vaadin.testbench.TestBenchElement;
import com.vaadin.testbench.elementsbase.Element;

@Element( "entry-dialog-content" )
public class EntryDialogContent extends TestBenchElement {

	// Main Buttons

	protected ButtonElement okButton (){
		return $(ButtonElement.class).first();
	}
	protected ButtonElement closeButton (){
		return $(ButtonElement.class).last();
	}

	protected ButtonElement processButton (){
		return $(ButtonElement.class).first();
	}


	// Bank
	protected TextFieldElement getFinancialInstitutionName() {

		return $( TestBenchElement.class ).id( "FinancialInstitutionInfoSection" ).$( TextFieldElement.class ).id( "FinancialInstitutionName" );

	}
	protected TextFieldElement getAccountFirstName() {

		return $( TestBenchElement.class ).id( "FinancialInstitutionInfoSection" ).$( TextFieldElement.class ).id( "AccountFirstName" );

    }
	protected TextFieldElement getAccountLastName() {

		return $( TestBenchElement.class ).id( "FinancialInstitutionInfoSection" ).$( TextFieldElement.class ).id( "AccountLastName" );

	}
	protected TextFieldElement getAccountNumber() {

		return $( TestBenchElement.class ).id( "FinancialInstitutionInfoSection" ).$( TextFieldElement.class ).id( "AccountNumber" );

	}
	protected TextFieldElement getRoutingNumber() {

		return $( TestBenchElement.class ).id( "FinancialInstitutionInfoSection" ).$( TextFieldElement.class ).id( "RoutingNumber" );

	}
	protected SelectElement getPartyType() {
		return $( TestBenchElement.class ).id( "FinancialInstitutionInfoSection" ).$(SelectElement.class).id( "PartyType" );
	}
	protected SelectElement getAccountType() {
		return $( TestBenchElement.class ).id( "FinancialInstitutionInfoSection" ).$(SelectElement.class).id( "AccountType" );
	}


	// Notes
	protected ButtonElement addNoteButton(){
		return $(TestBenchElement.class).id( "mainContent" ).$( "note-list-view" ).first().$(ButtonElement.class).first();
	}
	protected ButtonElement DeleteNoteButton(){
		return $(ButtonElement.class).get( 2 );
	}
	protected TextAreaElement noteText(){
		return $(TestBenchElement.class).id( "mainContent" ).$( "note-list-view" ).first().$(TestBenchElement.class).id( "noteDetailDiv" ).$( "note-view" ).first().$(TextAreaElement.class).first();
	}
	protected ButtonElement attachButton(){
		return $(TestBenchElement.class).id( "mainContent" ).$( "note-list-view" ).first().$(TestBenchElement.class).id( "noteDetailDiv" ).$( "note-view" ).first().$(TestBenchElement.class).id( "viewContent" ).$(ButtonElement.class).id( "addButton" );
	}
	protected DatePickerElement expiresDate(){
		return $(TestBenchElement.class).id( "mainContent" ).$( "note-list-view" ).first().$(TestBenchElement.class).id( "noteDetailDiv" ).$( "note-view" ).first().$(TestBenchElement.class).id( "timesDiv" ).$(DatePickerElement.class).first();
	}
	protected SelectElement attachmentType(){
		return $(TestBenchElement.class).id( "mainContent" ).$( "note-list-view" ).first().$(TestBenchElement.class).id( "noteDetailDiv" ).$( "note-view" ).first().$(TestBenchElement.class).id( "attachmentTypeDiv" ).$(SelectElement.class).first();
	}
	protected UploadElement uploadFileButton(){
		return $(TestBenchElement.class).id( "mainContent" ).$( "note-list-view" ).first().$(TestBenchElement.class).id( "noteDetailDiv" ).$( "note-view" ).first().$(TestBenchElement.class).id( "uploadDiv" ).$(UploadElement.class).first();
	}


	// Suspense

	protected SelectElement suspenseSource(){
		return $(TestBenchElement.class).id( "mainContent" ).$(SelectElement.class).first();
	}
	protected SelectElement depositAccount(){
		return $(TestBenchElement.class).id( "mainContent" ).$(SelectElement.class).last();
	}
	protected TextFieldElement suspenseAmount(){
		return $(TestBenchElement.class).id( "mainContent" ).$(TextFieldElement.class).first();
	}
	protected DatePickerElement effectveDate() {
		return $(TestBenchElement.class).id( "mainContent" ).$(DatePickerElement.class).first();
	}

	//Beneficiary
	protected SelectElement selectBene (){
		return $(TestBenchElement.class).id("FldSec_1" ).$(SelectElement.class).id("PartyGUID");
	}
	protected TextFieldElement firstName (){
		return $(TestBenchElement.class).id("RoleInfo" ).$(TestBenchElement.class).id("sectionComponent").$(TextFieldElement.class).id("FirstName");
	}
	protected TextFieldElement lastName (){
		return $(TestBenchElement.class).id("RoleInfo" ).$(TextFieldElement.class).id("LastName");
	}
	protected SelectElement gender (){
		return $(TestBenchElement.class).id("RoleInfo" ).$(SelectElement.class).id("Gender");
	}
	protected DatePickerElement dob (){
		return $(TestBenchElement.class).id("RoleInfo" ).$(DatePickerElement.class).id("DateOfBirth");
	}
	protected TextFieldElement ssn (){
		return $(TestBenchElement.class).id("RoleInfo" ).$(TextFieldElement.class).id("SsnOrTaxID");
	}
	protected TextFieldElement email (){
		return $(TestBenchElement.class).id("Contact" ).$(TextFieldElement.class).id("Email");
	}
	protected TextFieldElement email2 (){
		return $(TestBenchElement.class).id("Contact" ).$(TextFieldElement.class).id("Email2");
	}
	protected TextFieldElement pnoneNumber (){
		return $(TestBenchElement.class).id("Contact" ).$(TextFieldElement.class).id("Phone1");
	}
	protected TextFieldElement phone2 (){
		return $(TestBenchElement.class).id("Contact" ).$(TextFieldElement.class).id("Phone2");
	}
	protected SelectElement phoneType1 (){
		return $(TestBenchElement.class).id("Contact" ).$(SelectElement.class).id("PhoneType1");
	}
	protected SelectElement phoneType2 (){
		return $(TestBenchElement.class).id("Contact" ).$(SelectElement.class).id("PhoneType2");
	}
	protected RadioButtonGroupElement defaultAddress (){
		return $(TestBenchElement.class).id("RoleInfo" ).$(RadioButtonGroupElement.class).first();
	}

	// PremiumTransaction
	protected TextFieldElement premiumAmount (){
		return $(TestBenchElement.class).id( "PremiumSection" ).$(TextFieldElement.class).id( "AmountRequested" );
	}
	protected TextFieldElement billingMonths (){
		return $(TestBenchElement.class).id( "PremiumSection" ).$(TextFieldElement.class).id( "BillingMonths" );
	}

	//0wner
	protected SelectElement relationship(){
		return $(TestBenchElement.class).id("RoleInfo" ).$(SelectElement.class).id("RelationshipType");
	}

	//other
	protected SelectElement roleType(){
		return $(TestBenchElement.class).id("FldSec_1" ).$(SelectElement.class).id("RoleType");
	}
	protected SelectElement relation(){
		return $(TestBenchElement.class).id("FldSec_1" ).$(SelectElement.class).id("RelationToPrimaryInsured");
	}
	protected DatePickerElement effectiveDate (){
		return $(TestBenchElement.class).id("FldSec_1" ).$(DatePickerElement.class).id("EffectiveDate");
	}

	// Loan
	protected TextFieldElement loanAmount (){
		return $(TestBenchElement.class).id( "InputsSection" ).$( TextFieldElement.class).id( "AmountRequested" );
	}
	protected SelectElement disbursementMethod (){
		return $(TestBenchElement.class).id( "InputsSection" ).$( SelectElement.class).id( "DisbursementMethod" );
	}

	//Rider

	protected SelectElement coverageName (){
		return $(TestBenchElement.class).id( "BenefitsChangeSection" ).$( SelectElement.class).id( "CoverageProductCodeBeingUpdated" );
	}
	protected TextFieldElement faceAmount(){
		return $ (TestBenchElement.class).id( "BenefitsChangeSection" ).$( TextFieldElement.class).id( "FaceAmount" );
	}
	protected ButtonElement addInsured(){
		return $ (TestBenchElement.class).id("FamilyMemberSection").$("TABLE-COMPONENT").first().$(ButtonElement.class).first();
	}


	protected SelectElement partyGUID(){

		return $ (TestBenchElement.class).id("S0").$(SelectElement.class).first();
	}
	protected DatePickerElement DOB (){
		return $ (TestBenchElement.class).id("S0").$("SECTION-COMPONENT").first().$ (TestBenchElement.class).id("section").$(DatePickerElement.class).id("DateOfBirth");
	}



	public void addBeneficiary (String firstName,String lastName,String ssn,String email,String phoneNumber,String phone2number,String email2){
		firstName().sendKeys(firstName);
		lastName().sendKeys(lastName);
		ssn().setValue(ssn);
		email().sendKeys(email);
		pnoneNumber().setValue(phoneNumber);
		phone2().setValue(phone2number);
		email2().sendKeys(email2);
	}


	public void addAccount(String bankName,String firstName,String lastName,String accountNumber,String routingNumber ){
		getFinancialInstitutionName().sendKeys( bankName );
		getAccountFirstName().sendKeys( firstName );
		getAccountLastName().sendKeys( lastName );
		getAccountNumber().sendKeys( accountNumber );
		getRoutingNumber().sendKeys( routingNumber );

	}

}
