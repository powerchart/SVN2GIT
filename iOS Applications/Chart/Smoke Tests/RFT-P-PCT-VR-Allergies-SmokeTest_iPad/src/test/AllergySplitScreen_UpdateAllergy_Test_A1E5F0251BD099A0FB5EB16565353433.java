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
public class AllergySplitScreen_UpdateAllergy_Test_A1E5F0251BD099A0FB5EB16565353433 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	private DataVar[] vars = new DataVar[10];
	
    
    
	
	public AllergySplitScreen_UpdateAllergy_Test_A1E5F0251BD099A0FB5EB16565353433(IContainer container, String invocationId) {
		super(container, "AllergySplitScreen_UpdateAllergy", invocationId, "A1E5F0251BD099A0FB5EB16565353433");
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
	        	this.add(varAction_1(this));
		KDelay delay_1 = new KDelay(this, "Delay (20 sec.)", "A1E5F028ADB13CA0FB5EB16565353433", 20, 1000);
		this.add(delay_1);
		
	this.add(applicationContext_1(this));
	this.add(applicationContext_2(this));
	this.add(applicationContext_3(this));
	this.add(applicationContext_4(this));
	this.add(applicationContext_5(this));
	this.add(applicationContext_6(this));
	this.add(applicationContext_7(this));
	this.add(applicationContext_8(this));
	this.add(applicationContext_9(this));
	this.add(applicationContext_10(this));
	this.add(applicationContext_11(this));
	this.add(applicationContext_12(this));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: AllergySplitScreen_UpdateAllergy_Test_A1E5F0251BD099A0FB5EB16565353433 ",e);
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

	VariableAction vc = new VariableAction(parent, "", "A1E5F0251BD099BEFB5EB16565353433");	
			vars[0] = new DataVar("var_Category_Old", null, IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[1] = new DataVar("var_Category_New", null, IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[2] = new DataVar("var_Type_old", null, IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[3] = new DataVar("var_Type_New", null, IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[4] = new DataVar("var_Serverity_Old", null, IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[5] = new DataVar("var_Serverity_New", null, IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[6] = new DataVar("var_Status_Old", null, IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[7] = new DataVar("var_Status_New", null, IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[8] = new DataVar("var_Source_Old", null, IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[9] = new DataVar("var_Source_New", null, IDataArea.VIRTUALUSER, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on the item containing Label 'Aredia' in Table view covering Label 'Aredia'",
												  "A1E5F0252A6338B0FB5EB16565353433",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5F0252A6338B0FB5EB16565353433\",\"preferredThinktime\":0,\"thinktime\":6195,\"isWeb\":false,\"description\":\"Think <i>6,195<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0},{\"uid\":\"A1E5F0252A6338B0FB5EB16565353433\",\"isWeb\":false,\"description\":\"Click on the item containing Label <b>'Aredia'<\\/b> in Table view covering Label <b>'Aredia'<\\/b>\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"clickItem\",\"parameters\":[{\"name\":\"position\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"1\"},{\"name\":\"section\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"1\"},{\"name\":\"Object\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Aredia\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},{\"name\":\"_mode_\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"UITableView.ClickItem.GroupObject\"}]},\"sync_policy\":\"WAIT-NOT-BUSY\",\"id\":\"2\",\"to_overriden\":true,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":30,\"object\":{\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Aredia\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LCover\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_2(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on the item containing Label 'Var_Old_Category' in Table view covering Label 'Var_Old_Category'",
												  "A1E5F0252D12C851FB5EB16565353433",
												  "{\"variables\":[{\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_Old_Category\",\"key\":\"MOEB_FIELD\\/TPM:A1E5F0252F4587D8FB5EB16565353433\\/WID:A1E5F0252F3FE18FFB5EB16565353433\\/IDB:A1E5F0252F4587D0FB5EB16565353433\"},{\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_Old_Category\",\"key\":\"MOEB_FIELD\\/TLC:A1E5F02742433640FB5EB16565353433\\/TPM:A1E5F02742433644FB5EB16565353433\\/WID:A1E5F02742433648FB5EB16565353433\\/IDB:A1E5F02770499750FB5EB16565353433\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5F0252D12C851FB5EB16565353433\",\"preferredThinktime\":0,\"thinktime\":289,\"isWeb\":false,\"description\":\"Think <i>289<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0},{\"description\":\"Click on the item containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TPM:A1E5F0252F4587D8FB5EB16565353433\\/WID:A1E5F0252F3FE18FFB5EB16565353433\\/IDB:A1E5F0252F4587D0FB5EB16565353433\\\">Var_Old_Category<\\/subst>'<\\/b> in Table view covering Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5F02742433640FB5EB16565353433\\/TPM:A1E5F02742433644FB5EB16565353433\\/WID:A1E5F02742433648FB5EB16565353433\\/IDB:A1E5F02770499750FB5EB16565353433\\\">Var_Old_Category<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"uid\":\"A1E5F0252D12C851FB5EB16565353433\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E5F0252F4587D8FB5EB16565353433\\/WID:A1E5F0252F3FE18FFB5EB16565353433\\/IDB:A1E5F0252F4587D0FB5EB16565353433\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_Old_Category\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5F02742433640FB5EB16565353433\\/TPM:A1E5F02742433644FB5EB16565353433\\/WID:A1E5F02742433648FB5EB16565353433\\/IDB:A1E5F02770499750FB5EB16565353433\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_Old_Category\"}],\"isWeb\":false,\"action\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"clickItem\",\"parameters\":[{\"name\":\"position\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"1\"},{\"name\":\"section\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"1\"},{\"name\":\"Object\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"3\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},{\"name\":\"_mode_\",\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"UITableView.ClickItem.GroupObject\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"4\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LCover\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_1 = new DataSub();
		stepBatch.addDataSub(subContainer_1);
	ISubRule sub_0 = new SubRule("MOEB_FIELD/TPM:A1E5F0252F4587D8FB5EB16565353433/WID:A1E5F0252F3FE18FFB5EB16565353433/IDB:A1E5F0252F4587D0FB5EB16565353433", 0, 16, false, (IDCCoreVar)vars[0], false, "Var_Old_Category", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	
	ISubRule sub_1 = new SubRule("MOEB_FIELD/TLC:A1E5F02742433640FB5EB16565353433/TPM:A1E5F02742433644FB5EB16565353433/WID:A1E5F02742433648FB5EB16565353433/IDB:A1E5F02770499750FB5EB16565353433", 0, 16, false, (IDCCoreVar)vars[0], false, "Var_Old_Category", null, 0, false);
	subContainer_1.addSubInstruction(sub_1);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_3(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on the item containing Label 'Var_New_Category' in Table view covering Label 'Var_New_Category'",
												  "A1E5F02531FDF043FB5EB16565353433",
												  "{\"variables\":[{\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_New_Category\",\"key\":\"MOEB_FIELD\\/TPM:A1E5F02534BDFA78FB5EB16565353433\\/WID:A1E5F02534B7441BFB5EB16565353433\\/IDB:A1E5F02534BDFA70FB5EB16565353433\"},{\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_New_Category\",\"key\":\"MOEB_FIELD\\/TLC:A1E5F025326AE2D4FB5EB16565353433\\/TPM:A1E5F025326AE2DDFB5EB16565353433\\/WID:A1E5F025326AE2D8FB5EB16565353433\\/IDB:A1E5F025326AE2CDFB5EB16565353433\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5F02531FDF043FB5EB16565353433\",\"preferredThinktime\":0,\"thinktime\":1,\"isWeb\":false,\"description\":\"Think <i>1<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0},{\"description\":\"Click on the item containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TPM:A1E5F02534BDFA78FB5EB16565353433\\/WID:A1E5F02534B7441BFB5EB16565353433\\/IDB:A1E5F02534BDFA70FB5EB16565353433\\\">Var_New_Category<\\/subst>'<\\/b> in Table view covering Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5F025326AE2D4FB5EB16565353433\\/TPM:A1E5F025326AE2DDFB5EB16565353433\\/WID:A1E5F025326AE2D8FB5EB16565353433\\/IDB:A1E5F025326AE2CDFB5EB16565353433\\\">Var_New_Category<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"uid\":\"A1E5F02531FDF043FB5EB16565353433\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E5F02534BDFA78FB5EB16565353433\\/WID:A1E5F02534B7441BFB5EB16565353433\\/IDB:A1E5F02534BDFA70FB5EB16565353433\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_New_Category\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5F025326AE2D4FB5EB16565353433\\/TPM:A1E5F025326AE2DDFB5EB16565353433\\/WID:A1E5F025326AE2D8FB5EB16565353433\\/IDB:A1E5F025326AE2CDFB5EB16565353433\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_New_Category\"}],\"isWeb\":false,\"action\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"clickItem\",\"parameters\":[{\"name\":\"position\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"2\"},{\"name\":\"Object\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"3\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},{\"name\":\"_mode_\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"UITableView.ClickItem.GroupObject\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"4\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LCover\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_2 = new DataSub();
		stepBatch.addDataSub(subContainer_2);
	ISubRule sub_2 = new SubRule("MOEB_FIELD/TPM:A1E5F02534BDFA78FB5EB16565353433/WID:A1E5F02534B7441BFB5EB16565353433/IDB:A1E5F02534BDFA70FB5EB16565353433", 0, 16, false, (IDCCoreVar)vars[1], false, "Var_New_Category", null, 0, false);
	subContainer_2.addSubInstruction(sub_2);
	
	ISubRule sub_3 = new SubRule("MOEB_FIELD/TLC:A1E5F025326AE2D4FB5EB16565353433/TPM:A1E5F025326AE2DDFB5EB16565353433/WID:A1E5F025326AE2D8FB5EB16565353433/IDB:A1E5F025326AE2CDFB5EB16565353433", 0, 16, false, (IDCCoreVar)vars[1], false, "Var_New_Category", null, 0, false);
	subContainer_2.addSubInstruction(sub_3);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_4(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on the item containing Label 'var_old_Type' in Table view covering Label 'var_old_Type'",
												  "A1E5F025374FC8F0FB5EB16565353433",
												  "{\"variables\":[{\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"var_old_Type\",\"key\":\"MOEB_FIELD\\/TPM:A1E5F0253A1551DDFB5EB16565353433\\/WID:A1E5F0253A0FFA5FFB5EB16565353433\\/IDB:A1E5F0253A1551D5FB5EB16565353433\"},{\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"var_old_Type\",\"key\":\"MOEB_FIELD\\/TLC:A1E5F0253773CBAEFB5EB16565353433\\/TPM:A1E5F0253773CBB7FB5EB16565353433\\/WID:A1E5F0253773CBB2FB5EB16565353433\\/IDB:A1E5F0253773CBA7FB5EB16565353433\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5F025374FC8F0FB5EB16565353433\",\"preferredThinktime\":0,\"thinktime\":361,\"isWeb\":false,\"description\":\"Think <i>361<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0},{\"description\":\"Click on the item containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TPM:A1E5F0253A1551DDFB5EB16565353433\\/WID:A1E5F0253A0FFA5FFB5EB16565353433\\/IDB:A1E5F0253A1551D5FB5EB16565353433\\\">var_old_Type<\\/subst>'<\\/b> in Table view covering Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5F0253773CBAEFB5EB16565353433\\/TPM:A1E5F0253773CBB7FB5EB16565353433\\/WID:A1E5F0253773CBB2FB5EB16565353433\\/IDB:A1E5F0253773CBA7FB5EB16565353433\\\">var_old_Type<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"uid\":\"A1E5F025374FC8F0FB5EB16565353433\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E5F0253A1551DDFB5EB16565353433\\/WID:A1E5F0253A0FFA5FFB5EB16565353433\\/IDB:A1E5F0253A1551D5FB5EB16565353433\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"var_old_Type\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5F0253773CBAEFB5EB16565353433\\/TPM:A1E5F0253773CBB7FB5EB16565353433\\/WID:A1E5F0253773CBB2FB5EB16565353433\\/IDB:A1E5F0253773CBA7FB5EB16565353433\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"var_old_Type\"}],\"isWeb\":false,\"action\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"clickItem\",\"parameters\":[{\"name\":\"position\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"2\"},{\"name\":\"section\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"1\"},{\"name\":\"Object\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"3\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},{\"name\":\"_mode_\",\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"UITableView.ClickItem.GroupObject\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"4\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LCover\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_3 = new DataSub();
		stepBatch.addDataSub(subContainer_3);
	ISubRule sub_4 = new SubRule("MOEB_FIELD/TPM:A1E5F0253A1551DDFB5EB16565353433/WID:A1E5F0253A0FFA5FFB5EB16565353433/IDB:A1E5F0253A1551D5FB5EB16565353433", 0, 12, false, (IDCCoreVar)vars[2], false, "var_old_Type", null, 0, false);
	subContainer_3.addSubInstruction(sub_4);
	
	ISubRule sub_5 = new SubRule("MOEB_FIELD/TLC:A1E5F0253773CBAEFB5EB16565353433/TPM:A1E5F0253773CBB7FB5EB16565353433/WID:A1E5F0253773CBB2FB5EB16565353433/IDB:A1E5F0253773CBA7FB5EB16565353433", 0, 12, false, (IDCCoreVar)vars[2], false, "var_old_Type", null, 0, false);
	subContainer_3.addSubInstruction(sub_5);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_5(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on the item containing Label 'Var_New_Side Effect' in Table view covering Label 'Var_New_Side Effect'",
												  "A1E5F0253D3BBED0FB5EB16565353433",
												  "{\"variables\":[{\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_New_Side Effect\",\"key\":\"MOEB_FIELD\\/TPM:A1E5F0254063B2C8FB5EB16565353433\\/WID:A1E5F025405D7138FB5EB16565353433\\/IDB:A1E5F0254063B2C0FB5EB16565353433\"},{\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_New_Side Effect\",\"key\":\"MOEB_FIELD\\/TLC:A1E5F0253DA9C312FB5EB16565353433\\/TPM:A1E5F0253DA9C31BFB5EB16565353433\\/WID:A1E5F0253DA9C316FB5EB16565353433\\/IDB:A1E5F0253DA9C30BFB5EB16565353433\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5F0253D3BBED0FB5EB16565353433\",\"preferredThinktime\":0,\"thinktime\":1,\"isWeb\":false,\"description\":\"Think <i>1<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0},{\"description\":\"Click on the item containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TPM:A1E5F0254063B2C8FB5EB16565353433\\/WID:A1E5F025405D7138FB5EB16565353433\\/IDB:A1E5F0254063B2C0FB5EB16565353433\\\">Var_New_Side Effect<\\/subst>'<\\/b> in Table view covering Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5F0253DA9C312FB5EB16565353433\\/TPM:A1E5F0253DA9C31BFB5EB16565353433\\/WID:A1E5F0253DA9C316FB5EB16565353433\\/IDB:A1E5F0253DA9C30BFB5EB16565353433\\\">Var_New_Side Effect<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"uid\":\"A1E5F0253D3BBED0FB5EB16565353433\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E5F0254063B2C8FB5EB16565353433\\/WID:A1E5F025405D7138FB5EB16565353433\\/IDB:A1E5F0254063B2C0FB5EB16565353433\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_New_Side Effect\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5F0253DA9C312FB5EB16565353433\\/TPM:A1E5F0253DA9C31BFB5EB16565353433\\/WID:A1E5F0253DA9C316FB5EB16565353433\\/IDB:A1E5F0253DA9C30BFB5EB16565353433\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_New_Side Effect\"}],\"isWeb\":false,\"action\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"clickItem\",\"parameters\":[{\"name\":\"position\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"2\"},{\"name\":\"Object\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"3\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},{\"name\":\"_mode_\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"UITableView.ClickItem.GroupObject\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"4\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LCover\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_4 = new DataSub();
		stepBatch.addDataSub(subContainer_4);
	ISubRule sub_6 = new SubRule("MOEB_FIELD/TPM:A1E5F0254063B2C8FB5EB16565353433/WID:A1E5F025405D7138FB5EB16565353433/IDB:A1E5F0254063B2C0FB5EB16565353433", 0, 19, false, (IDCCoreVar)vars[3], false, "Var_New_Side Effect", null, 0, false);
	subContainer_4.addSubInstruction(sub_6);
	
	ISubRule sub_7 = new SubRule("MOEB_FIELD/TLC:A1E5F0253DA9C312FB5EB16565353433/TPM:A1E5F0253DA9C31BFB5EB16565353433/WID:A1E5F0253DA9C316FB5EB16565353433/IDB:A1E5F0253DA9C30BFB5EB16565353433", 0, 19, false, (IDCCoreVar)vars[3], false, "Var_New_Side Effect", null, 0, false);
	subContainer_4.addSubInstruction(sub_7);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_6(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on the item containing Label 'Var_old_Severity' in Table view covering Label 'Var_old_Severity'",
												  "A1E5F02542F189A0FB5EB16565353433",
												  "{\"variables\":[{\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_old_Severity\",\"key\":\"MOEB_FIELD\\/TPM:A1E5F02545C08948FB5EB16565353433\\/WID:A1E5F02545BB7F16FB5EB16565353433\\/IDB:A1E5F02545C08940FB5EB16565353433\"},{\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_old_Severity\",\"key\":\"MOEB_FIELD\\/TLC:A1E5F02543158C57FB5EB16565353433\\/TPM:A1E5F02543158C60FB5EB16565353433\\/WID:A1E5F02543158C5BFB5EB16565353433\\/IDB:A1E5F02543158C50FB5EB16565353433\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5F02542F189A0FB5EB16565353433\",\"preferredThinktime\":0,\"thinktime\":326,\"isWeb\":false,\"description\":\"Think <i>326<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0},{\"description\":\"Click on the item containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TPM:A1E5F02545C08948FB5EB16565353433\\/WID:A1E5F02545BB7F16FB5EB16565353433\\/IDB:A1E5F02545C08940FB5EB16565353433\\\">Var_old_Severity<\\/subst>'<\\/b> in Table view covering Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5F02543158C57FB5EB16565353433\\/TPM:A1E5F02543158C60FB5EB16565353433\\/WID:A1E5F02543158C5BFB5EB16565353433\\/IDB:A1E5F02543158C50FB5EB16565353433\\\">Var_old_Severity<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"uid\":\"A1E5F02542F189A0FB5EB16565353433\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E5F02545C08948FB5EB16565353433\\/WID:A1E5F02545BB7F16FB5EB16565353433\\/IDB:A1E5F02545C08940FB5EB16565353433\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_old_Severity\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5F02543158C57FB5EB16565353433\\/TPM:A1E5F02543158C60FB5EB16565353433\\/WID:A1E5F02543158C5BFB5EB16565353433\\/IDB:A1E5F02543158C50FB5EB16565353433\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_old_Severity\"}],\"isWeb\":false,\"action\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"clickItem\",\"parameters\":[{\"name\":\"position\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"3\"},{\"name\":\"section\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"1\"},{\"name\":\"Object\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"3\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},{\"name\":\"_mode_\",\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"UITableView.ClickItem.GroupObject\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"4\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LCover\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_5 = new DataSub();
		stepBatch.addDataSub(subContainer_5);
	ISubRule sub_8 = new SubRule("MOEB_FIELD/TPM:A1E5F02545C08948FB5EB16565353433/WID:A1E5F02545BB7F16FB5EB16565353433/IDB:A1E5F02545C08940FB5EB16565353433", 0, 16, false, (IDCCoreVar)vars[4], false, "Var_old_Severity", null, 0, false);
	subContainer_5.addSubInstruction(sub_8);
	
	ISubRule sub_9 = new SubRule("MOEB_FIELD/TLC:A1E5F02543158C57FB5EB16565353433/TPM:A1E5F02543158C60FB5EB16565353433/WID:A1E5F02543158C5BFB5EB16565353433/IDB:A1E5F02543158C50FB5EB16565353433", 0, 16, false, (IDCCoreVar)vars[4], false, "Var_old_Severity", null, 0, false);
	subContainer_5.addSubInstruction(sub_9);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_7(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on the item containing Label 'var_new_Severity' in Table view covering Label 'var_new_Severity'",
												  "A1E5F02C1AA9539CFB5EB16565353433",
												  "{\"variables\":[{\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"var_new_Severity\",\"key\":\"MOEB_FIELD\\/TPM:A1E5F02C24898E10FB5EB16565353433\\/WID:A1E5F02C24898E15FB5EB16565353433\\/IDB:A1E5F02C49997851FB5EB16565353433\"},{\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"var_new_Severity\",\"key\":\"MOEB_FIELD\\/TLC:A1E5F02C1A0E251BFB5EB16565353433\\/TPM:A1E5F02C1A0E2524FB5EB16565353433\\/WID:A1E5F02C1A0E251FFB5EB16565353433\\/IDB:A1E5F02C1A0E2514FB5EB16565353433\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5F02C1AA9539CFB5EB16565353433\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E5F02C24898E10FB5EB16565353433\\/WID:A1E5F02C24898E15FB5EB16565353433\\/IDB:A1E5F02C49997851FB5EB16565353433\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"var_new_Severity\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5F02C1A0E251BFB5EB16565353433\\/TPM:A1E5F02C1A0E2524FB5EB16565353433\\/WID:A1E5F02C1A0E251FFB5EB16565353433\\/IDB:A1E5F02C1A0E2514FB5EB16565353433\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"var_new_Severity\"}],\"isWeb\":false,\"description\":\"Click on the item containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TPM:A1E5F02C24898E10FB5EB16565353433\\/WID:A1E5F02C24898E15FB5EB16565353433\\/IDB:A1E5F02C49997851FB5EB16565353433\\\">var_new_Severity<\\/subst>'<\\/b> in Table view covering Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5F02C1A0E251BFB5EB16565353433\\/TPM:A1E5F02C1A0E2524FB5EB16565353433\\/WID:A1E5F02C1A0E251FFB5EB16565353433\\/IDB:A1E5F02C1A0E2514FB5EB16565353433\\\">var_new_Severity<\\/subst>'<\\/b>\",\"action\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"clickItem\",\"parameters\":[{\"name\":\"position\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"0\"},{\"name\":\"section\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"1\"},{\"name\":\"Object\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"2\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},{\"name\":\"_mode_\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"UITableView.ClickItem.GroupObject\"}]},\"id\":\"1\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"object\":{\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"3\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LCover\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_6 = new DataSub();
		stepBatch.addDataSub(subContainer_6);
	ISubRule sub_10 = new SubRule("MOEB_FIELD/TPM:A1E5F02C24898E10FB5EB16565353433/WID:A1E5F02C24898E15FB5EB16565353433/IDB:A1E5F02C49997851FB5EB16565353433", 0, 16, false, (IDCCoreVar)vars[5], false, "var_new_Severity", null, 0, false);
	subContainer_6.addSubInstruction(sub_10);
	
	ISubRule sub_11 = new SubRule("MOEB_FIELD/TLC:A1E5F02C1A0E251BFB5EB16565353433/TPM:A1E5F02C1A0E2524FB5EB16565353433/WID:A1E5F02C1A0E251FFB5EB16565353433/IDB:A1E5F02C1A0E2514FB5EB16565353433", 0, 16, false, (IDCCoreVar)vars[5], false, "var_new_Severity", null, 0, false);
	subContainer_6.addSubInstruction(sub_11);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_8(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on the item containing Label 'Var_old_Status' in Table view containing Label 'Var_old_Status'",
												  "A1E5F02550DAA240FB5EB16565353433",
												  "{\"variables\":[{\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_old_Status\",\"key\":\"MOEB_FIELD\\/TPM:A1E5F025538C5520FB5EB16565353433\\/WID:A1E5F02553874BAFFB5EB16565353433\\/IDB:A1E5F025538C5518FB5EB16565353433\"},{\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_old_Status\",\"key\":\"MOEB_FIELD\\/TLC:A1E5F02550FC5B15FB5EB16565353433\\/TPM:A1E5F02550FC5B1EFB5EB16565353433\\/WID:A1E5F02550FC5B19FB5EB16565353433\\/IDB:A1E5F02550FC5B0EFB5EB16565353433\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5F02550DAA240FB5EB16565353433\",\"preferredThinktime\":0,\"thinktime\":303,\"isWeb\":false,\"description\":\"Think <i>303<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0},{\"description\":\"Click on the item containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TPM:A1E5F025538C5520FB5EB16565353433\\/WID:A1E5F02553874BAFFB5EB16565353433\\/IDB:A1E5F025538C5518FB5EB16565353433\\\">Var_old_Status<\\/subst>'<\\/b> in Table view containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5F02550FC5B15FB5EB16565353433\\/TPM:A1E5F02550FC5B1EFB5EB16565353433\\/WID:A1E5F02550FC5B19FB5EB16565353433\\/IDB:A1E5F02550FC5B0EFB5EB16565353433\\\">Var_old_Status<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"uid\":\"A1E5F02550DAA240FB5EB16565353433\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E5F025538C5520FB5EB16565353433\\/WID:A1E5F02553874BAFFB5EB16565353433\\/IDB:A1E5F025538C5518FB5EB16565353433\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_old_Status\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5F02550FC5B15FB5EB16565353433\\/TPM:A1E5F02550FC5B1EFB5EB16565353433\\/WID:A1E5F02550FC5B19FB5EB16565353433\\/IDB:A1E5F02550FC5B0EFB5EB16565353433\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_old_Status\"}],\"isWeb\":false,\"action\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"clickItem\",\"parameters\":[{\"name\":\"position\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"4\"},{\"name\":\"section\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"1\"},{\"name\":\"Object\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"3\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},{\"name\":\"_mode_\",\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"UITableView.ClickItem.GroupObject\"}]},\"sync_policy\":\"SYNC-WITH-NEXT-STEP\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"4\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LContain\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_7 = new DataSub();
		stepBatch.addDataSub(subContainer_7);
	ISubRule sub_12 = new SubRule("MOEB_FIELD/TPM:A1E5F025538C5520FB5EB16565353433/WID:A1E5F02553874BAFFB5EB16565353433/IDB:A1E5F025538C5518FB5EB16565353433", 0, 14, false, (IDCCoreVar)vars[6], false, "Var_old_Status", null, 0, false);
	subContainer_7.addSubInstruction(sub_12);
	
	ISubRule sub_13 = new SubRule("MOEB_FIELD/TLC:A1E5F02550FC5B15FB5EB16565353433/TPM:A1E5F02550FC5B1EFB5EB16565353433/WID:A1E5F02550FC5B19FB5EB16565353433/IDB:A1E5F02550FC5B0EFB5EB16565353433", 0, 14, false, (IDCCoreVar)vars[6], false, "Var_old_Status", null, 0, false);
	subContainer_7.addSubInstruction(sub_13);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_9(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on the item containing Label 'Var_new_Status' in Table view covering Label 'Var_new_Status'",
												  "A1E5F02556FF3458FB5EB16565353433",
												  "{\"variables\":[{\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_new_Status\",\"key\":\"MOEB_FIELD\\/TPM:A1E5F0255A824098FB5EB16565353433\\/WID:A1E5F0255A7BB0E8FB5EB16565353433\\/IDB:A1E5F0255A824090FB5EB16565353433\"},{\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_new_Status\",\"key\":\"MOEB_FIELD\\/TLC:A1E5F02557B60162FB5EB16565353433\\/TPM:A1E5F02557B6016BFB5EB16565353433\\/WID:A1E5F02557B60166FB5EB16565353433\\/IDB:A1E5F02557B6015BFB5EB16565353433\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5F02556FF3458FB5EB16565353433\",\"preferredThinktime\":0,\"thinktime\":498,\"isWeb\":false,\"description\":\"Think <i>498<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0},{\"description\":\"Click on the item containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TPM:A1E5F0255A824098FB5EB16565353433\\/WID:A1E5F0255A7BB0E8FB5EB16565353433\\/IDB:A1E5F0255A824090FB5EB16565353433\\\">Var_new_Status<\\/subst>'<\\/b> in Table view covering Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5F02557B60162FB5EB16565353433\\/TPM:A1E5F02557B6016BFB5EB16565353433\\/WID:A1E5F02557B60166FB5EB16565353433\\/IDB:A1E5F02557B6015BFB5EB16565353433\\\">Var_new_Status<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"uid\":\"A1E5F02556FF3458FB5EB16565353433\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E5F0255A824098FB5EB16565353433\\/WID:A1E5F0255A7BB0E8FB5EB16565353433\\/IDB:A1E5F0255A824090FB5EB16565353433\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_new_Status\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5F02557B60162FB5EB16565353433\\/TPM:A1E5F02557B6016BFB5EB16565353433\\/WID:A1E5F02557B60166FB5EB16565353433\\/IDB:A1E5F02557B6015BFB5EB16565353433\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_new_Status\"}],\"isWeb\":false,\"action\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"clickItem\",\"parameters\":[{\"name\":\"position\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"2\"},{\"name\":\"Object\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"3\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},{\"name\":\"_mode_\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"UITableView.ClickItem.GroupObject\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"4\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LCover\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_8 = new DataSub();
		stepBatch.addDataSub(subContainer_8);
	ISubRule sub_14 = new SubRule("MOEB_FIELD/TPM:A1E5F0255A824098FB5EB16565353433/WID:A1E5F0255A7BB0E8FB5EB16565353433/IDB:A1E5F0255A824090FB5EB16565353433", 0, 14, false, (IDCCoreVar)vars[7], false, "Var_new_Status", null, 0, false);
	subContainer_8.addSubInstruction(sub_14);
	
	ISubRule sub_15 = new SubRule("MOEB_FIELD/TLC:A1E5F02557B60162FB5EB16565353433/TPM:A1E5F02557B6016BFB5EB16565353433/WID:A1E5F02557B60166FB5EB16565353433/IDB:A1E5F02557B6015BFB5EB16565353433", 0, 14, false, (IDCCoreVar)vars[7], false, "Var_new_Status", null, 0, false);
	subContainer_8.addSubInstruction(sub_15);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_10(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on the item containing Label 'var_Old_Source' in Table view containing Label 'var_Old_Source'",
												  "A1E5F02A26C3FFA3FB5EB16565353433",
												  "{\"variables\":[{\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"var_Old_Source\",\"key\":\"MOEB_FIELD\\/TPM:A1E5F02A26C426BFFB5EB16565353433\\/WID:A1E5F02A26C426C9FB5EB16565353433\\/IDB:A1E5F02A26C426D3FB5EB16565353433\"},{\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"var_Old_Source\",\"key\":\"MOEB_FIELD\\/TLC:A1E5F02A26C3FFB5FB5EB16565353433\\/TPM:A1E5F02A26C3FFBBFB5EB16565353433\\/WID:A1E5F02A26C3FFC5FB5EB16565353433\\/IDB:A1E5F02A26C3FFCFFB5EB16565353433\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5F02A26C3FFA3FB5EB16565353433\",\"preferredThinktime\":0,\"thinktime\":303,\"isWeb\":false,\"description\":\"Think <i>303<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0},{\"description\":\"Click on the item containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TPM:A1E5F02A26C426BFFB5EB16565353433\\/WID:A1E5F02A26C426C9FB5EB16565353433\\/IDB:A1E5F02A26C426D3FB5EB16565353433\\\">var_Old_Source<\\/subst>'<\\/b> in Table view containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5F02A26C3FFB5FB5EB16565353433\\/TPM:A1E5F02A26C3FFBBFB5EB16565353433\\/WID:A1E5F02A26C3FFC5FB5EB16565353433\\/IDB:A1E5F02A26C3FFCFFB5EB16565353433\\\">var_Old_Source<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"uid\":\"A1E5F02A26C3FFA3FB5EB16565353433\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E5F02A26C426BFFB5EB16565353433\\/WID:A1E5F02A26C426C9FB5EB16565353433\\/IDB:A1E5F02A26C426D3FB5EB16565353433\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"var_Old_Source\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5F02A26C3FFB5FB5EB16565353433\\/TPM:A1E5F02A26C3FFBBFB5EB16565353433\\/WID:A1E5F02A26C3FFC5FB5EB16565353433\\/IDB:A1E5F02A26C3FFCFFB5EB16565353433\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"var_Old_Source\"}],\"isWeb\":false,\"action\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"clickItem\",\"parameters\":[{\"name\":\"position\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"4\"},{\"name\":\"section\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"1\"},{\"name\":\"Object\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"3\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},{\"name\":\"_mode_\",\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"UITableView.ClickItem.GroupObject\"}]},\"sync_policy\":\"SYNC-WITH-NEXT-STEP\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"4\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LContain\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_9 = new DataSub();
		stepBatch.addDataSub(subContainer_9);
	ISubRule sub_16 = new SubRule("MOEB_FIELD/TPM:A1E5F02A26C426BFFB5EB16565353433/WID:A1E5F02A26C426C9FB5EB16565353433/IDB:A1E5F02A26C426D3FB5EB16565353433", 0, 14, false, (IDCCoreVar)vars[8], false, "var_Old_Source", null, 0, false);
	subContainer_9.addSubInstruction(sub_16);
	
	ISubRule sub_17 = new SubRule("MOEB_FIELD/TLC:A1E5F02A26C3FFB5FB5EB16565353433/TPM:A1E5F02A26C3FFBBFB5EB16565353433/WID:A1E5F02A26C3FFC5FB5EB16565353433/IDB:A1E5F02A26C3FFCFFB5EB16565353433", 0, 14, false, (IDCCoreVar)vars[8], false, "var_Old_Source", null, 0, false);
	subContainer_9.addSubInstruction(sub_17);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_11(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on the item containing Label 'var_New_Source' in Table view covering Label 'var_New_Source'",
												  "A1E5F02570648440FB5EB16565353433",
												  "{\"variables\":[{\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"var_New_Source\",\"key\":\"MOEB_FIELD\\/TPM:A1E5F025773A3DF8FB5EB16565353433\\/WID:A1E5F0257733D550FB5EB16565353433\\/IDB:A1E5F025773A3DF0FB5EB16565353433\"},{\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"var_New_Source\",\"key\":\"MOEB_FIELD\\/TLC:A1E5F02571757F1EFB5EB16565353433\\/TPM:A1E5F02571757F27FB5EB16565353433\\/WID:A1E5F02571757F22FB5EB16565353433\\/IDB:A1E5F02571757F17FB5EB16565353433\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5F02570648440FB5EB16565353433\",\"preferredThinktime\":0,\"thinktime\":456,\"isWeb\":false,\"description\":\"Think <i>456<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0},{\"description\":\"Click on the item containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TPM:A1E5F025773A3DF8FB5EB16565353433\\/WID:A1E5F0257733D550FB5EB16565353433\\/IDB:A1E5F025773A3DF0FB5EB16565353433\\\">var_New_Source<\\/subst>'<\\/b> in Table view covering Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5F02571757F1EFB5EB16565353433\\/TPM:A1E5F02571757F27FB5EB16565353433\\/WID:A1E5F02571757F22FB5EB16565353433\\/IDB:A1E5F02571757F17FB5EB16565353433\\\">var_New_Source<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"uid\":\"A1E5F02570648440FB5EB16565353433\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E5F025773A3DF8FB5EB16565353433\\/WID:A1E5F0257733D550FB5EB16565353433\\/IDB:A1E5F025773A3DF0FB5EB16565353433\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"var_New_Source\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5F02571757F1EFB5EB16565353433\\/TPM:A1E5F02571757F27FB5EB16565353433\\/WID:A1E5F02571757F22FB5EB16565353433\\/IDB:A1E5F02571757F17FB5EB16565353433\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"var_New_Source\"}],\"isWeb\":false,\"action\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"clickItem\",\"parameters\":[{\"name\":\"position\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"2\"},{\"name\":\"Object\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"3\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},{\"name\":\"_mode_\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"UITableView.ClickItem.GroupObject\"}]},\"sync_policy\":\"SYNC-WITH-NEXT-STEP\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"4\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LCover\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_10 = new DataSub();
		stepBatch.addDataSub(subContainer_10);
	ISubRule sub_18 = new SubRule("MOEB_FIELD/TPM:A1E5F025773A3DF8FB5EB16565353433/WID:A1E5F0257733D550FB5EB16565353433/IDB:A1E5F025773A3DF0FB5EB16565353433", 0, 14, false, (IDCCoreVar)vars[9], false, "var_New_Source", null, 0, false);
	subContainer_10.addSubInstruction(sub_18);
	
	ISubRule sub_19 = new SubRule("MOEB_FIELD/TLC:A1E5F02571757F1EFB5EB16565353433/TPM:A1E5F02571757F27FB5EB16565353433/WID:A1E5F02571757F22FB5EB16565353433/IDB:A1E5F02571757F17FB5EB16565353433", 0, 14, false, (IDCCoreVar)vars[9], false, "var_New_Source", null, 0, false);
	subContainer_10.addSubInstruction(sub_19);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_12(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on Button 'Save' to the right of Label 'Allergies' to the right of Label 'Cancel'",
												  "A1E5F0280FF3C467FB5EB16565353433",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5F0280FF3C467FB5EB16565353433\",\"isWeb\":false,\"description\":\"Click on <b>Button<\\/b> <b>'Save'<\\/b> to the right of Label <b>'Allergies'<\\/b> to the right of Label <b>'Cancel'<\\/b>\",\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"click\",\"parameters\":[]},\"id\":\"1\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"object\":{\"identifier\":{\"expression\":\"currentTitle\",\"parameter\":{\"name\":\"currentTitle\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Save\"},\"name\":\"currentTitle\",\"expType\":\"getter\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIButton\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Allergies\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Cancel\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"}}},\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

}
