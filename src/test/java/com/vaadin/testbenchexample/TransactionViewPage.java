package com.vaadin.testbenchexample;

import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.testbench.TestBenchElement;
import com.vaadin.testbench.elementsbase.Element;

@Element( "transaction-view-page" )
public class TransactionViewPage extends TestBenchElement {
    protected ButtonElement cancel (){
        {return $( ButtonElement.class ).last();}
    }

}

