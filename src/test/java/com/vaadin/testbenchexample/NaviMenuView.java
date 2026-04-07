package com.vaadin.testbenchexample;
import javax.swing.*;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

import com.vaadin.flow.component.html.testbench.SpanElement;
import com.vaadin.flow.component.icon.testbench.IconElement;
import com.vaadin.flow.component.select.testbench.SelectElement;
import com.vaadin.testbench.TestBenchElement;
import com.vaadin.testbench.annotations.Attribute;
import com.vaadin.testbench.elementsbase.Element;


@Element( "NAVI-MENU" )
//@Attribute(name="class",value="navi-item page-item")
public class NaviMenuView extends TestBenchElement {


	//main

	protected TestBenchElement getAddresses() {

		return $(TestBenchElement.class).id("navi-menu").$(IconElement.class).get(5);
	}
	protected TestBenchElement getSuspense() {

		return $(TestBenchElement.class).id("navi-menu").$(IconElement.class).get(25);
	}
	protected TestBenchElement getNewBusiness() {

		return $(TestBenchElement.class).id("navi-menu").$(IconElement.class).get(30);
	}

	protected TestBenchElement getBankInformation() {

		return $(TestBenchElement.class).id("navi-menu").$(IconElement.class).get(4);
	}
	protected TestBenchElement suspense() {

		return $(TestBenchElement.class).id("navi-menu").$(IconElement.class).get(23);
	}


	//Policy
	protected TestBenchElement getApplication() {

		return $(TestBenchElement.class).id("navi-menu").$(IconElement.class).get(1);
	}
	protected TestBenchElement beneficiaries() {

		return $(TestBenchElement.class).id("navi-menu").$(IconElement.class).get(11);
	}
	protected TestBenchElement getDocument() {

		return $(TestBenchElement.class).id("navi-menu").$(IconElement.class).get(18);
	}
	protected TestBenchElement policyTransactions() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$( IconElement.class ).get( 36 );
	}
	protected TestBenchElement policyPermPlusTransactions() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$( IconElement.class ).get( 30 );
	}
	protected TestBenchElement policyTransactionsSPDA() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$( IconElement.class ).get( 33 );
	}
	protected TestBenchElement getFamily() {

		return $(TestBenchElement.class).id("navi-menu").$(IconElement.class).last();
	}
	protected TestBenchElement checkIGO() {

		return $(TestBenchElement.class).id("navi-menu").$(IconElement.class).get(25);
	}
	protected TestBenchElement otherRoles() {

		return $(TestBenchElement.class).id("navi-menu").$(IconElement.class).get(13);
	}
	protected TestBenchElement payorAndOwner() {

		return $(TestBenchElement.class).id("navi-menu").$(IconElement.class).get(4);
	}
	protected TestBenchElement getReport() {

		return $(TestBenchElement.class).id("navi-menu").$(IconElement.class).get(7);
	}

	protected TestBenchElement getResult() {

		return $(TestBenchElement.class).id("navi-menu").$(IconElement.class).get(5);
	}

	protected TestBenchElement getPolicy() {

		return $(TestBenchElement.class).id("navi-menu").$(IconElement.class).first();
	}


	//SPDA
	protected TestBenchElement getDocumentSPDA() {

		return $(TestBenchElement.class).id("navi-menu").$(IconElement.class).get(13);
	}
	protected TestBenchElement checkSpdaIGO() {

		return $(TestBenchElement.class).id("navi-menu").$(IconElement.class).get(20);
	}

	protected TestBenchElement suspenseSpda() {

		return $(TestBenchElement.class).id("navi-menu").$(IconElement.class).get(18);
	}
	protected TestBenchElement transactionsSPDA() {

		return $(TestBenchElement.class).id("navi-menu").$(IconElement.class).get(33);
	}






	// FPDR
	protected TestBenchElement transactionsFPDR() {

		return $(TestBenchElement.class).id("navi-menu").$(IconElement.class).get(43);
	}

	//SPIA
	protected TestBenchElement transactionsSPIA() {

		return $(TestBenchElement.class).id("navi-menu").$(IconElement.class).get(27);
	}

	//WL
	protected TestBenchElement transactionsWL() {

		return $(TestBenchElement.class).id("navi-menu").$(IconElement.class).get(32);
	}



	protected TestBenchElement transactionsLoan() {

		return $(TestBenchElement.class).id("navi-menu").$(IconElement.class).get(38);
	}
	protected TestBenchElement transactions() {

		return $(TestBenchElement.class).id("navi-menu").$(IconElement.class).get(35);
	}

//claims
    protected TestBenchElement claims() {

	   return $( TestBenchElement.class ).id( "navi-menu" ).$(IconElement.class).get( 24 );
	}


	protected TestBenchElement processClaim() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$(IconElement.class).get( 24 );
	}
	protected TestBenchElement makePayment() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$(IconElement.class).get( 29 );
	}
	protected TestBenchElement makeTIPayment() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$( IconElement.class ).get( 16 );
	}
	protected TestBenchElement policy() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$(IconElement.class).get( 21 );
	}
	protected TestBenchElement claimPolicy() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$(IconElement.class).get( 50 );
	}
	protected TestBenchElement processTIClaim() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$( IconElement.class ).get( 14 );
	}

	protected TestBenchElement claimsFPRA() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$(IconElement.class).get( 32 );
	}
	protected TestBenchElement claimsSPDA() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$(IconElement.class).get( 26 );
	}
	protected TestBenchElement claimsSPDA1() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$(IconElement.class).get( 23 );
	}
	protected TestBenchElement claimTIPolicy() {

		return $( TestBenchElement.class ).id( "navi-menu" ).$( IconElement.class ).get( 24 );
	}

}