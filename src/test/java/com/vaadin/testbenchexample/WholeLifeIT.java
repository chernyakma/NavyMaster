package com.vaadin.testbenchexample;

import com.vaadin.testbench.screenshot.ImageFileUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class WholeLifeIT extends BaseLoginTest{
/*
    @Test
    public void addLoan() throws InterruptedException, IOException {
        VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
        getSelectButton.getSelectItem().selectItemByIndex( 6 );
        SearchComponentView getPolicy = $( SearchComponentView.class ).first();
        getPolicy.searchByPolicy().sendKeys( "69429529" );
        getPolicy.searchButton().click();
        getPolicy.family().getCell( "69429529" ).click();
        NaviMenuView transaction = $( NaviMenuView.class ).first();
        transaction.transactionsLoan().click();
        ScenarioView loanTransaction = $(ScenarioView.class).first();
        loanTransaction.addTransactionButton().click();
//		EntryDialogContent selectTransaction = $(EntryDialogContent.class).first();
        TransactionPopUpPageView selectTransaction = $(TransactionPopUpPageView.class).first();
        selectTransaction.transactionType().selectByText( "Loan" );
        EntryDialogContent loan = $(EntryDialogContent.class).first();
        loan.loanAmount().sendKeys( Keys.chord( Keys.CONTROL, "a" ), "500" );


        loan.disbursementMethod().selectByText( "Check Disbursement" );
        Assertions.assertEquals( "500.00",loan.loanAmount().getValue() );
        TransactionPopUpPageView getApproved = $(TransactionPopUpPageView.class).first();
        getApproved.approved().click();
        loan.okButton().click();
        ScenarioView processLoanTransaction = $(ScenarioView.class).first();
        processLoanTransaction.processInitialPremiumTransactionButton().click();

        VaadinConfirmDialogView confirm = $(VaadinConfirmDialogView.class).first();
        confirm.getSaveButton().click();
        ScenarioView transactionsPage = $(ScenarioView.class).first();
        waitUntil(driver -> !transactionsPage.progressBar().isDisplayed(), 80);

//      ScenarioView transactionsPage = $(ScenarioView.class).first();
 //      transactionsPage.viewLoanTransactionButton().click();
 //    Thread.sleep( 5_000 );
 //      Assert.assertTrue( testBench().compareScreen( ImageFileUtil.getReferenceScreenshotFile(
 //       "Screenshot 2024-05-31 165800.png" ) ) );
 //       TransactionViewPage transactionPage = $(TransactionViewPage.class).first();
 //       transactionPage.cancel().click();

        NaviMenuView policy = $(NaviMenuView.class).first();
        policy.getPolicy().click();
        ScenarioView policyPage = $(ScenarioView.class).first();
        Assertions.assertEquals( "500.00",policyPage.loanBalance().getValue() );
        NaviMenuView transactions = $(NaviMenuView.class).first();
        transactions.transactionsLoan().click();
        ScenarioView deleteTransaction = $(ScenarioView.class).first();
        deleteTransaction.reverseLoanTransactionButton().click();
        VaadinConfirmDialogView ok = $(VaadinConfirmDialogView.class).first();
        ok.getSaveButton().click();
        waitUntil(driver -> !deleteTransaction.progressBar().isDisplayed(), 80);
        ScenarioView deleteLoanTransaction = $(ScenarioView.class).first();
        deleteLoanTransaction.deleteLoanTransactionButton().click();
        VaadinConfirmDialogView confirmation = $(VaadinConfirmDialogView.class).first();
        confirmation.getSaveButton().click();

    }
*/
    @Test
    public void addRider() throws InterruptedException, IOException {

        VaadinSelectView getSelectButton = $( VaadinSelectView.class ).first();
        getSelectButton.getSelectItem().selectItemByIndex( 6 );
        SearchComponentView getPolicy = $( SearchComponentView.class ).first();
        getPolicy.searchByPolicy().sendKeys("69432987" );
        getPolicy.searchButton().click();
        getPolicy.family().getCell( "69432987" ).click();
        NaviMenuView transaction = $( NaviMenuView.class ).first();
        transaction.transactions().click();
        ScenarioView loanTransaction = $(ScenarioView.class).first();
        loanTransaction.addTransactionButton().click();
        //		EntryDialogContent selectTransaction = $(EntryDialogContent.class).first();
        TransactionPopUpPageView selectTransaction = $(TransactionPopUpPageView.class).first();
        selectTransaction.transactionType().selectByText( "Add Rider" );
        selectTransaction.effectiveDate().setDate( LocalDate.of( 2025, 8, 1 ) );
        EntryDialogContent addRider = $(EntryDialogContent.class).first();
        addRider.coverageName().selectItemByIndex( 0);
        addRider.addInsured().click();

        EntryDialogContent addInsured = $(EntryDialogContent.class).last();
        addInsured.partyGUID().selectItemByIndex(0);
        addInsured.okButton().click();
         TransactionPopUpPageView notes = $(TransactionPopUpPageView.class).first();
        notes.note().sendKeys( "123" );
        addRider.okButton().click();
        ScenarioView processTransaction = $(ScenarioView.class).first();
        processTransaction.processInitialPremiumTransactionButton().click();
        VaadinConfirmDialogView confirm = $(VaadinConfirmDialogView.class).first();
        confirm.getSaveButton().click();
        ScenarioView transactionsPage = $(ScenarioView.class).first();
        waitUntil(driver -> !transactionsPage.progressBar().isDisplayed(), 60);

        Assertions.assertEquals( "$220.26",transactionsPage.modalPremium().getText() );

/*		ScenarioView transactionsPage = $(ScenarioView.class).first();
		transactionsPage.viewLoanTransactionButton().click();
		Thread.sleep( 5_000 );
		Assert.assertTrue( testBench().compareScreen( ImageFileUtil.getReferenceScreenshotFile(
				"Screenshot 2024-05-31 165802.png" ) ) );
		Assertions.assertEquals("Actual",processTransaction.transactionStatus().getText());

		TransactionViewPage transactionPage = $(TransactionViewPage.class).first();
		transactionPage.cancel().click();
*/
        ScenarioView deleteTransaction = $(ScenarioView.class).first();
        deleteTransaction.reverseAddRiderTransactionButton().click();
        VaadinConfirmDialogView ok = $(VaadinConfirmDialogView.class).first();
        ok.getSaveButton().click();
        ScenarioView deleteLoanTransaction = $(ScenarioView.class).first();
        waitUntil(driver -> !deleteTransaction.progressBar().isDisplayed(), 80);

//		ScenarioView deleteLoanTransaction = $(ScenarioView.class).first();
        deleteLoanTransaction.deleteLoanTransactionButton().click();
        VaadinConfirmDialogView confirmation = $(VaadinConfirmDialogView.class).first();
        confirmation.getSaveButton().click();


    }

}
