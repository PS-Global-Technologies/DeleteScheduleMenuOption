package com.psg.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.misys.liq.desktop.core.misc.schedule.LoanScheduleEditorController;
import com.misys.liq.infrastructure.ui.view.labstrct.LS2Controller;
import com.sxsy.smtj.ui.abt.widgets.compatibility.CascadeButtonView;

public class LoanScheduleEditorControllerUIHandler extends UIEventHandler {
	 @Override
	protected List<List<String>> eventSpec() {
		 System.out.println(
		            "LoanScheduleEditorControllerUIHandler eventSpec CALLED"
		        );
		ArrayList<List<String>> r = new ArrayList<>();
		r.add(Arrays.asList("LoanScheduleEditor", "postOpenInitialization", "postOpenInitialization"));
		return r;
	}

	void postOpenInitialization(LS2Controller ls2) {
		
		((CascadeButtonView)((LoanScheduleEditorController)ls2).getSubpartNamed("optionsMenu")).disableValue("deleteScheduleMenuChoice");
		//((LoanScheduleEditorController)ls2).getSubpartNamed("addButton").protect();
		((LoanScheduleEditorController)ls2).getSubpartNamed("deleteButton").protect();
		((LoanScheduleEditorController)ls2).getSubpartNamed("modifyButton").protect();
		((LoanScheduleEditorController)ls2).getSubpartNamed("remainingAmountButton").protect();
		((CascadeButtonView)((LoanScheduleEditorController)ls2).getSubpartNamed("optionsMenu")).disableValue("synchronizeMenuChoice");
		//((CascadeButtonView)((LoanScheduleEditorController)ls2).getSubpartNamed("optionsMenu")).disableValue("rescheduleMenuChoice");

	}
}
