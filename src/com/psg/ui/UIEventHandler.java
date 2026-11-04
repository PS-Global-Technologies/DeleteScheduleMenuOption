package com.psg.ui;

import com.misys.liq.enhancements.registry.LiqEnhancementsRegistry;
import com.sxsy.smtj.compatibility.va.kernel.core.DirectedMessage;
import com.sxsy.smtj.utilities.CollectionUtility;

import java.util.List;

public class UIEventHandler {

    public static void setupUIHandlers(){
    	System.out.println("setupUIHandlers  invoked");
        (new LoanScheduleEditorControllerUIHandler()).setup();
    }

    protected List<List<String>> eventSpec(){
    	System.out.println("eventSpec  invoked");
        //ControllerName, eventName, methodName
        return null;
    }

    public void setup(){
    	System.out.println("setup  invoked");
        eventSpec().stream().forEach(e->
        {
            DirectedMessage msg= new DirectedMessage();
            msg.setMethodName(e.get(2));
            msg.setReceiver(this);
            msg.setArguments(CollectionUtility.listOfSize(1));
            LiqEnhancementsRegistry.clazz.current().registerEvent(e.get(1), e.get(0), msg);
        });
    }
}
