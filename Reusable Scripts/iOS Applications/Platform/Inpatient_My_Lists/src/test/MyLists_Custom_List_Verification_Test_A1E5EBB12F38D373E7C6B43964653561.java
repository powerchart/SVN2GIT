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
public class MyLists_Custom_List_Verification_Test_A1E5EBB12F38D373E7C6B43964653561 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
    }
	
	private DataVar[] vars = new DataVar[3];
	
    
    
	
	public MyLists_Custom_List_Verification_Test_A1E5EBB12F38D373E7C6B43964653561(IContainer container, String invocationId) {
		super(container, "MyLists_Custom_List_Verification", invocationId, "A1E5EBB12F38D373E7C6B43964653561");
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
	this.add(applicationContext_1(this));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: MyLists_Custom_List_Verification_Test_A1E5EBB12F38D373E7C6B43964653561 ",e);
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

	VariableAction vc = new VariableAction(parent, "", "A1E5EAEB83480EF7D953B63630323433");	
			vars[0] = new DataVar("Var_FIN_PatientA", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[1] = new DataVar("Var_FIN_PatientH", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[2] = new DataVar("Var_ChartList_Name", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Inpatient",
												  "A1E5EAEB8348AB20D953B63630323433",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1E5EB75AB7D8AC8C8D3E43363636335\",\"id\":\"1\",\"substitutionParameters\":[{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"text\",\"value\":\"Var_ChartList_Name\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5EB75AB2EF337C8D3E43363636335\\/TPM:A1E5EB75AB2EF340C8D3E43363636335\\/WID:A1E5EB75AB2EF33BC8D3E43363636335\\/IDB:A1E5EB75AB2EF330C8D3E43363636335\",\"type\":\"TString\"}],\"application_uid\":\"c8b46bc7a82ff4485477ff2d43689ee6\",\"to_overriden\":false,\"vpExpression\":{\"expression\":\"text\",\"id\":\"8\",\"parameter\":{\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"text\",\"value\":\"Select All\",\"type\":\"TString\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"name\":\"text\",\"translatedName\":\"Text\",\"operator\":\"TEquals\",\"expType\":\"getter\"},\"isWeb\":false,\"description\":\"Verify that <b>Text<\\/b> equals <b>Select All<\\/b> on <b>Label<\\/b> to the right of Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5EB75AB2EF337C8D3E43363636335\\/TPM:A1E5EB75AB2EF340C8D3E43363636335\\/WID:A1E5EB75AB2EF33BC8D3E43363636335\\/IDB:A1E5EB75AB2EF330C8D3E43363636335\\\">Var_ChartList_Name<\\/subst>'<\\/b>\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"object\":{\"id\":\"3\",\"locator\":{\"id\":\"4\",\"parameter\":{\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"objectId\",\"object\":{\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"identifier\":{\"expression\":\"text\",\"id\":\"7\",\"parameter\":{\"$ref\":\"2\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"name\":\"text\",\"operator\":\"TEquals\",\"expType\":\"getter\"}},\"type\":\"TUIObject\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"},\"skipScrollingIniOSDF\":false,\"retry\":false,\"timeout\":0},{\"uid\":\"A1E5EB757BFD80CFC8D3E43363636335\",\"id\":\"10\",\"substitutionParameters\":[{\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"text\",\"value\":\"Var_ChartList_Name\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5EB759AEBE500C8D3E43363636335\\/TPM:A1E5EB759AEBE504C8D3E43363636335\\/WID:A1E5EB759AEBE508C8D3E43363636335\\/IDB:A1E5EB759C38FE71C8D3E43363636335\",\"type\":\"TString\"}],\"application_uid\":\"c8b46bc7a82ff4485477ff2d43689ee6\",\"to_overriden\":false,\"vpExpression\":{\"expression\":\"text\",\"id\":\"19\",\"parameter\":{\"id\":\"20\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"text\",\"value\":\"Lists\",\"type\":\"TString\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"name\":\"text\",\"translatedName\":\"Text\",\"operator\":\"TEquals\",\"expType\":\"getter\"},\"isWeb\":false,\"description\":\"Verify that <b>Text<\\/b> equals <b>Lists<\\/b> on <b>Label<\\/b> <b>'Lists'<\\/b> to the left of Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5EB759AEBE500C8D3E43363636335\\/TPM:A1E5EB759AEBE504C8D3E43363636335\\/WID:A1E5EB759AEBE508C8D3E43363636335\\/IDB:A1E5EB759C38FE71C8D3E43363636335\\\">Var_ChartList_Name<\\/subst>'<\\/b>\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"object\":{\"id\":\"12\",\"locator\":{\"id\":\"15\",\"parameter\":{\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"objectId\",\"object\":{\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"identifier\":{\"expression\":\"text\",\"id\":\"18\",\"parameter\":{\"$ref\":\"11\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"name\":\"text\",\"operator\":\"TEquals\",\"expType\":\"getter\"}},\"type\":\"TUIObject\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LLeft\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"identifier\":{\"expression\":\"text\",\"id\":\"13\",\"parameter\":{\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"text\",\"value\":\"Lists\",\"type\":\"TString\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"name\":\"text\",\"operator\":\"TEquals\",\"expType\":\"getter\"}},\"skipScrollingIniOSDF\":false,\"retry\":false,\"timeout\":0},{\"uid\":\"A1E5EB7F392C8387C8D3E43363636335\",\"id\":\"21\",\"substitutionParameters\":[{\"id\":\"22\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"text\",\"value\":\"Var_FIN_PatientA\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5EB7F38DB7AB7C8D3E43363636335\\/TPM:A1E5EB7F38DB7AC0C8D3E43363636335\\/WID:A1E5EB7F38DB7ABBC8D3E43363636335\\/IDB:A1E5EB7F38DB7AB0C8D3E43363636335\",\"type\":\"TString\"}],\"application_uid\":\"c8b46bc7a82ff4485477ff2d43689ee6\",\"to_overriden\":false,\"vpExpression\":{\"expression\":\"isEnabled\",\"id\":\"28\",\"parameter\":{\"id\":\"29\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"enabled\",\"value\":\"false\",\"type\":\"TBoolean\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"name\":\"enabled\",\"translatedName\":\"Is enabled\",\"operator\":\"TEquals\",\"expType\":\"getter\"},\"isWeb\":false,\"description\":\"Verify that <b>Is enabled<\\/b> equals <b>false<\\/b> on <b>Button<\\/b> to the right of Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5EB7F38DB7AB7C8D3E43363636335\\/TPM:A1E5EB7F38DB7AC0C8D3E43363636335\\/WID:A1E5EB7F38DB7ABBC8D3E43363636335\\/IDB:A1E5EB7F38DB7AB0C8D3E43363636335\\\">Var_FIN_PatientA<\\/subst>'<\\/b>\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"object\":{\"id\":\"23\",\"locator\":{\"id\":\"24\",\"parameter\":{\"id\":\"25\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"objectId\",\"object\":{\"id\":\"26\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"identifier\":{\"expression\":\"text\",\"id\":\"27\",\"parameter\":{\"$ref\":\"22\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"name\":\"text\",\"operator\":\"TEquals\",\"expType\":\"getter\"}},\"type\":\"TUIObject\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIButton\"},\"skipScrollingIniOSDF\":false,\"retry\":false,\"timeout\":0},{\"uid\":\"A1E5EB7FABA022CAC8D3E43363636335\",\"id\":\"30\",\"substitutionParameters\":[{\"id\":\"31\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"text\",\"value\":\"Var_FIN_PatientH\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5EB7FAB5163C7C8D3E43363636335\\/TPM:A1E5EB7FAB5163D0C8D3E43363636335\\/WID:A1E5EB7FAB5163CBC8D3E43363636335\\/IDB:A1E5EB7FAB5163C0C8D3E43363636335\",\"type\":\"TString\"}],\"application_uid\":\"c8b46bc7a82ff4485477ff2d43689ee6\",\"to_overriden\":false,\"vpExpression\":{\"expression\":\"isEnabled\",\"id\":\"37\",\"parameter\":{\"id\":\"38\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"enabled\",\"value\":\"true\",\"type\":\"TBoolean\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"name\":\"enabled\",\"translatedName\":\"Is enabled\",\"operator\":\"TEquals\",\"expType\":\"getter\"},\"isWeb\":false,\"description\":\"Verify that <b>Is enabled<\\/b> equals <b>true<\\/b> on <b>Button<\\/b> to the right of Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5EB7FAB5163C7C8D3E43363636335\\/TPM:A1E5EB7FAB5163D0C8D3E43363636335\\/WID:A1E5EB7FAB5163CBC8D3E43363636335\\/IDB:A1E5EB7FAB5163C0C8D3E43363636335\\\">Var_FIN_PatientH<\\/subst>'<\\/b>\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"object\":{\"id\":\"32\",\"locator\":{\"id\":\"33\",\"parameter\":{\"id\":\"34\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"name\":\"objectId\",\"object\":{\"id\":\"35\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"identifier\":{\"expression\":\"text\",\"id\":\"36\",\"parameter\":{\"$ref\":\"31\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"name\":\"text\",\"operator\":\"TEquals\",\"expType\":\"getter\"}},\"type\":\"TUIObject\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"},\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UIButton\"},\"skipScrollingIniOSDF\":false,\"retry\":false,\"timeout\":0}],\"timeout\":10,\"variables\":[{\"id\":\"39\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_ChartList_Name\",\"key\":\"MOEB_FIELD\\/TLC:A1E5EB75AB2EF337C8D3E43363636335\\/TPM:A1E5EB75AB2EF340C8D3E43363636335\\/WID:A1E5EB75AB2EF33BC8D3E43363636335\\/IDB:A1E5EB75AB2EF330C8D3E43363636335\"},{\"id\":\"40\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_ChartList_Name\",\"key\":\"MOEB_FIELD\\/TLC:A1E5EB759AEBE500C8D3E43363636335\\/TPM:A1E5EB759AEBE504C8D3E43363636335\\/WID:A1E5EB759AEBE508C8D3E43363636335\\/IDB:A1E5EB759C38FE71C8D3E43363636335\"},{\"id\":\"41\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FIN_PatientA\",\"key\":\"MOEB_FIELD\\/TLC:A1E5EB7F38DB7AB7C8D3E43363636335\\/TPM:A1E5EB7F38DB7AC0C8D3E43363636335\\/WID:A1E5EB7F38DB7ABBC8D3E43363636335\\/IDB:A1E5EB7F38DB7AB0C8D3E43363636335\"},{\"id\":\"42\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FIN_PatientH\",\"key\":\"MOEB_FIELD\\/TLC:A1E5EB7FAB5163C7C8D3E43363636335\\/TPM:A1E5EB7FAB5163D0C8D3E43363636335\\/WID:A1E5EB7FAB5163CBC8D3E43363636335\\/IDB:A1E5EB7FAB5163C0C8D3E43363636335\"}]}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_1 = new DataSub();
		stepBatch.addDataSub(subContainer_1);
	ISubRule sub_0 = new SubRule("MOEB_FIELD/TLC:A1E5EB75AB2EF337C8D3E43363636335/TPM:A1E5EB75AB2EF340C8D3E43363636335/WID:A1E5EB75AB2EF33BC8D3E43363636335/IDB:A1E5EB75AB2EF330C8D3E43363636335", 0, 18, false, (IDCCoreVar)vars[2], false, "Var_ChartList_Name", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	
	ISubRule sub_1 = new SubRule("MOEB_FIELD/TLC:A1E5EB759AEBE500C8D3E43363636335/TPM:A1E5EB759AEBE504C8D3E43363636335/WID:A1E5EB759AEBE508C8D3E43363636335/IDB:A1E5EB759C38FE71C8D3E43363636335", 0, 18, false, (IDCCoreVar)vars[2], false, "Var_ChartList_Name", null, 0, false);
	subContainer_1.addSubInstruction(sub_1);
	
	ISubRule sub_2 = new SubRule("MOEB_FIELD/TLC:A1E5EB7F38DB7AB7C8D3E43363636335/TPM:A1E5EB7F38DB7AC0C8D3E43363636335/WID:A1E5EB7F38DB7ABBC8D3E43363636335/IDB:A1E5EB7F38DB7AB0C8D3E43363636335", 0, 16, false, (IDCCoreVar)vars[0], false, "Var_FIN_PatientA", null, 0, false);
	subContainer_1.addSubInstruction(sub_2);
	
	ISubRule sub_3 = new SubRule("MOEB_FIELD/TLC:A1E5EB7FAB5163C7C8D3E43363636335/TPM:A1E5EB7FAB5163D0C8D3E43363636335/WID:A1E5EB7FAB5163CBC8D3E43363636335/IDB:A1E5EB7FAB5163C0C8D3E43363636335", 0, 16, false, (IDCCoreVar)vars[1], false, "Var_FIN_PatientH", null, 0, false);
	subContainer_1.addSubInstruction(sub_3);
	


		return stepBatch;
	}

}
