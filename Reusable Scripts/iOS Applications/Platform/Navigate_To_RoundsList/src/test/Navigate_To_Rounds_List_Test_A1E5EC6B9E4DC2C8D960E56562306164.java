/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
/******************************************************************
* Licensed Materials - Property of IBM
* IBM Rational Test Workbench
* Copyright IBM Corporation 2013. All Rights Reserved.
* 
* U.S. Government Users Restricted Rights - Use, duplication or 
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
******************************************************************/
/* TestScript.template - Suitable for collaborative code generation */
package test;

import com.ibm.rational.test.lt.datacorrelation.execution.action.CustomCodeAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.moeb.action.EndMoebStepBatchAction;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.impl.KAction;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.custom.ICustomCode2;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTCustomCodeExceptionEvent;
import com.ibm.rational.test.lt.kernel.services.RPTCustomCodeVPFailureEvent;
import com.ibm.rational.test.lt.kernel.services.RPTEvent;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;

@SuppressWarnings("all")
public class Navigate_To_Rounds_List_Test_A1E5EC6B9E4DC2C8D960E56562306164 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(1);
	
	
    
    
	
	public Navigate_To_Rounds_List_Test_A1E5EC6B9E4DC2C8D960E56562306164(IContainer container, String invocationId) {
		super(container, "Navigate_To_Rounds_List", invocationId, "A1E5EC6B9E4DC2C8D960E56562306164");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		
	}

    public void execute() {
    	try {
			
	    		
	
	if (!isScheduleRun()){
this.addEventBehavior(new RPTEventStructure(new RPTFailVPEvent(), new RPTContinueEvent("Content Verification Point failed"), 1, "Content Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), new RPTContinueEvent("Connection failed"), 1, "Connection failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), new RPTContinueEvent("Authentication failed"), 1, "Authentication failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(), new RPTStopUserEvent("End of datapool reached"), 1, "End of datapool reached"));
	this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), new RPTContinueEvent("Failed to extract reference"), 1, "Failed to extract reference"));
	this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), new RPTContinueEvent("Substitution failed"), 1, "Substitution failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), new RPTContinueEvent("Timeout"), 1, "Timeout"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), new RPTContinueEvent("Custom Verification Point failed"), 1, "Custom Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeAlertEvent(), new RPTContinueEvent("Custom Code reported an Alert"), 0, "Custom Code reported an Alert"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1, "Custom Code reported an unhandled exception"));
	}
	        	this.add(new CustomCode_1(this, dcVars[0]));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: Navigate_To_Rounds_List_Test_A1E5EC6B9E4DC2C8D960E56562306164 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		
		super.preFinish();
	}
	
	public void stop() {
		
		super.stop();
	}	
	
	
	public class CustomCode_1 extends CustomCodeAction {

		IDataCorrelationVar outVar;
		/**
		 * @param parent
		 * @param name
		 */
		public CustomCode_1(IContainer parent, IDataCorrelationVar outVar) {
			super(parent, "forQuickSwipe.Class", "A1E5EB902A29D233D5FCE33834363764");
			this.outVar = outVar;
		}
	
		/**
		 * @see com.ibm.rational.test.lt.kernel.action.IKAction#execute()
		 */
		public void execute() {
		
				
	
	
	
	
			IDCCoreVar[] inputVars = {
				
			};
			
			ICustomCode2 ccclass = 	new forQuickSwipe.Class();
			
			setCCClass(ccclass);
			setInputVars(inputVars);
			setOutVar(outVar);
			
			super.execute();

		}
	}



}
