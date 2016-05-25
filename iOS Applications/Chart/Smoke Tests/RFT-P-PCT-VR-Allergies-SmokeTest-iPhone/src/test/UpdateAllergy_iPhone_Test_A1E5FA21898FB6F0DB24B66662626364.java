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
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;

@SuppressWarnings("all")
public class UpdateAllergy_iPhone_Test_A1E5FA21898FB6F0DB24B66662626364 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	private DataVar[] vars = new DataVar[12];
	
    
    
	
	public UpdateAllergy_iPhone_Test_A1E5FA21898FB6F0DB24B66662626364(IContainer container, String invocationId) {
		super(container, "UpdateAllergy_iPhone", invocationId, "A1E5FA21898FB6F0DB24B66662626364");
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
	this.add(applicationContext_13(this));
	this.add(applicationContext_14(this));
	this.add(applicationContext_15(this));
	this.add(applicationContext_16(this));
	this.add(applicationContext_17(this));
	this.add(applicationContext_18(this));
	this.add(applicationContext_19(this));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: UpdateAllergy_iPhone_Test_A1E5FA21898FB6F0DB24B66662626364 ",e);
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

	VariableAction vc = new VariableAction(parent, "", "A1E5FA21898FB70EDB24B66662626364");	
			vars[0] = new DataVar("var_Old_Category", null, IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[1] = new DataVar("var_Old_Type", null, IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[2] = new DataVar("var_Old_Severity", null, IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[3] = new DataVar("var_Old_Status", null, IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[4] = new DataVar("var_Old_Onset", null, IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[5] = new DataVar("var_Old_Source", null, IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[6] = new DataVar("var_New_Category", null, IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[7] = new DataVar("var_New_Type", null, IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[8] = new DataVar("var_New_Serverity", null, IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[9] = new DataVar("var_New_Status", null, IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[10] = new DataVar("var_New_Onset", null, IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[11] = new DataVar("var_New_Source", null, IDataArea.VIRTUALUSER, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on the item containing Label 'Old Categogy' in Table view containing Label 'Old Categogy'",
												  "A1E5FA218C62D43EDB24B66662626364",
												  "{\"variables\":[{\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Old Categogy\",\"key\":\"MOEB_FIELD\\/TPM:A1E5FA218CA55B68DB24B66662626364\\/WID:A1E5FA218CA35F9FDB24B66662626364\\/IDB:A1E5FA218CA55B60DB24B66662626364\"},{\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Old Categogy\",\"key\":\"MOEB_FIELD\\/TLC:A1E5FA218C691639DB24B66662626364\\/TPM:A1E5FA218C691642DB24B66662626364\\/WID:A1E5FA218C69163DDB24B66662626364\\/IDB:A1E5FA218C691632DB24B66662626364\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5FA218C62D43EDB24B66662626364\",\"preferredThinktime\":0,\"thinktime\":64,\"isWeb\":false,\"description\":\"Think <i>64<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0},{\"description\":\"Click on the item containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TPM:A1E5FA218CA55B68DB24B66662626364\\/WID:A1E5FA218CA35F9FDB24B66662626364\\/IDB:A1E5FA218CA55B60DB24B66662626364\\\">Old Categogy<\\/subst>'<\\/b> in Table view containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5FA218C691639DB24B66662626364\\/TPM:A1E5FA218C691642DB24B66662626364\\/WID:A1E5FA218C69163DDB24B66662626364\\/IDB:A1E5FA218C691632DB24B66662626364\\\">Old Categogy<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"uid\":\"A1E5FA218C62D43EDB24B66662626364\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E5FA218CA55B68DB24B66662626364\\/WID:A1E5FA218CA35F9FDB24B66662626364\\/IDB:A1E5FA218CA55B60DB24B66662626364\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Old Categogy\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5FA218C691639DB24B66662626364\\/TPM:A1E5FA218C691642DB24B66662626364\\/WID:A1E5FA218C69163DDB24B66662626364\\/IDB:A1E5FA218C691632DB24B66662626364\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Old Categogy\"}],\"isWeb\":false,\"action\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"clickItem\",\"parameters\":[{\"name\":\"position\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"1\"},{\"name\":\"section\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"1\"},{\"name\":\"Object\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"3\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},{\"name\":\"_mode_\",\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"UITableView.ClickItem.GroupObject\"}]},\"sync_policy\":\"SYNC-WITH-NEXT-STEP\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"4\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LContain\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_1 = new DataSub();
		stepBatch.addDataSub(subContainer_1);
	ISubRule sub_0 = new SubRule("MOEB_FIELD/TPM:A1E5FA218CA55B68DB24B66662626364/WID:A1E5FA218CA35F9FDB24B66662626364/IDB:A1E5FA218CA55B60DB24B66662626364", 0, 12, false, (IDCCoreVar)vars[0], false, "Old Categogy", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	
	ISubRule sub_1 = new SubRule("MOEB_FIELD/TLC:A1E5FA218C691639DB24B66662626364/TPM:A1E5FA218C691642DB24B66662626364/WID:A1E5FA218C69163DDB24B66662626364/IDB:A1E5FA218C691632DB24B66662626364", 0, 12, false, (IDCCoreVar)vars[0], false, "Old Categogy", null, 0, false);
	subContainer_1.addSubInstruction(sub_1);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_2(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on the item containing Label 'New Category' in Table view covering Label 'New Category'",
												  "A1E5FA218CC1BD65DB24B66662626364",
												  "{\"variables\":[{\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"New Category\",\"key\":\"MOEB_FIELD\\/TPM:A1E5FA218CDEBAE8DB24B66662626364\\/WID:A1E5FA218CDD0D55DB24B66662626364\\/IDB:A1E5FA218CDEBAE0DB24B66662626364\"},{\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"New Category\",\"key\":\"MOEB_FIELD\\/TLC:A1E5FA218CCABE44DB24B66662626364\\/TPM:A1E5FA218CCABE4DDB24B66662626364\\/WID:A1E5FA218CCABE48DB24B66662626364\\/IDB:A1E5FA218CCABE3DDB24B66662626364\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5FA218CC1BD65DB24B66662626364\",\"preferredThinktime\":0,\"thinktime\":56,\"isWeb\":false,\"description\":\"Think <i>56<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0},{\"description\":\"Click on the item containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TPM:A1E5FA218CDEBAE8DB24B66662626364\\/WID:A1E5FA218CDD0D55DB24B66662626364\\/IDB:A1E5FA218CDEBAE0DB24B66662626364\\\">New Category<\\/subst>'<\\/b> in Table view covering Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5FA218CCABE44DB24B66662626364\\/TPM:A1E5FA218CCABE4DDB24B66662626364\\/WID:A1E5FA218CCABE48DB24B66662626364\\/IDB:A1E5FA218CCABE3DDB24B66662626364\\\">New Category<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"uid\":\"A1E5FA218CC1BD65DB24B66662626364\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E5FA218CDEBAE8DB24B66662626364\\/WID:A1E5FA218CDD0D55DB24B66662626364\\/IDB:A1E5FA218CDEBAE0DB24B66662626364\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"New Category\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5FA218CCABE44DB24B66662626364\\/TPM:A1E5FA218CCABE4DDB24B66662626364\\/WID:A1E5FA218CCABE48DB24B66662626364\\/IDB:A1E5FA218CCABE3DDB24B66662626364\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"New Category\"}],\"isWeb\":false,\"action\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"clickItem\",\"parameters\":[{\"name\":\"position\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"2\"},{\"name\":\"Object\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"3\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},{\"name\":\"_mode_\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"UITableView.ClickItem.GroupObject\"}]},\"sync_policy\":\"SYNC-WITH-NEXT-STEP\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"4\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LCover\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_2 = new DataSub();
		stepBatch.addDataSub(subContainer_2);
	ISubRule sub_2 = new SubRule("MOEB_FIELD/TPM:A1E5FA218CDEBAE8DB24B66662626364/WID:A1E5FA218CDD0D55DB24B66662626364/IDB:A1E5FA218CDEBAE0DB24B66662626364", 0, 12, false, (IDCCoreVar)vars[6], false, "New Category", null, 0, false);
	subContainer_2.addSubInstruction(sub_2);
	
	ISubRule sub_3 = new SubRule("MOEB_FIELD/TLC:A1E5FA218CCABE44DB24B66662626364/TPM:A1E5FA218CCABE4DDB24B66662626364/WID:A1E5FA218CCABE48DB24B66662626364/IDB:A1E5FA218CCABE3DDB24B66662626364", 0, 12, false, (IDCCoreVar)vars[6], false, "New Category", null, 0, false);
	subContainer_2.addSubInstruction(sub_3);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_3(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on Back in Navigation bar whose Title is Category",
												  "A1E5FA218CDEBAF0DB24B66662626364",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5FA218CDEBAF0DB24B66662626364\",\"preferredThinktime\":0,\"thinktime\":51,\"isWeb\":false,\"description\":\"Think <i>51<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0},{\"uid\":\"A1E5FA218CDEBAF0DB24B66662626364\",\"isWeb\":false,\"description\":\"Click on <b>Back<\\/b> in Navigation bar whose <b>Title<\\/b> is <b>Category<\\/b>\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"back\",\"parameters\":[]},\"sync_policy\":\"SYNC-WITH-NEXT-STEP\",\"id\":\"2\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"object\":{\"identifier\":{\"expression\":\"topItem.title\",\"parameter\":{\"name\":\"title\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Category\"},\"name\":\"title\",\"expType\":\"field\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UINavigationBar\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_4(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on the item containing Label 'Old Type' in Table view containing Label 'Old Type'",
												  "A1E5FA218D30AB70DB24B66662626364",
												  "{\"variables\":[{\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Old Type\",\"key\":\"MOEB_FIELD\\/TPM:A1E5FA218D942838DB24B66662626364\\/WID:A1E5FA218D91420EDB24B66662626364\\/IDB:A1E5FA218D942830DB24B66662626364\"},{\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Old Type\",\"key\":\"MOEB_FIELD\\/TLC:A1E5FA218D369EFDDB24B66662626364\\/TPM:A1E5FA218D369F06DB24B66662626364\\/WID:A1E5FA218D369F01DB24B66662626364\\/IDB:A1E5FA218D369EF6DB24B66662626364\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5FA218D30AB70DB24B66662626364\",\"preferredThinktime\":0,\"thinktime\":72,\"isWeb\":false,\"description\":\"Think <i>72<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0},{\"description\":\"Click on the item containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TPM:A1E5FA218D942838DB24B66662626364\\/WID:A1E5FA218D91420EDB24B66662626364\\/IDB:A1E5FA218D942830DB24B66662626364\\\">Old Type<\\/subst>'<\\/b> in Table view containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5FA218D369EFDDB24B66662626364\\/TPM:A1E5FA218D369F06DB24B66662626364\\/WID:A1E5FA218D369F01DB24B66662626364\\/IDB:A1E5FA218D369EF6DB24B66662626364\\\">Old Type<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"uid\":\"A1E5FA218D30AB70DB24B66662626364\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E5FA218D942838DB24B66662626364\\/WID:A1E5FA218D91420EDB24B66662626364\\/IDB:A1E5FA218D942830DB24B66662626364\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Old Type\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5FA218D369EFDDB24B66662626364\\/TPM:A1E5FA218D369F06DB24B66662626364\\/WID:A1E5FA218D369F01DB24B66662626364\\/IDB:A1E5FA218D369EF6DB24B66662626364\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Old Type\"}],\"isWeb\":false,\"action\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"clickItem\",\"parameters\":[{\"name\":\"position\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"2\"},{\"name\":\"section\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"1\"},{\"name\":\"Object\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"3\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},{\"name\":\"_mode_\",\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"UITableView.ClickItem.GroupObject\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"4\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LContain\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_3 = new DataSub();
		stepBatch.addDataSub(subContainer_3);
	ISubRule sub_4 = new SubRule("MOEB_FIELD/TPM:A1E5FA218D942838DB24B66662626364/WID:A1E5FA218D91420EDB24B66662626364/IDB:A1E5FA218D942830DB24B66662626364", 0, 8, false, (IDCCoreVar)vars[1], false, "Old Type", null, 0, false);
	subContainer_3.addSubInstruction(sub_4);
	
	ISubRule sub_5 = new SubRule("MOEB_FIELD/TLC:A1E5FA218D369EFDDB24B66662626364/TPM:A1E5FA218D369F06DB24B66662626364/WID:A1E5FA218D369F01DB24B66662626364/IDB:A1E5FA218D369EF6DB24B66662626364", 0, 8, false, (IDCCoreVar)vars[1], false, "Old Type", null, 0, false);
	subContainer_3.addSubInstruction(sub_5);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_5(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on the item containing Label 'New Type' in Table view covering Label 'New Type'",
												  "A1E5FA218DB014E2DB24B66662626364",
												  "{\"variables\":[{\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"New Type\",\"key\":\"MOEB_FIELD\\/TPM:A1E5FA218DCC4F38DB24B66662626364\\/WID:A1E5FA218DCAEFF6DB24B66662626364\\/IDB:A1E5FA218DCC4F30DB24B66662626364\"},{\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"New Type\",\"key\":\"MOEB_FIELD\\/TLC:A1E5FA218DB915C8DB24B66662626364\\/TPM:A1E5FA218DB915D1DB24B66662626364\\/WID:A1E5FA218DB915CCDB24B66662626364\\/IDB:A1E5FA218DB915C1DB24B66662626364\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5FA218DB014E2DB24B66662626364\",\"preferredThinktime\":0,\"thinktime\":81,\"isWeb\":false,\"description\":\"Think <i>81<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0},{\"description\":\"Click on the item containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TPM:A1E5FA218DCC4F38DB24B66662626364\\/WID:A1E5FA218DCAEFF6DB24B66662626364\\/IDB:A1E5FA218DCC4F30DB24B66662626364\\\">New Type<\\/subst>'<\\/b> in Table view covering Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5FA218DB915C8DB24B66662626364\\/TPM:A1E5FA218DB915D1DB24B66662626364\\/WID:A1E5FA218DB915CCDB24B66662626364\\/IDB:A1E5FA218DB915C1DB24B66662626364\\\">New Type<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"uid\":\"A1E5FA218DB014E2DB24B66662626364\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E5FA218DCC4F38DB24B66662626364\\/WID:A1E5FA218DCAEFF6DB24B66662626364\\/IDB:A1E5FA218DCC4F30DB24B66662626364\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"New Type\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5FA218DB915C8DB24B66662626364\\/TPM:A1E5FA218DB915D1DB24B66662626364\\/WID:A1E5FA218DB915CCDB24B66662626364\\/IDB:A1E5FA218DB915C1DB24B66662626364\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"New Type\"}],\"isWeb\":false,\"action\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"clickItem\",\"parameters\":[{\"name\":\"position\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"2\"},{\"name\":\"Object\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"3\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},{\"name\":\"_mode_\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"UITableView.ClickItem.GroupObject\"}]},\"sync_policy\":\"SYNC-WITH-NEXT-STEP\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"4\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LCover\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_4 = new DataSub();
		stepBatch.addDataSub(subContainer_4);
	ISubRule sub_6 = new SubRule("MOEB_FIELD/TPM:A1E5FA218DCC4F38DB24B66662626364/WID:A1E5FA218DCAEFF6DB24B66662626364/IDB:A1E5FA218DCC4F30DB24B66662626364", 0, 8, false, (IDCCoreVar)vars[7], false, "New Type", null, 0, false);
	subContainer_4.addSubInstruction(sub_6);
	
	ISubRule sub_7 = new SubRule("MOEB_FIELD/TLC:A1E5FA218DB915C8DB24B66662626364/TPM:A1E5FA218DB915D1DB24B66662626364/WID:A1E5FA218DB915CCDB24B66662626364/IDB:A1E5FA218DB915C1DB24B66662626364", 0, 8, false, (IDCCoreVar)vars[7], false, "New Type", null, 0, false);
	subContainer_4.addSubInstruction(sub_7);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_6(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on Back in Navigation bar whose Title is Type",
												  "A1E5FA218DCC4F40DB24B66662626364",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5FA218DCC4F40DB24B66662626364\",\"preferredThinktime\":0,\"thinktime\":58,\"isWeb\":false,\"description\":\"Think <i>58<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0},{\"uid\":\"A1E5FA218DCC4F40DB24B66662626364\",\"isWeb\":false,\"description\":\"Click on <b>Back<\\/b> in Navigation bar whose <b>Title<\\/b> is <b>Type<\\/b>\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"back\",\"parameters\":[]},\"sync_policy\":\"SYNC-WITH-NEXT-STEP\",\"id\":\"2\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"object\":{\"identifier\":{\"expression\":\"topItem.title\",\"parameter\":{\"name\":\"title\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Type\"},\"name\":\"title\",\"expType\":\"field\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UINavigationBar\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_7(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on the item containing Label 'Old Severity' in Table view containing Label 'Old Severity'",
												  "A1E5FA218E20B0C0DB24B66662626364",
												  "{\"variables\":[{\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Old Severity\",\"key\":\"MOEB_FIELD\\/TPM:A1E5FA218E86ECA8DB24B66662626364\\/WID:A1E5FA218E8454A6DB24B66662626364\\/IDB:A1E5FA218E86ECA0DB24B66662626364\"},{\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Old Severity\",\"key\":\"MOEB_FIELD\\/TLC:A1E5FA218E26CB6BDB24B66662626364\\/TPM:A1E5FA218E26CB74DB24B66662626364\\/WID:A1E5FA218E26CB6FDB24B66662626364\\/IDB:A1E5FA218E26CB64DB24B66662626364\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5FA218E20B0C0DB24B66662626364\",\"preferredThinktime\":0,\"thinktime\":69,\"isWeb\":false,\"description\":\"Think <i>69<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0},{\"description\":\"Click on the item containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TPM:A1E5FA218E86ECA8DB24B66662626364\\/WID:A1E5FA218E8454A6DB24B66662626364\\/IDB:A1E5FA218E86ECA0DB24B66662626364\\\">Old Severity<\\/subst>'<\\/b> in Table view containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5FA218E26CB6BDB24B66662626364\\/TPM:A1E5FA218E26CB74DB24B66662626364\\/WID:A1E5FA218E26CB6FDB24B66662626364\\/IDB:A1E5FA218E26CB64DB24B66662626364\\\">Old Severity<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"uid\":\"A1E5FA218E20B0C0DB24B66662626364\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E5FA218E86ECA8DB24B66662626364\\/WID:A1E5FA218E8454A6DB24B66662626364\\/IDB:A1E5FA218E86ECA0DB24B66662626364\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Old Severity\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5FA218E26CB6BDB24B66662626364\\/TPM:A1E5FA218E26CB74DB24B66662626364\\/WID:A1E5FA218E26CB6FDB24B66662626364\\/IDB:A1E5FA218E26CB64DB24B66662626364\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Old Severity\"}],\"isWeb\":false,\"action\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"clickItem\",\"parameters\":[{\"name\":\"position\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"3\"},{\"name\":\"section\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"1\"},{\"name\":\"Object\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"3\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},{\"name\":\"_mode_\",\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"UITableView.ClickItem.GroupObject\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"4\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LContain\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_5 = new DataSub();
		stepBatch.addDataSub(subContainer_5);
	ISubRule sub_8 = new SubRule("MOEB_FIELD/TPM:A1E5FA218E86ECA8DB24B66662626364/WID:A1E5FA218E8454A6DB24B66662626364/IDB:A1E5FA218E86ECA0DB24B66662626364", 0, 12, false, (IDCCoreVar)vars[2], false, "Old Severity", null, 0, false);
	subContainer_5.addSubInstruction(sub_8);
	
	ISubRule sub_9 = new SubRule("MOEB_FIELD/TLC:A1E5FA218E26CB6BDB24B66662626364/TPM:A1E5FA218E26CB74DB24B66662626364/WID:A1E5FA218E26CB6FDB24B66662626364/IDB:A1E5FA218E26CB64DB24B66662626364", 0, 12, false, (IDCCoreVar)vars[2], false, "Old Severity", null, 0, false);
	subContainer_5.addSubInstruction(sub_9);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_8(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on the item containing Label 'New Severity' in Table view covering Label 'New Severity'",
												  "A1E5FA218EAF3545DB24B66662626364",
												  "{\"variables\":[{\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"New Severity\",\"key\":\"MOEB_FIELD\\/TPM:A1E5FA218ED92B58DB24B66662626364\\/WID:A1E5FA218ED7CBC7DB24B66662626364\\/IDB:A1E5FA218ED92B50DB24B66662626364\"},{\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"New Severity\",\"key\":\"MOEB_FIELD\\/TLC:A1E5FA218EBAF57FDB24B66662626364\\/TPM:A1E5FA218EBAF588DB24B66662626364\\/WID:A1E5FA218EBAF583DB24B66662626364\\/IDB:A1E5FA218EBAF578DB24B66662626364\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5FA218EAF3545DB24B66662626364\",\"preferredThinktime\":0,\"thinktime\":105,\"isWeb\":false,\"description\":\"Think <i>105<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0},{\"description\":\"Click on the item containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TPM:A1E5FA218ED92B58DB24B66662626364\\/WID:A1E5FA218ED7CBC7DB24B66662626364\\/IDB:A1E5FA218ED92B50DB24B66662626364\\\">New Severity<\\/subst>'<\\/b> in Table view covering Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5FA218EBAF57FDB24B66662626364\\/TPM:A1E5FA218EBAF588DB24B66662626364\\/WID:A1E5FA218EBAF583DB24B66662626364\\/IDB:A1E5FA218EBAF578DB24B66662626364\\\">New Severity<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"uid\":\"A1E5FA218EAF3545DB24B66662626364\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E5FA218ED92B58DB24B66662626364\\/WID:A1E5FA218ED7CBC7DB24B66662626364\\/IDB:A1E5FA218ED92B50DB24B66662626364\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"New Severity\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5FA218EBAF57FDB24B66662626364\\/TPM:A1E5FA218EBAF588DB24B66662626364\\/WID:A1E5FA218EBAF583DB24B66662626364\\/IDB:A1E5FA218EBAF578DB24B66662626364\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"New Severity\"}],\"isWeb\":false,\"action\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"clickItem\",\"parameters\":[{\"name\":\"position\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"4\"},{\"name\":\"Object\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"3\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},{\"name\":\"_mode_\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"UITableView.ClickItem.GroupObject\"}]},\"sync_policy\":\"SYNC-WITH-NEXT-STEP\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"4\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LCover\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_6 = new DataSub();
		stepBatch.addDataSub(subContainer_6);
	ISubRule sub_10 = new SubRule("MOEB_FIELD/TPM:A1E5FA218ED92B58DB24B66662626364/WID:A1E5FA218ED7CBC7DB24B66662626364/IDB:A1E5FA218ED92B50DB24B66662626364", 0, 12, false, (IDCCoreVar)vars[8], false, "New Severity", null, 0, false);
	subContainer_6.addSubInstruction(sub_10);
	
	ISubRule sub_11 = new SubRule("MOEB_FIELD/TLC:A1E5FA218EBAF57FDB24B66662626364/TPM:A1E5FA218EBAF588DB24B66662626364/WID:A1E5FA218EBAF583DB24B66662626364/IDB:A1E5FA218EBAF578DB24B66662626364", 0, 12, false, (IDCCoreVar)vars[8], false, "New Severity", null, 0, false);
	subContainer_6.addSubInstruction(sub_11);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_9(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on Back in Navigation bar whose Title is Severity",
												  "A1E5FA218ED92B60DB24B66662626364",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5FA218ED92B60DB24B66662626364\",\"preferredThinktime\":0,\"thinktime\":73,\"isWeb\":false,\"description\":\"Think <i>73<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0},{\"uid\":\"A1E5FA218ED92B60DB24B66662626364\",\"isWeb\":false,\"description\":\"Click on <b>Back<\\/b> in Navigation bar whose <b>Title<\\/b> is <b>Severity<\\/b>\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"back\",\"parameters\":[]},\"sync_policy\":\"SYNC-WITH-NEXT-STEP\",\"id\":\"2\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"object\":{\"identifier\":{\"expression\":\"topItem.title\",\"parameter\":{\"name\":\"title\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Severity\"},\"name\":\"title\",\"expType\":\"field\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UINavigationBar\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_10(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on the item containing Label 'Old Status' in Table view containing Label 'Old Status'",
												  "A1E5FA218F302571DB24B66662626364",
												  "{\"variables\":[{\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Old Status\",\"key\":\"MOEB_FIELD\\/TPM:A1E5FA218F937AA8DB24B66662626364\\/WID:A1E5FA218F913129DB24B66662626364\\/IDB:A1E5FA218F937AA0DB24B66662626364\"},{\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Old Status\",\"key\":\"MOEB_FIELD\\/TLC:A1E5FA218F368DE5DB24B66662626364\\/TPM:A1E5FA218F368DEEDB24B66662626364\\/WID:A1E5FA218F368DE9DB24B66662626364\\/IDB:A1E5FA218F368DDEDB24B66662626364\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5FA218F302571DB24B66662626364\",\"preferredThinktime\":0,\"thinktime\":72,\"isWeb\":false,\"description\":\"Think <i>72<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0},{\"description\":\"Click on the item containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TPM:A1E5FA218F937AA8DB24B66662626364\\/WID:A1E5FA218F913129DB24B66662626364\\/IDB:A1E5FA218F937AA0DB24B66662626364\\\">Old Status<\\/subst>'<\\/b> in Table view containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5FA218F368DE5DB24B66662626364\\/TPM:A1E5FA218F368DEEDB24B66662626364\\/WID:A1E5FA218F368DE9DB24B66662626364\\/IDB:A1E5FA218F368DDEDB24B66662626364\\\">Old Status<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"uid\":\"A1E5FA218F302571DB24B66662626364\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E5FA218F937AA8DB24B66662626364\\/WID:A1E5FA218F913129DB24B66662626364\\/IDB:A1E5FA218F937AA0DB24B66662626364\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Old Status\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5FA218F368DE5DB24B66662626364\\/TPM:A1E5FA218F368DEEDB24B66662626364\\/WID:A1E5FA218F368DE9DB24B66662626364\\/IDB:A1E5FA218F368DDEDB24B66662626364\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Old Status\"}],\"isWeb\":false,\"action\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"clickItem\",\"parameters\":[{\"name\":\"position\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"4\"},{\"name\":\"section\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"1\"},{\"name\":\"Object\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"3\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},{\"name\":\"_mode_\",\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"UITableView.ClickItem.GroupObject\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"4\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LContain\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_7 = new DataSub();
		stepBatch.addDataSub(subContainer_7);
	ISubRule sub_12 = new SubRule("MOEB_FIELD/TPM:A1E5FA218F937AA8DB24B66662626364/WID:A1E5FA218F913129DB24B66662626364/IDB:A1E5FA218F937AA0DB24B66662626364", 0, 10, false, (IDCCoreVar)vars[3], false, "Old Status", null, 0, false);
	subContainer_7.addSubInstruction(sub_12);
	
	ISubRule sub_13 = new SubRule("MOEB_FIELD/TLC:A1E5FA218F368DE5DB24B66662626364/TPM:A1E5FA218F368DEEDB24B66662626364/WID:A1E5FA218F368DE9DB24B66662626364/IDB:A1E5FA218F368DDEDB24B66662626364", 0, 10, false, (IDCCoreVar)vars[3], false, "Old Status", null, 0, false);
	subContainer_7.addSubInstruction(sub_13);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_11(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on the item containing Label 'New Status' in Table view covering Label 'New Status'",
												  "A1E5FA218FB4E5A7DB24B66662626364",
												  "{\"variables\":[{\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"New Status\",\"key\":\"MOEB_FIELD\\/TPM:A1E5FA218FD69E28DB24B66662626364\\/WID:A1E5FA218FD53E90DB24B66662626364\\/IDB:A1E5FA218FD69E20DB24B66662626364\"},{\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"New Status\",\"key\":\"MOEB_FIELD\\/TLC:A1E5FA218FBE82D4DB24B66662626364\\/TPM:A1E5FA218FBE82DDDB24B66662626364\\/WID:A1E5FA218FBE82D8DB24B66662626364\\/IDB:A1E5FA218FBE82CDDB24B66662626364\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5FA218FB4E5A7DB24B66662626364\",\"preferredThinktime\":0,\"thinktime\":103,\"isWeb\":false,\"description\":\"Think <i>103<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0},{\"description\":\"Click on the item containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TPM:A1E5FA218FD69E28DB24B66662626364\\/WID:A1E5FA218FD53E90DB24B66662626364\\/IDB:A1E5FA218FD69E20DB24B66662626364\\\">New Status<\\/subst>'<\\/b> in Table view covering Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5FA218FBE82D4DB24B66662626364\\/TPM:A1E5FA218FBE82DDDB24B66662626364\\/WID:A1E5FA218FBE82D8DB24B66662626364\\/IDB:A1E5FA218FBE82CDDB24B66662626364\\\">New Status<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"uid\":\"A1E5FA218FB4E5A7DB24B66662626364\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E5FA218FD69E28DB24B66662626364\\/WID:A1E5FA218FD53E90DB24B66662626364\\/IDB:A1E5FA218FD69E20DB24B66662626364\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"New Status\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5FA218FBE82D4DB24B66662626364\\/TPM:A1E5FA218FBE82DDDB24B66662626364\\/WID:A1E5FA218FBE82D8DB24B66662626364\\/IDB:A1E5FA218FBE82CDDB24B66662626364\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"New Status\"}],\"isWeb\":false,\"action\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"clickItem\",\"parameters\":[{\"name\":\"position\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"3\"},{\"name\":\"Object\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"3\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},{\"name\":\"_mode_\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"UITableView.ClickItem.GroupObject\"}]},\"sync_policy\":\"SYNC-WITH-NEXT-STEP\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"4\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LCover\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_8 = new DataSub();
		stepBatch.addDataSub(subContainer_8);
	ISubRule sub_14 = new SubRule("MOEB_FIELD/TPM:A1E5FA218FD69E28DB24B66662626364/WID:A1E5FA218FD53E90DB24B66662626364/IDB:A1E5FA218FD69E20DB24B66662626364", 0, 10, false, (IDCCoreVar)vars[9], false, "New Status", null, 0, false);
	subContainer_8.addSubInstruction(sub_14);
	
	ISubRule sub_15 = new SubRule("MOEB_FIELD/TLC:A1E5FA218FBE82D4DB24B66662626364/TPM:A1E5FA218FBE82DDDB24B66662626364/WID:A1E5FA218FBE82D8DB24B66662626364/IDB:A1E5FA218FBE82CDDB24B66662626364", 0, 10, false, (IDCCoreVar)vars[9], false, "New Status", null, 0, false);
	subContainer_8.addSubInstruction(sub_15);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_12(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on Back in Navigation bar whose Title is Status",
												  "A1E5FA218FD69E30DB24B66662626364",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5FA218FD69E30DB24B66662626364\",\"preferredThinktime\":0,\"thinktime\":74,\"isWeb\":false,\"description\":\"Think <i>74<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0},{\"uid\":\"A1E5FA218FD69E30DB24B66662626364\",\"isWeb\":false,\"description\":\"Click on <b>Back<\\/b> in Navigation bar whose <b>Title<\\/b> is <b>Status<\\/b>\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"back\",\"parameters\":[]},\"sync_policy\":\"SYNC-WITH-NEXT-STEP\",\"id\":\"2\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"object\":{\"identifier\":{\"expression\":\"topItem.title\",\"parameter\":{\"name\":\"title\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Status\"},\"name\":\"title\",\"expType\":\"field\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UINavigationBar\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_13(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on the item containing Label 'Old Onset' in Table view containing Label 'Old Onset'",
												  "A1E5FA21902E0CF1DB24B66662626364",
												  "{\"variables\":[{\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Old Onset\",\"key\":\"MOEB_FIELD\\/TPM:A1E5FA2190938588DB24B66662626364\\/WID:A1E5FA219091149DDB24B66662626364\\/IDB:A1E5FA2190938580DB24B66662626364\"},{\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Old Onset\",\"key\":\"MOEB_FIELD\\/TLC:A1E5FA219034008BDB24B66662626364\\/TPM:A1E5FA2190340094DB24B66662626364\\/WID:A1E5FA219034008FDB24B66662626364\\/IDB:A1E5FA2190340084DB24B66662626364\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5FA21902E0CF1DB24B66662626364\",\"preferredThinktime\":0,\"thinktime\":72,\"isWeb\":false,\"description\":\"Think <i>72<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0},{\"description\":\"Click on the item containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TPM:A1E5FA2190938588DB24B66662626364\\/WID:A1E5FA219091149DDB24B66662626364\\/IDB:A1E5FA2190938580DB24B66662626364\\\">Old Onset<\\/subst>'<\\/b> in Table view containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5FA219034008BDB24B66662626364\\/TPM:A1E5FA2190340094DB24B66662626364\\/WID:A1E5FA219034008FDB24B66662626364\\/IDB:A1E5FA2190340084DB24B66662626364\\\">Old Onset<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"uid\":\"A1E5FA21902E0CF1DB24B66662626364\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E5FA2190938588DB24B66662626364\\/WID:A1E5FA219091149DDB24B66662626364\\/IDB:A1E5FA2190938580DB24B66662626364\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Old Onset\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5FA219034008BDB24B66662626364\\/TPM:A1E5FA2190340094DB24B66662626364\\/WID:A1E5FA219034008FDB24B66662626364\\/IDB:A1E5FA2190340084DB24B66662626364\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Old Onset\"}],\"isWeb\":false,\"action\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"clickItem\",\"parameters\":[{\"name\":\"position\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"5\"},{\"name\":\"section\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"1\"},{\"name\":\"Object\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"3\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},{\"name\":\"_mode_\",\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"UITableView.ClickItem.GroupObject\"}]},\"sync_policy\":\"SYNC-WITH-NEXT-STEP\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"4\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LContain\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_9 = new DataSub();
		stepBatch.addDataSub(subContainer_9);
	ISubRule sub_16 = new SubRule("MOEB_FIELD/TPM:A1E5FA2190938588DB24B66662626364/WID:A1E5FA219091149DDB24B66662626364/IDB:A1E5FA2190938580DB24B66662626364", 0, 9, false, (IDCCoreVar)vars[4], false, "Old Onset", null, 0, false);
	subContainer_9.addSubInstruction(sub_16);
	
	ISubRule sub_17 = new SubRule("MOEB_FIELD/TLC:A1E5FA219034008BDB24B66662626364/TPM:A1E5FA2190340094DB24B66662626364/WID:A1E5FA219034008FDB24B66662626364/IDB:A1E5FA2190340084DB24B66662626364", 0, 9, false, (IDCCoreVar)vars[4], false, "Old Onset", null, 0, false);
	subContainer_9.addSubInstruction(sub_17);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_14(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Select the item containing 'New Onset' in component 1 in Picker view",
												  "A1E5FA219093D3A0DB24B66662626364",
												  "{\"variables\":[{\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"New Onset\",\"key\":\"MOEB_FIELD\\/TPM:A1E5FA2190961D9EDB24B66662626364\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5FA219093D3A0DB24B66662626364\",\"preferredThinktime\":0,\"thinktime\":3550,\"isWeb\":false,\"description\":\"Think <i>3,550<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0},{\"description\":\"Select the item containing <b>'<subst key=\\\"MOEB_FIELD\\/TPM:A1E5FA2190961D9EDB24B66662626364\\\">New Onset<\\/subst>'<\\/b> in component <b>1<\\/b> in Picker view\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"uid\":\"A1E5FA219093D3A0DB24B66662626364\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E5FA2190961D9EDB24B66662626364\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"New Onset\"}],\"isWeb\":false,\"action\":{\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"pickerValue\",\"parameters\":[{\"name\":\"component\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"1\"},{\"name\":\"row\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"4\"},{\"$ref\":\"3\"},{\"name\":\"_mode_\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"UIPickerView.PickerValue.GroupText\"}]},\"sync_policy\":\"SYNC-WITH-NEXT-STEP\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIPickerView\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_10 = new DataSub();
		stepBatch.addDataSub(subContainer_10);
	ISubRule sub_18 = new SubRule("MOEB_FIELD/TPM:A1E5FA2190961D9EDB24B66662626364", 0, 9, false, (IDCCoreVar)vars[10], false, "New Onset", null, 0, false);
	subContainer_10.addSubInstruction(sub_18);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_15(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on Back in Navigation bar whose Title is Onset",
												  "A1E5FA21909644A0DB24B66662626364",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5FA21909644A0DB24B66662626364\",\"preferredThinktime\":0,\"thinktime\":298,\"isWeb\":false,\"description\":\"Think <i>298<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0},{\"uid\":\"A1E5FA21909644A0DB24B66662626364\",\"isWeb\":false,\"description\":\"Click on <b>Back<\\/b> in Navigation bar whose <b>Title<\\/b> is <b>Onset<\\/b>\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"back\",\"parameters\":[]},\"sync_policy\":\"SYNC-WITH-NEXT-STEP\",\"id\":\"2\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"object\":{\"identifier\":{\"expression\":\"topItem.title\",\"parameter\":{\"name\":\"title\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Onset\"},\"name\":\"title\",\"expType\":\"field\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UINavigationBar\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_16(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on the item containing Label 'Old Source' in Table view containing Label 'Old Source'",
												  "A1E5FA2190ECA201DB24B66662626364",
												  "{\"variables\":[{\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Old Source\",\"key\":\"MOEB_FIELD\\/TPM:A1E5FA219151CC71DB24B66662626364\\/WID:A1E5FA21914F5BAADB24B66662626364\\/IDB:A1E5FA219151A560DB24B66662626364\"},{\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Old Source\",\"key\":\"MOEB_FIELD\\/TLC:A1E5FA2190F3CE3EDB24B66662626364\\/TPM:A1E5FA2190F3CE47DB24B66662626364\\/WID:A1E5FA2190F3CE42DB24B66662626364\\/IDB:A1E5FA2190F3CE37DB24B66662626364\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5FA2190ECA201DB24B66662626364\",\"preferredThinktime\":0,\"thinktime\":69,\"isWeb\":false,\"description\":\"Think <i>69<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0},{\"description\":\"Click on the item containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TPM:A1E5FA219151CC71DB24B66662626364\\/WID:A1E5FA21914F5BAADB24B66662626364\\/IDB:A1E5FA219151A560DB24B66662626364\\\">Old Source<\\/subst>'<\\/b> in Table view containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5FA2190F3CE3EDB24B66662626364\\/TPM:A1E5FA2190F3CE47DB24B66662626364\\/WID:A1E5FA2190F3CE42DB24B66662626364\\/IDB:A1E5FA2190F3CE37DB24B66662626364\\\">Old Source<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"uid\":\"A1E5FA2190ECA201DB24B66662626364\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E5FA219151CC71DB24B66662626364\\/WID:A1E5FA21914F5BAADB24B66662626364\\/IDB:A1E5FA219151A560DB24B66662626364\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Old Source\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5FA2190F3CE3EDB24B66662626364\\/TPM:A1E5FA2190F3CE47DB24B66662626364\\/WID:A1E5FA2190F3CE42DB24B66662626364\\/IDB:A1E5FA2190F3CE37DB24B66662626364\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Old Source\"}],\"isWeb\":false,\"action\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"clickItem\",\"parameters\":[{\"name\":\"position\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"6\"},{\"name\":\"section\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"1\"},{\"name\":\"Object\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"3\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},{\"name\":\"_mode_\",\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"UITableView.ClickItem.GroupObject\"}]},\"sync_policy\":\"SYNC-WITH-NEXT-STEP\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"4\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LContain\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_11 = new DataSub();
		stepBatch.addDataSub(subContainer_11);
	ISubRule sub_19 = new SubRule("MOEB_FIELD/TPM:A1E5FA219151CC71DB24B66662626364/WID:A1E5FA21914F5BAADB24B66662626364/IDB:A1E5FA219151A560DB24B66662626364", 0, 10, false, (IDCCoreVar)vars[5], false, "Old Source", null, 0, false);
	subContainer_11.addSubInstruction(sub_19);
	
	ISubRule sub_20 = new SubRule("MOEB_FIELD/TLC:A1E5FA2190F3CE3EDB24B66662626364/TPM:A1E5FA2190F3CE47DB24B66662626364/WID:A1E5FA2190F3CE42DB24B66662626364/IDB:A1E5FA2190F3CE37DB24B66662626364", 0, 10, false, (IDCCoreVar)vars[5], false, "Old Source", null, 0, false);
	subContainer_11.addSubInstruction(sub_20);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_17(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on the item containing Label 'New Source' in Table view covering Label 'New Source'",
												  "A1E5FA2191CBB7BEDB24B66662626364",
												  "{\"variables\":[{\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"New Source\",\"key\":\"MOEB_FIELD\\/TPM:A1E5FA219246DAD8DB24B66662626364\\/WID:A1E5FA2192452D76DB24B66662626364\\/IDB:A1E5FA219246DAD0DB24B66662626364\"},{\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"New Source\",\"key\":\"MOEB_FIELD\\/TLC:A1E5FA2191EB4DBADB24B66662626364\\/TPM:A1E5FA2191EB4DC3DB24B66662626364\\/WID:A1E5FA2191EB4DBEDB24B66662626364\\/IDB:A1E5FA2191EB4DB3DB24B66662626364\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5FA2191CBB7BEDB24B66662626364\",\"preferredThinktime\":0,\"thinktime\":60,\"isWeb\":false,\"description\":\"Think <i>60<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0},{\"description\":\"Click on the item containing Label <b>'<subst key=\\\"MOEB_FIELD\\/TPM:A1E5FA219246DAD8DB24B66662626364\\/WID:A1E5FA2192452D76DB24B66662626364\\/IDB:A1E5FA219246DAD0DB24B66662626364\\\">New Source<\\/subst>'<\\/b> in Table view covering Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5FA2191EB4DBADB24B66662626364\\/TPM:A1E5FA2191EB4DC3DB24B66662626364\\/WID:A1E5FA2191EB4DBEDB24B66662626364\\/IDB:A1E5FA2191EB4DB3DB24B66662626364\\\">New Source<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"uid\":\"A1E5FA2191CBB7BEDB24B66662626364\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TPM:A1E5FA219246DAD8DB24B66662626364\\/WID:A1E5FA2192452D76DB24B66662626364\\/IDB:A1E5FA219246DAD0DB24B66662626364\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"New Source\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5FA2191EB4DBADB24B66662626364\\/TPM:A1E5FA2191EB4DC3DB24B66662626364\\/WID:A1E5FA2191EB4DBEDB24B66662626364\\/IDB:A1E5FA2191EB4DB3DB24B66662626364\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"New Source\"}],\"isWeb\":false,\"action\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"clickItem\",\"parameters\":[{\"name\":\"position\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"5\"},{\"name\":\"Object\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"3\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},{\"name\":\"_mode_\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"UITableView.ClickItem.GroupObject\"}]},\"sync_policy\":\"SYNC-WITH-NEXT-STEP\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UITableView\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"4\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LCover\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_12 = new DataSub();
		stepBatch.addDataSub(subContainer_12);
	ISubRule sub_21 = new SubRule("MOEB_FIELD/TPM:A1E5FA219246DAD8DB24B66662626364/WID:A1E5FA2192452D76DB24B66662626364/IDB:A1E5FA219246DAD0DB24B66662626364", 0, 10, false, (IDCCoreVar)vars[11], false, "New Source", null, 0, false);
	subContainer_12.addSubInstruction(sub_21);
	
	ISubRule sub_22 = new SubRule("MOEB_FIELD/TLC:A1E5FA2191EB4DBADB24B66662626364/TPM:A1E5FA2191EB4DC3DB24B66662626364/WID:A1E5FA2191EB4DBEDB24B66662626364/IDB:A1E5FA2191EB4DB3DB24B66662626364", 0, 10, false, (IDCCoreVar)vars[11], false, "New Source", null, 0, false);
	subContainer_12.addSubInstruction(sub_22);
	


		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_18(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on Back in Navigation bar whose Title is Source",
												  "A1E5FA219246DAE0DB24B66662626364",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5FA219246DAE0DB24B66662626364\",\"preferredThinktime\":0,\"thinktime\":54,\"isWeb\":false,\"description\":\"Think <i>54<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0},{\"uid\":\"A1E5FA219246DAE0DB24B66662626364\",\"isWeb\":false,\"description\":\"Click on <b>Back<\\/b> in Navigation bar whose <b>Title<\\/b> is <b>Source<\\/b>\",\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"back\",\"parameters\":[]},\"sync_policy\":\"SYNC-WITH-NEXT-STEP\",\"id\":\"2\",\"to_overriden\":true,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":30,\"object\":{\"identifier\":{\"expression\":\"topItem.title\",\"parameter\":{\"name\":\"title\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Source\"},\"name\":\"title\",\"expType\":\"field\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UINavigationBar\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_19(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Ambulatory - Click on Button 'Save'",
												  "A1E5FA21BAA8AF37DB24B66662626364",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5FA21BAA8AF37DB24B66662626364\",\"isWeb\":false,\"description\":\"Click on <b>Button<\\/b> <b>'Save'<\\/b>\",\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"click\",\"parameters\":[]},\"id\":\"1\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"application_uid\":\"550EB7B70A7BD58D6A6A0A9309E667BC\",\"timeout\":0,\"object\":{\"identifier\":{\"expression\":\"currentTitle\",\"parameter\":{\"name\":\"currentTitle\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Save\"},\"name\":\"currentTitle\",\"expType\":\"getter\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIButton\"}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");



		return stepBatch;
	}

}
