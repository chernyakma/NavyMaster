package com.vaadin.testbenchexample;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.vaadin.testbench.screenshot.ImageFileUtil;

public class AddNewBusinessSpiaIT extends BaseLoginTest {

	/*
	@Test
	public void addIllustration() throws InterruptedException {

		VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
		getSelectButton.getSelectItem().selectItemByIndex( 4 );
		SearchComponentView getFamily = $( SearchComponentView.class ).first();
		getFamily.searchByName().sendKeys( "Mouse" );
		getFamily.searchButton().click();
		getFamily.family().getCell( "Mouse" ).click();
		NaviMenuView newBusiness = $( NaviMenuView.class ).first();
		newBusiness.getNewBusiness().click();
		NewIllustrationView addNewBusiness = $( NewIllustrationView.class ).first();
		addNewBusiness.getProductType().selectByText( "Immediate Annuity" );
		addNewBusiness.getDepositAmount().sendKeys( Keys.chord( Keys.CONTROL, "a" ), "100000" );
		addNewBusiness.getInsured().selectItemByIndex( 0 );
		addNewBusiness.getOkButton().click();
		IllustrationView illustration = $( IllustrationView.class ).first();
		illustration.getAgentNumber().openPopup();
		illustration.getAgentNumber().sendKeys( Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN );
		illustration.getAgentNumber().sendKeys( Keys.ENTER );
		Assertions.assertEquals( "NM001 - Navy Mutual Default Agent", illustration.getAgentNumber().getSelectedText() );
		illustration.payOutOption().selectByText( "Period Certain" );
		illustration.paymentMode().selectByText( "Quarterly" );
		illustration.periodCertainYears().selectByText( "15 Year" );
		illustration.federalTaxWithholdingPercentage().sendKeys( Keys.chord( Keys.CONTROL, "a" ), "10" );
		illustration.disbursementMethod().selectByText( "ACH Disbursement" );
		Assertions.assertEquals( "Quarterly",illustration.paymentMode().getSelectedText() );
		Assertions.assertEquals( "15 Year",illustration.periodCertainYears().getSelectedText() );
		Assertions.assertEquals( "ACH Disbursement",illustration.disbursementMethod().getSelectedText() );
	//			illustration.getSaveButton().click();

	}

	@Test
	public void addApplication1() throws IOException {

		VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
		getSelectButton.getSelectItem().selectItemByIndex( 4 );
		SearchComponentView getFamily = $( SearchComponentView.class ).first();
		getFamily.searchByName().sendKeys( "Mouse" );
		getFamily.searchButton().click();
		getFamily.family().getCell( "Mouse" ).click();
		ScenarioView getApplication = $( ScenarioView.class ).first();
		getApplication.illustrationNumber().getCell( "424000226" ).click();
		NaviMenuView getReport = $( NaviMenuView.class ).first();
		getReport.getReport().click();
		IllustrationView apply = $( IllustrationView.class ).first();
		apply.getApplyButtonReport().click();
		Assert.assertTrue( testBench().compareScreen( ImageFileUtil.getReferenceScreenshotFile(
			"Screenshot 2024-07-09 114907.png" ) ) );
		VaadinConfirmDialogView confirm = $( VaadinConfirmDialogView.class ).first();
		confirm.getDeleteButton().click();

	}

	@Test
	public void addApplication2() throws Exception {

		VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
		getSelectButton.getSelectItem().selectItemByIndex( 5 );
		SearchComponentView getFamily = $( SearchComponentView.class ).first();
		getFamily.searchByName().sendKeys( "Palmer" );
		getFamily.searchButton().click();
		getFamily.family().getCell( "Palmer" ).click();
		ScenarioView getApplication = $( ScenarioView.class ).first();
		getApplication.applicationNumber().getCell( "424000035" ).click();
		NaviMenuView getDocument = $( NaviMenuView.class ).first();
		getDocument.getDocument().click();
		ApplicationView application = $( ApplicationView.class ).first();
		application.downloadButton().click();
		Thread.sleep( 3_000 );
		application.compareAndDeleteDownloadedPdf();

	application.applicationReceived().selectByText( "Yes" );
		Assertions.assertEquals( "Yes", application.applicationReceived().getSelectedText() );
		application.applicationReceivedDate().setDate( LocalDate.now() );
		application.applicationSignedDate().setDate( LocalDate.now() );
		application.applicationFundsReceived().selectByText( "Yes" );
		Assertions.assertEquals( "Yes", application.applicationFundsReceived().getSelectedText() );
		application.cashWithApplication().selectByText( "Yes" );
		Assertions.assertEquals( "Yes", application.cashWithApplication().getSelectedText() );
		application.cashWithApplicationReceivedDate().setDate( LocalDate.now() );
		application.threeDotsButton().click();
		WebElement noteList = findElement( By.xpath( "//*[@class='vaadin-menu-item']" ) );
		noteList.click();
		Thread.sleep( 3_000 );
		EntryDialogContent addNote = $( EntryDialogContent.class ).first();
		addNote.addNoteButton().click();
		addNote.noteText().setValue( "document 1" );
		addNote.expiresDate().setDate( LocalDate.of( 2024, 12, 12 ) );
		addNote.attachButton().click();
		addNote.attachmentType().selectByText( "Annuity Owner Questionnaire" );
		addNote.uploadFileButton().upload( new File( "C:\\Users\\MariiaCherniak\\Documents\\correspondence_CondolenceLetterDeferredAnnuity_20240524172728195.pdf" ) );
		Thread.sleep( 3_000 );
		addNote.attachButton().click();
		addNote.attachmentType().selectByText( "Final Application" );
		addNote.uploadFileButton().upload( new File( "C:\\Users\\MariiaCherniak\\Documents\\correspondence_CondolenceLetterDeferredAnnuity_20240524172728195.pdf" ) );
		Thread.sleep( 3_000 );
		addNote.attachButton().click();
		addNote.attachmentType().selectByText( "Sales Representative Disclosure" );
		addNote.uploadFileButton().upload( new File( "C:\\Users\\MariiaCherniak\\Documents\\correspondence_CondolenceLetterDeferredAnnuity_20240524172728195.pdf" ) );
		Thread.sleep( 3_000 );
		addNote.attachButton().click();
		addNote.attachmentType().selectByText( "Final Illustration" );
		addNote.uploadFileButton().upload( new File( "C:\\Users\\MariiaCherniak\\Documents\\correspondence_CondolenceLetterDeferredAnnuity_20240524172728195.pdf" ) );
		addNote.okButton().click();
		addNote.closeButton().click();
		NaviMenuView iGO = $( NaviMenuView.class ).first();
		iGO.checkIGO().click();
		Thread.sleep( 3_000 );
		Assert.assertTrue( testBench().compareScreen( ImageFileUtil.getReferenceScreenshotFile(
			"Screenshot 2024-06-04 171743.png" ) ) );
		ApplicationView getIssueButton = $( ApplicationView.class ).first();
		Assertions.assertTrue(getIssueButton.issueButton().isDisplayed()  );
		ApplicationView note = $( ApplicationView.class ).first();
		note.threeDotsButton().click();
		WebElement noteMenu = findElement( By.xpath( "//*[@class='vaadin-menu-item']" ) );
		noteMenu.click();
		Thread.sleep( 3_000 );
		EntryDialogContent deleteNote = $( EntryDialogContent.class ).first();
		deleteNote.DeleteNoteButton().click();
		VaadinConfirmDialogView getDeleteButton = $( VaadinConfirmDialogView.class ).first();
		getDeleteButton.getSaveButton().click();
		EntryDialogContent closeNote = $( EntryDialogContent.class ).first();
		closeNote.closeButton().click();

	}

	@Test
	public void addSuspenseSPIA() {VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
		getSelectButton.getSelectItem().selectItemByIndex( 4 );
		SearchComponentView getFamily = $( SearchComponentView.class ).first();
		getFamily.searchByName().sendKeys( "Mouse" );
		getFamily.searchButton().click();
		getFamily.family().getCell( "Mouse" ).click();
		ScenarioView getApplication = $( ScenarioView.class ).first();
		getApplication.applicationNumber().getCell( "424000224" ).click();
		NaviMenuView addSuspense = $( NaviMenuView.class ).first();
		addSuspense.suspense().click();
		ApplicationView addSuspenseButton = $( ApplicationView.class ).first();
		addSuspenseButton.addSuspense().click();
		EntryDialogContent suspenseSource = $( EntryDialogContent.class ).first();
		suspenseSource.suspenseAmount().sendKeys( "100000" );
		Assertions.assertEquals( "100000",suspenseSource.suspenseAmount().getValue() );
		suspenseSource.suspenseSource().selectByText( "Check" );
		Assertions.assertEquals( "Check",suspenseSource.suspenseSource().getSelectedText() );
		suspenseSource.processButton().click();
	}

	@Test
	public void issuePolicySPIA() {

		VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
		getSelectButton.getSelectItem().selectItemByIndex( 4 );
		SearchComponentView getFamily = $( SearchComponentView.class ).first();
		getFamily.searchByName().sendKeys( "Mouse" );
		getFamily.searchButton().click();
		getFamily.family().getCell( "Mouse" ).click();
		ScenarioView getApplication = $( ScenarioView.class ).first();
		getApplication.applicationNumber().getCell( "424000225" ).click();
		NaviMenuView iGO = $( NaviMenuView.class ).first();
		iGO.checkIGO().click();
		ApplicationView issue = $( ApplicationView.class ).first();
		issue.issueButton().click();
		VaadinConfirmDialogView confirm = $( VaadinConfirmDialogView.class ).first();
		confirm.getSaveButton().click();
	}

	@Test
	public void activatePolicySPIA() throws InterruptedException, IOException {

		VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
		getSelectButton.getSelectItem().selectItemByIndex( 4 );
		SearchComponentView getFamily = $( SearchComponentView.class ).first();
		getFamily.searchByName().sendKeys( "Mouse" );
		getFamily.searchButton().click();
		getFamily.family().getCell( "Mouse" ).click();
		ScenarioView getPolicy = $( ScenarioView.class ).first();
		getPolicy.policyNumber().getCell( "424000224" ).click();
		NaviMenuView getTransactions = $( NaviMenuView.class ).first();
		getTransactions.transactionsSPIA().click();
		ScenarioView transaction = $( ScenarioView.class ).first();
		transaction.processActivateTransactionButton().click();
		VaadinConfirmDialogView confirmButton = $( VaadinConfirmDialogView.class ).first();
		confirmButton.getSaveButton().click();
		Thread.sleep( 10_000 );
		transaction.processInitialPremiumTransactionButton().click();
		VaadinConfirmDialogView okButton = $( VaadinConfirmDialogView.class ).first();
		okButton.getSaveButton().click();

		ScenarioView getPolicyStatus = $(ScenarioView.class).first();
		Assertions.assertEquals( "Annuitized",getPolicyStatus.policyStatus().getText() );
		Thread.sleep( 5_000 );
			Assert.assertTrue( testBench().compareScreen( ImageFileUtil.getReferenceScreenshotFile(
				"Screenshot 2024-06-11 135341.png")));
		transaction.reverseActivateTransactionButtonSPIA().click();
		VaadinConfirmDialogView undoButton = $( VaadinConfirmDialogView.class ).first();
		undoButton.getSaveButton().click();

	}

*/

