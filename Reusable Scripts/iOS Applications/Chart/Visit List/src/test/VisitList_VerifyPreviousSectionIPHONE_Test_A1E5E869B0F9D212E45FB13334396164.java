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
public class VisitList_VerifyPreviousSectionIPHONE_Test_A1E5E869B0F9D212E45FB13334396164 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	private DataVar[] vars = new DataVar[6];
	
    
    
	
	public VisitList_VerifyPreviousSectionIPHONE_Test_A1E5E869B0F9D212E45FB13334396164(IContainer container, String invocationId) {
		super(container, "VisitList_VerifyPreviousSectionIPHONE", invocationId, "A1E5E869B0F9D212E45FB13334396164");
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
		     log("Test Execution: VisitList_VerifyPreviousSectionIPHONE_Test_A1E5E869B0F9D212E45FB13334396164 ",e);
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
			vars[0] = new DataVar("Var_PreviousDTM", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

	
		vars[1] = new DataVar("Var_PreviousReasonForVisit", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

	
		vars[2] = new DataVar("Var_PreviousEncounterType", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

	
		vars[3] = new DataVar("Var_PreviousLocation", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

	
		vars[4] = new DataVar("Var_PreviousAttendingPhy", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

	
		vars[5] = new DataVar("Var_PreviousRoom/Bed", null, IDataArea.VIRTUALUSER, "WARNING", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "PowerChart",
												  "A1E5D00E5242B090F902E56335343263",
												  "{\"variables\":[{\"id\":\"67\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousDTM\",\"key\":\"MOEB_FIELD\\/TLC:A1E5D4F6DBB7FE75C5F7B03036336664\\/TPM:A1E5D4F76B3452F0C5F7B03036336664\\/WID:A1E5D4F76B3452F4C5F7B03036336664\\/IDB:A1E5D4F76DC006E1C5F7B03036336664\"},{\"id\":\"68\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousDTM\",\"key\":\"MOEB_FIELD\\/IDB:A1E5D4D601801810C5F7B03036336664\"},{\"id\":\"69\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousReasonForVisit\",\"key\":\"MOEB_FIELD\\/TLC:A1E5D4D51680CB02C5F7B03036336664\\/TPM:A1E5D4D51680CB0BC5F7B03036336664\\/WID:A1E5D4D51680CB06C5F7B03036336664\\/IDB:A1E5D4D51680CAFBC5F7B03036336664\"},{\"id\":\"70\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousDTM\",\"key\":\"MOEB_FIELD\\/TEX:A1E5D4D51680CB18C5F7B03036336664\\/TPM:A1E5D4D51680CB1CC5F7B03036336664\"},{\"id\":\"71\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousReasonForVisit\",\"key\":\"MOEB_FIELD\\/IDB:A1E5D4D64D625D10C5F7B03036336664\"},{\"id\":\"72\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousEncounterType\",\"key\":\"MOEB_FIELD\\/TLC:A1E5D4D515261D25C5F7B03036336664\\/TPM:A1E5D4D515261D2EC5F7B03036336664\\/WID:A1E5D4D515261D29C5F7B03036336664\\/IDB:A1E5D4D515261D1EC5F7B03036336664\"},{\"id\":\"73\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousReasonForVisit\",\"key\":\"MOEB_FIELD\\/TEX:A1E5D4D515381E76C5F7B03036336664\\/TPM:A1E5D4D515381E7AC5F7B03036336664\"},{\"id\":\"74\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousEncounterType\",\"key\":\"MOEB_FIELD\\/IDB:A1E5D4D65E54BE10C5F7B03036336664\"},{\"id\":\"75\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousLocation\",\"key\":\"MOEB_FIELD\\/TLC:A1E5D4D513B17E70C5F7B03036336664\\/TPM:A1E5D4D513B17E79C5F7B03036336664\\/WID:A1E5D4D513B17E74C5F7B03036336664\\/IDB:A1E5D4D513B17E69C5F7B03036336664\"},{\"id\":\"76\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousEncounterType\",\"key\":\"MOEB_FIELD\\/TEX:A1E5D4D513B17E86C5F7B03036336664\\/TPM:A1E5D4D513B17E8AC5F7B03036336664\"},{\"id\":\"77\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousLocation\",\"key\":\"MOEB_FIELD\\/IDB:A1E5D4D67CFB9320C5F7B03036336664\"},{\"id\":\"78\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousEncounterType\",\"key\":\"MOEB_FIELD\\/TLC:A1E5D4D512414CD1C5F7B03036336664\\/TPM:A1E5D4D512414CDAC5F7B03036336664\\/WID:A1E5D4D512414CD5C5F7B03036336664\\/IDB:A1E5D4D512414CCAC5F7B03036336664\"},{\"id\":\"79\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousLocation\",\"key\":\"MOEB_FIELD\\/TEX:A1E5D4D5125CEAF8C5F7B03036336664\\/TPM:A1E5D4D5125CEAFCC5F7B03036336664\"},{\"id\":\"80\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousAttendingPhy\",\"key\":\"MOEB_FIELD\\/IDB:A1E5D4D6921CD0C0C5F7B03036336664\"},{\"id\":\"81\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousEncounterType\",\"key\":\"MOEB_FIELD\\/TLC:A1E5D4D510D1DE0AC5F7B03036336664\\/TPM:A1E5D4D6956E93D0C5F7B03036336664\\/WID:A1E5D4D6956E93D4C5F7B03036336664\\/IDB:A1E5D4D696C1EED1C5F7B03036336664\"},{\"id\":\"82\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVariable\",\"value\":\"Var_PreviousAttendingPhy\",\"key\":\"MOEB_FIELD\\/TEX:A1E5D4D510D1DE1FC5F7B03036336664\\/TPM:A1E5D4D510D1DE23C5F7B03036336664\"}],\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"description\":\"Verify that <b>Text<\\/b> equals <b>Previous<\\/b> on <b>Label<\\/b> <b>'Previous'<\\/b> above Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5D4F6DBB7FE75C5F7B03036336664\\/TPM:A1E5D4F76B3452F0C5F7B03036336664\\/WID:A1E5D4F76B3452F4C5F7B03036336664\\/IDB:A1E5D4F76DC006E1C5F7B03036336664\\\">Var_PreviousDTM<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"11\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Previous\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"10\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5D4F6DBB7FE84C5F7B03036336664\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5D4F6DBB7FE75C5F7B03036336664\\/TPM:A1E5D4F76B3452F0C5F7B03036336664\\/WID:A1E5D4F76B3452F4C5F7B03036336664\\/IDB:A1E5D4F76DC006E1C5F7B03036336664\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousDTM\"}],\"isWeb\":false,\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"name\":\"text\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Previous\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"2\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LAbove\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5D4D51680CB18C5F7B03036336664\\/TPM:A1E5D4D51680CB1CC5F7B03036336664\\\">Var_PreviousDTM<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5D4D601801810C5F7B03036336664\\\">Var_PreviousDTM<\\/subst>'<\\/b> above Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5D4D51680CB02C5F7B03036336664\\/TPM:A1E5D4D51680CB0BC5F7B03036336664\\/WID:A1E5D4D51680CB06C5F7B03036336664\\/IDB:A1E5D4D51680CAFBC5F7B03036336664\\\">Var_PreviousReasonForVisit<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"15\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"22\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5D4D51680CB11C5F7B03036336664\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5D4D601801810C5F7B03036336664\",\"id\":\"13\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousDTM\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5D4D51680CB02C5F7B03036336664\\/TPM:A1E5D4D51680CB0BC5F7B03036336664\\/WID:A1E5D4D51680CB06C5F7B03036336664\\/IDB:A1E5D4D51680CAFBC5F7B03036336664\",\"id\":\"14\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousReasonForVisit\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5D4D51680CB18C5F7B03036336664\\/TPM:A1E5D4D51680CB1CC5F7B03036336664\",\"id\":\"15\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousDTM\"}],\"isWeb\":false,\"id\":\"12\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"13\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"17\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"16\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"19\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"14\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"21\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"20\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"18\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LAbove\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5D4D515381E76C5F7B03036336664\\/TPM:A1E5D4D515381E7AC5F7B03036336664\\\">Var_PreviousReasonForVisit<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5D4D64D625D10C5F7B03036336664\\\">Var_PreviousReasonForVisit<\\/subst>'<\\/b> above Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5D4D515261D25C5F7B03036336664\\/TPM:A1E5D4D515261D2EC5F7B03036336664\\/WID:A1E5D4D515261D29C5F7B03036336664\\/IDB:A1E5D4D515261D1EC5F7B03036336664\\\">Var_PreviousEncounterType<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"26\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"33\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5D4D515381E6FC5F7B03036336664\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5D4D64D625D10C5F7B03036336664\",\"id\":\"24\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousReasonForVisit\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5D4D515261D25C5F7B03036336664\\/TPM:A1E5D4D515261D2EC5F7B03036336664\\/WID:A1E5D4D515261D29C5F7B03036336664\\/IDB:A1E5D4D515261D1EC5F7B03036336664\",\"id\":\"25\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousEncounterType\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5D4D515381E76C5F7B03036336664\\/TPM:A1E5D4D515381E7AC5F7B03036336664\",\"id\":\"26\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousReasonForVisit\"}],\"isWeb\":false,\"id\":\"23\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"24\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"28\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"27\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"30\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"25\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"32\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"31\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"29\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LAbove\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5D4D513B17E86C5F7B03036336664\\/TPM:A1E5D4D513B17E8AC5F7B03036336664\\\">Var_PreviousEncounterType<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5D4D65E54BE10C5F7B03036336664\\\">Var_PreviousEncounterType<\\/subst>'<\\/b> above Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5D4D513B17E70C5F7B03036336664\\/TPM:A1E5D4D513B17E79C5F7B03036336664\\/WID:A1E5D4D513B17E74C5F7B03036336664\\/IDB:A1E5D4D513B17E69C5F7B03036336664\\\">Var_PreviousLocation<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"37\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"44\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5D4D513B17E7FC5F7B03036336664\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5D4D65E54BE10C5F7B03036336664\",\"id\":\"35\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousEncounterType\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5D4D513B17E70C5F7B03036336664\\/TPM:A1E5D4D513B17E79C5F7B03036336664\\/WID:A1E5D4D513B17E74C5F7B03036336664\\/IDB:A1E5D4D513B17E69C5F7B03036336664\",\"id\":\"36\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousLocation\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5D4D513B17E86C5F7B03036336664\\/TPM:A1E5D4D513B17E8AC5F7B03036336664\",\"id\":\"37\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousEncounterType\"}],\"isWeb\":false,\"id\":\"34\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"35\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"39\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"38\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"41\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"36\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"43\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"42\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"40\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LAbove\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5D4D5125CEAF8C5F7B03036336664\\/TPM:A1E5D4D5125CEAFCC5F7B03036336664\\\">Var_PreviousLocation<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5D4D67CFB9320C5F7B03036336664\\\">Var_PreviousLocation<\\/subst>'<\\/b> below Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5D4D512414CD1C5F7B03036336664\\/TPM:A1E5D4D512414CDAC5F7B03036336664\\/WID:A1E5D4D512414CD5C5F7B03036336664\\/IDB:A1E5D4D512414CCAC5F7B03036336664\\\">Var_PreviousEncounterType<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"48\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"55\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5D4D5125CEAF1C5F7B03036336664\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5D4D67CFB9320C5F7B03036336664\",\"id\":\"46\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousLocation\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5D4D512414CD1C5F7B03036336664\\/TPM:A1E5D4D512414CDAC5F7B03036336664\\/WID:A1E5D4D512414CD5C5F7B03036336664\\/IDB:A1E5D4D512414CCAC5F7B03036336664\",\"id\":\"47\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousEncounterType\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5D4D5125CEAF8C5F7B03036336664\\/TPM:A1E5D4D5125CEAFCC5F7B03036336664\",\"id\":\"48\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousLocation\"}],\"isWeb\":false,\"id\":\"45\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"46\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"50\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"49\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"52\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"47\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"54\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"53\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"51\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LUnder\"}}},{\"description\":\"Verify that <b>Text<\\/b> equals <b><subst key=\\\"MOEB_FIELD\\/TEX:A1E5D4D510D1DE1FC5F7B03036336664\\/TPM:A1E5D4D510D1DE23C5F7B03036336664\\\">Var_PreviousAttendingPhy<\\/subst><\\/b> on <b>Label<\\/b> <b>'<subst key=\\\"MOEB_FIELD\\/IDB:A1E5D4D6921CD0C0C5F7B03036336664\\\">Var_PreviousAttendingPhy<\\/subst>'<\\/b> to the right of Label <b>'<subst key=\\\"MOEB_FIELD\\/TLC:A1E5D4D510D1DE0AC5F7B03036336664\\/TPM:A1E5D4D6956E93D0C5F7B03036336664\\/WID:A1E5D4D6956E93D4C5F7B03036336664\\/IDB:A1E5D4D696C1EED1C5F7B03036336664\\\">Var_PreviousEncounterType<\\/subst>'<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"2D1DC2D1DEB758FD884CB3B7930832CD\",\"timeout\":0,\"vpExpression\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"59\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"66\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceSimpleExpression\",\"translatedName\":\"Text\",\"operator\":\"TEquals\"},\"uid\":\"A1E5D4D510D1DE19C5F7B03036336664\",\"substitutionParameters\":[{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/IDB:A1E5D4D6921CD0C0C5F7B03036336664\",\"id\":\"57\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousAttendingPhy\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TLC:A1E5D4D510D1DE0AC5F7B03036336664\\/TPM:A1E5D4D6956E93D0C5F7B03036336664\\/WID:A1E5D4D6956E93D4C5F7B03036336664\\/IDB:A1E5D4D696C1EED1C5F7B03036336664\",\"id\":\"58\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousEncounterType\"},{\"name\":\"text\",\"variableKey\":\"MOEB_FIELD\\/TEX:A1E5D4D510D1DE1FC5F7B03036336664\\/TPM:A1E5D4D510D1DE23C5F7B03036336664\",\"id\":\"59\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Var_PreviousAttendingPhy\"}],\"isWeb\":false,\"id\":\"56\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceVPUIObject\",\"retry\":false,\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"57\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"61\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"60\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\",\"locator\":{\"parameter\":{\"name\":\"objectId\",\"id\":\"63\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TUIObject\",\"object\":{\"identifier\":{\"expression\":\"text\",\"parameter\":{\"$ref\":\"58\"},\"name\":\"text\",\"expType\":\"getter\",\"id\":\"65\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"id\":\"64\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"UILabel\"}},\"id\":\"62\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LRight\"}}}],\"timeout\":10}",
												  null,
												  null,
												  "<default>");
		IDataSub subContainer_1 = new DataSub();
		stepBatch.addDataSub(subContainer_1);
	ISubRule sub_0 = new SubRule("MOEB_FIELD/TLC:A1E5D4F6DBB7FE75C5F7B03036336664/TPM:A1E5D4F76B3452F0C5F7B03036336664/WID:A1E5D4F76B3452F4C5F7B03036336664/IDB:A1E5D4F76DC006E1C5F7B03036336664", 0, 15, false, (IDCCoreVar)vars[0], false, "Var_PreviousDTM", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	
	ISubRule sub_1 = new SubRule("MOEB_FIELD/IDB:A1E5D4D601801810C5F7B03036336664", 0, 15, false, (IDCCoreVar)vars[0], false, "Var_PreviousDTM", null, 0, false);
	subContainer_1.addSubInstruction(sub_1);
	
	ISubRule sub_2 = new SubRule("MOEB_FIELD/TLC:A1E5D4D51680CB02C5F7B03036336664/TPM:A1E5D4D51680CB0BC5F7B03036336664/WID:A1E5D4D51680CB06C5F7B03036336664/IDB:A1E5D4D51680CAFBC5F7B03036336664", 0, 26, false, (IDCCoreVar)vars[1], false, "Var_PreviousReasonForVisit", null, 0, false);
	subContainer_1.addSubInstruction(sub_2);
	
	ISubRule sub_3 = new SubRule("MOEB_FIELD/TEX:A1E5D4D51680CB18C5F7B03036336664/TPM:A1E5D4D51680CB1CC5F7B03036336664", 0, 15, false, (IDCCoreVar)vars[0], false, "Var_PreviousDTM_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_3);
	
	ISubRule sub_4 = new SubRule("MOEB_FIELD/IDB:A1E5D4D64D625D10C5F7B03036336664", 0, 26, false, (IDCCoreVar)vars[1], false, "Var_PreviousReasonForVisit", null, 0, false);
	subContainer_1.addSubInstruction(sub_4);
	
	ISubRule sub_5 = new SubRule("MOEB_FIELD/TLC:A1E5D4D515261D25C5F7B03036336664/TPM:A1E5D4D515261D2EC5F7B03036336664/WID:A1E5D4D515261D29C5F7B03036336664/IDB:A1E5D4D515261D1EC5F7B03036336664", 0, 25, false, (IDCCoreVar)vars[2], false, "Var_PreviousEncounterType", null, 0, false);
	subContainer_1.addSubInstruction(sub_5);
	
	ISubRule sub_6 = new SubRule("MOEB_FIELD/TEX:A1E5D4D515381E76C5F7B03036336664/TPM:A1E5D4D515381E7AC5F7B03036336664", 0, 26, false, (IDCCoreVar)vars[1], false, "Var_PreviousReasonForVisit_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_6);
	
	ISubRule sub_7 = new SubRule("MOEB_FIELD/IDB:A1E5D4D65E54BE10C5F7B03036336664", 0, 25, false, (IDCCoreVar)vars[2], false, "Var_PreviousEncounterType", null, 0, false);
	subContainer_1.addSubInstruction(sub_7);
	
	ISubRule sub_8 = new SubRule("MOEB_FIELD/TLC:A1E5D4D513B17E70C5F7B03036336664/TPM:A1E5D4D513B17E79C5F7B03036336664/WID:A1E5D4D513B17E74C5F7B03036336664/IDB:A1E5D4D513B17E69C5F7B03036336664", 0, 20, false, (IDCCoreVar)vars[3], false, "Var_PreviousLocation", null, 0, false);
	subContainer_1.addSubInstruction(sub_8);
	
	ISubRule sub_9 = new SubRule("MOEB_FIELD/TEX:A1E5D4D513B17E86C5F7B03036336664/TPM:A1E5D4D513B17E8AC5F7B03036336664", 0, 25, false, (IDCCoreVar)vars[2], false, "Var_PreviousEncounterType_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_9);
	
	ISubRule sub_10 = new SubRule("MOEB_FIELD/IDB:A1E5D4D67CFB9320C5F7B03036336664", 0, 20, false, (IDCCoreVar)vars[3], false, "Var_PreviousLocation", null, 0, false);
	subContainer_1.addSubInstruction(sub_10);
	
	ISubRule sub_11 = new SubRule("MOEB_FIELD/TLC:A1E5D4D512414CD1C5F7B03036336664/TPM:A1E5D4D512414CDAC5F7B03036336664/WID:A1E5D4D512414CD5C5F7B03036336664/IDB:A1E5D4D512414CCAC5F7B03036336664", 0, 25, false, (IDCCoreVar)vars[2], false, "Var_PreviousEncounterType", null, 0, false);
	subContainer_1.addSubInstruction(sub_11);
	
	ISubRule sub_12 = new SubRule("MOEB_FIELD/TEX:A1E5D4D5125CEAF8C5F7B03036336664/TPM:A1E5D4D5125CEAFCC5F7B03036336664", 0, 20, false, (IDCCoreVar)vars[3], false, "Var_PreviousLocation_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_12);
	
	ISubRule sub_13 = new SubRule("MOEB_FIELD/IDB:A1E5D4D6921CD0C0C5F7B03036336664", 0, 24, false, (IDCCoreVar)vars[4], false, "Var_PreviousAttendingPhy", null, 0, false);
	subContainer_1.addSubInstruction(sub_13);
	
	ISubRule sub_14 = new SubRule("MOEB_FIELD/TLC:A1E5D4D510D1DE0AC5F7B03036336664/TPM:A1E5D4D6956E93D0C5F7B03036336664/WID:A1E5D4D6956E93D4C5F7B03036336664/IDB:A1E5D4D696C1EED1C5F7B03036336664", 0, 25, false, (IDCCoreVar)vars[2], false, "Var_PreviousEncounterType", null, 0, false);
	subContainer_1.addSubInstruction(sub_14);
	
	ISubRule sub_15 = new SubRule("MOEB_FIELD/TEX:A1E5D4D510D1DE1FC5F7B03036336664/TPM:A1E5D4D510D1DE23C5F7B03036336664", 0, 24, false, (IDCCoreVar)vars[4], false, "Var_PreviousAttendingPhy_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_15);
	


		return stepBatch;
	}

}
