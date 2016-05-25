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
public class ChartReview_VerifyVisitListPreviousSectionIPHONE_Test_A1E5E869B0613B1AE45FB13334396164 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	private DataVar[] vars = new DataVar[5];
	
    
    
	
	public ChartReview_VerifyVisitListPreviousSectionIPHONE_Test_A1E5E869B0613B1AE45FB13334396164(IContainer container, String invocationId) {
		super(container, "ChartReview_VerifyVisitListPreviousSectionIPHONE", invocationId, "A1E5E869B0613B1AE45FB13334396164");
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
		     log("Test Execution: ChartReview_VerifyVisitListPreviousSectionIPHONE_Test_A1E5E869B0613B1AE45FB13334396164 ",e);
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

	VariableAction vc = new VariableAction(parent, "", "A1E5D00E522AE2D3F902E56335343263");	
			vars[0] = new DataVar("Var_PreviousCount", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

	
		vars[1] = new DataVar("Var_PreviousDTM", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

	
		vars[2] = new DataVar("Var_PreviousReasonForVisit", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

	
		vars[3] = new DataVar("Var_PreviousEncounterType", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

	
		vars[4] = new DataVar("Var_PreviousAttendingPhy", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "PowerChart",
												  "A1E5D00E5242B090F902E56335343263",
												  "{\"variables\":[{\"id\":\"56\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousCount\",\"key\":\"MOEB_FIELD\\/IDB:A1E5D4C84F020BB0C5F7B03036336664\"},{\"id\":\"57\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousDTM\",\"key\":\"MOEB_FIELD\\/TLC:A1E5D4C771E98D43C5F7B03036336664\\/TPM:A1E5D4C771E98D4CC5F7B03036336664\\/WID:A1E5D4C771E98D47C5F7B03036336664\\/IDB:A1E5D4C771E98D3CC5F7B03036336664\"},{\"id\":\"58\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousCount\",\"key\":\"MOEB_FIELD\\/TEX:A1E5D4C771E98D59C5F7B03036336664\\/TPM:A1E5D4C771E98D5DC5F7B03036336664\"},{\"id\":\"59\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousDTM\",\"key\":\"MOEB_FIELD\\/IDB:A1E5D4C893CFB940C5F7B03036336664\"},{\"id\":\"60\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousReasonForVisit\",\"key\":\"MOEB_FIELD\\/TLC:A1E5D4C77717B17AC5F7B03036336664\\/TPM:A1E5D4C77717B183C5F7B03036336664\\/WID:A1E5D4C77717B17EC5F7B03036336664\\/IDB:A1E5D4C77717B173C5F7B03036336664\"},{\"id\":\"61\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousDTM\",\"key\":\"MOEB_FIELD\\/TEX:A1E5D4C777457858C5F7B03036336664\\/TPM:A1E5D4C77745785CC5F7B03036336664\"},{\"id\":\"62\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousReasonForVisit\",\"key\":\"MOEB_FIELD\\/IDB:A1E5D4C8AF5C7D10C5F7B03036336664\"},{\"id\":\"63\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousEncounterType\",\"key\":\"MOEB_FIELD\\/TLC:A1E5D4C7799CFCB5C5F7B03036336664\\/TPM:A1E5D4C7799CFCBEC5F7B03036336664\\/WID:A1E5D4C7799CFCB9C5F7B03036336664\\/IDB:A1E5D4C7799CFCAEC5F7B03036336664\"},{\"id\":\"64\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousReasonForVisit\",\"key\":\"MOEB_FIELD\\/TEX:A1E5D4C779D1531EC5F7B03036336664\\/TPM:A1E5D4C779D15322C5F7B03036336664\"},{\"id\":\"65\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousEncounterType\",\"key\":\"MOEB_FIELD\\/IDB:A1E5D4C8CB8CD3E0C5F7B03036336664\"},{\"id\":\"66\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousAttendingPhy\",\"key\":\"MOEB_FIELD\\/TLC:A1E5D4C77B95E677C5F7B03036336664\\/TPM:A1E5D4C77B95E680C5F7B03036336664\\/WID:A1E5D4C77B95E67BC5F7B03036336664\\/IDB:A1E5D4C77B95E670C5F7B03036336664\"},{\"id\":\"67\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousEncounterType\",\"key\":\"MOEB_FIELD\\/TEX:A1E5D4C77B95E68DC5F7B03036336664\\/TPM:A1E5D4C77B95E691C5F7B03036336664\"},{\"id\":\"68\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousAttendingPhy\",\"key\":\"MOEB_FIELD\\/IDB:A1E5D4C8D7D42360C5F7B03036336664\"},{\"id\":\"69\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousEncounterType\",\"key\":\"MOEB_FIELD\\/TLC:A1E5D4C77DAC9170C5F7B03036336664\\/TPM:A1E5D4C77DAC9179C5F7B03036336664\\/WID:A1E5D4C77DAC9174C5F7B03036336664\\/IDB:A1E5D4C77DAC6A60C5F7B03036336664\"},{\"id\":\"70\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousAttendingPhy\",\"key\":\"MOEB_FIELD\\/TEX:A1E5D4C77DAC9186C5F7B03036336664\\/TPM:A1E5D4C77DAC918AC5F7B03036336664\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5D4C771E98D59C5F7B03036336664\\/TPM:A1E5D4C771E98D5DC5F7B03036336664\\\">Var_PreviousCount<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5D4C84F020BB0C5F7B03036336664\\\">Var_PreviousCount<\\/subst>'<\\/b> above Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5D4C771E98D43C5F7B03036336664\\/TPM:A1E5D4C771E98D4CC5F7B03036336664\\/WID:A1E5D4C771E98D47C5F7B03036336664\\/IDB:A1E5D4C771E98D3CC5F7B03036336664\\\">Var_PreviousDTM<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"4\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5D4C771E98D52C5F7B03036336664\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5D4C84F020BB0C5F7B03036336664\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousCount\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5D4C771E98D43C5F7B03036336664\\/TPM:A1E5D4C771E98D4CC5F7B03036336664\\/WID:A1E5D4C771E98D47C5F7B03036336664\\/IDB:A1E5D4C771E98D3CC5F7B03036336664\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousDTM\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5D4C771E98D59C5F7B03036336664\\/TPM:A1E5D4C771E98D5DC5F7B03036336664\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousCount\"}],\"isWeb\":false,\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"2\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"3\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LAbove\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5D4C777457858C5F7B03036336664\\/TPM:A1E5D4C77745785CC5F7B03036336664\\\">Var_PreviousDTM<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5D4C893CFB940C5F7B03036336664\\\">Var_PreviousDTM<\\/subst>'<\\/b> above Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5D4C77717B17AC5F7B03036336664\\/TPM:A1E5D4C77717B183C5F7B03036336664\\/WID:A1E5D4C77717B17EC5F7B03036336664\\/IDB:A1E5D4C77717B173C5F7B03036336664\\\">Var_PreviousReasonForVisit<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"15\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"22\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5D4C777457851C5F7B03036336664\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5D4C893CFB940C5F7B03036336664\",\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousDTM\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5D4C77717B17AC5F7B03036336664\\/TPM:A1E5D4C77717B183C5F7B03036336664\\/WID:A1E5D4C77717B17EC5F7B03036336664\\/IDB:A1E5D4C77717B173C5F7B03036336664\",\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousReasonForVisit\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5D4C777457858C5F7B03036336664\\/TPM:A1E5D4C77745785CC5F7B03036336664\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousDTM\"}],\"isWeb\":false,\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"13\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"19\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"14\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"21\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"20\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LAbove\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5D4C779D1531EC5F7B03036336664\\/TPM:A1E5D4C779D15322C5F7B03036336664\\\">Var_PreviousReasonForVisit<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5D4C8AF5C7D10C5F7B03036336664\\\">Var_PreviousReasonForVisit<\\/subst>'<\\/b> above Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5D4C7799CFCB5C5F7B03036336664\\/TPM:A1E5D4C7799CFCBEC5F7B03036336664\\/WID:A1E5D4C7799CFCB9C5F7B03036336664\\/IDB:A1E5D4C7799CFCAEC5F7B03036336664\\\">Var_PreviousEncounterType<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"26\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"33\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5D4C779D15317C5F7B03036336664\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5D4C8AF5C7D10C5F7B03036336664\",\"id\":\"24\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousReasonForVisit\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5D4C7799CFCB5C5F7B03036336664\\/TPM:A1E5D4C7799CFCBEC5F7B03036336664\\/WID:A1E5D4C7799CFCB9C5F7B03036336664\\/IDB:A1E5D4C7799CFCAEC5F7B03036336664\",\"id\":\"25\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousEncounterType\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5D4C779D1531EC5F7B03036336664\\/TPM:A1E5D4C779D15322C5F7B03036336664\",\"id\":\"26\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousReasonForVisit\"}],\"isWeb\":false,\"id\":\"23\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"24\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"28\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"27\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"30\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"25\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"32\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"31\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"29\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LAbove\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5D4C77B95E68DC5F7B03036336664\\/TPM:A1E5D4C77B95E691C5F7B03036336664\\\">Var_PreviousEncounterType<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5D4C8CB8CD3E0C5F7B03036336664\\\">Var_PreviousEncounterType<\\/subst>'<\\/b> to the left of Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5D4C77B95E677C5F7B03036336664\\/TPM:A1E5D4C77B95E680C5F7B03036336664\\/WID:A1E5D4C77B95E67BC5F7B03036336664\\/IDB:A1E5D4C77B95E670C5F7B03036336664\\\">Var_PreviousAttendingPhy<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"37\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"44\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5D4C77B95E686C5F7B03036336664\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5D4C8CB8CD3E0C5F7B03036336664\",\"id\":\"35\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousEncounterType\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5D4C77B95E677C5F7B03036336664\\/TPM:A1E5D4C77B95E680C5F7B03036336664\\/WID:A1E5D4C77B95E67BC5F7B03036336664\\/IDB:A1E5D4C77B95E670C5F7B03036336664\",\"id\":\"36\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousAttendingPhy\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5D4C77B95E68DC5F7B03036336664\\/TPM:A1E5D4C77B95E691C5F7B03036336664\",\"id\":\"37\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousEncounterType\"}],\"isWeb\":false,\"id\":\"34\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"35\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"39\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"38\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"41\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"36\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"43\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"42\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"40\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LLeft\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5D4C77DAC9186C5F7B03036336664\\/TPM:A1E5D4C77DAC918AC5F7B03036336664\\\">Var_PreviousAttendingPhy<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5D4C8D7D42360C5F7B03036336664\\\">Var_PreviousAttendingPhy<\\/subst>'<\\/b> to the right of Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5D4C77DAC9170C5F7B03036336664\\/TPM:A1E5D4C77DAC9179C5F7B03036336664\\/WID:A1E5D4C77DAC9174C5F7B03036336664\\/IDB:A1E5D4C77DAC6A60C5F7B03036336664\\\">Var_PreviousEncounterType<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"48\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"55\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5D4C77DAC917FC5F7B03036336664\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5D4C8D7D42360C5F7B03036336664\",\"id\":\"46\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousAttendingPhy\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5D4C77DAC9170C5F7B03036336664\\/TPM:A1E5D4C77DAC9179C5F7B03036336664\\/WID:A1E5D4C77DAC9174C5F7B03036336664\\/IDB:A1E5D4C77DAC6A60C5F7B03036336664\",\"id\":\"47\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousEncounterType\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5D4C77DAC9186C5F7B03036336664\\/TPM:A1E5D4C77DAC918AC5F7B03036336664\",\"id\":\"48\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousAttendingPhy\"}],\"isWeb\":false,\"id\":\"45\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"46\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"50\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"49\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"52\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"47\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"54\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"53\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"51\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_1 = new DataSub();
		stepBatch.addDataSub(subContainer_1);
	ISubRule sub_0 = new SubRule("MOEB_FIELD/IDB:A1E5D4C84F020BB0C5F7B03036336664", 0, 17, false, (IDCCoreVar)vars[0], false, "Var_PreviousCount", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	
	ISubRule sub_1 = new SubRule("MOEB_FIELD/TLC:A1E5D4C771E98D43C5F7B03036336664/TPM:A1E5D4C771E98D4CC5F7B03036336664/WID:A1E5D4C771E98D47C5F7B03036336664/IDB:A1E5D4C771E98D3CC5F7B03036336664", 0, 15, false, (IDCCoreVar)vars[1], false, "Var_PreviousDTM", null, 0, false);
	subContainer_1.addSubInstruction(sub_1);
	
	ISubRule sub_2 = new SubRule("MOEB_FIELD/TEX:A1E5D4C771E98D59C5F7B03036336664/TPM:A1E5D4C771E98D5DC5F7B03036336664", 0, 17, false, (IDCCoreVar)vars[0], false, "Var_PreviousCount_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_2);
	
	ISubRule sub_3 = new SubRule("MOEB_FIELD/IDB:A1E5D4C893CFB940C5F7B03036336664", 0, 15, false, (IDCCoreVar)vars[1], false, "Var_PreviousDTM", null, 0, false);
	subContainer_1.addSubInstruction(sub_3);
	
	ISubRule sub_4 = new SubRule("MOEB_FIELD/TLC:A1E5D4C77717B17AC5F7B03036336664/TPM:A1E5D4C77717B183C5F7B03036336664/WID:A1E5D4C77717B17EC5F7B03036336664/IDB:A1E5D4C77717B173C5F7B03036336664", 0, 26, false, (IDCCoreVar)vars[2], false, "Var_PreviousReasonForVisit", null, 0, false);
	subContainer_1.addSubInstruction(sub_4);
	
	ISubRule sub_5 = new SubRule("MOEB_FIELD/TEX:A1E5D4C777457858C5F7B03036336664/TPM:A1E5D4C77745785CC5F7B03036336664", 0, 15, false, (IDCCoreVar)vars[1], false, "Var_PreviousDTM_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_5);
	
	ISubRule sub_6 = new SubRule("MOEB_FIELD/IDB:A1E5D4C8AF5C7D10C5F7B03036336664", 0, 26, false, (IDCCoreVar)vars[2], false, "Var_PreviousReasonForVisit", null, 0, false);
	subContainer_1.addSubInstruction(sub_6);
	
	ISubRule sub_7 = new SubRule("MOEB_FIELD/TLC:A1E5D4C7799CFCB5C5F7B03036336664/TPM:A1E5D4C7799CFCBEC5F7B03036336664/WID:A1E5D4C7799CFCB9C5F7B03036336664/IDB:A1E5D4C7799CFCAEC5F7B03036336664", 0, 25, false, (IDCCoreVar)vars[3], false, "Var_PreviousEncounterType", null, 0, false);
	subContainer_1.addSubInstruction(sub_7);
	
	ISubRule sub_8 = new SubRule("MOEB_FIELD/TEX:A1E5D4C779D1531EC5F7B03036336664/TPM:A1E5D4C779D15322C5F7B03036336664", 0, 26, false, (IDCCoreVar)vars[2], false, "Var_PreviousReasonForVisit_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_8);
	
	ISubRule sub_9 = new SubRule("MOEB_FIELD/IDB:A1E5D4C8CB8CD3E0C5F7B03036336664", 0, 25, false, (IDCCoreVar)vars[3], false, "Var_PreviousEncounterType", null, 0, false);
	subContainer_1.addSubInstruction(sub_9);
	
	ISubRule sub_10 = new SubRule("MOEB_FIELD/TLC:A1E5D4C77B95E677C5F7B03036336664/TPM:A1E5D4C77B95E680C5F7B03036336664/WID:A1E5D4C77B95E67BC5F7B03036336664/IDB:A1E5D4C77B95E670C5F7B03036336664", 0, 24, false, (IDCCoreVar)vars[4], false, "Var_PreviousAttendingPhy", null, 0, false);
	subContainer_1.addSubInstruction(sub_10);
	
	ISubRule sub_11 = new SubRule("MOEB_FIELD/TEX:A1E5D4C77B95E68DC5F7B03036336664/TPM:A1E5D4C77B95E691C5F7B03036336664", 0, 25, false, (IDCCoreVar)vars[3], false, "Var_PreviousEncounterType_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_11);
	
	ISubRule sub_12 = new SubRule("MOEB_FIELD/IDB:A1E5D4C8D7D42360C5F7B03036336664", 0, 24, false, (IDCCoreVar)vars[4], false, "Var_PreviousAttendingPhy", null, 0, false);
	subContainer_1.addSubInstruction(sub_12);
	
	ISubRule sub_13 = new SubRule("MOEB_FIELD/TLC:A1E5D4C77DAC9170C5F7B03036336664/TPM:A1E5D4C77DAC9179C5F7B03036336664/WID:A1E5D4C77DAC9174C5F7B03036336664/IDB:A1E5D4C77DAC6A60C5F7B03036336664", 0, 25, false, (IDCCoreVar)vars[3], false, "Var_PreviousEncounterType", null, 0, false);
	subContainer_1.addSubInstruction(sub_13);
	
	ISubRule sub_14 = new SubRule("MOEB_FIELD/TEX:A1E5D4C77DAC9186C5F7B03036336664/TPM:A1E5D4C77DAC918AC5F7B03036336664", 0, 24, false, (IDCCoreVar)vars[4], false, "Var_PreviousAttendingPhy_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_14);
	


		return stepBatch;
	}

}
