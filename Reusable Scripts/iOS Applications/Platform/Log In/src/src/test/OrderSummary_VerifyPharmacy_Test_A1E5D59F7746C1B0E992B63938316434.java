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

import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
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
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.impl.KDelay;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;

@SuppressWarnings("all")
public class OrderSummary_VerifyPharmacy_Test_A1E5D59F7746C1B0E992B63938316434 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
    }
	
	private DataVar[] vars = new DataVar[2];
	
    
    
	
	public OrderSummary_VerifyPharmacy_Test_A1E5D59F7746C1B0E992B63938316434(IContainer container, String invocationId) {
		super(container, "OrderSummary_VerifyPharmacy", invocationId, "A1E5D59F7746C1B0E992B63938316434");
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
	        	this.add(varAction_1(this));
		KDelay delay_1 = new KDelay(this, "Delay (3000 ms.)", "A1E5D5A05A0D68A0E992B63938316434", 3000, 1);
		this.add(delay_1);
		
	this.add(applicationContext_1(this));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: OrderSummary_VerifyPharmacy_Test_A1E5D59F7746C1B0E992B63938316434 ",e);
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
	
	private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1E5D594886080AEE992B63938316434");	
			vars[0] = new DataVar("Var_OrderSummaryPharmacyName", null, IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[1] = new DataVar("Var_OrderSummaryPharmacyAddress", null, IDataArea.VIRTUALUSER, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory",
												  "A1E5D5948862F190E992B63938316434",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5D59FD268FC02E992B63938316434\",\"id\":\"1\",\"substitutionParameters\":[{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"text\",\"value\":\"Var_OrderSummaryPharmacyName\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5D5B09625FAE0E992B63938316434\",\"type\":\"TString\"},{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"text\",\"value\":\"Var_OrderSummaryPharmacyAddress\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5D59FD22D794CE992B63938316434\\/TPM:A1E5D59FD22D7955E992B63938316434\\/WID:A1E5D59FD22D7950E992B63938316434\\/IDB:A1E5D59FD22D7945E992B63938316434\",\"type\":\"TString\"},{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"text\",\"value\":\"Var_OrderSummaryPharmacyName\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5D59FD268FC09E992B63938316434\\/TPM:A1E5D59FD268FC0DE992B63938316434\",\"type\":\"TString\"}],\"application_uid\":\"13043AA08BFCB50828961CB156759298\",\"to_overriden\":false,\"vpExpression\":{\"expression\":\"text\",\"id\":\"11\",\"parameter\":{\"$ref\":\"4\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"name\":\"text\",\"translatedName\":\"Text\",\"operator\":\"TEquals\",\"expType\":\"getter\"},\"isWeb\":false,\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5D59FD268FC09E992B63938316434\\/TPM:A1E5D59FD268FC0DE992B63938316434\\\">Var_OrderSummaryPharmacyName<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5D5B09625FAE0E992B63938316434\\\">Var_OrderSummaryPharmacyName<\\/subst>'<\\/b> above Label whose <b>Text<\\/b> contains <b><subst key=\\\"MOEB_FIELD\\/TLC:A1E5D59FD22D794CE992B63938316434\\/TPM:A1E5D59FD22D7955E992B63938316434\\/WID:A1E5D59FD22D7950E992B63938316434\\/IDB:A1E5D59FD22D7945E992B63938316434\\\">Var_OrderSummaryPharmacyAddress<\\/subst><\\/b>\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"object\":{\"id\":\"5\",\"locator\":{\"id\":\"7\",\"parameter\":{\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"objectId\",\"object\":{\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"identifier\":{\"expression\":\"text\",\"id\":\"10\",\"parameter\":{\"$ref\":\"3\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"name\":\"text\",\"operator\":\"TContains\",\"expType\":\"getter\"}},\"type\":\"TUIObject\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LAbove\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"identifier\":{\"expression\":\"text\",\"id\":\"6\",\"parameter\":{\"$ref\":\"2\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"name\":\"text\",\"operator\":\"TEquals\",\"expType\":\"getter\"}},\"skipScrollingIniOSDF\":false,\"retry\":false,\"timeout\":0}],\"timeout\":10,\"variables\":[{\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_OrderSummaryPharmacyName\",\"key\":\"MOEB_FIELD\\/IDB:A1E5D5B09625FAE0E992B63938316434\"},{\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_OrderSummaryPharmacyAddress\",\"key\":\"MOEB_FIELD\\/TLC:A1E5D59FD22D794CE992B63938316434\\/TPM:A1E5D59FD22D7955E992B63938316434\\/WID:A1E5D59FD22D7950E992B63938316434\\/IDB:A1E5D59FD22D7945E992B63938316434\"},{\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_OrderSummaryPharmacyName\",\"key\":\"MOEB_FIELD\\/TEX:A1E5D59FD268FC09E992B63938316434\\/TPM:A1E5D59FD268FC0DE992B63938316434\"}]}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_1 = new DataSub();
		stepBatch.addDataSub(subContainer_1);
	ISubRule sub_0 = new SubRule("MOEB_FIELD/IDB:A1E5D5B09625FAE0E992B63938316434", 0, 28, false, (IDCCoreVar)vars[0], false, "Var_OrderSummaryPharmacyName", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	
	ISubRule sub_1 = new SubRule("MOEB_FIELD/TLC:A1E5D59FD22D794CE992B63938316434/TPM:A1E5D59FD22D7955E992B63938316434/WID:A1E5D59FD22D7950E992B63938316434/IDB:A1E5D59FD22D7945E992B63938316434", 0, 31, false, (IDCCoreVar)vars[1], false, "Var_OrderSummaryPharmacyAddress", null, 0, false);
	subContainer_1.addSubInstruction(sub_1);
	
	ISubRule sub_2 = new SubRule("MOEB_FIELD/TEX:A1E5D59FD268FC09E992B63938316434/TPM:A1E5D59FD268FC0DE992B63938316434", 0, 28, false, (IDCCoreVar)vars[0], false, "Var_OrderSummaryPharmacyName_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_2);
	


		return stepBatch;
	}

}
