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

import com.ibm.rational.test.lt.datacorrelation.datapoolAction.Datapool;
import com.ibm.rational.test.lt.datacorrelation.datapoolAction.DatapoolAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.moeb.action.EndMoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.services.*;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;

@SuppressWarnings("all")
public class Enter_FourPIN_intoPINScreenPadScreen_Test_A1E6219C8CDD31A0CC18B63837636437 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(4);
	
	
    
    
	
	public Enter_FourPIN_intoPINScreenPadScreen_Test_A1E6219C8CDD31A0CC18B63837636437(IContainer container, String invocationId) {
		super(container, "Enter_FourPIN_intoPINScreenPadScreen", invocationId, "A1E6219C8CDD31A0CC18B63837636437");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		
	}

    public void execute() {
    	try {
			
	    		if (!isScheduleRun()) setThinkMax(2000);
	
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
	        	this.add(datapool_1(this));
	this.add(applicationContext_1(this));
	this.add(applicationContext_2(this));
	this.add(applicationContext_3(this));
	this.add(applicationContext_4(this));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: Enter_FourPIN_intoPINScreenPadScreen_Test_A1E6219C8CDD31A0CC18B63837636437 ",e);
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
	
	
	private DatapoolAction datapool_1(IContainer parent) {
		DatapoolAction dpAction = new DatapoolAction(parent, "A1E621AC1376E7B0CC18B63837636437", "A1E621ADA7BE1550CC18B63837636437");
		Datapool dp = new Datapool(
				 "/A1E621AC1376E7B0CC18B63837636437.datapool",
				 0,
				 true,
				 false,
				 Datapool.SEQUENTIAL,
				 null, 0);
		dp.addHarvestInstruction("PIN1", dcVars[0], false);
dp.addHarvestInstruction("PIN2", dcVars[1], false);
dp.addHarvestInstruction("PIN3", dcVars[2], false);
dp.addHarvestInstruction("PIN4", dcVars[3], false);
		dpAction.setDatapool(dp);
		return dpAction;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "PowerChart - Click on Button located at position 5",
												  "A1E62197FFBF3C60CC18B63837636437",
												  "{\"variables\":[{\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"5\",\"key\":\"MOEB_FIELD\\/TLC:A1E621980016AB66CC18B63837636437\\/TPM:A1E621980016AB6FCC18B63837636437\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E62197FFBF3C60CC18B63837636437\",\"preferredThinktime\":0,\"thinktime\":1137,\"isWeb\":false,\"description\":\"Think <i>1,137<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"3393CA2292544329B2A78FB9C194A977\",\"timeout\":0},{\"description\":\"Click on <b>Button<\\/b> located at position 5\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"3393CA2292544329B2A78FB9C194A977\",\"timeout\":0,\"uid\":\"A1E62197FFBF3C60CC18B63837636437\",\"substitutionParameters\":[{\"variableKey\":\"MOEB_FIELD\\/TLC:A1E621980016AB66CC18B63837636437\\/TPM:A1E621980016AB6FCC18B63837636437\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"5\"}],\"isWeb\":false,\"action\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"click\",\"parameters\":[]},\"sync_policy\":\"SYNC-WITH-NEXT-STEP\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIButton\",\"locator\":{\"parameter\":{\"$ref\":\"3\"},\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LPosition\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_1 = new DataSub();
		stepBatch.addDataSub(subContainer_1);
	ISubRule sub_0 = new SubRule("MOEB_FIELD/TLC:A1E621980016AB66CC18B63837636437/TPM:A1E621980016AB6FCC18B63837636437", 0, 1, false, (IDCCoreVar)dcVars[0], false, "5", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_2(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "PowerChart - Click on Button located at position 5",
												  "A1E6219CAE548BD3CC18B63837636437",
												  "{\"variables\":[{\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"5\",\"key\":\"MOEB_FIELD\\/TLC:A1E6219CAE548BE3CC18B63837636437\\/TPM:A1E6219CAE548BE9CC18B63837636437\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E6219CAE548BD3CC18B63837636437\",\"preferredThinktime\":0,\"thinktime\":1137,\"isWeb\":false,\"description\":\"Think <i>1,137<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"3393CA2292544329B2A78FB9C194A977\",\"timeout\":0},{\"description\":\"Click on <b>Button<\\/b> located at position 5\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"3393CA2292544329B2A78FB9C194A977\",\"timeout\":0,\"uid\":\"A1E6219CAE548BD3CC18B63837636437\",\"substitutionParameters\":[{\"variableKey\":\"MOEB_FIELD\\/TLC:A1E6219CAE548BE3CC18B63837636437\\/TPM:A1E6219CAE548BE9CC18B63837636437\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"5\"}],\"isWeb\":false,\"action\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"click\",\"parameters\":[]},\"sync_policy\":\"SYNC-WITH-NEXT-STEP\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIButton\",\"locator\":{\"parameter\":{\"$ref\":\"3\"},\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LPosition\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_2 = new DataSub();
		stepBatch.addDataSub(subContainer_2);
	ISubRule sub_1 = new SubRule("MOEB_FIELD/TLC:A1E6219CAE548BE3CC18B63837636437/TPM:A1E6219CAE548BE9CC18B63837636437", 0, 1, false, (IDCCoreVar)dcVars[1], false, "5_2", null, 0, false);
	subContainer_2.addSubInstruction(sub_1);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_3(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "PowerChart - Click on Button located at position 5",
												  "A1E6219CAE81DD60CC18B63837636437",
												  "{\"variables\":[{\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"5\",\"key\":\"MOEB_FIELD\\/TLC:A1E6219CAE81DD70CC18B63837636437\\/TPM:A1E6219CAE81DD76CC18B63837636437\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E6219CAE81DD60CC18B63837636437\",\"preferredThinktime\":0,\"thinktime\":1137,\"isWeb\":false,\"description\":\"Think <i>1,137<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"3393CA2292544329B2A78FB9C194A977\",\"timeout\":0},{\"description\":\"Click on <b>Button<\\/b> located at position 5\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"3393CA2292544329B2A78FB9C194A977\",\"timeout\":0,\"uid\":\"A1E6219CAE81DD60CC18B63837636437\",\"substitutionParameters\":[{\"variableKey\":\"MOEB_FIELD\\/TLC:A1E6219CAE81DD70CC18B63837636437\\/TPM:A1E6219CAE81DD76CC18B63837636437\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"5\"}],\"isWeb\":false,\"action\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"click\",\"parameters\":[]},\"sync_policy\":\"SYNC-WITH-NEXT-STEP\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIButton\",\"locator\":{\"parameter\":{\"$ref\":\"3\"},\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LPosition\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_3 = new DataSub();
		stepBatch.addDataSub(subContainer_3);
	ISubRule sub_2 = new SubRule("MOEB_FIELD/TLC:A1E6219CAE81DD70CC18B63837636437/TPM:A1E6219CAE81DD76CC18B63837636437", 0, 1, false, (IDCCoreVar)dcVars[2], false, "5_3", null, 0, false);
	subContainer_3.addSubInstruction(sub_2);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_4(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "PowerChart - Click on Button located at position 5",
												  "A1E6219CAEAFA423CC18B63837636437",
												  "{\"variables\":[{\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"5\",\"key\":\"MOEB_FIELD\\/TLC:A1E6219CAEAFA433CC18B63837636437\\/TPM:A1E6219CAEAFA439CC18B63837636437\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E6219CAEAFA423CC18B63837636437\",\"preferredThinktime\":0,\"thinktime\":1137,\"isWeb\":false,\"description\":\"Think <i>1,137<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"3393CA2292544329B2A78FB9C194A977\",\"timeout\":0},{\"description\":\"Click on <b>Button<\\/b> located at position 5\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"3393CA2292544329B2A78FB9C194A977\",\"timeout\":0,\"uid\":\"A1E6219CAEAFA423CC18B63837636437\",\"substitutionParameters\":[{\"variableKey\":\"MOEB_FIELD\\/TLC:A1E6219CAEAFA433CC18B63837636437\\/TPM:A1E6219CAEAFA439CC18B63837636437\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"5\"}],\"isWeb\":false,\"action\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"click\",\"parameters\":[]},\"sync_policy\":\"SYNC-WITH-NEXT-STEP\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIButton\",\"locator\":{\"parameter\":{\"$ref\":\"3\"},\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LPosition\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_4 = new DataSub();
		stepBatch.addDataSub(subContainer_4);
	ISubRule sub_3 = new SubRule("MOEB_FIELD/TLC:A1E6219CAEAFA433CC18B63837636437/TPM:A1E6219CAEAFA439CC18B63837636437", 0, 1, false, (IDCCoreVar)dcVars[3], false, "5_4", null, 0, false);
	subContainer_4.addSubInstruction(sub_3);
	


		return stepBatch;
	}

}