	@Test
	public void addNewBusiness() throws Exception {
		VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
		getSelectButton.getSelectItem().selectItemByIndex( 5 );
		SearchComponentView getFamily = $( SearchComponentView.class ).first();
		getFamily.searchByName().sendKeys( "Palmer" );
		getFamily.searchButton().click();
		getFamily.family().getCell( "Palmer" ).click();
		NaviMenuView newBusiness = $( NaviMenuView.class ).first();
		newBusiness.getNewBusiness().click();

		NewIllustrationView addNewBusiness = $( NewIllustrationView.class ).first();
		addNewBusiness.getProductType().selectByText( "Immediate Annuity" );
		addNewBusiness.getDepositAmount().sendKeys( Keys.chord( Keys.CONTROL, "a" ), "100000" );
        addNewBusiness.getState().selectByText( "VA" );
		addNewBusiness.getOkButton().click();
		IllustrationView illustration = $( IllustrationView.class ).first();
		illustration.getAgentNumber().openPopup();
		illustration.getAgentNumber().sendKeys( Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN );
		illustration.getAgentNumber().sendKeys( Keys.ENTER );
		Assertions.assertEquals( "NM001 - Navy Mutual Default Agent", illustration.getAgentNumber().getSelectedText() );
		illustration.payOutOption().selectByText( "Period Certain" );
		illustration.paymentMode().selectByText( "Quarterly" );
		illustration.periodCertainYears().selectByText( "15 Year" );
		illustration.federalTaxWithholdingPercentage().sendKeys( Keys.chord( Keys.CONTROL, "a" ), "10" );
		illustration.disbursementMethod().selectByText( "ACH Disbursement" );
		illustration.getSaveButton().click();
		Assertions.assertEquals( illustration.paymentStartDate().getDate(),illustration.policyEffectiveDate().getDate().plusMonths( 3 ) );
		NaviMenuView getReport = $( NaviMenuView.class ).first();
		getReport.getReport().click();

		IllustrationView apply = $( IllustrationView.class ).first();
		apply.getApplyButtonReport().click();
		VaadinConfirmDialogView confirm = $( VaadinConfirmDialogView.class ).first();
		confirm.getSaveButton().click();
        NaviMenuView getDocument = $( NaviMenuView.class ).first();
		getDocument.getDocument().click();
		ApplicationView application = $( ApplicationView.class ).first();
		application.downloadButton().click();
		Thread.sleep( 3_000 );
		application.compareAndDeleteDownloadedPdfSPIA();

		NaviMenuView getApplication = $( NaviMenuView.class ).first();
		getApplication.getApplication().click();
		ApplicationView app = $( ApplicationView.class ).first();

		app.applicationReceived().selectByText( "Yes" );
		Assertions.assertEquals( "Yes", application.applicationReceived().getSelectedText() );
		application.applicationReceivedDate().setDate( LocalDate.now() );
		application.applicationSignedDate().setDate( LocalDate.now() );
		application.applicationFundsReceived().selectByText( "Yes" );
		Assertions.assertEquals( "Yes", application.applicationFundsReceived().getSelectedText() );
		application.cashWithApplication().selectByText( "Yes" );
		Assertions.assertEquals( "Yes", application.cashWithApplication().getSelectedText() );
		application.cashWithApplicationReceivedDate().setDate( LocalDate.now() );
		application.threeDotsButton().click();
		WebElement noteList = findElement( By.xpath( "//*[@class='vaadin-menu-item']" ) );
		noteList.click();
		Thread.sleep( 3_000 );
		EntryDialogContent addNote = $( EntryDialogContent.class ).first();
		addNote.addNoteButton().click();
		addNote.noteText().setValue( "document 1" );
		addNote.expiresDate().setDate( LocalDate.of( 2024, 12, 12 ) );
		addNote.attachButton().click();
        addNote.attachmentType().selectByText( "Annuity Owner Questionnaire" );
        String filePath = System.getenv("UPLOAD_FILE_PATH");
        File fileToUpload = new File(filePath).getAbsoluteFile();
        addNote.uploadFileButton().upload(fileToUpload);
	//	addNote.attachmentType().selectByText( "Annuity Owner Questionnaire" );
	//	addNote.uploadFileButton().upload( new File( "C:\\Users\\MariiaCherniak\\Downloads\\Annuity Questionnare.pdf" ) );
		Thread.sleep( 3_000 );
		addNote.attachButton().click();
		addNote.attachmentType().selectByText( "Final Application" );
        String filePathApp = System.getenv("UPLOAD_FILE_PATH_App");
        File fileToUploadApp = new File(filePathApp).getAbsoluteFile();
        addNote.uploadFileButton().upload(fileToUploadApp);
	//	addNote.uploadFileButton().upload( new File( "C:\\Users\\MariiaCherniak\\Downloads\\Final Application.pdf") );
		Thread.sleep( 3_000 );
		addNote.attachButton().click();
		addNote.attachmentType().selectByText( "Sales Representative Disclosure" );
        String filePathS = System.getenv("UPLOAD_FILE_PATH_SALES");
        File fileToUploadS = new File(filePathS).getAbsoluteFile();
        addNote.uploadFileButton().upload(fileToUploadS);
	//	addNote.uploadFileButton().upload( new File( "C:\\Users\\MariiaCherniak\\Downloads\\Sales Representative.pdf" ) );
		Thread.sleep( 3_000 );
		addNote.attachButton().click();
		addNote.attachmentType().selectByText( "Final Illustration" );
        String filePathIll = System.getenv("UPLOAD_FILE_PATH_ILL");
        File fileToUploadIll = new File(filePathIll).getAbsoluteFile();
        addNote.uploadFileButton().upload(fileToUploadIll);
	//	addNote.uploadFileButton().upload( new File( "C:\\Users\\MariiaCherniak\\Downloads\\Final Illustration .pdf" ) );
		addNote.okButton().click();
		addNote.closeButton().click();
		NaviMenuView iGO = $( NaviMenuView.class ).first();
		iGO.checkIGO().click();
		Thread.sleep( 3_000 );
	//	Assert.assertTrue( testBench().compareScreen( ImageFileUtil.getReferenceScreenshotFile(
	//		"Screenshot 2024-06-04 171743.png" ) ) );
		ApplicationView getIssueButton = $( ApplicationView.class ).first();
		Assertions.assertTrue( getIssueButton.issueButton().isDisplayed() );
		NaviMenuView addSuspense = $( NaviMenuView.class ).first();
		addSuspense.suspense().click();
		ApplicationView addSuspenseButton = $( ApplicationView.class ).first();
		addSuspenseButton.addSuspense().click();
		EntryDialogContent suspenseSource = $( EntryDialogContent.class ).first();
		suspenseSource.suspenseAmount().sendKeys( "100000" );
		suspenseSource.suspenseSource().selectByText( "Check" );
		suspenseSource.processButton().click();

		NaviMenuView iGOIssue = $( NaviMenuView.class ).first();
		iGOIssue.checkIGO().click();
		ApplicationView issue = $( ApplicationView.class ).first();
		issue.issueButton().click();
		VaadinConfirmDialogView confirmButton = $( VaadinConfirmDialogView.class ).first();
		confirmButton.getSaveButton().click();

		NaviMenuView getTransactions = $( NaviMenuView.class ).first();
		getTransactions.transactionsSPIA().click();
		ScenarioView transaction = $( ScenarioView.class ).first();
		transaction.processActivateTransactionButton().click();
		VaadinConfirmDialogView confirmation = $( VaadinConfirmDialogView.class ).first();
		confirmation.getSaveButton().click();
		waitUntil(driver -> !transaction.progressBar().isDisplayed(), 80);

		transaction.processInitialPremiumTransactionButton().click();
		VaadinConfirmDialogView okButton = $( VaadinConfirmDialogView.class ).first();
		okButton.getSaveButton().click();
		waitUntil(driver -> !transaction.progressBar().isDisplayed(), 80);
		ScenarioView getPolicyStatus = $(ScenarioView.class).first();
		Assertions.assertEquals( "Annuitized",getPolicyStatus.policyStatus().getText() );


	}
/*
	@Test
	public void addNewBusinessMaster() throws Exception {
		VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
		getSelectButton.getSelectItem().selectItemByIndex( 5 );
		SearchComponentView getFamily = $( SearchComponentView.class ).first();
		getFamily.searchByName().sendKeys( "Palmer" );
		getFamily.searchButton().click();
		getFamily.family().getCell( "Palmer" ).click();
		NaviMenuView newBusiness = $( NaviMenuView.class ).first();
		newBusiness.getNewBusiness().click();

		NewIllustrationView addNewBusiness = $( NewIllustrationView.class ).first();
		addNewBusiness.getProductType().selectByText( "Immediate Annuity" );
		addNewBusiness.getDepositAmount().sendKeys( Keys.chord( Keys.CONTROL, "a" ), "100000" );
		addNewBusiness.getState().selectByText( "VA" );
		addNewBusiness.getOkButton().click();
		IllustrationView illustration = $( IllustrationView.class ).first();
		illustration.getAgentNumber().openPopup();
		illustration.getAgentNumber().sendKeys( Keys.ARROW_DOWN, Keys.ARROW_DOWN );
		illustration.getAgentNumber().sendKeys( Keys.ENTER );
	//	Assertions.assertEquals( "NM001 - Navy Mutual Default Agent", illustration.getAgentNumber().getSelectedText() );
		illustration.payOutOption().selectByText( "Period Certain" );
		illustration.paymentMode().selectByText( "Quarterly" );
		illustration.periodCertainYears().selectByText( "15 Year" );
		illustration.federalTaxWithholdingPercentage().sendKeys( Keys.chord( Keys.CONTROL, "a" ), "10" );
		illustration.disbursementMethod().selectByText( "ACH Disbursement" );
		illustration.getSaveButton().click();
		Assertions.assertEquals( illustration.paymentStartDate().getDate(),illustration.policyEffectiveDate().getDate().plusMonths( 3 ) );
		NaviMenuView getReport = $( NaviMenuView.class ).first();
		getReport.getReport().click();

		IllustrationView apply = $( IllustrationView.class ).first();
		apply.getApplyButtonReport().click();
		VaadinConfirmDialogView confirm = $( VaadinConfirmDialogView.class ).first();
		confirm.getSaveButton().click();
		NaviMenuView getDocument = $( NaviMenuView.class ).first();
		getDocument.getDocument().click();
		ApplicationView application = $( ApplicationView.class ).first();
		application.downloadButton().click();
		Thread.sleep( 3_000 );
		application.compareAndDeleteDownloadedPdfSPIA();

		NaviMenuView getApplication = $( NaviMenuView.class ).first();
		getApplication.getApplication().click();
		ApplicationView app = $( ApplicationView.class ).first();

		app.applicationReceived().selectByText( "Yes" );
		Assertions.assertEquals( "Yes", application.applicationReceived().getSelectedText() );
		application.applicationReceivedDate().setDate( LocalDate.now() );
		application.applicationSignedDate().setDate( LocalDate.now() );
		application.applicationFundsReceived().selectByText( "Yes" );
		Assertions.assertEquals( "Yes", application.applicationFundsReceived().getSelectedText() );
		application.cashWithApplication().selectByText( "Yes" );
		Assertions.assertEquals( "Yes", application.cashWithApplication().getSelectedText() );
		application.cashWithApplicationReceivedDate().setDate( LocalDate.now() );
		application.threeDotsButton().click();
		WebElement noteList = findElement( By.xpath( "//*[@class='vaadin-menu-item']" ) );
		noteList.click();
		Thread.sleep( 3_000 );
		EntryDialogContent addNote = $( EntryDialogContent.class ).first();
		addNote.addNoteButton().click();
		addNote.noteText().setValue( "document 1" );
		addNote.expiresDate().setDate( LocalDate.of( 2024, 12, 12 ) );
		addNote.attachButton().click();
		addNote.attachmentType().selectByText( "Annuity Owner Questionnaire" );
		addNote.uploadFileButton().upload( new File( "C:\\Users\\MariiaCherniak\\Downloads\\Annuity Questionnare.pdf" ) );
		Thread.sleep( 3_000 );
		addNote.attachButton().click();
		addNote.attachmentType().selectByText( "Final Application" );
		addNote.uploadFileButton().upload( new File( "C:\\Users\\MariiaCherniak\\Downloads\\Final Application.pdf") );
		Thread.sleep( 3_000 );
		addNote.attachButton().click();
		addNote.attachmentType().selectByText( "Sales Representative Disclosure" );
		addNote.uploadFileButton().upload( new File( "C:\\Users\\MariiaCherniak\\Downloads\\Sales Representative.pdf" ) );
		Thread.sleep( 3_000 );
		addNote.attachButton().click();
		addNote.attachmentType().selectByText( "Final Illustration" );
		addNote.uploadFileButton().upload( new File( "C:\\Users\\MariiaCherniak\\Downloads\\Final Illustration .pdf" ) );
		addNote.okButton().click();
		addNote.closeButton().click();
		NaviMenuView iGO = $( NaviMenuView.class ).first();
		iGO.checkIGO().click();
		Thread.sleep( 3_000 );
		Assert.assertTrue( testBench().compareScreen( ImageFileUtil.getReferenceScreenshotFile(
				"Screenshot 2024-06-04 171743.png" ) ) );
		ApplicationView getIssueButton = $( ApplicationView.class ).first();
		Assertions.assertTrue( getIssueButton.issueButton().isDisplayed() );
		NaviMenuView addSuspense = $( NaviMenuView.class ).first();
		addSuspense.suspense().click();
		ApplicationView addSuspenseButton = $( ApplicationView.class ).first();
		addSuspenseButton.addSuspense().click();
		EntryDialogContent suspenseSource = $( EntryDialogContent.class ).first();
		suspenseSource.suspenseAmount().sendKeys( "100000" );
		suspenseSource.suspenseSource().selectByText( "Check" );
		suspenseSource.processButton().click();

		NaviMenuView iGOIssue = $( NaviMenuView.class ).first();
		iGOIssue.checkIGO().click();
		ApplicationView issue = $( ApplicationView.class ).first();
		issue.issueButton().click();
		VaadinConfirmDialogView confirmButton = $( VaadinConfirmDialogView.class ).first();
		confirmButton.getSaveButton().click();

		NaviMenuView getTransactions = $( NaviMenuView.class ).first();
		getTransactions.transactionsSPIA().click();
		ScenarioView transaction = $( ScenarioView.class ).first();
		transaction.processActivateTransactionButton().click();
		VaadinConfirmDialogView confirmation = $( VaadinConfirmDialogView.class ).first();
		confirmation.getSaveButton().click();
		waitUntil(driver -> !transaction.progressBar().isDisplayed(), 80);
		transaction.processInitialPremiumTransactionButton().click();
		VaadinConfirmDialogView okButton = $( VaadinConfirmDialogView.class ).first();
		okButton.getSaveButton().click();
		ScenarioView getPolicyStatus = $(ScenarioView.class).first();
		Assertions.assertEquals( "Annuitized",getPolicyStatus.policyStatus().getText() );


	}
*/
}









