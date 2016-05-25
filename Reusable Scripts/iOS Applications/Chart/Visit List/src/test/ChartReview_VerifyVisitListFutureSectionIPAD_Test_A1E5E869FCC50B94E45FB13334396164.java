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
public class ChartReview_VerifyVisitListFutureSectionIPAD_Test_A1E5E869FCC50B94E45FB13334396164 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	private DataVar[] vars = new DataVar[5];
	
    
    
	
	public ChartReview_VerifyVisitListFutureSectionIPAD_Test_A1E5E869FCC50B94E45FB13334396164(IContainer container, String invocationId) {
		super(container, "ChartReview_VerifyVisitListFutureSectionIPAD", invocationId, "A1E5E869FCC50B94E45FB13334396164");
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
		     log("Test Execution: ChartReview_VerifyVisitListFutureSectionIPAD_Test_A1E5E869FCC50B94E45FB13334396164 ",e);
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

	VariableAction vc = new VariableAction(parent, "", "A1E5BE21041129BED600B86366343630");	
			vars[0] = new DataVar("Var_FutureCount", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

	
		vars[1] = new DataVar("Var_FutureDTM", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

	
		vars[2] = new DataVar("Var_FutureReasonForVisit", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

	
		vars[3] = new DataVar("Var_FutureEncounterType", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

	
		vars[4] = new DataVar("Var_FutureAttendingPhy", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "PowerChart",
												  "A1E5BE210412B041D600B86366343630",
												  "{\"variables\":[{\"id\":\"56\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureCount\",\"key\":\"MOEB_FIELD\\/IDB:A1E5CEA053D5FC10C17FB13564643936\"},{\"id\":\"57\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureDTM\",\"key\":\"MOEB_FIELD\\/TLC:A1E5CEA048697D49C17FB13564643936\\/TPM:A1E5CEA048697D52C17FB13564643936\\/WID:A1E5CEA048697D4DC17FB13564643936\\/IDB:A1E5CEA048697D42C17FB13564643936\"},{\"id\":\"58\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureCount\",\"key\":\"MOEB_FIELD\\/TEX:A1E5CEA0486BC732C17FB13564643936\\/TPM:A1E5CEA0486BC736C17FB13564643936\"},{\"id\":\"59\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureDTM\",\"key\":\"MOEB_FIELD\\/IDB:A1E5BE26F5543780D600B86366343630\"},{\"id\":\"60\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureEncounterType\",\"key\":\"MOEB_FIELD\\/TLC:A1E5BE26EBFD7944D600B86366343630\\/TPM:A1E5BE26EBFD794DD600B86366343630\\/WID:A1E5BE26EBFD7948D600B86366343630\\/IDB:A1E5BE26EBFD793DD600B86366343630\"},{\"id\":\"61\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureDTM\",\"key\":\"MOEB_FIELD\\/TEX:A1E5BE26EC0233B6D600B86366343630\\/TPM:A1E5BE26EC0233BAD600B86366343630\"},{\"id\":\"62\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureReasonForVisit\",\"key\":\"MOEB_FIELD\\/IDB:A1E5BE34A9A1ACB0D600B86366343630\"},{\"id\":\"63\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureAttendingPhy\",\"key\":\"MOEB_FIELD\\/TLC:A1E5BE26F8FA5D0FD600B86366343630\\/TPM:A1E5BE26F8FA5D18D600B86366343630\\/WID:A1E5BE26F8FA5D13D600B86366343630\\/IDB:A1E5BE26F8FA5D08D600B86366343630\"},{\"id\":\"64\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureReasonForVisit\",\"key\":\"MOEB_FIELD\\/TEX:A1E5BE26F9016355D600B86366343630\\/TPM:A1E5BE26F9016359D600B86366343630\"},{\"id\":\"65\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureEncounterType\",\"key\":\"MOEB_FIELD\\/IDB:A1E5BE270733B7A0D600B86366343630\"},{\"id\":\"66\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureDTM\",\"key\":\"MOEB_FIELD\\/TLC:A1E5CEA103708370C17FB13564643936\\/TPM:A1E5CEA103708374C17FB13564643936\\/WID:A1E5CEA103708378C17FB13564643936\\/IDB:A1E5CEA104F304C1C17FB13564643936\"},{\"id\":\"67\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureEncounterType\",\"key\":\"MOEB_FIELD\\/TEX:A1E5BE27008F6F58D600B86366343630\\/TPM:A1E5BE27008F6F5CD600B86366343630\"},{\"id\":\"68\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureAttendingPhy\",\"key\":\"MOEB_FIELD\\/IDB:A1E5BE270F3239E0D600B86366343630\"},{\"id\":\"69\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureReasonForVisit\",\"key\":\"MOEB_FIELD\\/TLC:A1E5CEA11C8D0A90C17FB13564643936\\/TPM:A1E5CEA11C8D0A94C17FB13564643936\\/WID:A1E5CEA11C8D0A98C17FB13564643936\\/IDB:A1E5CEA11E1F6A61C17FB13564643936\"},{\"id\":\"70\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_FutureAttendingPhy\",\"key\":\"MOEB_FIELD\\/TEX:A1E5BE270C35EAC5D600B86366343630\\/TPM:A1E5BE270C35EAC9D600B86366343630\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5CEA0486BC732C17FB13564643936\\/TPM:A1E5CEA0486BC736C17FB13564643936\\\">Var_FutureCount<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5CEA053D5FC10C17FB13564643936\\\">Var_FutureCount<\\/subst>'<\\/b> above Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5CEA048697D49C17FB13564643936\\/TPM:A1E5CEA048697D52C17FB13564643936\\/WID:A1E5CEA048697D4DC17FB13564643936\\/IDB:A1E5CEA048697D42C17FB13564643936\\\">Var_FutureDTM<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"4\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5CEA0486BC72BC17FB13564643936\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5CEA053D5FC10C17FB13564643936\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureCount\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5CEA048697D49C17FB13564643936\\/TPM:A1E5CEA048697D52C17FB13564643936\\/WID:A1E5CEA048697D4DC17FB13564643936\\/IDB:A1E5CEA048697D42C17FB13564643936\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureDTM\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5CEA0486BC732C17FB13564643936\\/TPM:A1E5CEA0486BC736C17FB13564643936\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureCount\"}],\"isWeb\":false,\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"2\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"3\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LAbove\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5BE26EC0233B6D600B86366343630\\/TPM:A1E5BE26EC0233BAD600B86366343630\\\">Var_FutureDTM<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5BE26F5543780D600B86366343630\\\">Var_FutureDTM<\\/subst>'<\\/b> to the left of Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5BE26EBFD7944D600B86366343630\\/TPM:A1E5BE26EBFD794DD600B86366343630\\/WID:A1E5BE26EBFD7948D600B86366343630\\/IDB:A1E5BE26EBFD793DD600B86366343630\\\">Var_FutureEncounterType<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"15\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"22\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5BE26EC0233AFD600B86366343630\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5BE26F5543780D600B86366343630\",\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureDTM\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5BE26EBFD7944D600B86366343630\\/TPM:A1E5BE26EBFD794DD600B86366343630\\/WID:A1E5BE26EBFD7948D600B86366343630\\/IDB:A1E5BE26EBFD793DD600B86366343630\",\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureEncounterType\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5BE26EC0233B6D600B86366343630\\/TPM:A1E5BE26EC0233BAD600B86366343630\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureDTM\"}],\"isWeb\":false,\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"13\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"19\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"14\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"21\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"20\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LLeft\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5BE26F9016355D600B86366343630\\/TPM:A1E5BE26F9016359D600B86366343630\\\">Var_FutureReasonForVisit<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5BE34A9A1ACB0D600B86366343630\\\">Var_FutureReasonForVisit<\\/subst>'<\\/b> to the left of Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5BE26F8FA5D0FD600B86366343630\\/TPM:A1E5BE26F8FA5D18D600B86366343630\\/WID:A1E5BE26F8FA5D13D600B86366343630\\/IDB:A1E5BE26F8FA5D08D600B86366343630\\\">Var_FutureAttendingPhy<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"26\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"33\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5BE26F901634ED600B86366343630\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5BE34A9A1ACB0D600B86366343630\",\"id\":\"24\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureReasonForVisit\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5BE26F8FA5D0FD600B86366343630\\/TPM:A1E5BE26F8FA5D18D600B86366343630\\/WID:A1E5BE26F8FA5D13D600B86366343630\\/IDB:A1E5BE26F8FA5D08D600B86366343630\",\"id\":\"25\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureAttendingPhy\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5BE26F9016355D600B86366343630\\/TPM:A1E5BE26F9016359D600B86366343630\",\"id\":\"26\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureReasonForVisit\"}],\"isWeb\":false,\"id\":\"23\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"24\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"28\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"27\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"30\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"25\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"32\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"31\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"29\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LLeft\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5BE27008F6F58D600B86366343630\\/TPM:A1E5BE27008F6F5CD600B86366343630\\\">Var_FutureEncounterType<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5BE270733B7A0D600B86366343630\\\">Var_FutureEncounterType<\\/subst>'<\\/b> to the right of Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5CEA103708370C17FB13564643936\\/TPM:A1E5CEA103708374C17FB13564643936\\/WID:A1E5CEA103708378C17FB13564643936\\/IDB:A1E5CEA104F304C1C17FB13564643936\\\">Var_FutureDTM<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"37\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"44\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5BE27008F6F52D600B86366343630\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5BE270733B7A0D600B86366343630\",\"id\":\"35\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureEncounterType\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5CEA103708370C17FB13564643936\\/TPM:A1E5CEA103708374C17FB13564643936\\/WID:A1E5CEA103708378C17FB13564643936\\/IDB:A1E5CEA104F304C1C17FB13564643936\",\"id\":\"36\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureDTM\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5BE27008F6F58D600B86366343630\\/TPM:A1E5BE27008F6F5CD600B86366343630\",\"id\":\"37\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureEncounterType\"}],\"isWeb\":false,\"id\":\"34\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"35\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"39\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"38\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"41\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"36\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"43\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"42\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"40\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5BE270C35EAC5D600B86366343630\\/TPM:A1E5BE270C35EAC9D600B86366343630\\\">Var_FutureAttendingPhy<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5BE270F3239E0D600B86366343630\\\">Var_FutureAttendingPhy<\\/subst>'<\\/b> to the right of Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5CEA11C8D0A90C17FB13564643936\\/TPM:A1E5CEA11C8D0A94C17FB13564643936\\/WID:A1E5CEA11C8D0A98C17FB13564643936\\/IDB:A1E5CEA11E1F6A61C17FB13564643936\\\">Var_FutureReasonForVisit<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"48\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"55\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5BE270C35EABFD600B86366343630\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5BE270F3239E0D600B86366343630\",\"id\":\"46\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureAttendingPhy\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5CEA11C8D0A90C17FB13564643936\\/TPM:A1E5CEA11C8D0A94C17FB13564643936\\/WID:A1E5CEA11C8D0A98C17FB13564643936\\/IDB:A1E5CEA11E1F6A61C17FB13564643936\",\"id\":\"47\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureReasonForVisit\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5BE270C35EAC5D600B86366343630\\/TPM:A1E5BE270C35EAC9D600B86366343630\",\"id\":\"48\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_FutureAttendingPhy\"}],\"isWeb\":false,\"id\":\"45\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"46\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"50\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"49\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"52\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"47\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"54\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"53\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"51\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_1 = new DataSub();
		stepBatch.addDataSub(subContainer_1);
	ISubRule sub_0 = new SubRule("MOEB_FIELD/IDB:A1E5CEA053D5FC10C17FB13564643936", 0, 15, false, (IDCCoreVar)vars[0], false, "Var_FutureCount", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	
	ISubRule sub_1 = new SubRule("MOEB_FIELD/TLC:A1E5CEA048697D49C17FB13564643936/TPM:A1E5CEA048697D52C17FB13564643936/WID:A1E5CEA048697D4DC17FB13564643936/IDB:A1E5CEA048697D42C17FB13564643936", 0, 13, false, (IDCCoreVar)vars[1], false, "Var_FutureDTM", null, 0, false);
	subContainer_1.addSubInstruction(sub_1);
	
	ISubRule sub_2 = new SubRule("MOEB_FIELD/TEX:A1E5CEA0486BC732C17FB13564643936/TPM:A1E5CEA0486BC736C17FB13564643936", 0, 15, false, (IDCCoreVar)vars[0], false, "Var_FutureCount_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_2);
	
	ISubRule sub_3 = new SubRule("MOEB_FIELD/IDB:A1E5BE26F5543780D600B86366343630", 0, 13, false, (IDCCoreVar)vars[1], false, "Var_FutureDTM", null, 0, false);
	subContainer_1.addSubInstruction(sub_3);
	
	ISubRule sub_4 = new SubRule("MOEB_FIELD/TLC:A1E5BE26EBFD7944D600B86366343630/TPM:A1E5BE26EBFD794DD600B86366343630/WID:A1E5BE26EBFD7948D600B86366343630/IDB:A1E5BE26EBFD793DD600B86366343630", 0, 23, false, (IDCCoreVar)vars[3], false, "Var_FutureEncounterType", null, 0, false);
	subContainer_1.addSubInstruction(sub_4);
	
	ISubRule sub_5 = new SubRule("MOEB_FIELD/TEX:A1E5BE26EC0233B6D600B86366343630/TPM:A1E5BE26EC0233BAD600B86366343630", 0, 13, false, (IDCCoreVar)vars[1], false, "Var_FutureDTM_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_5);
	
	ISubRule sub_6 = new SubRule("MOEB_FIELD/IDB:A1E5BE34A9A1ACB0D600B86366343630", 0, 24, false, (IDCCoreVar)vars[2], false, "Var_FutureReasonForVisit", null, 0, false);
	subContainer_1.addSubInstruction(sub_6);
	
	ISubRule sub_7 = new SubRule("MOEB_FIELD/TLC:A1E5BE26F8FA5D0FD600B86366343630/TPM:A1E5BE26F8FA5D18D600B86366343630/WID:A1E5BE26F8FA5D13D600B86366343630/IDB:A1E5BE26F8FA5D08D600B86366343630", 0, 22, false, (IDCCoreVar)vars[4], false, "Var_FutureAttendingPhy", null, 0, false);
	subContainer_1.addSubInstruction(sub_7);
	
	ISubRule sub_8 = new SubRule("MOEB_FIELD/TEX:A1E5BE26F9016355D600B86366343630/TPM:A1E5BE26F9016359D600B86366343630", 0, 24, false, (IDCCoreVar)vars[2], false, "Var_FutureReasonForVisit_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_8);
	
	ISubRule sub_9 = new SubRule("MOEB_FIELD/IDB:A1E5BE270733B7A0D600B86366343630", 0, 23, false, (IDCCoreVar)vars[3], false, "Var_FutureEncounterType", null, 0, false);
	subContainer_1.addSubInstruction(sub_9);
	
	ISubRule sub_10 = new SubRule("MOEB_FIELD/TLC:A1E5CEA103708370C17FB13564643936/TPM:A1E5CEA103708374C17FB13564643936/WID:A1E5CEA103708378C17FB13564643936/IDB:A1E5CEA104F304C1C17FB13564643936", 0, 13, false, (IDCCoreVar)vars[1], false, "Var_FutureDTM", null, 0, false);
	subContainer_1.addSubInstruction(sub_10);
	
	ISubRule sub_11 = new SubRule("MOEB_FIELD/TEX:A1E5BE27008F6F58D600B86366343630/TPM:A1E5BE27008F6F5CD600B86366343630", 0, 23, false, (IDCCoreVar)vars[3], false, "Var_FutureEncounterType_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_11);
	
	ISubRule sub_12 = new SubRule("MOEB_FIELD/IDB:A1E5BE270F3239E0D600B86366343630", 0, 22, false, (IDCCoreVar)vars[4], false, "Var_FutureAttendingPhy", null, 0, false);
	subContainer_1.addSubInstruction(sub_12);
	
	ISubRule sub_13 = new SubRule("MOEB_FIELD/TLC:A1E5CEA11C8D0A90C17FB13564643936/TPM:A1E5CEA11C8D0A94C17FB13564643936/WID:A1E5CEA11C8D0A98C17FB13564643936/IDB:A1E5CEA11E1F6A61C17FB13564643936", 0, 24, false, (IDCCoreVar)vars[2], false, "Var_FutureReasonForVisit", null, 0, false);
	subContainer_1.addSubInstruction(sub_13);
	
	ISubRule sub_14 = new SubRule("MOEB_FIELD/TEX:A1E5BE270C35EAC5D600B86366343630/TPM:A1E5BE270C35EAC9D600B86366343630", 0, 22, false, (IDCCoreVar)vars[4], false, "Var_FutureAttendingPhy_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_14);
	


		return stepBatch;
	}

}
