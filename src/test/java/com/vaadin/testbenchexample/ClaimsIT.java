package com.vaadin.testbenchexample;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;
import java.time.LocalDate;

public class ClaimsIT extends BaseLoginTest{
    @Test
    public void deathClaim() throws InterruptedException, IOException {
        VaadinSelectView getSelectButton = $(VaadinSelectView.class).first();
        getSelectButton.getSelectItem().selectByText("Search Policy");
        waitUntil(driver -> $(SearchComponentView.class).exists(), 80);
        SearchComponentView getPolicy = $(SearchComponentView.class).first();
        waitUntil(driver -> getPolicy.isDisplayed(), 20);
//        SearchComponentView getPolicy = $(SearchComponentView.class).first();
        getPolicy.searchByPolicy().sendKeys("426000020");
        getPolicy.searchButton().click();
        getPolicy.family().getCell("426000020").click();
        NaviMenuView menu = $(NaviMenuView.class).first();


        menu.policyTransactionsSPDA().click();
        ScenarioView processEffDate = $(ScenarioView.class).first();
        processEffDate.date().setDate(LocalDate.now());
        processEffDate.cycle().click();
        VaadinConfirmDialogView cycleUp = $(VaadinConfirmDialogView.class).first();
        cycleUp.getSaveButton().click();
        waitUntil(driver -> !processEffDate.progressBar().isDisplayed(), 80);

        menu.claimsSPDA().click();
        ScenarioView claims = $(ScenarioView.class).first();
        claims.getAddClaimsButton().click();
        EntryDialogContent createClaim = $(EntryDialogContent.class).first();
        //       createClaim.addRundomCaseNumber();
        //       createClaim.getClaimType().selectByText("Death");
        createClaim.getSource().selectByText("Spouse");
        LocalDate currentDate = createClaim.getReceivedDate().getDate();
        LocalDate newDate = currentDate.minusDays(3);
        createClaim.getIncurredDate().setDate(newDate);
        createClaim.getClaimCause().selectByText("Stroke");
        createClaim.getContact().selectItemByIndex(0);
        createClaim.saveAndOpenButton().click();
        menu.processClaim().click();
        waitUntil(driver -> $(EntryDialogContent.class).exists(), 80);

        boolean selected = false;

        for (int i = 0; i < 8; i++) {
            try {
                // Re-find dialog fresh every attempt
                EntryDialogContent dlg = $(EntryDialogContent.class).last();
                dlg.getEventType1().selectByText("Decision");
                selected = true;
                break;
            } catch (org.openqa.selenium.StaleElementReferenceException e) {
                if (i == 7) throw e;
            }
        }

        if (!selected) {
            throw new AssertionError("Could not select Event Type = Decision");
        }
        EntryDialogContent event = $(EntryDialogContent.class).first();
        event.getEventType().selectByText("Decision");
        event.okButton().click();
        menu.makePayment().click();
        EntryDialogContent payment = $(EntryDialogContent.class).first();
        payment.getPayee().selectItemByIndex(0);
        payment.okButton().click();
        menu.claimPolicy().click();
        menu.policyTransactionsSPDA().click();
        ScenarioView transactions = $(ScenarioView.class).first();
        transactions.reverseSecondTransactionButton().click();
        waitUntil(driver -> $(VaadinConfirmDialogView.class).exists(), 120);
        VaadinConfirmDialogView confirm = $(VaadinConfirmDialogView.class).first();
        confirm.getSaveButton().click();
        waitUntil(driver -> !transactions.progressBar().isDisplayed(), 80);
        transactions.deleteFirstTransactionButton().click();
        waitUntil(driver -> $(VaadinConfirmDialogView.class).exists(), 120);
        VaadinConfirmDialogView confirmDelete = $(VaadinConfirmDialogView.class).first();
        confirmDelete.getSaveButton().click();
        waitUntil(driver -> !transactions.progressBar().isDisplayed(), 80);
        transactions.deleteFirstTransactionButton().click();
        VaadinConfirmDialogView delete = $(VaadinConfirmDialogView.class).first();
        delete.getSaveButton().click();
        waitUntil(driver -> !transactions.progressBar().isDisplayed(), 80);
        menu.claimsSPDA().click();
        ScenarioView getClaims = $(ScenarioView.class).first();
        getClaims.getClaim().getCell("Approved").click();
        menu.processClaim().click();
        EntryDialogContent change = $(EntryDialogContent.class).first();
        change.getEventType().selectByText("Decision");
        EntryDialogContent denyClaim = $(EntryDialogContent.class).first();
        denyClaim.editDecision().click();
        EntryDialogContent decision = $(EntryDialogContent.class).last();
        decision.getClaimDecision().selectByText("Deny");
        decision.okButton().click();
        EntryDialogContent reason = $(EntryDialogContent.class).first();
        reason.getDenialClaimReason().selectByText("Marked Up In Error");
        reason.okButton().click();
        ScenarioView claimStatus = $(ScenarioView.class).first();
        Assertions.assertEquals("Denied", claimStatus.claimStatus().getText());
        Assertions.assertEquals("Active",claimStatus.policyClaimStatus().getText());

    }
    @Test
    public void terminalIllnessClaim() throws InterruptedException, IOException {
        VaadinSelectView getSelectButton = $(VaadinSelectView.class).first();
        getSelectButton.getSelectItem().selectByText("Search Policy");
        waitUntil(driver -> $(SearchComponentView.class).exists(), 80);
        SearchComponentView getPolicy = $(SearchComponentView.class).first();
        waitUntil(driver -> getPolicy.isDisplayed(), 20);
//        SearchComponentView getPolicy = $(SearchComponentView.class).first();
        getPolicy.searchByPolicy().sendKeys("06220153");
        getPolicy.searchButton().click();
        getPolicy.family().getCell("06220153").click();
        NaviMenuView menu = $(NaviMenuView.class).first();


        menu.policyTransactionsSPDA().click();
        ScenarioView processEffDate = $(ScenarioView.class).first();
        processEffDate.date().setDate(LocalDate.now());
        processEffDate.cycle().click();
        VaadinConfirmDialogView cycleUp = $(VaadinConfirmDialogView.class).first();
        cycleUp.getSaveButton().click();
        waitUntil(driver -> !processEffDate.progressBar().isDisplayed(), 80);

        NaviMenuView menu2 = $(NaviMenuView.class).first();
        menu2.claims().click();
        ScenarioView claims = $(ScenarioView.class).first();
        claims.getAddClaimsButton().click();
        EntryDialogContent createClaim = $(EntryDialogContent.class).first();
        //       createClaim.addRundomCaseNumber();
        createClaim.getTIClaimType().selectByText("Terminal Illness");
        createClaim.getSource().selectByText("Spouse");
        LocalDate currentDate = createClaim.getReceivedDate().getDate();
        LocalDate newDate = currentDate.minusMonths(1);
        createClaim.getIncurredDate().setDate(newDate);
        createClaim.getClaimCause().selectByText("Stroke");
        createClaim.getContact().selectItemByIndex(0);
        createClaim.saveAndOpenButton().click();

        menu2.processTIClaim().click();
        EntryDialogContent event = $(EntryDialogContent.class).first();
        event.getEventType().selectByText("Approve");
        event.okButton().click();
        menu2.makeTIPayment().click();
        EntryDialogContent payment = $(EntryDialogContent.class).first();
        //       payment.getPayee().selectItemByIndex(0);
        payment.okButton().click();
        menu2.claimTIPolicy().click();
        menu2.policyPermPlusTransactions().click();
        ScenarioView transactions = $(ScenarioView.class).first();
        transactions.reverseSecondTransactionButton().click();
        waitUntil(driver -> $(VaadinConfirmDialogView.class).exists(), 120);
        VaadinConfirmDialogView confirm = $(VaadinConfirmDialogView.class).first();
        confirm.getSaveButton().click();
        waitUntil(driver -> !transactions.progressBar().isDisplayed(), 80);
        transactions.deleteFirstTransactionButton().click();
        waitUntil(driver -> $(VaadinConfirmDialogView.class).exists(), 120);
        VaadinConfirmDialogView confirmDelete = $(VaadinConfirmDialogView.class).first();
        confirmDelete.getSaveButton().click();
        waitUntil(driver -> !transactions.progressBar().isDisplayed(), 80);
        transactions.deleteFirstTransactionButton().click();
        VaadinConfirmDialogView delete = $(VaadinConfirmDialogView.class).first();
        delete.getSaveButton().click();
        waitUntil(driver -> !transactions.progressBar().isDisplayed(), 80);
        menu2.claims().click();
        ScenarioView getClaims = $(ScenarioView.class).first();
        getClaims.getClaim().getCell("Pending").click();
        menu2.processTIClaim().click();
        EntryDialogContent change = $(EntryDialogContent.class).first();
        change.getEventType().selectByText("Denial");
  /*
        EntryDialogContent denyClaim = $(EntryDialogContent.class).first();
        denyClaim.editDecision().click();
        EntryDialogContent decision = $(EntryDialogContent.class).last();
        decision.getClaimDecision().selectByText("Deny");
        decision.okButton().click();
        EntryDialogContent reason = $(EntryDialogContent.class).first();

   */
        change.getDenialClaimReason().selectByText("Marked Up In Error");
        change.okButton().click();
        ScenarioView claimStatus = $(ScenarioView.class).first();
        Assertions.assertEquals("Denied", claimStatus.claimStatus().getText());
        Assertions.assertEquals("Active",claimStatus.policyClaimStatus().getText());

    }


}
